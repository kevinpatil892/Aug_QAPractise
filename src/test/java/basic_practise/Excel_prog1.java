package basic_practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_prog1 
{
	public static void main(String[] args) throws IOException 
	{
		String path="C:\\Users\\admin\\Desktop\\July_Automation\\Book1.xlsx";
		
		FileInputStream file= new FileInputStream(path);
		XSSFWorkbook book= new XSSFWorkbook(file);
		
		XSSFSheet sheet= book.getSheet("Sheet1");
		XSSFRow row= sheet.getRow(1);
		XSSFCell cell=row.getCell(1);
		
		String value=cell.getStringCellValue();
		System.out.println(value);
		
		
		
		
	}

}
