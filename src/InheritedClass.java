import java.util.Random;
/*
* @Title: InheritedClass.java 
* @Description: Demonstrates Inheritance and Constructor
* @Author: Vimal Raj Viswaraj
* @EmployeeId: M1135
 */
public class InheritedClass extends EncapsulatedClass {
	// Constructor method
	public InheritedClass() {

		Random rand = new Random();
		// Returns random number
		System.out.println("Employee Record created : " + rand.nextInt());

	}

}
