package br.com.bridi.decoratorPattern.drink;

public abstract class AbstractDrink implements Drink {

	protected Drink d;

	public AbstractDrink(Drink d) {
		super();
		this.d = d;
	}
	
	@Override
	public Double getCost() {
		return this.d.getCost();
	}
	
}
