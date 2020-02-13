package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pages.*;

import java.util.concurrent.TimeUnit;

public class ArrivaTripTest {
    private WebDriver driver;
    private String homeURL = "http://www.google.com";
    private GoogleSearchPage searchPage;
    private GoogleResultsPage resultsPage;
    private ArrivaHomePage arrivaHomePage;
    private ArrivaDepartureSelectPage arrivaDepartureSelectPage;
    private ArrivaFindBusStopPage findBusStopPage;
    private ArrivaContactPage arrivaContactPage;

    @BeforeTest
    @Parameters({"browserName"})
    public void setupTest(String browserName)
    {
        if(browserName.equalsIgnoreCase("chrome"))
        {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        searchPage = new GoogleSearchPage(driver);
        resultsPage = new GoogleResultsPage(driver);
        arrivaHomePage = new ArrivaHomePage(driver);
        arrivaDepartureSelectPage = new ArrivaDepartureSelectPage(driver);
        findBusStopPage = new ArrivaFindBusStopPage(driver);
        arrivaContactPage = new ArrivaContactPage(driver);
    }

    @BeforeMethod
    public void beforeEveryTestMethod()
    {
        driver.navigate().to(homeURL);
    }

    @Test
    public void testMethod1() throws InterruptedException
    {
        String startPoint = "Valpovo";
        String endPoint = "Osijek";

        searchPage.setTextInSearchTextBox("arriva vozni red");

        resultsPage.linkTextEqualsTo("Arriva Hrvatska");
        resultsPage.printActualLinkText();
        resultsPage.clickFirstLink();

        arrivaHomePage.setTripStartPoint(startPoint);
        arrivaHomePage.setTripEndPoint(endPoint);
        arrivaHomePage.setDateOfTrip();
        arrivaHomePage.clickButtonSubmit();

        arrivaDepartureSelectPage.checkifStartEndPointIsCorrect(startPoint, endPoint);
    }

    @Test
    public void testMethod2() throws InterruptedException
    {
        String startPoint = "Zagreb";
        String endPoint = "Rijeka";

        searchPage.setTextInSearchTextBox("arriva");

        resultsPage.linkTextEqualsTo("Arriva Hrvatska");
        resultsPage.printActualLinkText();
        resultsPage.clickFirstLink();

        arrivaHomePage.setTripStartPoint(startPoint);
        arrivaHomePage.setTripEndPoint(endPoint);
        arrivaHomePage.setDateOfTrip();
        arrivaHomePage.clickButtonSubmit();

        arrivaDepartureSelectPage.checkifStartEndPointIsCorrect(startPoint, endPoint);
    }

    @Test
    public void testMethod3() throws InterruptedException
    {
        String startPoint = "Osijek";
        String endPoint = "Slavonski Brod";

        searchPage.setTextInSearchTextBox("arriva vozni red");

        resultsPage.linkTextEqualsTo("Arriva Hrvatska");
        resultsPage.printActualLinkText();
        resultsPage.clickFirstLink();

        arrivaHomePage.setTripStartPoint(startPoint);
        arrivaHomePage.setTripEndPoint(endPoint);
        arrivaHomePage.setDateOfTrip();
        arrivaHomePage.clickButtonSubmit();

        arrivaDepartureSelectPage.checkifStartEndPointIsCorrect(startPoint, endPoint);
        arrivaDepartureSelectPage.clickFirstDeparturePriceBox();
        arrivaDepartureSelectPage.clickFirstToBasketButton();
        arrivaDepartureSelectPage.checkIfBasketStartEndPointIsCorrect(startPoint, endPoint);
    }

    @Test
    public void testMethod4() throws InterruptedException
    {
        searchPage.setTextInSearchTextBox("arriva");

        resultsPage.linkTextEqualsTo("Arriva Hrvatska");
        resultsPage.printActualLinkText();
        resultsPage.clickFirstLink();

        arrivaHomePage.clickUsefulInfoTab();
        arrivaHomePage.clickusefulInfoTabFindBusStop();

        findBusStopPage.checkIfBusStopHeadIsCorrect("Pronađi stajalište");
        findBusStopPage.setBusStopText("Zadar");
        findBusStopPage.clickFindBusStopButton();
    }

    @Test
    public void testMethod5() throws InterruptedException
    {
        searchPage.setTextInSearchTextBox("arriva");

        resultsPage.linkTextEqualsTo("Arriva Hrvatska");
        resultsPage.printActualLinkText();
        resultsPage.clickFirstLink();

        arrivaHomePage.clickContactTab();
        arrivaHomePage.clickContactTabContact();

        arrivaContactPage.checkPhoneNumberIsCorrect("+385 (0)72 660 660");
    }

    @AfterMethod
    public void afterEveryTestMethod() throws InterruptedException
    {
        Thread.sleep(2000);
    }

    @AfterTest
    public void teardownTest()
    {
        driver.quit();
    }
}
