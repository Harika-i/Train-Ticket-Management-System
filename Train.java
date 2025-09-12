package oopproject;

public class Train {
	private int trainNo;
	private String trainName;
	private String source;
	private String destination;
	private int seatsAvailable;
	private double baseFare;
	public Train(int trainNo,String trainName,String source, String destination,int seatsAvailable, double baseFare) {
		this.trainNo=trainNo;
		this.trainName=trainName;
		this.source=source;
		this.destination=destination;
		this.seatsAvailable=seatsAvailable;
		this.baseFare=baseFare;
		
	}
	/* @return the trainNo */
	public int getTrainNo() {
		return trainNo;
	}
	/* @return the trainName*/
	public String getTrainName() {
		return trainName;
	}
	/* @return the source */
	public String getSource() {
		return source;
	}
	/** @return the destination */
	public String getDestination() {
		return destination;
	}
	/* @return the seatsAvailable*/
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	/* @return the baseFare*/
	public double getBaseFare() {
		return baseFare;
	}
	/* @param trainNo the trainNo to set */
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	/* @param trainName the trainName to set */
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	/* @param source the source to set */
	public void setSource(String source) {
		this.source = source;
	}
	/* @param destination the destination to set */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/* @param seatsAvailable the seatsAvailable to set*/
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	/* @param baseFare the baseFare to set*/
	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}
	public String toString() {
		return trainNo+" "+trainName+" "+source+"-"+destination+" "+" "+seatsAvailable+" "+baseFare;	
	}

}
		
			
			
