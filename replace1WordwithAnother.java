import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

// done by krishna Kanth

/**
 * Write a logic to replace one word with another?*/
public class replace1WordwithAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rootPath = System.getProperty("user.dir");
		
		File myfile = new File(rootPath, "myfile.txt");
		
		try(FileReader fr = new FileReader(myfile);BufferedReader br = new BufferedReader(fr)){
        	String line = null, text ="";        	
        	while((line=br.readLine())!=null){
        		text+=line+System.getProperty("line.separator");        		
        	}
        	//System.out.println(text);
        	text=text.replaceAll("Assignment", "Seventh(7th) Homework");
        	//System.out.println(text);
        	try (FileWriter fw = new FileWriter(myfile);BufferedWriter bw = new BufferedWriter(fw)){
        		bw.write(text);
            	bw.flush();
        	}
        	
        	
        	System.out.println("Replace Successfull");
        	
        }catch(Exception e){
        	e.printStackTrace();
        }
		
		

	}

}
