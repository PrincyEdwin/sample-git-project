package org.gitsample;
import java.util.Scanner;

public class challenge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] number = new int[10];
		
		System.out.println("Enter a number for which we can print the multiplication table");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i=1; i<=10 ;i=i+1)
		{
			System.out.println(i +"x"+a+ "=" +i*a);
			
		}
		
		
		
		
	}

}
