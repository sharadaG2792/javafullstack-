package com.Example;

public class Product {
	public int prodid;
	public String prodname;
	public float price;
	
	public void addProuct(int prodid,String prodname,float price)
	{
		this.prodid=prodid;
		this.prodname=prodname;
		this.price=price;
	}
	public void showProduct()
	{
		System.out.println(this.prodid+"\t"+this.prodname+"\t"+this.price);
	}
}
