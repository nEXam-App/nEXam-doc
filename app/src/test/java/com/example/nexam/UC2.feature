Feature: Use Case 2 edit an existing Exam
    As a USER 
    I want to edit the information of an existing exam.
    Therefore I will get shown the topic and additional information (subject, content and date) of the selected exam.

    Background:
        Given The application has the needed local permissions
        And At least one exam is existing
        And The user wants to edit all information

    @postsession-feature:
    Scenario Outline: Edit all information on an existing exam
        When The user clicks on the existing exam in the Dashboard view
        And The user edit the topic <topic>
        And The user edit the subject <subject>
        And The user edit the content <content>
        And The user edit the date <date>
        And The user clicks on the Save button
        And All the data is valid
        Then The exam is updated 
        And The success message with <topic> is shown

        Examples: Exam
        | topic           | subject               | content     | date       |
        | Formale Sprache | Regulaere Ausdruecke  | Regex       | 2021-12-17 |
        | Statistik       | Deskriptive Statistik | Histogramme | 2021-12-23 |

    Background:
        Given The application has the needed local permissions
        And At least one exam is existing
        And The user wants to edit the date

    @postsession-feature:
    Scenario Outline: Edit only one information of an existing exam (example <date>)
        When The user clicks on the existing exam in the Dashboard view
        And The user edit the date <date>
        And The user clicks on the Save button
        And All the data is valid
        Then The exam is updated 
        And The success message with <topic> is shown

        Examples: Exam
        | topic | subject | content | date       |
        |       |         |         | 2021-12-17 |
        |       |         |         | 2021-12-23 |

    @postsession-feature:
    Scenario: Leaving the Activity New Exam without creating an exam
        When The user presses the Back button 
        Then No exam is updated
        And The user returns to the previous screen