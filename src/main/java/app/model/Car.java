package app.model;

public class Car {
	
	public static final int wheels = 4;
	private String color;
	
	public Car(String color){
		setColor(color);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static int getWheels() {
		return wheels;
	}
}
