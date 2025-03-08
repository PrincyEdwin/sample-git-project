import java.util.Scanner;
import java.lang.System;


public class School {

	String passorfail(int num)
	{
		System.out.println(num);
		
		if (num >= 45)
		{
			return "pass";
		}
		
		else {
			
			return "fail";
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		School obj1 = new School();
		String result = obj1.passorfail(num);
		System.out.println(result);
		
		
		
	}

}
