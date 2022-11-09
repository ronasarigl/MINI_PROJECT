package starter.project;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Cart extends PageObject {

    private By cartButton(){
        return By.xpath("//i[@class='v-icon notranslate fas fa-shopping-cart theme--dark']");
    }

    private By detailProduct(){
        return By.xpath("//div[@class='container']");
    }

    public void clickCartButton(){
        $(cartButton()).click();
    }

    public void detailProductDisplayed(){
        $(detailProduct()).isDisplayed();
    }
}
