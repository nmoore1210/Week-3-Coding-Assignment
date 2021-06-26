import java.util.Arrays;

public class Main {
	
	// Bullet 1 //
	
	public static void main(String[] args) {
		
		// Part 1 //
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93. //
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		
		// Part 2 //
		// Programmatically subtract the value of the first element in the array from the value in the last element of //
		// the array (i.e. do not use ages[7] in your code). Print the result to the console. //
		System.out.println(ages[ages.length-1]-ages[0]);	
		
		
		// Part 3 //
		// Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).//
		int n = ages.length;
		
		int newAges[] = new int[n+1];
				
		int value = 16;
		
		for(int i=0; i<n; i++) {
			
			newAges[i] = ages[i];
		}
		
		newAges[n] = value;
		
		System.out.println(newAges[newAges.length-1]-newAges[0]);
		
		// Part 4 //
		// Use a loop to iterate through the array and calculate the average age. Print the result to the console.//

		System.out.println("The average age is " + averageofArray(newAges));
		
	// Bullet 2 //
		
		// Part 1 //
		// Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.//
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// Part 2 //
		// Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.//
		int sum = 0;
		
		for(int i=0; i<names.length; i++) {
			
			sum = sum + names[i].length();
		}
		
		System.out.println("The average letters per name in the names array is: " + (sum/names.length));
		
		// Part 3 //
		// Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console. //
		
		for(int i=0; i == 0; i++) {
			
			System.out.println(names[i] + " " + names[i+1] + " " + names[i+2] + " " + names[i+3] + " " + names[i+4] + " " + names[i+5]);
		}
		
		
	// Bullet 5 //
	// Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array. //
		
		int[] nameLengths = new int[6];
		
		for(int i=0; i<names.length; i++) {
			nameLengths[i] = names[i].length();
		}
    
	// Bullet 6 //
	// Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console. //
		
		int sumnameLengths = 0;
		for(int i=0; i<nameLengths.length; i++) {
			
			sumnameLengths = sumnameLengths + nameLengths[i];
		}
	
		System.out.println("The sum of letters in the names array is: " + sumnameLengths);
		
	}
	
	// Bullet 7 //
	// Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. //
	// (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”). //

	
	public static String Repeat(String word, int n) { 
		
		String newString = "";
		for (int i = 0; i < n; i++) {
			newString += word;
		}
		
		return newString;
	}
	
	// Bullet 8 //
	// Write a method that takes two Strings, firstName and lastName, and returns a full name //
	// (the full name should be the first and the last name as a String separated by a space). //

	public static String fullName(String firstName, String lastName) {
		
		return firstName + " " + lastName;
	}
	
	// Bullet 9 //
	// Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100. //
	
	public static boolean over100(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	// Bullet 10 //
	// Write a method that takes an array of double and returns the average of all the elements in the array. //
	
	public static double averageArr(double[] arr) {
		
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			
		}
		return sum/arr.length;
	}
	
	// Bullet 11 //
	// Write a method that takes two arrays of double and returns true if the average of the 
	// elements in the first array is greater than the average of the elements in the second array. //
	
	public static boolean compareArr(double[] arr1, double[] arr2) {
		
		if (averageArr(arr1) > averageArr(arr2)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// Bullet 12 //
	// Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is 
	// greater than 10.50. //
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	// Bullet 13 //
	
	// Created this method to determine if I will go outside for the day or will decide to
	// to stay in based off the temperature outside. 
	
	public static boolean willGoOutside(int temp) {
		if (temp > 55 && temp < 105) {
			return true;
		} else {
			return false;
		}
	}
	
	
	//Part 4//
	//Use a loop to iterate through the array and calculate the average age. Print the result to the console.//

	public static int averageofArray(int[] numbers) {
		int sum = 0;
		
		for (int i = 0; i < (numbers.length); i++) {
			
			sum = sum + numbers[i];
			
			
		}
		return (sum / numbers.length); 
	}

	

}





