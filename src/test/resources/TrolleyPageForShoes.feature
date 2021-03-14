Feature: Trolley Page For Shoes Functionality

  As a user
  I want to go to Ebay website
  So that I can buy a shoes

  Background:
    Given user is on ebay homepage
    When user types shoes in serach box
    And user click on search button
    Then user should able to see all shoes products

  @ShoesSelection
  Scenario: Check the selected shoes into the trolley
    Given user is on shoes Resultpage of Ebay website
    When user select one product of the shoes
    And user select shoes colour and size
    And user add the product of shoes to basket
    Then user able to see that selected shoes into trolley

  @ShoesPrice
  Scenario: Check the price When increase the Quantity
    Given user is on shoes Resultpage of Ebay website
    When user select one product of the shoes
    And user select shoes colour and size
    And user add the product of shoes to basket
    And user increase the shoes quantity
    Then user able to see shoes price is increase as per quantity
