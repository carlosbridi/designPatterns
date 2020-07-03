package br.com.bridi.abstractFactoryPattern;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("productB")
public class ConcreteFactoryB implements AbsFactoryProduct {

	@Inject
	@Qualifier("productA")
	private AbsFactoryProduct absFactoryA; 
	
	@Override
	public Product createProductA() {
		System.out.println("absFactoryA -> Call absFactoryA");
		return absFactoryA.createProductA();
	}

	@Override
	public Product createProductB() {
		return new ProductB("Concrete FactoryB");
	}

}
