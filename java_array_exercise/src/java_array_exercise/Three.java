package java_array_exercise;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[20];
		int positive = 0;
		int negative = 0;
		int even = 0;
		int odd = 0;
		int zero = 0;
		
		for(int i = 0; i < 20; i++)
		{
			System.out.print("Enter value >> ");
			int A = sc.nextInt();
			array[i] = A;
			
			if(A > 0) ++ positive;
			else if(A != 0) ++negative;
			
			if((A % 2) == 0) ++ even;
			else ++odd;
			
			if(A == 0) ++ zero;
			
		}
		System.out.println("Number of positive numbers >> " + positive);
		System.out.println("Number of negative numbers >> " + negative);
		System.out.println("Number of even numbers >> " + even);
		System.out.println("Number of odd numbers >> " + odd);
		System.out.println("Number of 0's >> " + zero);
		
	}

}
