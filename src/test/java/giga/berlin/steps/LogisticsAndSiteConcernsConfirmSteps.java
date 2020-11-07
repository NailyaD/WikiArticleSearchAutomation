package giga.berlin.steps;

import giga.berlin.pages.ArticlePage;
import io.cucumber.java8.En;

/**
 * LogisticsAndSiteConcernsConfirmSteps
 * Class implements the step definitions for testing that Giga Berlin article contains
 * Logistics and Site concerns sections.
 */

public class LogisticsAndSiteConcernsConfirmSteps implements En {

    public LogisticsAndSiteConcernsConfirmSteps() {

        ArticlePage articlePage = new ArticlePage();

        Then("I see Logistics and Site concerns sections on the article page", () -> {
            articlePage.assertMessages("Logistics", "Site concerns");
        });
    }
}
