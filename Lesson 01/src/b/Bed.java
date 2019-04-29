package b;

public class Bed extends Furniture {

	private boolean tween;

	@Override
	public String display() {
		return "Chair [" + (tween ? "tween" : "single") + ", length=" + length + ", width=" + width + ", height="
				+ height + ", color=" + color + "]";
	}

	@Override
	public void draw() {
		System.out.println("chair");

	}

}
