package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ArrivaContactPage {

    private WebDriver driver = null;
    private By phoneNumberTextBox = By.xpath("//body[@class='contact']/div[4]/div[@class='container']/div/div[2]/div[@class='info-center-item']/span[@class='oneline']/strong[.='+385 (0)72 660 660']");

    public ArrivaContactPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void checkPhoneNumberIsCorrect(String text)
    {
        Assert.assertEquals(driver.findElement(phoneNumberTextBox).getText(), text);
    }
}
