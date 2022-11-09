package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class RegistPage extends BasePageObject {

    private By loginBtn = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    private By registerText = By.xpath("//android.widget.Button[@content-desc='Register']");


    private By fieldName = By.xpath("//android.widget.EditText[1]");

    private By fieldMail = By.xpath("//android.widget.EditText[2]");

    private By fieldPass = By.xpath("//android.widget.EditText[3]");

    private By registrationBtn = By.xpath("//android.widget.Button[@content-desc='Register']");

    private By errorFullnameMsg = By.xpath("//android.view.View[@content-desc='fullname can not empty']");

    private By errorNewMailMsg = By.xpath("//android.view.View[@content-desc='email can not empty']");

    private By errorNewPassMsg = By.xpath("//android.view.View[@content-desc='password can not empty']");

    private By mainPage = By.xpath("//android.widget.ScrollView");

    public void clickLoginIBtn(){
        //AndroidElement loginElm = driver.findElement(loginBtn);
        //loginElm.click();
        click(loginBtn);
    }

    public void clickRegText(){
        //AndroidElement regElm = driver.findElement(registerText);
        //regElm.click();
        click(registerText);
    }

    public void clickFullname(){
        //AndroidElement fullNameElm = driver.findElement(fieldName);
        //fullNameElm.click();
        click(fieldName);
    }

    public void inputNewFullname(String name) {
        //AndroidElement fieldNewMailElm = driver.findElement(fieldName);
        //fieldNewMailElm.sendKeys(name);
        inputText(fieldName, name);
    }

    public void clickNewEmail(){
        //AndroidElement NewEmailElm = driver.findElement(fieldMail);
        //NewEmailElm.click();
        click(fieldMail);
    }

    public void inputNewEmail(String email) {
        //AndroidElement fieldNewMailElm = driver.findElement(fieldMail);
        //fieldNewMailElm.sendKeys(email);
        inputText(fieldMail, email);
    }

    public void clickNewPass(){
        //AndroidElement NewPasslElm = driver.findElement(fieldPass);
        //NewPasslElm.click();
        click(fieldPass);
    }

    public void inputNewPass(String password) {
        //AndroidElement fieldNewPassElm = driver.findElement(fieldPass);
        //fieldNewPassElm.sendKeys(password);
        inputText(fieldPass, password);
    }

    public void clickRegisterButton(){
        //AndroidElement RegBtnlElm = driver.findElement(registrationBtn);
        //RegBtnlElm.click();
        click(registrationBtn);
    }

    public void errorFullnameMsgDisplayed()throws InterruptedException{
        Thread.sleep(1000);
        //AndroidElement errorNameElm = driver.findElement(errorFullnameMsg);
        //errorNameElm.isDisplayed();
        isDisplayed(errorFullnameMsg);
    }

    public void errorNewMailMsgDisplayed()throws InterruptedException{
        Thread.sleep(1000);
        //AndroidElement errorNewMailElm = driver.findElement(errorNewMailMsg);
        //errorNewMailElm.isDisplayed();
        isDisplayed(errorNewMailMsg);
    }

    public void errorNewPassMsgDisplayed()throws InterruptedException{
        Thread.sleep(1000);
        //AndroidElement errorNewPassElm = driver.findElement(errorNewPassMsg);
        //errorNewPassElm.isDisplayed();
        isDisplayed(errorNewPassMsg);
    }

    public void mainPageDisplayed()throws InterruptedException{
        Thread.sleep(1000);
        //AndroidElement proHeaderElm = driver.findElement(mainPage);
        //proHeaderElm .isDisplayed();
        isDisplayed(mainPage);
    }




}
