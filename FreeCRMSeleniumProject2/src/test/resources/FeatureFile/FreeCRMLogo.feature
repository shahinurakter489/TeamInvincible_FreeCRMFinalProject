Feature: Free CRM Logo Functionality

  @Regression @Sanity
  Scenario: Customer should able to see the logo
    Given Customer is on the  Free CRM home page
    When Customer click the logo button
    Then Customer Should be able to see the logo in home page
