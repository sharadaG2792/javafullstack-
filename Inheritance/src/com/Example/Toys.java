package com.Example;

public class Toys extends Product{
	public boolean isRemoteDevice;
	
	public void defineToys(boolean isRemoteDevice)
	{
		this.isRemoteDevice=isRemoteDevice;
	}
	
	public void showToys()
	{
		System.out.println(this.isRemoteDevice);
	}

}
