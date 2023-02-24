import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 extends Base {


    @Test(priority = 11)
    void sample() {
        driver.get("https://google.com");
    }
}
