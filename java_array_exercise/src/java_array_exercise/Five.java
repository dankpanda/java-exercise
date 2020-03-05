package java_array_exercise;

public class Five {
	private static void max_min(int arr[])
	{
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		
		System.out.println("The maximum value is >> " + max);
		System.out.println("The minimum value is >> " + min);
	}

	public static void main(String[] args) {
		int my_array[] = {1,9,2,24,30,9,-1}; // Input array here
		
		max_min(my_array);

	}

}
