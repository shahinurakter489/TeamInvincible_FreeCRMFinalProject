Feature: Free CRM Sign Up Functionality

  @Regression @Sanity
  Scenario: Customer should able to Sign up
    Given Customer is on the  Free CRM home page
    When Customer click on the Sign up button
    Then Customer Should be able to redirected to the registration page "https://register.freecrm.com/register/"
