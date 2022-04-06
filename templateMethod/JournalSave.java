package br.com.bridi.templateMethod;

public class JournalSave extends Save {

  @Override
  void beforeSave() {
    System.out.println("Before save journal save");
  }

}
