package starter.project;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {

    private By homePage() {
        return By.xpath("//div[@class = 'v-main__wrap']");
    }

    private By loginIcon(){
        return By.xpath("//button//i[contains(@class, 'sign-in')]");
    }

    private By fieldEmail() {
        return By.xpath("//div[label[text() = 'Email']]/input");
    }

    private By fieldPassword() {
        return By.xpath("//div[label[text() = 'Password']]/input");
    }

    private By loginButton(){
        return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }

   private By errorMessage(){
        return By.xpath("//div[@class = 'v-alert__wrapper']");
   }

   public void openUrl(){
        openAt("/");
   }

   public void homeDisplayed(){
        $(homePage()).isDisplayed();
   }

   public void clickLoginIcon(){
        $(loginIcon()).click();
   }
   public void inputEmail(String email){
        $(fieldEmail()).type(email);
   }

   public void inputPassword(String password){
        $(fieldPassword()).type(password);
   }

   public void clickLoginButton(){
        $(loginButton()).click();
   }

   public void ErrorMessageDisplayed(){
        $(errorMessage()).isDisplayed();
   }

}