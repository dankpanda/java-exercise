package java_array_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Enter value >> ");
			int A = sc.nextInt();
			array[i] = A;
		}
		
		System.out.println(Arrays.toString(array));

	}

}
