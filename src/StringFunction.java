/*
* @Title: StringFunction.java 
* @Description: Demonstrates replaceFirst and Compare methods
* @Author: Vimal Raj Viswaraj
* @EmployeeId: M1135
 */
public class StringFunction {

	public static void main(String[] args) {
		
/*		Write a program that will remove a given characters from the 
		string (String = “REST ASSURED” , remove characters “ST”  )*/
		
		//Test string is defined
		String testStr = "REST ASSURED";
		//Replace the value from the string
		System.out.println(testStr.replaceFirst("ST", ""));
		
//*************************************************************************************************
		/*Write a program to compare two strings using JAVA Program */
		
		String sampleStr = "Vimal";
		String sampleStr1 = "Raj";

		// One way of comparing two string is using equals function
		if (sampleStr.equals(sampleStr1)) {
			System.out.println("Both  string is same!");
		}

		else {
			System.out.println("Both string is't same!");
		}

	}

}