package model;

public class ElectricCar extends Car implements IBatteryNotify {

	private double batteryCapacity;

	/**
	 * 
	 * @param id
	 * @param licensePlate
	 * @param model
	 * @param batteryCapacity
	 */
	public ElectricCar(String id, String licensePlate, String model, double batteryCapacity) {
		super(id, licensePlate,model); 
		this.batteryCapacity = batteryCapacity;


	
	}
	@Override
	public String drive(double kmh){
		return "El vehiculo electrico se ha movilizado en "+kmh+" km";
	}

	@Override
	public String calculateBatteryLevel(double km){
		Double watts  =(km/100)*2;
		Double actualBattery = (100-((watts/this.batteryCapacity)*100));
		if(actualBattery<0){
			actualBattery = 0.0;
		}
		return "El nivel de bateria es del "+actualBattery+"%";
	}

	public double getBatteryCapacity() {
		return this.batteryCapacity;
	}

	/**
	 * 
	 * @param batteryCapacity
	 */
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

}
