//done by Krishna Kanth
/**
 *  Identify number of words  in your file?*/


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class countWords {

	public static void main(String[] args) {


		String rootPath = System.getProperty("user.dir");
		File myfile =  new File(rootPath, "myfile.txt");;	
		
		System.out.println("Select a text file to display the number of words in that file");
		JFileChooser chooser = new JFileChooser(rootPath);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
           
                    myfile= new File(chooser.getSelectedFile().getPath());
        }else{
        	System.err.println("You did not choose a text file. If there is myfile.txt in your directory, it is selected automatically");
        	
        }
        
        
        
        try(FileReader fr = new FileReader(myfile);BufferedReader br = new BufferedReader(fr)){
        	String line = null;
        	int count =0;
        	while((line=br.readLine())!=null){
        		StringTokenizer str = new StringTokenizer(line);
        		count+=str.countTokens();
        		
        	}
        	System.out.println("Number of words in the selected text file is: "+count);
        	
        }catch(Exception e){
        	e.printStackTrace();
        }
        
	}

}
