package extent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportClass {
	
	
	public static ExtentReports getExtentReport() {
		String path=System.getProperty("user.dir")+"/reports/index.html";
		ExtentSparkReporter esr=new ExtentSparkReporter(path);
		esr.config().setReportName("Vani");
		esr.config().setDocumentTitle("Test Results");
		ExtentReports ext=new ExtentReports();
		ext.attachReporter(esr);
		
		return ext;
		
		
	}

}
