# Use-Case Specification: Create Exam

## 1. Use-Case
This use case allows users to create a new exam.

## 2. Flow of Events
### 2.1 Basic flow
A user will create an exam and list all of them. He can edit them if changes occur or delete them altogether.

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/basic%20flow.jpg)

### 2.2 Creation
During the creation of a new exam, the user is asked, to enter the subject and optional the date of the exam. Later on, there is also the opportunity to navigate to the add topic UI.

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/bc15f070dcdfbce8f52901afdc50dbbf4994b986/diagrams/activity%20diagram/nEXam-activity%20diagram%20(create%20Exam).jpg)

### 3.2 Narratives
The feature file for this use case.
#### Usecase: Create Exam
```Gherkin
Feature: Use Case Create Exam
    As a USER 
    I want to create a new exam.
    Therefore I will be asked for the subject and date.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Create new Exam
        When The user clicks on the Create Exam button
        And The user types the subject <subject>
        And The user types the date <date>
        And The user clicks on the Save button
        And All the data is valid
        Then The exam is created 
        And The success message with <subject> is shown

        Examples: Exam
        | subject           | date       |
        | Formale Sprache   | 2021-12-17 |
        | Statistik         | 2021-12-23 |

    @postsession-feature:
    Scenario: Leaving the Activity New Exam without creating an exam
        When The user presses the Back button 
        Then No exam is saved
        And The user returns to the previous screen
```

### 3.3 Mockups

Below you will find our first wireframes. Those will show you our first thoughts about the look.

![Create exam](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20edit%20exam.PNG)

![Error](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/error.PNG)

### 3.4 Created views

We designed a light and a dark mode.

<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam%20light.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/examError_dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/examError_light.png" alt="drawing" width="350"/>

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After creating a new exam, the user will be redirected to the dashboard, where all entries will be displayed.

## 6. Function Points
We calculated 111,15 function points for this use case.

![Function Points](https://github.com/nEXam-App/nEXam-doc/blob/bc15f070dcdfbce8f52901afdc50dbbf4994b986/diagrams/FP/FPCreateExam.PNG)