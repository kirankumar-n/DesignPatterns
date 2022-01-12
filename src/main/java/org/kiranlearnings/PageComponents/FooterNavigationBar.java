package org.kiranlearnings.PageComponents;

import org.kiranlearnings.AbstractComponent.AbstactComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterNavigationBar extends AbstactComponent {

    //Scope of selenium will be within footer section when using this class
    WebDriver driver;
    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");

    public FooterNavigationBar(WebDriver driver, By sectionElement) {
        super(driver, sectionElement); //When u inherit a parent class, u should invoke parent class constructor in ur child constructor
    }

    public void clickOnFlights(){
        findElement(flights).click();
    }

    public String getFlightsAttribute(){
        return findElement(flights).getAttribute("class");
    }

    public int getLinkCounts(){
        return findElements(links).size();
    }

}
