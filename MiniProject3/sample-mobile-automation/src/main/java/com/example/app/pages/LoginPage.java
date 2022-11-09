package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class LoginPage extends BasePageObject {

    private By productHeader = By.xpath("//android.view.View[@content-desc= 'Products']");

    private By loginIcon = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    private By fieldEmail = By.xpath("//android.widget.EditText[1]");

    private By fieldPassword = By.xpath("//android.widget.EditText[2]");

    private By loginButton = By.xpath("//android.widget.Button[@content-desc='Login']");

    private By errorEmailMsg = By.xpath("//android.view.View[@content-desc='email can not empty']");

    private By errorPassMsg = By.xpath("//android.view.View[@content-desc='password can not empty']");

    private By errorInvalidMsg = By.xpath("//android.view.View[@content-desc='Email atau password tidak valid.']");

    private By mainPage = By.xpath("//android.widget.ScrollView");

    public void productHeaderDisplayed(){
        //AndroidElement headerElm = driver.findElement(productHeader);
        //AndroidElement headerElm = find(productHeader);
        //headerElm.isDisplayed();
        isDisplayed(productHeader);
    }

    public void mainPageDisplayed()throws InterruptedException{
        Thread.sleep(1000);
        //AndroidElement mainPageElm = driver.findElement(mainPage);
        //AndroidElement mainPageElm = find(mainPage);
        //mainPageElm.isDisplayed();
        isDisplayed(mainPage);
    }

    public void errorEmailMsgDisplayed() throws InterruptedException{
            Thread.sleep(1000);
        //AndroidElement headerEmailElm = driver.findElement(errorEmailMsg);
        //AndroidElement headerEmailElm = find(errorEmailMsg);
        //headerEmailElm.isDisplayed();
        isDisplayed(errorEmailMsg);
    }

    public void errorPassMsgDisplayed()throws InterruptedException{
        Thread.sleep(1000);
        //AndroidElement headerPassElm = driver.findElement(errorPassMsg);
        //AndroidElement headerPassElm = find(errorPassMsg);
        //headerPassElm.isDisplayed();
        isDisplayed(errorPassMsg);
    }

    public void errorInvalidMsgDisplayed()throws InterruptedException{
        Thread.sleep(1000);
        //AndroidElement headerInvElm = driver.findElement(errorInvalidMsg);
        //AndroidElement headerInvElm = find(errorInvalidMsg);
        //headerInvElm.isDisplayed();
        isDisplayed(errorInvalidMsg);
    }

    public void clickLoginIcon(){
        //AndroidElement  loginIconElm = driver.findElement(loginIcon);
        //AndroidElement  loginIconElm = find(loginIcon);
        //loginIconElm.click();
        click(loginIcon);
    }

    public void inputEmail(String email){
        //AndroidElement fieldEmailElm = driver.findElement(fieldEmail);
        //AndroidElement fieldEmailElm = find(fieldEmail);
        //fieldEmailElm.sendKeys(email);
        inputText(fieldEmail,email);
    }

    public void inputPassword(String password){
        //AndroidElement fieldPassElm = driver.findElement(fieldPassword);
        //AndroidElement fieldPassElm = find(fieldPassword);
        //fieldPassElm.sendKeys(password);
        inputText(fieldPassword, password);
    }

    public void clickLoginBtn(){
        //AndroidElement loginBtnElm = driver.findElement(loginButton);
        //AndroidElement loginBtnElm = find(loginButton);
        //loginBtnElm.click();
        click(loginButton);
    }

    public void clickEmail(){
        //AndroidElement MailBtnElm = driver.findElement(fieldEmail);
        //AndroidElement MailBtnElm = find(fieldEmail);
        //MailBtnElm.click();
        click(fieldEmail);
    }

    public void clickPass(){
        //AndroidElement PassBtnElm = driver.findElement(fieldPassword);
        //AndroidElement PassBtnElm = find(fieldPassword);
        //PassBtnElm.click();
        click(fieldPassword);
    }

}
