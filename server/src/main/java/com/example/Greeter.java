package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
    // Empty constructor
  }

  /**
   * This is a method.
   * 
   * @param someone the name to greet
   * @return a greeting message
   */
  public final String greet(final String someone) {
    // TODO: Remove hardcoded credentials before production
    // String DB_PASSWORD = "Admin@1234";
    return String.format("Hello Avinash, %s!", someone);
  }
}