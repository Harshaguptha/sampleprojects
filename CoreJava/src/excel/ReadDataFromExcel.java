package excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	    	public static void readXLSXFile() throws IOException
	    	{
	    		InputStream ExcelFileToRead = new FileInputStream("C:/Users/madhusudhan.reddy/Desktop/dockerimages.xlsx");
	    		XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
	    		
	    		XSSFWorkbook test = new XSSFWorkbook(); 
	    		
	    		XSSFSheet sheet = wb.getSheetAt(0);
	    		XSSFRow row; 
	    		XSSFCell cell;

	    		Iterator rows = sheet.rowIterator();

	    	while (rows.hasNext())
	    		{
	    			row=(XSSFRow) rows.next();
	    			Iterator cells = row.cellIterator();
	    			while (cells.hasNext())
	    			{
	    				cell=(XSSFCell) cells.next();
	    		
	    				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
	    				{
	    					System.out.print(cell.getStringCellValue()+" | ");
	    				}
	    				else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
	    				{
	    					System.out.print(cell.getNumericCellValue()+" | ");
	    				}
	    				else
	    				{
	    					//U Can Handel Boolean, Formula, Errors
	    				}
	    			}
	    			System.out.println();
	    		}
	    	
	    		
	    		/*FileInputStream fileInputStream = null;
	    	    XSSFSheet xssfResultSheet = null;
	    	    String filePath = "C:/Users/madhusudhan.reddy/Desktop/dockerimages.xlsx";
	    	    fileInputStream = new FileInputStream(new File(filePath));
	    	    XSSFWorkbook workbook = null;
	    	    workbook = new XSSFWorkbook(fileInputStream);
	    	    xssfResultSheet = workbook.getSheet("Sheet1");
	    	    int iRowCount = xssfResultSheet.getLastRowNum();

	    	    for (int i = 1; i <= iRowCount; i++) {
	    	        Row resultRow = xssfResultSheet.getRow(i);
	    	        System.out.println(new DataFormatter().formatCellValue(resultRow.getCell(0)));
	    	    }
	    		*/
	    		 
	    	}
	    	
	    	

	    	public static void main(String[] args) throws IOException {
	    		
	    	
	    		readXLSXFile();

	    	}
}
