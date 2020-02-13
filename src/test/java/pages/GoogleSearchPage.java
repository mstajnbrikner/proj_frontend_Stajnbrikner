package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

   private WebDriver driver = null;
   private By textbox_search = By.name("q");

   public GoogleSearchPage(WebDriver driver)
   {
       this.driver = driver;
   }

   public void setTextInSearchTextBox(String text)
   {
       driver.findElement(textbox_search).sendKeys(text + Keys.RETURN);
   }
}
