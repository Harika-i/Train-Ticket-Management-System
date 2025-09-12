package oopproject;

public class Ticket {
	private int ticketId;
	private Train train;
	private Passenger passenger;
	private double fare;
	public Ticket(int Ticket,Train train,Passenger passenger) {
		this.ticketId=ticketId;
		this.train=train;
		this.passenger=passenger;
		this.fare=fare;
	}
	
	public int getTicketId() {
		return ticketId;
	}
	
	public Train getTrain() {
		return train;
	}
	
	public Passenger getPassenger() {
		return passenger;
	}
	
	public double getFare() {
		return fare;
	}
	
	public String toString() {
		return  "TicketId: "+ticketId+"Train:"+train+"Passenger"+passenger+"Fare"+fare;
	}

}
