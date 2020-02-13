package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoogleResultsPage {

    private WebDriver driver = null;

    By firstLink = By.xpath("//h3[contains(text(),'Arriva Hrvatska')]");

    public GoogleResultsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void linkTextEqualsTo(String text) {
        Assert.assertEquals(driver.findElement(firstLink).getText(), text);
    }

    public void printActualLinkText()
    {
        System.out.println("\n\nActual link text is: " + driver.findElement(firstLink).getText() + "\n\n");
    }

    public void clickFirstLink()
    {
        driver.findElement(firstLink).click();
    }
}
