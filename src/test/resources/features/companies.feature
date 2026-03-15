Feature: Add companies functionality of HireAccel

  Background:
    Given User navigate to login page
    When User enters email "testexampledeep@gmail.com"
    And User enters password "Test@123"
    And User clicks login
    Then User should see "Dashboard"

  Scenario: HR adds a new company
    When User clicks companies tab
    And User clicks add company button
    And User enters company name "Stranger Things"
    And User selects company size "1000+ employees"
    And User enters company address "Georgia"
    And User enters city name "Hawkins"
    And User enters pin code "303303"
    And User enters founded year "2016"
    And User enters company description "Stranger Things is a Netflix sci-fi horror series created by the Duffer Brothers, set in 1980s Indiana, that blends nostalgic coming-of-age adventures with supernatural thrills. It follows a group of kids, teenagers, and adults fighting shadowy government conspiracies and interdimensional monsters from the Upside Down."
    And User clicks create company button
    Then User should see created company id