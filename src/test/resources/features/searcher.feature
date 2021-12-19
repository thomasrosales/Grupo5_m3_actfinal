Feature: searcher
  In order to do a search
  As a customer
  I want to be able to search for items contain certain words

  Scenario: Searching by KW on the Bing website

    Given I want to do a search by kw
    When  I search with the KW 'CHEESECAKE'
    Then I should see the tithe 'Recetas' on the Results Pages
