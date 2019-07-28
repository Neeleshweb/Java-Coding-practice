package main;

public class PrivateVehicle extends Vehicle {

	PrivateVehicle(String regno) {
		super(regno);
		
	}

	@Override
	float calcTax(String type, String highway) {
	
		return 0;
	}

}
