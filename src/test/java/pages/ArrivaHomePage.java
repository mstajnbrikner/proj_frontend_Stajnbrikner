package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class ArrivaHomePage {

    private WebDriver driver = null;
    private By buttonSubmit = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/div[2]/div[1]/button[1]");
    private By textBoxTripStartPoint = By.id("search-from");
    private By textBoxTripEndPoint = By.id("search-to");
    private By dateTimePicker = By.id("datetimepicker");
    private By usefulInfoTab = By.xpath("//nav[@class='navbar navbar-default']/div/div[3]/ul[@class='nav navbar-nav navbar-right']/li[5]/a[@href='#']");
    private By usefulInfoTabFindBusStop = By.xpath("//nav[@class='navbar navbar-default']/div/div[3]/ul[@class='nav navbar-nav navbar-right']/li[5]/ul[@class='dropdown-menu']//a[@href='/hr-hr/pronadi-stajaliste']");
    private By contactTab = By.xpath("//nav[@class='navbar navbar-default']/div/div[3]/ul[@class='nav navbar-nav navbar-right']/li[7]/a[@href='#']");
    private By contactTabcontact = By.xpath("//nav[@class='navbar navbar-default']/div/div[3]/ul[@class='nav navbar-nav navbar-right']/li[7]/ul[@class='dropdown-menu']//a[@href='/hr-hr/kontakt-informacije']");



    public ArrivaHomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setTripStartPoint(String text)
    {
        driver.findElement(textBoxTripStartPoint).sendKeys(text + Keys.RETURN);
    }

    public void setTripEndPoint(String text)
    {
        driver.findElement(textBoxTripEndPoint).sendKeys(text + Keys.RETURN);
    }

    public void setDateOfTrip()
    {
        driver.findElement(dateTimePicker).click();
        driver.findElement(By.xpath("//div[@id='tab1']/div/div/div/div/div/div[2]/ul/li/div/div/table/thead/tr/th[3]/span")).click();
        driver.findElement(By.xpath("//div[@id='tab1']/div/div/div/div/div/div[2]/ul/li/div/div/table/thead/tr/th[3]/span")).click();
        driver.findElement(By.xpath("//div[@id='tab1']/div/div/div/div/div/div[2]/ul/li/div/div/table/thead/tr/th[3]/span")).click();
        driver.findElement(By.xpath("//div[@id='tab1']/div/div/div/div/div/div[2]/ul/li/div/div/table/tbody/tr[4]/td[3]")).click();
    }

    public void clickButtonSubmit()
    {
        driver.findElement(buttonSubmit).click();
    }

    public void clickUsefulInfoTab()
    {
        driver.findElement(usefulInfoTab).click();
    }

    public void clickusefulInfoTabFindBusStop()
    {
        driver.findElement(usefulInfoTabFindBusStop).click();
    }

    public void clickContactTab()
    {
        driver.findElement(contactTab).click();
    }

    public void clickContactTabContact()
    {
        driver.findElement(contactTabcontact).click();
    }
}
