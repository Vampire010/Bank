package SighnUp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sighnup_DataDriven
{
	String path="./Excel_Data/Signup_Data_Sheet.xlsx";
	//File f=new File("path");

	public String getdata(String sname,int rno,int cno) throws IOException
	{
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook w=new XSSFWorkbook(fis);
		XSSFSheet s=w.getSheet(sname);
		String s1=s.getRow(rno).getCell(cno).getStringCellValue();
		return s1;
		
	}

	public String setdata(String sname,int rno,int cno,String n) throws IOException

	{
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook w=new XSSFWorkbook(fis);
		XSSFSheet s=w.getSheet(sname);
		s.getRow(rno).createCell(cno).setCellValue(n);
		FileOutputStream fos=new FileOutputStream(path);
		w.write(fos);
		String data="program complted";
		return data;
	}

}
