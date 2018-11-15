package KDD;

public class DriverScript {
	public static void main(String[] args) throws Exception 
	 {
	 //Declaring the path of the Excel file with the name of the Excel file
	 String sPath = "C:\\Users\\Vampire\\Desktop\\DataEngine_kdd.xlsx"; 
	 
	 //Here we are passing the Excel path and SheetName as arguments to connect with Excel file
	 ReadExcelData.setExcelFile(sPath, "Test Steps");
	 
	 for (int iRow=1;iRow<=7;iRow++)
	 {
	 String sActions = ReadExcelData.getCellData(iRow, 1); 
	 
	 //Comparing the value of Excel cell with all the keywords in the "Actions" class
	 if(sActions.equals("openBrowser"))
	 { 
	 //This will execute if the excel cell value is 'openBrowser'    
	 //Action Keyword is called here to perform action
		 Methods.openBrowser();
	 }
	 else if(sActions.equals("navigate"))
	 {
		 Methods.navigate();
	 }
	 else if(sActions.equals("input_Username"))
	 {
		 Methods.input_Username();
	 }
	 else if(sActions.equals("input_Password"))
	 {
		 Methods.input_Password();
	 }
	 else if(sActions.equals("click_Login"))
	 {
		 Methods.click_Login();
	 } 
	 else if(sActions.equals("verify_Login"))
	 {
		 Methods.verify_login();
	 } 
	 else if(sActions.equals("closeBrowser"))
	 {
		 Methods.closeBrowser();
	 } 
	 }
	 }
}
