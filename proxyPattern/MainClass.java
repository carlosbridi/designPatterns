package br.com.bridi.proxyPattern;

import java.time.Duration;
import java.time.Instant;

public class MainClass {

  public static void main(String[] args) {
    
    Instant start = null;
    Instant end = null;
    Duration interval = null;
    
    String sampleText = "teste de string longa";
    IBookParser bookParser = new ProxyBookParser(sampleText);
    
    start = Instant.now();
    int numberOfChapters = bookParser.getNumberOfChapters();
    
    end = Instant.now();
    interval = Duration.between(start, end);
    System.out.println("Execution time in seconds: " + interval.getSeconds());
    
    
    start = Instant.now();
    int numberOfPages = bookParser.getNumberOfPages();
    interval = Duration.between(start, end);
    System.out.println("Execution time in seconds: " + interval.getSeconds());
    
    start = Instant.now();
    int numberOfSpaces = bookParser.getNumberOfSpaces();
    interval = Duration.between(start, end);
    System.out.println("Execution time in seconds: " + interval.getSeconds());
    
  }
  
}
