package java_array_exercise;
import java.util.Arrays;

public class Six {
	private static void array_check(int arr[]) // Used for array containing integers
	{
		int forward[] = arr;
		int backward[] = new int[arr.length];
		int c = 0;
		
		for(int i = forward.length-1; i>=0; i--)
		{
			backward[c] = forward[i];
			c++;
		}
		
		if(Arrays.equals(forward, backward)) System.out.println("True");
		else System.out.println("False");
				
	}
	
	private static void array_check(String arr[]) // Used for array containing strings
	{
		String forward[] = arr;
		String backward[] = new String[arr.length];
		int c = 0;
		
		for(int i = forward.length-1; i>=0; i--)
		{
			backward[c] = forward[i];
			c++;
		}
		
		if(Arrays.equals(forward, backward)) System.out.println("True");
		else System.out.println("False");
		
	}

	public static void main(String[] args) {
		int my_array[] = {1,2,3,2,1}; // Input array here
		String my_array2[] = {"Hello","Testing","Hello"};
		
		array_check(my_array);
		array_check(my_array2);
		
	}

}
