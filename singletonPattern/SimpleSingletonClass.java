package br.com.bridi.singletonPattern;

public class SimpleSingletonClass {

	//Hidden constructor for anybody can a instantiate a Singleton class, more than one more time
	private static SimpleSingletonClass singletonSimpleClass;
	
	private SimpleSingletonClass() {}
	
	public static SimpleSingletonClass getInstance() {
		
		if (singletonSimpleClass == null)
			singletonSimpleClass = new SimpleSingletonClass();
		
		return singletonSimpleClass;

	}
	
}
