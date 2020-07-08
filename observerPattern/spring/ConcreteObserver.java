package br.com.bridi.observerPattern.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("com.bridi.observerPattern.spring")
public class ConcreteObserver implements IObserver {
	
	@Override
	public void update() {
		System.out.println("Notifing");
	}
	
	
}
