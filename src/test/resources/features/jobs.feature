Feature: Add jobs functionality of HireAccel

  Background:
    Given User navigate to login page
    When User enters email "testexampledeep@gmail.com"
    And User enters password "Test@123"
    And User clicks login
    Then User should see "Dashboard"

  Scenario: HR adds a new job vacancies
    When User clicks jobs tab
    And User clicks post new job
    And User enters job title "Acting"
    And User enters location "chennai"
    And User selects company "Stranger Things"
    And User selects job type "Full-time"
    And User selects work type "Onsite"
    And User enters min exp "1"
    And User enters max exp "5"
    And User enters num of openings "7"
    And User selects hiring time "3-4 weeks"
    And User enters job description "An actor portrays characters in film, television, theater, or other media to entertain or inform an audience. Key responsibilities include analyzing scripts, memorizing lines, attending auditions, rehearsing, and performing, often requiring emotional depth, adaptability to direction, and physical, musical, or vocal skills."
    And User enters skills "vocal projection and articulation, physical characterization and movement, character analysis, memorization, and improvisation."
    And User enters min salary "90000"
    And User enters max salary "200000"
    And User selects date "31/03/2026"
    And User clicks create job
    Then User should see created job id
