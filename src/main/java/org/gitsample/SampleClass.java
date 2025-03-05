package org.gitsample;
import java.util.Scanner;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Some sample lines!
		//System.out.println("Hello world!");
		
		int[] score = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0; i<=4 ;i=i+1) {
			
			score[i] = sc.nextInt();
		}
		
		for(int i=0; i<=4 ; i=i+1) {
			
			System.out.println(score[i]);
			
		}
		

	}

}
