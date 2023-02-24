import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

//@Listeners(Listener.class)

public class Setup extends Base {

/*    @BeforeSuite
    void setup() {
        System.setProperty("webdriver.chrome.driver", path);
    }   */

    @BeforeSuite()

    @Parameters({"browser"})
    void browserSelection(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", path);
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", firefoxPath);
            driver=new FirefoxDriver();
        }
        else {
            System.setProperty("webdriver.chrome.driver", path);
            driver = new ChromeDriver();
        }

//        driver.get(URL);
    }

    @AfterMethod
    void actionDelay() throws InterruptedException {
        Thread.sleep(500);
    }

    @AfterClass
    void pageDelay() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test(alwaysRun = true, priority = 0,enabled = false)
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
    @Parameters({"username","password"})
    void third(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Test(priority = 3, dependsOnMethods = {"first", "third"})
    void submit() {
        driver.findElement(By.id("login-button")).submit();
    }

    @AfterSuite
    void tearDown() {
        driver.quit();
    }
}
