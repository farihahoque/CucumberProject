package Pages;

import org.openqa.selenium.By;

public class BookDetailsPage extends BasePage{
    public By ClickOrder=By.xpath("//button[@class='single_add_to_cart_button button alt ']");
    public By FinishOrder=By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
}
