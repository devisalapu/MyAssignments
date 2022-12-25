package Utlis;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell {

	//public static void main(String[] args) throws IOException {
	  public static String[][] readData(String filename, int shtNbr)throws IOException {
		
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook("./src/main/java/Utlis/"+filename+".xlsx");
		
		XSSFSheet ws = wb.getSheetAt(shtNbr);
		
		int rowct = ws.getLastRowNum();
		
		short cellct = ws.getRow(0).getLastCellNum();
		
		
		String[][] data = new String[rowct][cellct];
		for(int i = 1;i<=rowct;i++) {
			for(int j=0;j<cellct;j++) {
				XSSFRow row1 = ws.getRow(i);
				XSSFCell cell1 = row1.getCell(j);
				String cellValue = cell1.getStringCellValue();
				data[i-1][j]=cellValue;
			}
				
			}
		
		wb.close();
		return data;
		

	}

}
