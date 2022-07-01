# Use-Case Specification: Finish Exam

## 1. Use-Case
This use case allows users to finish a selected exam.

## 2. Flow of Events
### 2.1 Basic flow
A user will create an exam and list all of them. He can edit them if changes occur or delete them altogether.

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/basic%20flow.jpg)

### 2.2 Set finished
By clicking on a switchbutton and answering the up poping dialog with 'yes' the user can set the exam on finished

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/bc15f070dcdfbce8f52901afdc50dbbf4994b986/diagrams/activity%20diagram/nEXam-activity%20diagram%20(finish%20exam).jpg)

### 3.2 Narratives
The feature file for this use case.
#### Usecase: Create Exam
```Gherkin
Feature: Use Case Set Exam finished
    As a USER 
    I want to set a selected exam to finished.
    Therefore I will be asked for confirmation.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Finish a selected exam
        When The user clicks on the finish switchbutton
        And The exam is currently unfinished
        And The user clicks on the yes answer on the dialog
        Then The exam is set to finished 
        And The finished label is shown


    @postsession-feature:
    Scenario Outline: Uninish a selected exam
        When The user clicks on the finish switchbutton
        And The exam is currently finished
        Then The exam is set to unfinished 
        And The finished label is hiden
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

![Function Points](https://github.com/nEXam-App/nEXam-doc/blob/bc15f070dcdfbce8f52901afdc50dbbf4994b986/diagrams/FP/FPSetExamFinished.PNG)
