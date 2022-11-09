package starter.project;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Search extends PageObject {
    private By selectCategoryBtn(){
        return By.xpath("(//div[@class = 'v-input__append-inner'])[2]");
    }

    private By gamingTypeBtn(){
        return By.xpath("(//div[@class= 'v-list-item__title'])[3]");
    }

    private By productEmpty(){
        return By.xpath("//i[contains(@class, 'v-icon notranslate v-alert__icon fas fa-info-circle theme--light info--text')]");
    }

    public void clickSelectCategoryBtn(){
        $(selectCategoryBtn()).click();
    }

    public void clickGamingBtn(){
        $(gamingTypeBtn()).click();
    }

    public void productEmptyDisplayed(){
        $(productEmpty()).isDisplayed();
    }
}
