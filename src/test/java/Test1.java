import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test1 extends Base {

    @BeforeSuite
    void setup() {
        System.setProperty("webdriver.chrome.driver", path);
    }

    @BeforeTest
    void browser() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    void delay() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    void first() {
        driver.get("https://google.com");
    }

    @Test
    void second() {
        Assert.assertEquals("Google", driver.getTitle());
    }

    @AfterTest
    void tearDown() {
        driver.close();
    }
}
