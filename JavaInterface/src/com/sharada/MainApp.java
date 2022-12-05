
package com.sharada;

class car
{
	public String carColor;
	public float fuelCap;
	
	public car() {
		this.carColor="White";
		this.fuelCap=40.00f;
	}

	public car(String carColor, float fuelCap)
	{
		this.carColor="carColor";
		this.fuelCap=fuelCap;
	}
}

class BMW extends car
{
	public String model;
	
	public BMW() {
		super();
		this.model=model;
	}
	
	public BMW(String model) {
		super("Red",50.00f);
		this.model=model;
	}
}

public class MainApp {

	public static void main(String[] args) {
		BMW b1=new BMW();
		System.out.println("Car clor = "+b1.carColor+"\tFule Capacity = "+b1.fuelCap+"\tmodel = "+b1.model);
	
		BMW b2=new BMW("R class");
		System.out.println("Car clor = "+b1.carColor+"\tFule Capacity = "+b1.fuelCap+"\tmodel = "+b1.model);
	
	}

}
