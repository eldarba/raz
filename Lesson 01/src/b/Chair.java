package b;

public class Chair extends Furniture {

	private int numOfLegs;

	public Chair(double length, double width, double height, String color, int numOfLegs) {
		super(length, width, height, color);
		this.numOfLegs = numOfLegs;
	}

	public Chair() {
		super();
	}


	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}


	@Override
	public String display() {
		return "Chair [numOfLegs=" + numOfLegs + ", length=" + length + ", width=" + width + ", height=" + height
				+ ", color=" + color + "]";
	}
	

	@Override
	public void draw() {
		System.out.println("chair");
		
	}
	
	

}
