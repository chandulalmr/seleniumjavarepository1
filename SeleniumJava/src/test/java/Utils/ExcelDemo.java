package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	public static XSSFWorkbook workbook;
	static String projectPath;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		//		getrowcount();
		getcelldatastring();
		getcelldatanumeric();
	}

	//Create method
	public static void getrowcount() {
		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/excel/New.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("This is your row count: " +rowCount);

		} catch (IOException e) {
			System.out.println("This is your message: "+e.getMessage());
			e.printStackTrace();
		}

	}
	public static void getcelldatastring() {

		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/excel/New.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String getcelldata = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("My celldata is: "+getcelldata);

		} catch (Exception e) {
			System.out.println("This is your message: "+e.getMessage());
			e.printStackTrace();
		}

	}

	public static void getcelldatanumeric() {

		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/excel/New.xlsx");
			sheet = workbook.getSheet("Sheet1");
			double getcellvalue = sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println("My celldata is: "+getcellvalue);

		} catch (Exception e) {
			System.out.println("This is your message: "+e.getMessage());
			e.printStackTrace();
		}

	}
}
