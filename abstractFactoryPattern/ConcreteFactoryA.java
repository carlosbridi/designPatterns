package br.com.bridi.abstractFactoryPattern;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("productA")
public class ConcreteFactoryA implements AbsFactoryProduct {
	
	@Inject
	@Qualifier("productB")
	private AbsFactoryProduct absProductB; 
	
	@Override
	public Product createProductA() {
		return new ProductA("Concrete FactoryA");
	}

	@Override
	public Product createProductB() {
		System.out.println("absProductB -> Call absFactoryB");
		return absProductB.createProductB();
	}

}
