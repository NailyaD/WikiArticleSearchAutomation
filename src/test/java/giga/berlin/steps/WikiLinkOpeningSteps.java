package giga.berlin.steps;

import giga.berlin.pages.GoogleSearchListPage;
import io.cucumber.java8.En;

/**
 * WikiLinkOpeningSteps
 * Class implements the step definitions for opening Wikipedia main page link.
 */

public class WikiLinkOpeningSteps implements En {

    public WikiLinkOpeningSteps() {

        GoogleSearchListPage googleSearchListPage = new GoogleSearchListPage();

        When("I choose Wikipedia official page from the list", googleSearchListPage::clickWikipediaLink);
    }
}
