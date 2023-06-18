Feature: Purchase Flight Page Functionality

  Scenario Outline: Verify user able to Purchase a Flight
    Given User navigates to Purchase Page "https://blazedemo.com/purchase.php"
    When User enters name "<name>"
    And User enters Address "<address>"
    And User enters City "<city>"
    And User enters State "<state>"
    And User enters ZipCode "<zipCode>"
    And User selects Card Type "<cardType>"
    And User enters Card Number "<creditCardNumber>"
    And User enters Card Date "<creditCardMont>" "<creditCardYear>"
    And User enters Card Name "<nameOnCard>"
    And User clicks Remmeber Me Check Box
    And User Clicks Submit button
    Then User verifies confirmation message "<ConfirmationTextField>"

    Examples: 
      | name   | address      | city     | state | zipCode | cardType         | creditCardNumber | creditCardMont | creditCardYear | nameOnCard          | ConfirmationTextField              |
      | John   | 123 drive st | Cali     | CA    | Male    | Visa             |    1253644896121 |             11 |           2016 | JOHN CENA           | Thank you for your purchase today! |
      | James  | 345 drive st | london   | NY    | Male    | American Express |    2548789512314 |             12 |           2018 | James Bond          | Thank you for your purchase today! |
      | Khabib | 678 drive st | Dagestan | NY    | Male    | Diner's Club     |    8977456325632 |              9 |           2022 | Khabib Nurmagomedov | Thank you for your purchase today! |
      | Bon    | 912 drive st | New York | NY    | Male    | Visa             |    6478963212514 |              8 |           2021 | Bon Jovi            | Thank you for your purchase today! |
      | Tony   | 454 drive st | New York | TN    | Male    | American Express |    9778563214523 |              1 |           2023 | Tony Stark          | Thank you for your purchase today! |
