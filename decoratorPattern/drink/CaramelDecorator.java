package br.com.bridi.decoratorPattern.drink;

public class CaramelDecorator extends AbstractDrink {

	public CaramelDecorator(Drink d) {
		super(d);
	}
	
	@Override
	public Double getCost() {
		return super.getCost() + 0.75;
	}

}
