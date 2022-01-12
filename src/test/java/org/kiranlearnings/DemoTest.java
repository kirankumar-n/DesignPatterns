package org.kiranlearnings;

import org.junit.Test;
import org.kiranlearnings.AbstractComponent.SearchFlight;
import org.kiranlearnings.PageComponents.MultiTrip;
import org.kiranlearnings.PageComponents.RoundTrip;
import org.kiranlearnings.PageObjects.TravelHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

    @Test
    public void srpFooterTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();
        System.out.println(travelHomePage.getFooterNavigationBar().getFlightsAttribute());
    }

    @Test
    public void srpHeaderTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();
        System.out.println(travelHomePage.getHeaderNavigationBar().getFlightsAttribute());
    }

    @Test
    public void getFooterLinks(){
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();
        System.out.println(travelHomePage.getFooterNavigationBar().getLinkCounts());
    }

    @Test
    public void getHeaderLinks(){
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();
        System.out.println(travelHomePage.getHeaderNavigationBar().getLinkCounts());
    }

    @Test
    public void strategyDesignPatternTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();

        SearchFlight multiTrip = new MultiTrip();
        SearchFlight roundTrip = new RoundTrip();

        travelHomePage.setBookingStrategy(new MultiTrip());
        travelHomePage.checkAvail("origin", "destination");

        travelHomePage.setBookingStrategy(new RoundTrip());
        travelHomePage.checkAvail("origin", "destination");
    }
}
