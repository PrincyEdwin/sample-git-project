package org.gitsample;
import java.util.Scanner;

public class Mobile {
	
	// Declared variables
	
	// to use this variables we need to create objects for class then with that we can refer these variables.
	
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
	
	
	// void functions cannot return value so we created function using integer.
	
	int Sum1(int a, int b)
	{
		int total = a+b;
		//System.out.println("total ="+ total);
		return total;
	}
	
	void Sub(int a, int b)
	{
		int c = a-b;
		System.out.println("Value =" + c);
	}
	
	void Mul(int a, int b)
	{
		int c = a*b;
		System.out.println("Answer ="+ c);
	}
	
	String getname(String a) 
	{
		return a;
		
	}
	
	int getphone(int num)
	{
		return num;
	}
	
	
	void Div(int a, int b)
	{
		int c = a/b;
		System.out.println("Answer for Div =" + c);
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
		
		//obj1.total_money();
		
		int total = obj1.Sum1(10,25);
		
		System.out.println("Sum =" +total);
		obj1.Sub(45,25);
		obj1.Mul(45, 75);
		obj1.Div(75, 15);
		
		String name = obj1.getname("Name " + "Jebisha");
		System.out.println(name);
		
		int num = obj1.getphone(123456789);
		System.out.println("Contact " +num);
			
	}

}
