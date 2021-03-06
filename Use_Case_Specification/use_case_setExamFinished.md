# Use-Case Specification: Set exam finished

## 1. Use-Case
This use case allows users to finish a selected exam.

## 2. Flow of Events
### 2.1 Basic flow
A user will create an exam and list all of them. He can edit them if changes occur or delete them altogether.

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/basic%20flow.jpg)

### 2.2 Set finished
By clicking on a switch button and answering the confirm dialog with 'yes' the user can set the exam to finished. With setting an exam to finish, the user can also change the sorting order on the dashboard.

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/activity%20diagram/nEXam-activity%20diagram%20(finish%20exam).jpg)

### 3.2 Narratives
The feature file for this use case.
#### Usecase: Set exam finished
```Gherkin
Feature: Use Case Set Exam finished
    As a USER 
    I want to set a selected exam to finished.
    Therefore I will be asked for confirmation.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Finish a selected exam
        When The user navigates to the detail view of an existing exam
        And The user clicks on the finish switch button
        And The exam is currently unfinished
        And The user clicks on the yes answer on the dialog
        Then The exam is set to finished 
        And The finished label is shown


    @postsession-feature:
    Scenario Outline: Unfinish a selected exam
        When The user clicks on the finish switch button
        And The exam is currently finished
        Then The exam is set to unfinished 
        And The finished label is hidden
```

### 3.3 Created views

We designed a light and a dark mode.

<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/unfinishedExam_light.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/finishDialog_light.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/finishedExam_light.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/unfinishedExam_dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/finishDialog_dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/finishedExam_dark.png" alt="drawing" width="350"/>

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After changing the finished status of a selected exam, the user will stay on the edit exam view.

## 6. Function Points
We calculated 94.25 function points for this use case.

![Function Points](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/FP/FPSetExamFinished.PNG)
