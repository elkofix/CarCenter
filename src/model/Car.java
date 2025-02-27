package model;

public abstract class Car {

	private String id;
	private String licensePlate;
	private String model;
	

	/**
	 * 
	 * @param id
	 * @param licensePlate
	 * @param model
	 */
	public Car(String id, String licensePlate, String model) {
		this.id = id; 
		this.licensePlate = licensePlate;
		this.model = model;

	}

	public String getId() {
		return this.id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getLicensePlate() {
		return this.licensePlate;
	}

	/**
	 * 
	 * @param licensePlate
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getModel() {
		return this.model;
	}

	/**
	 * 
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * 
	 * @param kilometers
	 */
	public abstract String drive(double kilometers);

}
