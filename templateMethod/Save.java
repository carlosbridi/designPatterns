package br.com.bridi.templateMethod;

public abstract class Save {

  abstract void beforeSave();
  
  
  void saveMethod(){
    this.beforeSave();
    System.out.println("Already call beforeSave");
    this.afterSave();
  }
  
  void afterSave() {
    System.out.println("Default after save");
  }
  
}
