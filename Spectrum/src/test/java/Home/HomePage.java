package Home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.TestHomePages;

public class HomePage extends CommonAPI {

    @Test
    public void testMethod() throws Exception {
        TestHomePages testHomePage = PageFactory.initElements(driver, TestHomePages.class);
        testHomePage.test();
    }
}
