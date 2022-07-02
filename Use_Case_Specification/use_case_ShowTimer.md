# Use-Case Specification: Show timer

## 1. Use-Case
This use case allows users to keep track of their time for a specific exam.

## 2. Flow of Events
### 2.1 Basic flow
A user will be able to see the timer in the opend exam. He has the possibilty to start and stop the timer.

### 2.2 Creation
During the creation of a new exam, the user was asked, to enter a difficulty to the exam. With this value, the app suggests the remaining time and displays it.

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/70084e70270abd4ab53fe7f90b9996a2fade4caa/diagrams/activity%20diagram/nEXam-activity%20diagram%20ShowTimer.jpg)

### 3.2 Narratives
The feature file for this use case.
#### Usecase: Show Timer
```Gherkin
Feature: Use Case Show Timer
    As a USER 
    I want to keep track of my time spent for a exam.
    Therefore I can start and stop the built-in timer.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Show Timer
        When The user clicks on an existing exam
        And The user sees the timer below the information for the exam
        And The user start the timer with the button
        And The user stops the timer again
        Then The remaining time will be displayed
```

### 3.3 Mockups

Below you will find our first wireframes. Those will show you our first thoughts about the look.

![Dashboard](https://github.com/nEXam-App/nEXam-doc/blob/70084e70270abd4ab53fe7f90b9996a2fade4caa/wireframes/dashboard.PNG)

### 3.4 Created views

We designed a light and a dark mode.

<img src="https://github.com/nEXam-App/nEXam-doc/blob/70084e70270abd4ab53fe7f90b9996a2fade4caa/wireframes/create%20topic%20dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/70084e70270abd4ab53fe7f90b9996a2fade4caa/wireframes/create%20topic%20light.png" alt="drawing" width="350"/>

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After stoping the timer, the new remaining time will be stored in the database.

## 6. Function Points
We calculated 122.2 function points for this use case.

![Function Points](https://github.com/nEXam-App/nEXam-doc/blob/70084e70270abd4ab53fe7f90b9996a2fade4caa/diagrams/FP/FPShowTimer.PNG)
