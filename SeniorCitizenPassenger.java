package oopproject;

public class SeniorCitizenPassenger extends Passenger{

	public SeniorCitizenPassenger(int id, String name, int age) {
		super(id, name, age);
	}
	public double calculateFare(double baseFare) {
		return baseFare*0.7; // 30% discount
	}


}
