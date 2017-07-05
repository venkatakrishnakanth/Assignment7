//done by Krishna Kanth

/** Write a program to create an xls file and update the file with Student info id, name marks and fee. */

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class student{
	private int id;	
	private String name;
	private int marks;
	private double fee;
	
	public student(int id, String name, int marks, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	
}




public class studentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1 = new student(10,"Krishna",78,5000.00);
		student s2 = new student(34,"Kanth",85,5720.00);
		student s3 = new student(43,"Venkata",49,44100.00);
		student s4 = new student(67,"Musunuru",64,4040.00);
		
		List<student> slist = Arrays.asList(s1,s2,s3,s4);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Student Info");
		
		int rowcount=0;
		Row row = sheet.createRow(rowcount);
		Cell cell = row.createCell(1);
		cell.setCellValue("ID");
		
		cell = row.createCell(2);
		cell.setCellValue("NAME");
		
		cell = row.createCell(3);
		cell.setCellValue("MARKS");
		
		cell = row.createCell(4);
		cell.setCellValue("FEE");
		
		for(student s : slist){
			 row = sheet.createRow(++rowcount);
			WritetoStudent(s,row);
		}
		
		String rootPath=System.getProperty("user.dir");
		File f= new File(rootPath, "Student info.xlsx");
		
		try (FileOutputStream fos = new FileOutputStream(f)) {
	        workbook.write(fos);
	        System.out.println("write Successfull");
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

	private static void WritetoStudent(student s, Row row) {
		// TODO Auto-generated method stub
		Cell cell = row.createCell(1);
	    cell.setCellValue(s.getId());
	 
	    cell = row.createCell(2);
	    cell.setCellValue(s.getName());
	 
	    cell = row.createCell(3);
	    cell.setCellValue(s.getMarks());
	    
	    cell = row.createCell(4);
	    cell.setCellValue(s.getFee());
	}

}
