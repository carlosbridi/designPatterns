package br.com.bridi.singletonPattern;

public class SingletonDemo {

	public static void main(String[] args) {
		
		SimpleSingletonClass instance = SimpleSingletonClass.getInstance();
		
		System.out.println(instance);
		
	}
	
}
