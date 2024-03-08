package eu.ase.lab3;

public abstract class Aircraft implements Operable {

	private int engineNo;
	private float maxSpeed;
	private float maxAltitude;
	
	protected Aircraft(int engineNo, float maxSpeed, float maxAltitude) {
		this.engineNo = engineNo;
		this.maxSpeed = maxSpeed;
		this.maxAltitude = maxAltitude;
	}

	public int getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public float getMaxAltitude() {
		return maxAltitude;
	}

	public void setMaxAltitude(float maxAltitude) {
		this.maxAltitude = maxAltitude;
	}
	
	public abstract void takeOff();
	public abstract void navigate();
	public abstract void land();
	
	public float speedPerEngine() {
		return this.getMaxSpeed() / this.getEngineNo();
	}
	
}
