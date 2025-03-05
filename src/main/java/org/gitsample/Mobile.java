package org.gitsample;
import java.util.Scanner;

public class Mobile {
	
	int a=10;
	int b=20;
	
	int apple_price = 20;
	int apple_count = 5;
	
	void total_money()
	{
	System.out.println(apple_price * apple_count);
	}
	
	void Sum()
	{
		int total = a+b;
		System.out.println(total);
	}
	void iphone() {
		
		System.out.println("This is Iphone 16");
	}
	
	void samsung() {
		
		System.out.println("This is Samsung");
	}

	void Oppo() {
		
		System.out.println("This is Oppo");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Mobile obj1 = new Mobile();
		// obj1.Oppo();
		// obj1.Sum();
		
		obj1.total_money();
			
	}

}
