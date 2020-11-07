package giga.berlin.steps;

import giga.berlin.pages.GoogleMainPage;
import io.cucumber.java8.En;
import static com.codeborne.selenide.Selenide.open;
import static giga.berlin.utils.Constants.googlePage;

/**
 * WikiLinkSearchSteps
 * Class implements the step definitions for searching Wikipedia link using search field on the Google main page.
 */

public class WikiLinkSearchSteps implements En {

    public WikiLinkSearchSteps() {

        GoogleMainPage googleMainPage = new GoogleMainPage();

        Given("I am on Google main page", () -> {
            open(googlePage);
        });

        When("I enter www.wikipedia.com in the search field", () -> {
            googleMainPage.insertUserData("www.wikipedia.com");
        });
    }
}
