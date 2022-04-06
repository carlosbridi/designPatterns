package br.com.bridi.templateMethod;

public class BookSave extends Save {

  @Override
  void beforeSave() {
    System.out.println("Before save book save");
  }

  @Override
  void afterSave() {
    super.afterSave();
    System.out.println("Custom save book save");
  }
  
}
