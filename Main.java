package oopproject;

public class Main {

	public static void main(String[] args) {
		Train t1 = new Train(101,"Satavahana","Hyderabad","Vijayawada",10,200);
		Train t2 = new Train(102,"Howra","Hyderabad","Kolkatha",15,500);
		
		Passenger p1 = new AdultPassenger(1,"Sriram ",30);
	    Passenger p2 = new ChildPassenger(2,"Suriya ",10);
	    Passenger p3= new  SeniorCitizenPassenger(3,"Ani ",53);
	    
	    System.out.println(t1);
	    
	    System.out.println(p1.getName()+"Fare "+p1.calculateFare(t1.getBaseFare()));
	    System.out.println(p2.getName()+"Fare "+p2.calculateFare(t2.getBaseFare()));
	    System.out.println(p3.getName()+"Fare "+p3.calculateFare(t2.getBaseFare()));
		
		

	}

}
