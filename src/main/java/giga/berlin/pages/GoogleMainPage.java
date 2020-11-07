package giga.berlin.pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 * GoogleMainPage
 * Class implements the methods and fields of the Google main page.
 */

public class GoogleMainPage {

    private By searchField = By.name("q");

    public GoogleSearchListPage insertUserData(String userdata){
        $(searchField).val(userdata).pressEnter();
        return new GoogleSearchListPage();
    }
}
