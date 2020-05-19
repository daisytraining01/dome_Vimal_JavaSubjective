import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* @Title: PrintingAlternateLinesInFiles.java 
* @Description: program to read all the lines from the text file.
* 				While printing, print only the alternate lines and amend “#” to every line that is printed
* @Author: Vimal Raj Viswaraj
* @EmployeeId: M1135
 */
public class PrintingAlternateLinesInFiles {

	public static void main(String[] args) throws IOException {

		// FileInputStream object is created
		FileInputStream fstream = new FileInputStream("./SupportDocuments/Sales.txt");
		// BufferedReader object is created and input file path is assigned
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		// Local variables assigned
		String strLine;
		int n = 1;

		// Try block starts
		try {
			// Reads line by line
			while ((strLine = br.readLine()) != null) {
				// Prints only even lines
				if (n % 2 == 0) {
					// StringBuilder object is created a
					StringBuilder obj = new StringBuilder(strLine);

					// appends # to the end of each line
					obj.append("#");
					System.out.println(obj);

				}
				n++;
			}
		} 
		//Catch block 
		catch (IOException e) {

			e.printStackTrace();

		} 
		//Finally block
		finally {
			//closing the file stream
			fstream.close();

		}
	}

}
