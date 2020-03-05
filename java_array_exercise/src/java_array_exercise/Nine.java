package java_array_exercise;
import java.util.Arrays;
public class Nine {

	private static void right(int arr[])
	{
		int arr1[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(i == arr.length -1) arr1[0] = arr[i];
			else arr1[i+1] = arr[i];
		}
		System.out.println("INPUT >> " + Arrays.toString(arr));
		System.out.println("OUTPUT >> " + Arrays.toString(arr1));
		
	}
	public static void main(String[] args) {
		int my_array[] = {4,9,2,30,3}; // Input array here
		right(my_array);

	}

}
