package org.kiranlearnings.AbstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstactComponent {

    WebElement sectionElement;

    public AbstactComponent(WebDriver driver, By sectionElement) {
        this.sectionElement = driver.findElement(sectionElement);
    }

    public WebElement findElement(By byElement){
        return sectionElement.findElement(byElement);
    }

    public List<WebElement> findElements(By byElement){
        return sectionElement.findElements(byElement);
    }
}
