package giga.berlin.pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 * WikipediaOfficialPage
 * Class implements the methods and fields of the Wikipedia main page.
 */

public class WikipediaOfficialPage {

    private By wikiSearchField = By.name("search");

    public ArticlePage insertArticleName(String userdata){
        $(wikiSearchField).val(userdata).pressEnter();
        return new ArticlePage();
    }
}
