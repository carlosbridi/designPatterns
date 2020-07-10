package br.com.bridi.decoratorPattern.shapes;

public class BlueCircleDecorator extends ShapeDecorator {

	public BlueCircleDecorator(Shape decoratorShape) {
		super(decoratorShape);
	}

	@Override
	public void draw() {
		super.draw();
		this.setBlueCircle();
	}
	
	private void setBlueCircle() {
		System.out.println("Blue");
	}
	
}
