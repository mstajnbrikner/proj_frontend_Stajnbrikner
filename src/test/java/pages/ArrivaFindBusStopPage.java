package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ArrivaFindBusStopPage {

    private WebDriver driver = null;
    private By busStopTextBox = By.id("bus-stop-name");
    private By findBusStopButton = By.id("find-busstop");
    private By findBusStopHeader = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/h1[1]");

    public ArrivaFindBusStopPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public void setBusStopText(String text)
    {
        driver.findElement(busStopTextBox).sendKeys(text);
    }

    public void clickFindBusStopButton()
    {
        driver.findElement(findBusStopButton).click();
    }

    public void checkIfBusStopHeadIsCorrect(String text)
    {
        Assert.assertEquals(driver.findElement(findBusStopHeader).getText(), text);
    }

}

