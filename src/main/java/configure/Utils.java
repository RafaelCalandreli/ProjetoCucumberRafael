package configure;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import gherkin.lexer.Sr_cyrl;

public class Utils {

	public static void logPrint(String strLog) {

		ExtentTest extentTest = TestRule.getExtentTest();

		try {
			efetuarPrintTela(strLog);

			extentTest.log(Status.INFO, strLog,
					MediaEntityBuilder
							.createScreenCaptureFromPath(
									System.getProperty(("user.dir") + "/src/test/resources/"+ strLog +".png"))
							.build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void efetuarPrintTela(String strLog) {

		File arquivo = ((TakesScreenshot) TestRule.getDriver()).getScreenshotAs(OutputType.FILE);

		try {

			FileUtils.copyFile(arquivo,
					new File(("user.dir") + "/src/test/resources/"+strLog +".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void logPass(String strMensagem) {
		ExtentTest extenTest = TestRule.getExtentTest();
		extenTest.log(Status.PASS, strMensagem);
	}
	
	public static void logFail(String strMensagem) {
		ExtentTest extenTest = TestRule.getExtentTest();
		extenTest.log(Status.FAIL, strMensagem);
	}
	

}
