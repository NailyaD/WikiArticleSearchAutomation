package giga.berlin.pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * ArticlePage
 * Class implements the methods and fields of the Wikipedia Article page.
 */

public class ArticlePage {

    private By logisticsSection = By.id("Logistics");
    private By siteConcernsSection = By.id("Site_concerns");
    private By coordinatesLink = By.xpath("//tbody/tr[5]/td[1]/span[1]/span[1]/a[1]/span[3]/span[1]");

    public void assertMessages(String msg1, String msg2){
        $(logisticsSection).shouldHave(text(msg1));
        $(siteConcernsSection).shouldHave(text(msg2));
    }

    public GeoHackPage coordinatesClick() {
        $(coordinatesLink).click();
        return new GeoHackPage();
    }
}
