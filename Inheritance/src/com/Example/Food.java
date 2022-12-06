package com.Example;

public class Food extends Product{
	
	public String flavor;
	
	public void definedFood(String flavor)
	{
		this.flavor=flavor;
	}
	public void showFood()
	{
		System.out.println(this.flavor);
	}
}
