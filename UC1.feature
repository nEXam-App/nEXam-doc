Feature: Use Case 1 Create Exam
    As a USER 
    I want to create a new exam with a topic and further information.
    Therefore I will be asked for the topic and additional information (subject, content and date).

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Create new Exam
        When The user clicks on the Create Exam button
        And The user types the topic <topic>
        And The user types the subject <subject>
        And The user types the content <content>
        And The user types the date <date>
        And The user clicks on the Save button
        And All the data is valid
        Then The exam is created 
        And The success message with <topic> is shown

        Examples: Exam
        | topic           | subject               | content     | date       |
        | Formale Sprache | Regulaere Ausdruecke  | Regex       | 2021-12-17 |
        | Statistik       | Deskriptive Statistik | Histogramme | 2021-12-23 |

    @postsession-feature:
    Scenario: Leaving the Activity New Exam without creating an exam
        When The user presses the Back button 
        Then No exam is saved
        And The user returns to the previous screen