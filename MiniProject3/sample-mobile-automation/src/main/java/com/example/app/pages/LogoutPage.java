package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class LogoutPage extends BasePageObject {

    private By logoutBtn = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    private By prodHeader = By.xpath("//android.view.View[@content-desc= 'Products']");

    public void clickLogoutBtn(){
        //AndroidElement logoutBtnElm = driver.findElement(logoutBtn);
        //logoutBtnElm.click();
        click(logoutBtn);
    }

    public void prodHeader(){
        //AndroidElement proElm = driver.findElement(prodHeader);
        //proElm.isDisplayed();
        isDisplayed(prodHeader);
    }


}
