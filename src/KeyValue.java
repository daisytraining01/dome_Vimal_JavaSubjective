import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
/*
* @Title: KeyValue.java 
* @Description: Write a program to remove duplicate values from the has set that has the key value pair as below

Key 1: TestVal1
Key 2: TestVal2
Key 3: TestVal1
Key 4: TestVal2
Key 5: TestVal2
Key 6: TestVal3

* @Author: Vimal Raj Viswaraj
* @EmployeeId: M1135
 */
public class KeyValue {

	public static void main(String[] args) {
		
		//HashMap object is created
		HashMap<String, String> mapValues = new HashMap<String, String>();
		
		//Values are put inside the HashMap
		mapValues.put("Key 1", "TestVal1");
		mapValues.put("Key 2", "TestVal2");
		mapValues.put("Key 3", "TestVal1");
		mapValues.put("Key 4", "TestVal2");
		mapValues.put("Key 5", "TestVal2");
		mapValues.put("Key 6", "TestVal3");
		
		//Collection object is defined
		Collection<String> list = mapValues.values();
		
		//For loop using Iterator
		for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
			
			//Checks the condition
			if (Collections.frequency(list, itr.next()) > 1) {
				
				//Removes the duplicate values
				itr.remove();
			}
		}
		
		//Displays the final list
		System.out.println(mapValues);

	}
}
