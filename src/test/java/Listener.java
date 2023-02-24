import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Let's begin");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Test started");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("Test finished");
    }
}
