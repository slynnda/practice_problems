package io.sophialhudson.strings;

import org.apache.commons.configuration.PropertiesConfiguration;

public class ReverseString {

  private final PropertiesConfiguration config;
  
  public ReverseString(PropertiesConfiguration config) {
    this.config = config;
  }

  protected static String reverseInPlace(String str) {
    return str;
  }

}
