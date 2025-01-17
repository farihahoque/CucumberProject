package Pages;

import org.openqa.selenium.By;

 public class CheckoutPage extends BasePage{
 public By Area=By.xpath("//select[@id='billing_area']");
 public By Address=By.xpath("//textarea[@id='billing_address_1']");
 public By OtherInfo=By.xpath("//textarea[@id='order_comments']");
 public By ShipToOffice=By.xpath("//input[@id='ship_to_office']");
 public By GiftPaper=By.xpath("//input[@id='gift_paper']");
 public By ShipToDifferentAddress=By.xpath("//input[@id='ship-to-different-address-checkbox']");
 public By BkashPay=By.xpath("//input[@id='payment_method_bkash']");
 public By RocketPay=By.xpath("//input[@id='payment_method_rocket']");
 public By NagadPay=By.xpath("//input[@id='payment_method_nagad']");
 public By VisaAndMaster=By.xpath("//input[@id='payment_method_sslcommerz']");
 public By OtherAddressName=By.xpath("//input[@id='shipping_first_name']");
  public By Otherphone=By.xpath("//input[@id='shipping_phone']");
 public By AlternativePhone=By.xpath("//input[@id='shipping_alternative_phone']");
 public By AltArea=By.xpath("//select[@id='shipping_area']");
 public By AltAddress=By.xpath("//textarea[@id='shipping_address_1']");

















}
