Feature: Signin

  Scenario: Successful Signin with Valid Credentials
    Given User opens URL "https://www.cvs.com/account/login/?icid=cvsheader:signin&screenname=%2F"
    When User give Email as "k_hassan17@yahoo.com"
    And User click on sign in button
    Then User type password as "Ny123456"
    Then User click on continue button
    And User click signout button
