# Use-Case Specification: Start / Stop Timer

## 1. Use-Case
This use case allows users to start and stop a timer that count the estimated time down.

## 2. Flow of Events
### 2.1 Basic flow
A user will create an exam and list all of them. He can edit them if changes occur or delete them altogether.

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/basic%20flow.jpg)

### 2.2 Start / Stop timer
By clicking on the start timer button the timer will start counting. The start timer button will be disabled and the stop timer button will be enabled. By clicking on the stop timer button the timer will stop counting and set the buttons back to default. 
Other buttons, like delete or edit button, will also cast a stop timer action.

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/bc15f070dcdfbce8f52901afdc50dbbf4994b986/diagrams/activity%20diagram/nEXam-activity%20diagram%20(start%20stop%20timer).jpg)

### 3.2 Narratives
The feature file for this use case.
#### Usecase: Create Exam
```Gherkin
Feature: Use Case Start Timer
    As a USER 
    I want to start a timer.
    Therefore I need to click the start timer button.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: start timer
        When The user clicks on the start timer button
        Then The timer will start counting down the estimated time 

     @postsession-feature:
    Scenario Outline: stop timer
        When The user clicks on the stop timer button
        Then The timer will stop counting down the estimated time
```

### 3.3 Mockups

Below you will find our first wireframes. Those will show you our first thoughts about the look.

![Create exam](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20edit%20exam.PNG)

![Error](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/error.PNG)

### 3.4 Created views

We designed a light and a dark mode.

<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/timerStarted_light.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/timerStopped_light.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/timerStarted_dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/timerStarted_dark.png" alt="drawing" width="350"/>

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
The user will stay on the exam details.

## 6. Function Points
We calculated 111,15 function points for this use case.

![Function Points](https://github.com/nEXam-App/nEXam-doc/blob/bc15f070dcdfbce8f52901afdc50dbbf4994b986/diagrams/FP/FPCreateExam.PNG)