package giga.berlin.pages;

import com.codeborne.selenide.Selenide;

/**
 * GoogleSearchListPage
 * Class implements the methods and fields of the Google page with search results.
 */

public class GoogleSearchListPage {

    public WikipediaOfficialPage clickWikipediaLink(){
        Selenide.executeJavaScript("document.querySelector('#rso > div:nth-child(1) > div > div.yuRUbf > a > h3 > span').click()");
        return new WikipediaOfficialPage();
    }
}
