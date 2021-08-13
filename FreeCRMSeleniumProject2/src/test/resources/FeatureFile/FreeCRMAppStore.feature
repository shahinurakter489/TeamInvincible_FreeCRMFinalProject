Feature: FreeCRM Appstore feature

  @Sanity @Regression
  Scenario: User should be able to redirect to the Appstore Page when clicking on the Appstore option
    Given User is on the homepage of freeCRM "https://freecrm.com/"
    When User clicks on the Appstore button
    Then User should be able to redirect to the Appstore Page "https://apps.apple.com/us/app/cogmento/id1291380634"
