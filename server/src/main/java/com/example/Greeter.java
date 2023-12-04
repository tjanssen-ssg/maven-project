package com.example;


public class Greeter { 

  
  public Greeter() {

  }
/**
* @param name someone of a person
* @return freeting string
**/
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
