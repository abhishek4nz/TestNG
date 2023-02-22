import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 extends Base {

    @Test
    void currentURL() {
        Assert.assertEquals(URL + "cart.html", driver.getCurrentUrl());
    }

}
