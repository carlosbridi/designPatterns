package br.com.bridi.decoratorPattern.drink;

public class Water implements Drink {

	@Override
	public Double getCost() {
		return 0.5;
	}

}
