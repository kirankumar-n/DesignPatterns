package org.kiranlearnings.PageComponents;

import org.kiranlearnings.AbstractComponent.AbstactComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderNavigationBar extends AbstactComponent {

    WebDriver driver;
    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");

    public HeaderNavigationBar(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }

    public String getFlightsAttribute() {
        return findElement(flights).getAttribute("class");
    }

    public int getLinkCounts() {
        return findElements(links).size();
    }
}
