package week6.day1.TestNGassignments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell {

	//public static void main(String[] args) throws IOException {
	  public static String[][] readData(String filename)throws IOException {
		
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook("./src/main/java/data/"+filename+".xlsx");
		
		XSSFSheet ws = wb.getSheetAt(0);
		
		XSSFRow row = ws.getRow(1);
		
		XSSFCell cell = row.getCell(0);
		
		String data1 = cell.getStringCellValue();
		
		System.out.println(data1);
		int rowct = ws.getLastRowNum();
		System.out.println(rowct);
		int numberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println(numberOfRows);
		
		short cellct = ws.getRow(0).getLastCellNum();
		System.out.println(cellct);
		/*for(int i = 1;i<=rowct;i++) {
			for(int j=0;j<3;j++) {
				XSSFRow row1 = ws.getRow(i);
				
				XSSFCell cell1 = row1.getCell(j);
				
				String data1 = cell1.getStringCellValue();
				System.out.println(data1);
			}
				
			}*/
		String[][] data = new String[rowct][cellct];
		for(int i = 1;i<=rowct;i++) {
			for(int j=0;j<3;j++) {
				XSSFRow row1 = ws.getRow(i);
				
				XSSFCell cell1 = row1.getCell(j);
				
				String cellValue = cell1.getStringCellValue();
				data[i-1][j]=cellValue;
				//System.out.println(data);
			}
				
			}
		
		wb.close();
		return data;
		

	}

}
