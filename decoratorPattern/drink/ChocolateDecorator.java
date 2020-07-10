package br.com.bridi.decoratorPattern.drink;

public class ChocolateDecorator extends AbstractDrink {

	public ChocolateDecorator(Drink d) {
		super(d);
	}
	
	@Override
	public Double getCost() {
		return super.getCost() + 0.5;
	}

}
