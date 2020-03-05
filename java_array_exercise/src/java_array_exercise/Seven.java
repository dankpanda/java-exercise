package java_array_exercise;
import java.util.ArrayList;
import java.util.Scanner;

public class Seven {
	
	private static void splitter()
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr1 = new ArrayList<Integer>(5);
		ArrayList<Integer> arr2 = new ArrayList<Integer>(5);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Enter value >> ");
			int x = sc.nextInt();
			
			if(i < 5) arr1.add(x);
			else arr2.add(x);
		}
		
		System.out.println(arr1);
		System.out.println(arr2);
	}
	
	public static void main(String[] args) {
		splitter();
	}

}
