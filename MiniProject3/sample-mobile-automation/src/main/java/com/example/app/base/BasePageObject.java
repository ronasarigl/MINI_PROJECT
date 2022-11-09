package com.example.app.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class BasePageObject {

    public AndroidDriver<AndroidElement> getDriver() {
        return driver;
    }

    public WebDriverWait onWait(){
        return new WebDriverWait(getDriver(),30,1000);
    }

    public AndroidElement find(By locator){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator){
        AndroidElement elm = find(locator);
        elm.click();
    }

    public void inputText(By locator, String input){
        AndroidElement elm = find(locator);
        elm.sendKeys(input);
    }

    public void isDisplayed(By locator){
        AndroidElement elm = find(locator);
        elm.isDisplayed();
    }

}
