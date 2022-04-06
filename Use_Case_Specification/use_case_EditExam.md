# Use-Case Specification: Edit Exam

## 1. Use-Case
This use case allows users to edit the infos of an existing exam.

![Use Case](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/nEXam-use%20case%20diagram.jpg)

## 2. Flow of Events
### 2.1 Basic flow
A user will create an exam and list all of them. He can edit them if changes occur or delete them altogether.

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/basic%20flow.jpg)

### 2.2 Edit
By editing the user can change all the info he wants for the current exam. The data will be validated afterwards.

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/activity_diagram_EditInfo.jpg)

### 3.2 Narratives
The feature files for the use case.
#### Usecase 2: Edit Exam
```Gherkin
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
```

### 3.3 Wireframes

Below you will find our first wireframes. Those will show you our first thoughts about the look.

![Edit exam](https://github.com/nEXam-App/nEXam-doc/blob/main/docs/wireframes/create%20edit%20exam.PNG)

![Error](https://github.com/nEXam-App/nEXam-doc/blob/main/docs/wireframes/error.PNG)

![Success message](https://github.com/nEXam-App/nEXam-doc/blob/main/docs/wireframes/success%20message.PNG)

3.4 Created views

We designed a light and a dark mode.

<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/docs/wireframes/create%20exam.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/docs/wireframes/create%20exam%20light.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/docs/wireframes/examError_dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/docs/wireframes/examError_light.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/docs/wireframes/examSuccess_dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/docs/wireframes/examSuccess_ligt.png" alt="drawing" width="350"/>

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions

### 5.2 Edit
After the user saved his edits, the updated data will be displayed in the overview.

### 5.3 Delete
After confirming the deletion modal, the exam will be removed from the overview.

## 6. Function Points
[//]: <Domain Characteristic Table>

[//]: <Complexity Adjustment Table>
