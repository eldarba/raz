package b;

public abstract class Furniture {

	// fields, attributes (instance variables)
	protected double length;
	protected double width;
	protected double height;
	protected String color;

	public Furniture(double length, double width, double height, String color) {
		super();
		this.length = length;
		this.width = width;
		setHeight(height);
		this.color = color;
	}

	public Furniture() {
		super();
	}
	
	public abstract String display();
	public abstract void draw();

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height >= 0) {
			this.height = height;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
