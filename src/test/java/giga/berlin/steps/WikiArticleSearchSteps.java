package giga.berlin.steps;

import giga.berlin.pages.WikipediaOfficialPage;
import io.cucumber.java8.En;

/**
 * WikiArticleSearchSteps
 * Class implements the step definitions for searching Giga Berlin article.
 */

public class WikiArticleSearchSteps implements En {

    public WikiArticleSearchSteps() {

        WikipediaOfficialPage wikipediaOfficialPage = new WikipediaOfficialPage();

        When("I enter Giga Berlin in the search field", () -> {
            wikipediaOfficialPage.insertArticleName("Giga Berlin");
        });
    }
}
