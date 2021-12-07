# Use-Case Specification: Create Exam

## 1. Use-Case
This use case allows users to create a new exam with the first topic.

![Use Case](https://github.com/Calco2001/nEXam/blob/main/docs/diagrams/use%20case%20diagram.jpg)

## 2. Flow of Events
### 2.1 Basic flow
A user will create an exam and list all of them. He can edit them if changes occur or delete them altogether.

![Basic Flow](https://github.com/Calco2001/nEXam/blob/main/docs/diagrams/basic%20flow.jpg)

### 2.2 Creation
During the creation of a new exam the user is asked, to enter the topic and additional information(subject, content and date).

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/Calco2001/nEXam/blob/main/docs/diagrams/activity_diagram_CreateExam.jpg)

### 3.2 Narratives
The feature file for the first case.
#### ![Usecase 1](https://github.com/Calco2001/nEXam/blob/main/application/src/test/UC1.feature): Create Exam
```Gherkin
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
```

### 3.3 Mockups

Below you will find our first wireframes. Those will show you our first thoughts about the look.

![Create exam](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/create%20edit%20exam.PNG)

![Error](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/error.PNG)

![Success message](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/success%20message.PNG)

### 3.4 Created views

We designed a light and a dark mode.

<img src="https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/create%20exam.png" alt="drawing" width="350"/>
<!--![Create exam dark](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/create%20exam.png)-->
<img src="https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/create%20exam%20light.png" alt="drawing" width="350"/>
<!--![Create exam light](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/create%20exam%20light.png)-->
<img src="https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/examError_dark.png" alt="drawing" width="350"/>
<!--![Error message dark](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/examError_dark.png)-->
<img src="https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/examError_light.png" alt="drawing" width="350"/>
<!--![Error message dark](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/examError_light.png)-->
<img src="https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/examSuccess_dark.png" alt="drawing" width="350"/>
<!--![Success message dark](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/examSuccess_dark.png)-->
<img src="https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/examSuccess_ligt.png" alt="drawing" width="350"/>
<!--![Success message light](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/examSuccess_ligt.png)-->

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After creating a new exam, the user will be redirected to the overview, where all entries will be displayed.

## 6. Function Points
[//]: <Domain Characteristic Table>

[//]: <Complexity Adjustment Table>