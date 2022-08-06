package Utils;

import org.testng.reporters.jq.Main;

public class excelutils_Demo {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		
//we need create object for our class
		ExcelDemowithconstructor excel = new ExcelDemowithconstructor(projectPath+"/excel/New.xlsx", "Sheet1");

		// now we can call function
		excel.getrowcount();
		excel.getcelldatastring(0, 0);
		excel.getcelldatanumeric(1, 1);
	}

}
