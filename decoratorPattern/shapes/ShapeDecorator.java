package br.com.bridi.decoratorPattern.shapes;

public abstract class ShapeDecorator implements Shape {

	protected Shape decoratorShape;
	
	public ShapeDecorator(Shape decoratorShape) {
		super();
		this.decoratorShape = decoratorShape;
	}

	@Override
	public void draw() {
		this.decoratorShape.draw();
		
	}
	
}
