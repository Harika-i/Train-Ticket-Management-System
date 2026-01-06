package oopproject;

public class ChildPassenger extends Passenger{
	public ChildPassenger(int  id,String name,int age) {
		super(id, name, age);
	}
	@Override
	public double calculateFare(double baseFare) {
		return baseFare*0.5; 
	}


}

