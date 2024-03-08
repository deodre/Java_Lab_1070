package eu.ase.lab3;

public class Airplane extends Aircraft {

	private float wingSpan;
	
	public Airplane(float wingSpan, int engineNo, float maxSpeed, float maxAltitude) {
		super(engineNo, maxSpeed, maxAltitude);
		this.wingSpan = wingSpan;
	}

	public float getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(float wingSpan) {
		this.wingSpan = wingSpan;
	}

	@Override
	public void takeOff() {
		System.out.println("The airplane is taking off on the runway");
	}

	@Override
	public void navigate() {
		System.out.println("The airplane is navigating");
	}

	@Override
	public void land() {
		System.out.println("The airplane is landing on the runway");		
	}
	
	@Override
	public String toString() {
		return String.format("The airplane has a wingspan of %.2f, %d engines, a maximum speed of %.2f and a maximum altitude %.2f", this.getWingSpan(), this.getEngineNo(), this.getMaxSpeed(), this.getMaxAltitude());
	}

	@Override
	public void startEngine() {
		for (int i = 0; i < this.getEngineNo(); i++) {
			System.out.println(String.format("Engine %d is starting", (i + 1)));
		}
	}

	@Override
	public void stopEngine() {
		for (int i = 0; i < this.getEngineNo(); i++) {
			System.out.println(String.format("Engine %d is stopping", (i + 1)));
		}
	}

}
