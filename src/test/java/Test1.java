import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends Base{

    @Test(priority = 8)
    void currentURL() {
        Assert.assertEquals(URL+"inventory.html",driver.getCurrentUrl());
    }

    @Test(priority = 9)
    void cart() {
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
    }
}
