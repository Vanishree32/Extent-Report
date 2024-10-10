package extent;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ListenerImplementationClass implements ITestListener{
	ExtentReports ex=ExtentReportClass.getExtentReport();
	
	 public void onTestStart(ITestResult result) {
		   // ex.createTest(result.getMethod().getMethodName());
		    ex.createTest("test");
		  }

		 
		
	public void onTestSuccess(ITestResult result) {
	System.out.println("hi");
		  }
		 
		  public void onTestFailure(ITestResult result) {
		    // not implemented
		  }
	
		  public  void onFinish(ITestContext context) {
			  ex.flush();
			    }
	

}
