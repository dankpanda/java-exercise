package java_array_exercise;

import java.util.ArrayList;


public class Eight {
	private static void max_split(int arr[])
	{
		int max_counter = 0;
		int max = 0;
		int second_max=0;
		int temp[] = arr;
		
		for(int i = 0; i <arr.length;i++)
		{
			if(arr[i] > max) max = arr[i];
			if(arr[i] > second_max & arr[i] != max) second_max = arr[i];
		}
		
		
		for(int i = 0; i <arr.length;i++)
		{
			if(arr[i] == max) max_counter++;
		}
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>(arr.length+max_counter);
		
		for(int i = 0;i <arr.length;i++)
		{
			if(arr[i] != max) arr1.add(temp[i]);
			
			else
			{
				arr1.add(second_max);
				arr1.add(max-second_max);
			}
			
		}
		System.out.print(arr1.toString());
		
	}
	public static void main(String[] args) {
		int my_array[] = {4,8,3,6,2,9,9};
		System.out.print("Sample input >> ");
		for(int i = 0; i < my_array.length;i++ )
		{
			System.out.print(my_array[i]+" ");
		}
		
		System.out.print("\nOutput >> ");
		max_split(my_array);

	}

}
