Feature: Free CRM Login page

  @Regression @Sanity
  Scenario: Customer have navigated  to  the Login page
    Given Customer is on the  Free CRM home page
    When Customer login with valid userid and password
    Then Customer Should be able to redirected to the login page "https://ui.cogmento.com/"
