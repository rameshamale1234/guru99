package Guru99;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilityclass {
public static String getPFData(String key) throws IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\rames\\eclipse-workspace\\Project1\\Confi.Propertires");
	Properties p=new Properties();
	p.load(file);
	String value = p.getProperty(key);
	return value;
}
public static String getTestData(int rowindex,int cellIndex) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\rames\\eclipse-workspace\\Project1\\TestData\\Mastar-PJ.xlsx");
    XSSFWorkbook workbook=new   XSSFWorkbook(file); 
	XSSFSheet sh = workbook.getSheet("Data");
	String value = sh.getRow(rowindex).getCell(cellIndex).getStringCellValue();
	System.out.println("bmbm");
	return value;

}
public static void captureScreenshot(WebDriver driver,int TCID) throws IOException 
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\sanjay\\eclipse-workspace\\Nov27 Eve Selenium\\Screenshots\\TestCase"+TCID+".jpg");
	org.openqa.selenium.io.FileHandler.copy(src, dest);
}
}