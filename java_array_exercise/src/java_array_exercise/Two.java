package java_array_exercise;

import java.util.Scanner;
import java.util.ArrayList;


public class Two {
	
	private static void check(ArrayList<Integer> array, int value) {
		if(array.contains(value) == true)
		{
			System.out.println("The value " + value + " is present in the array");
		}
		else
		{
			System.out.println("The value " + value + " is not present in the array");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>(10);
		
		for(int i = 0; i < 10; i++)	
		{
			System.out.print("Enter value >> ");
			int A = sc.nextInt();
			array.add(i,A);
		}

		System.out.print("Enter value to check >> ");
		int value_check = sc.nextInt();
		check(array,value_check);
		
	}

}
