package giga.berlin.pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * GoogleMapsPage
 * Class implements the methods and fields of the Google Maps page.
 */

public class GoogleMapsPage {

    public By locationName = By.xpath("//span[contains(text(),'Grünheide, 15537 Grünheide (Mark)')]");

    public void assertLocation(String location){
        $(locationName).shouldHave(text(location));
    }
}
