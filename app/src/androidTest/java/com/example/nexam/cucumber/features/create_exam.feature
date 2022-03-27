Feature: Use Case 1 Create Exam
  As a USER
  I want to create a new exam with a topic and further information.
  Therefore I will be asked for the subject and additional information (topic, date and content).

  @smoke
    @e2e

  Scenario Outline: Successful creation of a new exam

    Given I start the application
    When I click create exam button
    And I click subject field
    And I enter subject <subject>
    And I close the keyboard
    And I click topic field
    And I enter topic <topic>
    And I close the keyboard
    And I click date field
    And I enter valid date <date>
    And I close the keyboard
    And I click content field
    And I enter content <content>
    And I close the keyboard
    And I click save button
    Then I expect to see success page

    Examples:
      | subject          | topic                 | content     | date       |
      | Formale Sprachen | Regulaere Ausdruecke  | Regex       | 2021-12-17 |
      | Statistik        | Deskriptive Statistik | Histogramme | 2021-12-23 |