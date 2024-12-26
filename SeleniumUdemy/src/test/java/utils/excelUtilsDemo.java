package utils;

public class excelUtilsDemo {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		ExcelUtil excel = new ExcelUtil(projectPath+"/excel/data.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getColCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNum(1, 1);
	}

}
