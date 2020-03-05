package java_array_exercise;

import java.util.Arrays;

public class Ten {

	public static void main(String[] args) {
		int my_array[] = {3,1,2,4,5}; // Input array here
		System.out.println("INPUT >> " + Arrays.toString(my_array));
		Arrays.sort(my_array);
		System.out.println("OUTPUT >> " + Arrays.toString(my_array));

	}

}
