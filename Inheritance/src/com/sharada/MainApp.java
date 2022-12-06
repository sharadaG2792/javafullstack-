package com.sharada;

import com.Example.Food;
import com.Example.Toys;

public class MainApp {

	public static void main(String[] args) {
		Food f1=new Food();
		f1.addProuct(101, "Apple", 60.00f);
		f1.definedFood("Sour");
		
		Toys t1=new Toys();
		t1.addProuct(102, "Police Car", 300.00f);
		t1.defineToys(true);

		f1.showProduct();
		f1.showFood();
		
		t1.showProduct();
		t1.showToys();
	}

}
