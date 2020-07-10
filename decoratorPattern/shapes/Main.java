package br.com.bridi.decoratorPattern.shapes;

public class Main {

	public static void main(String[] args) {
		
		Shape redAndBlue = new RedShapeDecorator(new BlueCircleDecorator(new Circle()));
		redAndBlue.draw();
		
		Shape justRed = new RedShapeDecorator(new Circle());
		justRed.draw();
		
	}
	
}
