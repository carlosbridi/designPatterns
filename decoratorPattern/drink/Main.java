package br.com.bridi.decoratorPattern.drink;

public class Main {

	public static void main(String[] args) {
		
		Drink d = new CaramelDecorator(new ChocolateDecorator(new Coffee()));
		System.out.println(d.getCost());
		
		Drink justMilk = new ChocolateDecorator(new Milk());
		System.out.println(justMilk.getCost());
		
		Drink milkAndCaramel = new CaramelDecorator(new ChocolateDecorator(new Milk()));
		System.out.println(milkAndCaramel.getCost());
		
	}
	
}
