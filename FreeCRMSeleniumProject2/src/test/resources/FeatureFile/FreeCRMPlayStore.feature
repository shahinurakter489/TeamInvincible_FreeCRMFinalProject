Feature: FreeCRM Playstore feature

  @Sanity @Regression
  Scenario: User should be redirected to the Playstore Page when clicking on the Playstore option
    Given User on the homepage of freeCRM "https://freecrm.com/"
    When User clicks on Playstore button
    Then User should be redirected to the Playstore Page "https://play.google.com/store/apps/details?id=com.cogmento.app"
