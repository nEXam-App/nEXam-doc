# Use-Case Specification: View Exam

## 1. Use-Case
This use case allows users to view a created exam.

## 2. Flow of Events
### 2.1 Basic flow
A user will create an exam and this exam will be listed on the dashboard with others. To see more details about it, he can change in the detail view with a click on the specific exam.

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/basic%20flow.jpg)

### 2.2 Creation
During the creation of a new exam, the user is asked, to enter the subject and optional the date of the exam. Afterwards the data can be displayed.

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/dfc0c277d2951844cd0da6b9c2d8eef0ddb40d0a/diagrams/activity%20diagram/NEX-186%20nEXam-activity%20diagram%20ViewExam.jpg)

### 3.2 Narratives
The feature file for this use case.
#### Usecase: View Exam
```Gherkin
Feature: Use Case: View Exam
    As a USER 
    I want to view an existing exam.
    Therefore I can select an existing exam.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: View Exam
        When The user clicks on an existing exam
        Then The exam view is filled with the existing information
        And The exam view is shown
```

### 3.3 Mockups

Below you will find our first wireframes. Those will show you our first thoughts about the look.

![View exam](https://github.com/nEXam-App/nEXam-doc/blob/dfc0c277d2951844cd0da6b9c2d8eef0ddb40d0a/wireframes/exam%20view.PNG)

### 3.4 Created views

We designed a light and a dark mode.

<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/examView_dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/examView_light.png" alt="drawing" width="350"/>

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After viewing an exam, the user has the opportunity to edit it.

## 6. Function Points
We calculated 121.55 function points for this use case.

![Function Points](https://github.com/nEXam-App/nEXam-doc/blob/dfc0c277d2951844cd0da6b9c2d8eef0ddb40d0a/diagrams/FP/FPShowExamView.PNG)
