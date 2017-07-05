// done by Krishna Kanth

/**
 * Write a program to create an xls file and update the file with week names? */



import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class weekNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("WeeksSheet");
		Object[][] weekData = {
				{"DAY OF WEEK", "NAME"},
                {"First Day of Week", "Monday"},
                {"Second Day of Week", "Tuesday"},
                {"Third Day of Week", "Wednesday"},
                {"Fourth Day of Week", "Thursday"},
                {"Fifth Day of Week", "Friday"},
                {"Sixth Day of Week", "Saturday"},
                {"Seventh Day of Week", "Sunday"},
        };
		
		
		int rowcount =0;
		for(Object[] a : weekData ){
			Row row = sheet.createRow(++rowcount);
			
			int colcount=0;
			for(Object field: a){
				Cell cell = row.createCell(++colcount);
				cell.setCellValue((String) field);
				
			}
		}
		
		
		String rootPath = System.getProperty("user.dir");
		File f = new File(rootPath, "WEEKS.xlsx");
		try (FileOutputStream fos = new FileOutputStream(f)) {
            workbook.write(fos);
            System.out.println("Write successfull");
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		

	}

}
