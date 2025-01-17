package Pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public static String homepageUrl = "https://www.wafilife.com/";

    public By loginorReg= By.xpath("//a[@title='আমার অ্যাকাউন্ট']");
    public By WriterSelect=By.xpath("//span[contains(text(),'লেখক')]");
    public By AuthorSelect=By.xpath("//h3[normalize-space()='Kazi Nurul Haque']");
    public By ClickBook= new By.ByCssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > span:nth-child(1)");
    public By AnyBook=By.xpath("//div[@class='owl-item active']//a[contains(text(),'নব্বুই- এর অভ্যুত্থান')]");
    public By ReadBook=By.xpath("//a[contains(text(),'আরো পড়ুন')].3");






    public static void loadHomePage(){

        loadAWebPage(homepageUrl);
    }
}
