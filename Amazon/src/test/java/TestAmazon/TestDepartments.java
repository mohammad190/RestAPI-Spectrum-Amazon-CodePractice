package TestAmazon;

import Amazon.Departments;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDepartments extends CommonAPI {

    @Test
    public void TestDeparments() throws InterruptedException {
        Departments departments = PageFactory.initElements(driver,Departments.class);
        departments.DepartmentsFeatures();
    }
}
