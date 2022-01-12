package org.kiranlearnings.PageObjects;

import org.kiranlearnings.AbstractComponent.SearchFlight;
import org.kiranlearnings.PageComponents.FooterNavigationBar;
import org.kiranlearnings.PageComponents.HeaderNavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/** Practise for Single Responsibilty Principle Pattern
 * Page Link: https://rahulshettyacademy.com/dropdownsPractise/ */
public class TravelHomePage {

    //Reduce driver observation from main to section using By in this class
    WebDriver driver;
    By footerSection = By.id("traveller-home");
    By headerSection = By.id("buttons");
    SearchFlight searchFlight;

    public TravelHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HeaderNavigationBar getHeaderNavigationBar(){
        return new HeaderNavigationBar(driver, headerSection);
    }

    public FooterNavigationBar getFooterNavigationBar(){
        return new FooterNavigationBar(driver, footerSection);
    }

    public void goTo(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
    }

    public void setBookingStrategy(SearchFlight searchFlight) {
        this.searchFlight = searchFlight;
    }

    public void checkAvail(String origin, String destination) {
        searchFlight.checkFlightAvailability(origin,destination);
    }
}
