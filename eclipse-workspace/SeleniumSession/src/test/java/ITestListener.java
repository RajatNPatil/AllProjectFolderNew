import org.testng.ITestContext;
import org.testng.ITestResult;

public interface ITestListener {
	
	    void onTestStart(ITestResult result);
	    
	    void onTestSuccess(ITestResult result);
	    
	    void onTestFailure(ITestResult result);
	    
	    void onTestSkipped(ITestResult result);
	    
	    void onTestFailedButWithinSuccessPercentage(ITestResult result);
	    
	    void onStart(ITestContext context);
	    
	    void onFinish(ITestContext context);
	    
	    default void onTestFailedWithTimeout(ITestResult result) {
	        onTestFailure(result);
	    
	}

}
