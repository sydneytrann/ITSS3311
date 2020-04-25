import java.util.Scanner;

public class StrictlyIdentical {

//Sample Run 1:
//Enter 5 elements of list1 : 
//23
//Enter 5 elements of list1 : 
//55
//Enter 5 elements of list1 : 
//31
//Enter 5 elements of list1 : 
//2
//Enter 5 elements of list1 : 
//10
//Enter 5 elements of list2 : 
//23
//Enter 5 elements of list2 : 
//55
//Enter 5 elements of list2 : 
//31
//Enter 5 elements of list2 : 
//2
//Enter 5 elements of list2 : 
//10
//Two lists are strictly identical.
	
//Sample Run 2:
//Enter 5 elements of list1 : 
//23
//Enter 5 elements of list1 : 
//55
//Enter 5 elements of list1 : 
//31
//Enter 5 elements of list1 : 
//2
//Enter 5 elements of list1 : 
//10
//Enter 5 elements of list2 : 
//23
//Enter 5 elements of list2 : 
//55
//Enter 5 elements of list2 : 
//3
//Enter 5 elements of list2 : 
//2
//Enter 5 elements of list2 : 
//10
//Two lists are not strictly identical.
	
//Sample Run 3:
//Enter 5 elements of list1 : 
//1
//Enter 5 elements of list1 : 
//2
//Enter 5 elements of list1 : 
//3
//Enter 5 elements of list1 : 
//4
//Enter 5 elements of list1 : 
//5
//Enter 5 elements of list2 : 
//1
//Enter 5 elements of list2 : 
//2
//Enter 5 elements of list2 : 
//3
//Enter 5 elements of list2 : 
//4
//Enter 5 elements of list2 : 
//5
//Two lists are strictly identical.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		//Create two arrays that allow for integers to be stored in size 5
		int[] list1 = new int[5];
		
		int[] list2 = new int[5];
		
		//Creates a for loop to assign enter values to an array
		for(int i = 0; i<5; i++) 
		{
			//Tell the user to input five numbers for the first array
			System.out.println("Enter 5 elements of list1 : ");
			
			//Allows for the user-inputed values to be assigned to array "list1"
			list1[i] = input.nextInt();
			
		}
		//Creates a for loop to assign enter values to an array
		for(int i = 0; i<5; i++) 
		{
			//Tell the user to input five numbers for the second array
			System.out.println("Enter 5 elements of list2 : ");
			
			//Allows for the user-inputed values to be assigned to array "list2"
			list2[i] = input.nextInt();
		}
		
		//Creating a boolean method "equals" that calls on arrays: list1 and list2
		boolean equals = equals(list1, list2);
		
		//Checks if both arrays are identical to return a statement
		if (equals == true) 
		{
			//Print out the following sentence if arrays are identical
			System.out.println("Two lists are strictly identical.");	
		}
		else 
		{
			//Print out the following statement if arrays are not the same
			System.out.println("Two lists are not strictly identical.");
		}
	}

	//Create a new method equals that includes arrays, list1 and list 2
	public static boolean equals(int[] list1, int[] list2) 
	{
		//Create new boolean method that is equal to true 
		boolean equal = true; 
		
		//Checks if both the lengths of the arrays, list1 and list2, are the same
		if (list1.length == list2.length) 
		{
			//Create for loop that checks every element of array "list1"
			for(int i = 0; i < list1.length; i++) 
			{
				//Checks if both arrays are not equal to each other
				if (list1[i] != list2[i]) 
				{
					//Set boolean variable "equal" to false
					equal = false;
				}
			}
		}
		//If both arrays are equal to each other, return boolean variable "equal"
		return equal; 
	}
}
