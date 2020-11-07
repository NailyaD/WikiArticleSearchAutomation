package giga.berlin.steps;

import giga.berlin.pages.ArticlePage;
import giga.berlin.pages.GeoHackPage;
import giga.berlin.pages.GoogleMapsPage;
import io.cucumber.java8.En;

/**
 * CoordinatesConfirmSteps
 * Class implements the step definitions for testing the confirmation of location name at the Google Maps page.
 */

public class CoordinatesConfirmSteps implements En {

    public CoordinatesConfirmSteps() {
        ArticlePage articlePage = new ArticlePage();
        GeoHackPage geoHackPage = new GeoHackPage();
        GoogleMapsPage googleMapsPage = new GoogleMapsPage();

        When("I click on coordinates link", articlePage::coordinatesClick);

        When("I right-click on Google Maps link to open it in a new tab", geoHackPage::contextClick);

        Then("I see that coordinates corresponds Grünheide location", () -> {
            googleMapsPage.assertLocation("Grünheide");
        });
    }
}
