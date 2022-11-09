package starter.project;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Register extends PageObject {

    private By registerText() {
        return By.xpath("//a[contains(@href, '/auth/register')]");
    }

    private By fieldName(){
        return By.xpath("//div[label[text() = 'Nama Lengkap']]/input");
    }

    private By fieldEmail() {
        return By.xpath("//div[label[text() = 'Email']]/input");
    }

    private By fieldPassword() {
        return By.xpath("//div[label[text() = 'Password']]/input");
    }

    private By registerButton(){
        return By.xpath("//div//span[@class = 'v-btn__content' and contains(., 'Register')]");
    }

    private By errorMsg(){
        return By.xpath("//div[@class = 'v-alert__wrapper']");
    }

    private By thePage(){
        return By.xpath("//div[@class = 'v-main__wrap']");
    }

    public void clickRegistText(){
        $(registerText()).click();
    }

    public void inputName(String name){
        $(fieldName()).type(name);
    }

    public void inputTheEmail(String email){
        $(fieldEmail()).type(email);
    }

    public void inputPass(String password){
        $(fieldPassword()).type(password);
    }

    public void clickRegisBtn(){
        $(registerButton()).click();
    }

    public void errorMsgDisplayed(){
        $(errorMsg()).isDisplayed();
    }

    public void pageDisplayed(){
        $(thePage()).isDisplayed();
    }

}
