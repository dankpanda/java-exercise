package java_array_exercise;

public class Four {
	
	private static void calculate(int arr[])
	{
		int total_sum = 0;
		int total_product = 1;
		
		for(int i = 0; i < arr.length; i++)
		{
			total_sum += arr[i];
			total_product *= arr[i];
		}
		System.out.println("Total sum is >> " + total_sum);
		System.out.println("Total product is >> " + total_product);
		
	}

	public static void main(String[] args) {
		int my_array[] = {2,4,1,1,9}; // Input array here
		
		calculate(my_array);
		

	}

}
