package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemowithconstructor {
	public static XSSFWorkbook workbook;
	static String projectPath;
	static XSSFSheet sheet;



	public ExcelDemowithconstructor(String excelpath, String sheetName) {
		try {
// moved projectPath = System.getProperty("user.dir"); to class
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetName);
			

		} catch (Exception e) {
			System.out.println("This is your message: "+e.getMessage());
			e.printStackTrace();
		}

		
	}

	public static void main(String[] args) {
		//		getrowcount();
//		getcelldatastring(0,0);
//		getcelldatanumeric(1,1);
	}


	//Create method
	public static void getrowcount() {
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("This is your row count: " +rowCount);
	}
	public static void getcelldatastring(int rowNum,int colNum) {

		
			String getcelldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("My celldata is: "+getcelldata);

	}

	public static void getcelldatanumeric(int rowNum,int colNum) {

			double getcellvalue = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("My celldata is: "+getcellvalue);

	}
}
