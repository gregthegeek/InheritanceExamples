package org.byramhills.apcs.cars;

public class AstonMartin extends Car {
	// New Variables specific to ferrari
	private boolean jamesBond;
	private int gadgetCount;

	// Override Constructors
	public AstonMartin() {
		super();
	}

	public AstonMartin(boolean jamesBond1, int gadgetCount1, int currentSpeed1,
			int maxSpeed1, String color1, boolean cool1) {
		super(currentSpeed1, maxSpeed1, color1, cool1);
		jamesBond = jamesBond1;
		gadgetCount = gadgetCount1;
	}

	// Override the old drive to make it fast
	public void drive() {
		if (currentSpeed < maxSpeed) {
			currentSpeed += 50;
		}
	}

}
