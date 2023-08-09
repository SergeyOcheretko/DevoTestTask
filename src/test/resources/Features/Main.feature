Feature: Main

  Scenario: Check receiving an error with an invalid email

    Given Enter "beyonce" in the Link ou Nome de usuario field
    When Enter "iudwiuw@" in the email field
    When Click on the CONTINUAR button
    Then Verify that error is appeared below email field