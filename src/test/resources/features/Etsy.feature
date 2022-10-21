@ets
#TC #1: Etsy Title Verification
#1. Open Chrome browser

#2. Go to https://www.etsy.com
#3. Search for “wooden spoon”
#4. Verify title:
#Expected: “Wooden spoon | Etsy”

  Feature: Etsy Title Verification

    Scenario:
      When User open the chrome browser
      And User go to Etsy page
      Given user is on the login page of the web table app
      Then User click accept button
      And User enter "Wooden spoon"
      Then User click the  search
      Then User can see "Wooden spoon" title
