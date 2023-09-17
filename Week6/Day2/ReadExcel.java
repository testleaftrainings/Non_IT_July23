package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		// set up the path for excel
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		// Get into the sheet based index and String
		XSSFSheet ws = wb.getSheetAt(0);	
		// row count	
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		// column(cell) count	
		short columnCount = ws.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		//string [] []
		String[][] data =new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			
			XSSFRow row = ws.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {
				
				XSSFCell cell = row.getCell(j);
				// Read the data from cell
				String CellValue = cell.getStringCellValue();
				data[i-1][j]=CellValue;//0 0
				System.out.println(CellValue);
			}

		}
		// Close the file
		wb.close();
		return data;

	}

}
