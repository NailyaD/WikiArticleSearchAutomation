package giga.berlin.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

/**
 * GeoHackPage
 * Class implements the methods and fields of the GeoHack page.
 */

public class GeoHackPage {

    private SelenideElement googleMapsLink = $("#mw-content-text > div > div:nth-child(3) > div:nth-child(3) > p > a:nth-child(2) > span");

    public GoogleMapsPage contextClick() {
        actions().contextClick(googleMapsLink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        return new GoogleMapsPage();
    }
}
