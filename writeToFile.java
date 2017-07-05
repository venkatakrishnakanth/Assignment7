/* Done by Krishna Kanth*/

/** Write in to file using BufferedWriter? */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rootPath = System.getProperty("user.dir");
				
		File myfile = new File(rootPath, "myfile.txt");
		
		BufferedWriter bw=null;
		try {
			FileWriter fw = new FileWriter(myfile);
			bw = new BufferedWriter(fw);
			bw.write("I have written this to my file.");
			bw.newLine();
			bw.write("My name is Krishna Kanth.\nThis is Assignment on files.");
			bw.newLine();
			bw.write("The same file will be used in another programs to count, and replace words.\n");
			bw.newLine();
			bw.write("In 3rd Program, the word Assignment will be replaced by seventh(7th) Homework ");
			System.out.println("Write Successfull");
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{bw.close();
			System.out.println("Buffered Writer closed.");
		}
		catch(IOException e1)
		{System.out.println("Error on closing buffered writer");}

		
	}

}
