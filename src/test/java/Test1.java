import org.openqa.selenium.By;
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
        driver.get(URL);
    }

    @AfterMethod
    void actionDelay() throws InterruptedException {
        Thread.sleep(500);
    }

    @AfterClass
    void pageDelay() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test(alwaysRun = true, priority = 0)
    void currentURL() {
        Assert.assertEquals(URL, driver.getCurrentUrl());
    }

    @Test(priority = 1)
    void first() {
        driver.get("https://saucedemo.com");
    }

    @Test(priority = 4)
    void second() {
        Assert.assertEquals("Swag Labs", driver.getTitle());
    }

    @Test(priority = 2)
    void third() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @Test(priority = 3, dependsOnMethods = {"first", "third"})
    void submit() {
        driver.findElement(By.id("login-button")).submit();
    }

    @AfterSuite
    void tearDown() {
        driver.close();
    }
}
