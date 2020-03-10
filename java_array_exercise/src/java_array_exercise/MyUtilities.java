package java_array_exercise;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class MyUtilities {

	Scanner sc = new Scanner(System.in);
	
	// Number 1
	public int[] inputValues() {
		System.out.print("Input length of array >> ");
		int length = sc.nextInt();
		int myArray[] = new int[length];
		
		for(int i = 0; i < length; i++) {
			System.out.print("Enter value number " + (i+1) + " >>" );
			int value = sc.nextInt();
			myArray[i] = value;
		}
		
		return myArray;
	}
	
	public void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	// Number 2
	public boolean searchNumber(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				System.out.println(key + " is present in the array");
				return(true);
			}
		}
		System.out.println(key + " is not present in the array");
		return(false);
	}
	
	// Number 3
	public void valueOrganize() {
		int odd = 0, even = 0, positive = 0, negative = 0, zeros = 0;
		int[] myArray = inputValues();
		
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] > 0) positive++;
			if(myArray[i] < 0) negative++;
			if(myArray[i] == 0) zeros++;
			if(myArray[i]%2 == 0) even++;
			else odd++;
		}
		System.out.println("Number of positive numbers >> " + positive);
		System.out.println("Number of negative numbers >> " + negative);
		System.out.println("Number of odd numberse >> " + odd);
		System.out.println("Number of even numbers >> " + even);
		System.out.println("Number of 0's >> " + zeros);
	}
	
	// Number 4
	public void sumProduct() {
		int myArray[] = inputValues();
		int sum = 0;
		int product = 1;
		
		for(int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
			product *= myArray[i];
		}
		
		System.out.println("Total sum >> " + sum);
		System.out.println("Total product >> " + product);
	}
	
	// Number 5
	public void largeSmall() {
		int myArray[] = inputValues();
		int max, min;
		
		Arrays.sort(myArray);
		max = myArray[-1];
		min = myArray[0];
		
		System.out.println("Maximum value >> " + max);
		System.out.println("Minimum value >> " + min);
	}
	
	// Number 6
	public void reverseCheck() {
		int myArray[] = inputValues();
		int backwards[] = new int[myArray.length];
		int counter = 0;
		
		for(int i = myArray.length; i > 0; i--) {
			backwards[counter] = myArray[i];
			counter++;
		}
		
		if(Arrays.equals(backwards, myArray))System.out.println("It is equal");
		else System.out.println("It is not equal");
	}
	
	// Number 7
	public void splitter() {
		int myArray[] = new int[10];
		int frontArray[] = new int[5];
		int backArray[] = new int[5];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Enter value number " + (i+1) + " >>" );
			int value = sc.nextInt();
			myArray[i] = value;
			if(i < 5) frontArray[i] = myArray[i];
			else backArray[i] = myArray[i];
		}
		
		System.out.println("First array >> " + Arrays.toString(frontArray));
		System.out.println("Second array >> " + Arrays.toString(backArray));
	}
	
	// Number 8
	public void maxSplit() {
		System.out.println("Input length of array >> ");
		int length = sc.nextInt();
		int temp[] = new int[length];
		int secondMax = 0;
		int maxCounter = 0;
		int max = 0;
		
		for(int i = 0; i < length; i++) {
			System.out.print("Enter value number " + (i+1) + " >>" );
			int value = sc.nextInt();
			temp[i] = value;
		}	
		
		System.out.println("Input Array >> " + Arrays.toString(temp));
		
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] > max) max = temp[i];
			if(temp[i] > secondMax & temp[i] != max) secondMax = temp[i];
		}
		
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] == max) maxCounter ++;
		}
		
		ArrayList<Integer> myArray = new ArrayList<Integer>(length + maxCounter);
		
		for(int i = 0;i <temp.length;i++)
		{
			if(temp[i] != max) myArray.add(temp[i]);
			
			else
			{
				myArray.add(secondMax);
				myArray.add(max-secondMax);
			}
			
		}
		System.out.println("Output Array >> " + myArray.toString());
	}
	
	// Number 9
	public void circularRight() {
		int myArray[] = inputValues();
		System.out.println("Input Array >> " + Arrays.toString(myArray));
		
		for(int i = 0; i < myArray.length; i++) {
			if(i != myArray.length-1) myArray[i+1] = myArray[i];
			else myArray[i] = myArray[0];
		}
		
		System.out.println("Output Array >> " + Arrays.toString(myArray));
	}
	
	// Number 10
	public void sortArray() {
		int myArray[] = inputValues();
		System.out.println("Input Array >> " + Arrays.toString(myArray));
		Arrays.sort(myArray);
		System.out.println("Output Array >> " + Arrays.toString(myArray));
	}
}

	
