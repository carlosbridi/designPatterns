package br.com.bridi.templateMethod;

public class Main {

  public static void main(String[] args) {
    
    Save bookSave = new BookSave();
    bookSave.saveMethod();
    
    System.out.println("------------");
    
    Save journalSave = new JournalSave();
    journalSave.saveMethod();
    
    
  }
  
}
