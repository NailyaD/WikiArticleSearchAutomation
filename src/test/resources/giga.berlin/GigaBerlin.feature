@gigaberlin
Feature: Searching data on Giga Berlin Wiki Article Page

  Background:
    Given I am on Google main page
    When I enter www.wikipedia.com in the search field
    And I choose Wikipedia official page from the list
    And I enter Giga Berlin in the search field

    @logisticsandsiteconcerns
    Scenario: Searching Logistics and Site concerns sections in Giga Berlin article
      Then I see Logistics and Site concerns sections on the article page

    @coordinates
    Scenario: Checking coordinates
      And I click on coordinates link
      And I right-click on Google Maps link to open it in a new tab
      Then I see that coordinates corresponds Grünheide location
