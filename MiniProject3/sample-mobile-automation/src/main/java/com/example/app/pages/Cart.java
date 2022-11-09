package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class Cart extends BasePageObject {

    private By beliButton = By.xpath("(//android.widget.Button[@content-desc='Beli'])[1]");

    private By beliButtonDua = By.xpath("(//android.widget.Button[@content-desc='Beli'])[2]");

    private By cartIcon = By.xpath("//android.widget.Button[@content-desc='1']");

    private By cartIconDua = By.xpath("//android.widget.Button[@content-desc='2']");


    public void clickBeliBtn() {
        //AndroidElement beliBtnElm = driver.findElement(beliButton);
        //beliBtnElm.click();
        click(beliButton);
    }

    public void productCartDisplayed() {
        //AndroidElement productElm = driver.findElement(cartIcon);
        //productElm.isDisplayed();
        click(cartIcon);
    }


    public void clickBeliBtnDua() {
        //AndroidElement beliBtnElm = driver.findElement(beliButton);
        //beliBtnElm.click();
        click(beliButtonDua);
    }

    public void productCartDuaDisplayed() {
        //AndroidElement productElm = driver.findElement(cartIcon);
        //productElm.isDisplayed();
        click(cartIconDua);

    }
}