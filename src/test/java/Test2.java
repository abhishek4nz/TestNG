import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends Base{

    @Test(priority = 8)
    void currentURL() {
        Assert.assertEquals(URL+"inventory.html",driver.getCurrentUrl());
    }
}
