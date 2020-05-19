import java.util.LinkedList;

/*
* @Title: LastInFirstOut.java 
* @Description: Demonstrates Last In First Out concept using LinkedList
* @Author: Vimal Raj Viswaraj
* @EmployeeId: M1135
 */
public class LastInFirstOut {

	public static void main(String[] args) {

		// LinkedList object is created
		LinkedList<String> list = new LinkedList<String>();

		// Data's are posted inside the list using add()
		list.add("I'm");
		list.add("writing");
		list.add("exam");
		list.add("on");
		list.add("exam");

		System.out.println("************Last In First Out************");
		// Displays the complete list
		System.out.println("List : " + list);

		// Displays the last element
		System.out.println("Last IN string is (Tail) : " + list.getLast());

		// Removes the last element
		list.removeLast();

		// Displays the updated list
		System.out.println("After removing last string (LIFO) : " + list);

	}

}
