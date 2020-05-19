import java.util.Scanner;

/*
* @Title: EncapsulationAndInheritance.java 
* @Description: Program to demonstrate constructor, encapsulation and Inheritance .
* @Author: Vimal Raj Viswaraj
* @EmployeeId: M1135
 */
public class EncapsulationAndInheritance {

	public static void main(String[] args) {
		// InheritedClass object is created
		InheritedClass obj = new InheritedClass();

		// Scanner class defined
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name : ");
		// Gets input from user
		String name = input.next();
		obj.setUserName(name);

		System.out.println("Enter Employee Id : ");
		int emp = input.nextInt();
		obj.setEmpId(emp);

		// Displays the details stored
		System.out.println("******************Details******************");
		System.out.println("Name: " + obj.getUserName());
		System.out.println("Id: " + obj.getEmpId());

	}

}
