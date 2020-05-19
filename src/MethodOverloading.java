/*
* @Title: MethodOverloading.java 
* @Description: Demonstrates Method Overloading and Interface
* @Author: Vimal Raj Viswaraj
* @EmployeeId: M1135
 */
public class MethodOverloading implements InterfaceSample {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public float sum(float a, float b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public float sum(int a, float b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public static void main(String[] args) {
		
		//Object for class is created
		MethodOverloading obj = new MethodOverloading();
		
		//Calling method
		int sumInt = obj.sum(10, 20);
		float sumFloat = obj.sum(5.5f, 8.9f);
		float sumIntFloat = obj.sum(15, 98.78f);
		
		//Displays the values
		System.out.println("Sum of two integer is: " + sumInt);
		System.out.println("Sum of two float is: " + sumFloat);
		System.out.println("Sum of one integer and one float is: " + sumIntFloat);

	}

}
