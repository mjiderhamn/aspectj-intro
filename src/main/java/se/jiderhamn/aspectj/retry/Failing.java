package se.jiderhamn.aspectj.retry;

import java.net.SocketTimeoutException;

public class Failing {
  
  private int failures;

  public Failing(int failures) {
    this.failures = failures;
  }
  
  @Retry(maxRetries = 3)
  public void mayFail() throws Exception {
    if(failures > 0) {
      failures--;
      throw new SocketTimeoutException("Will fail another " + failures + " times");
    }

    System.out.println("Success");
  } 
}