
Feature: To validate Payment Details

  Scenario: User to enter the payment details to confirm the booking
    Given USer to enter firstname
    And USer to enter lastname
    When User to enter billing address
    And user to enter credit card 16 digit number
    And user to enter type of credit card
    Then user to selecte card expiry month and expiry year
    And user to enter cvv number
    Then User to click the booknow button
    And User should Navigated to Booking ticket confiramtion page
