Feature: Application Login

    Scenario: Home page default login

    Given User is on NetBanking landing page
    When User login into application with username "auf" and password "123"
    Then Home page is populated
    And Cards are displayed

  Scenario: Home page default login

    Given User is on NetBanking landing page
    When User login into application with username "auf43" and password "1321"
    Then Home page is populated
    And Cards are displayed


