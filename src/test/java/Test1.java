import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {

    WebDriver driver;

    @BeforeClass
    void setup() {
    System.setProperty("webdriver.chrome.driver","//home//innofied//Documents//Selenium//Drivers//chromedriver");
    driver = new ChromeDriver();
    driver.get("https://google.com");
    }

    @AfterMethod
    void delay() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    void first()    {
        System.out.println("come on");
        driver.close();
    }

}
