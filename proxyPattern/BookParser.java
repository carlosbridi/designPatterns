package br.com.bridi.proxyPattern;

public class BookParser implements IBookParser {

  private String bookString = null;
  
  public BookParser(String bookStringText) {
    this.bookString = bookStringText;
  }
  
  @Override
  public int getNumberOfPages() {
    return 123;
  }

  @Override
  public int getNumberOfChapters() {
    return 3;
  }

  @Override
  public int getNumberOfSpaces() {
    return 512;
  }

}
