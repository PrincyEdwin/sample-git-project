import java.util.Scanner;
import java.lang.System;



public class find {

	void evenorodd(int num)
	{
		
		//System.out.println(num);
		
		if (num % 2 == 0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		} 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a number!");
		int number = sc.nextInt();
		find obj1 = new find();
		obj1.evenorodd(number);
		
		
		
	}

}
