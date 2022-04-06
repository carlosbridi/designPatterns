package br.com.bridi.proxyPattern;

public class ProxyBookParser implements IBookParser {

  private BookParser bookParser;
  private String bookText = null;
  
  public ProxyBookParser(String bookTextString) {
    this.bookText = bookTextString;
  }
  
  @Override
  public int getNumberOfPages() {
    return getBookParser().getNumberOfChapters();
  }

  @Override
  public int getNumberOfChapters() {
    return getBookParser().getNumberOfChapters();
  }

  @Override
  public int getNumberOfSpaces() {
    return getBookParser().getNumberOfSpaces();
  }
  
  private BookParser getBookParser() {
    if (bookParser == null) {
      bookParser = new BookParser(bookText);
      try {
        Thread.sleep(20_000); //simulate expensive time to process some function/method.
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    
    return bookParser;
    
  }

}
