package oopproject;

public class AdultPassenger extends Passenger{
	public AdultPassenger(int id,String name,int age) {
		super(id, name, age);
	}

	public double calculateFare(double baseFare) {
		return baseFare; // fullfare
	}
	
}
