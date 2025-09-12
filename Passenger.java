package oopproject;

public abstract class Passenger {
	private int Id;
	private String Name;
	private int Age;
	public Passenger(int id,String name,int age) {
		this.Id=id;
		this.Name=name;
		this.Age=age;
	}
	
	public int getId() {
		return Id;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	
	//polymorphism: differs by passsenger type
	public abstract double calculateFare(double baseFare);
	
	public String toString() {
		return "Passenger{Id: = " + Id + ", Name= '" + Name + "', Age= " + Age +"}";
	}
	
}

