package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ArrivaDepartureSelectPage {

    private WebDriver driver = null;
    private By headerStartEndPoint = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/h2[1]");
    private By firstDeparturePriceBox = By.xpath("/html//div[@id='departures-group']/div[@class='row tab-info tab-info-first']/div[5]/a[1]");
    private By firstToBasketButton = By.xpath("/html//div[@id='departures-group']/div[3]/div/div[2]/div[@class='col-sm-4 dodaj-btn']/a[@href='#']");
    private By basketStartEndPoint = By.xpath("/html/body/div[@class='main-content-full']/div[@class='container']/div[@class='row']/div[2]//h3[@class='busline-status-true']");

    public ArrivaDepartureSelectPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void checkifStartEndPointIsCorrect(String startPoint, String endPoint)
    {
        Assert.assertEquals(driver.findElement(headerStartEndPoint).getText(), startPoint.toUpperCase() + "-" + endPoint.toUpperCase());
    }

    public void clickFirstDeparturePriceBox()
    {
        driver.findElement(firstDeparturePriceBox).click();
    }

    public void clickFirstToBasketButton()
    {
        driver.findElement(firstToBasketButton).click();
    }

    public void checkIfBasketStartEndPointIsCorrect(String startPoint, String endPoint)
    {
        Assert.assertEquals(driver.findElement(basketStartEndPoint).getText(), startPoint.toUpperCase() + " - " + endPoint.toUpperCase());
    }
}
