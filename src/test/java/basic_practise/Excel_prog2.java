package basic_practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_prog2 
{
	public static void main(String[] args) throws IOException 
	{
		String path="C:\\Users\\admin\\Desktop\\July_Automation\\Book1.xlsx";
		FileInputStream file= new FileInputStream(path);
		XSSFWorkbook book= new XSSFWorkbook(file);
		XSSFSheet sheet= book.getSheet("sheet1");
		
		int totalrow=sheet.getLastRowNum();
		
		for(int i=0;i<=totalrow;i++)
		{	
			for(int j=0;j<=1;j++)
			{
				XSSFRow row= sheet.getRow(i);
				XSSFCell cell=row.getCell(j);
				String data=cell.getStringCellValue();
				System.out.println(data);
			}
			
			
		}
		
	}

}
