package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

public abstract class PageObject {

    @Autowired
    protected WebDriver driver;

    protected WebDriverWait wait;

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 30);
    }

    public void clickElement(WebElement ele){
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        ele.click();
    }

    public void typeText(By by, CharSequence... charSequences){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).sendKeys(charSequences);
    }

    public void goToFrame(By by, String iframelocator){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.switchTo().frame(iframelocator);
    }

    public void switchToDefault(){
        driver.switchTo().defaultContent();
    }

}
