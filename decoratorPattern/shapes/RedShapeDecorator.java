package br.com.bridi.decoratorPattern.shapes;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
	}
	
	@Override
	public void draw() {
		super.draw();
		this.setRedBorder();
	}
	
	private void setRedBorder() {
		System.out.println("Red border");
	}

}
