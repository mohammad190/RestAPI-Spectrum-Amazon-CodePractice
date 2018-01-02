package TestAmazon;

import Amazon.Orders;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestOrders extends CommonAPI {

    @Test
    public void OrdersFea() throws IOException, InterruptedException {
        Orders orders = PageFactory.initElements(driver,Orders.class);
        orders.OrdersF("hbshbshvhsvh@yahoo.com","asdfghj123456987");
    }
}
