package starter.project;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Logout extends PageObject {

    private By profileIcon(){
        return By.xpath("//button//i[contains(@class, 'user')]");
    }

    private By logoutText(){
        return By.xpath("//i[@class='v-icon notranslate fas fa-sign-in theme--light']");
    }

    private By loginPage(){
        return By.xpath("//div[@class = 'v-main__wrap']");
    }

    public void clickProfileIcon() {$(profileIcon()).click();
    }

    public void clickLogoutText(){
        $(logoutText()).click();
    }

    public void loginPageDisplayed(){
        $(loginPage()).isDisplayed();
    }
}
