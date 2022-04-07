# Use-Case Specification: Update Progress Bar

## 1. Use-Case
This use case allows users to update the progress bar.

## 2. Flow of Events
### 2.1 Basic flow
A user starts or finishes learning a topic. Therefore, the progress bar of a topic will be updated. 

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/basic%20flow.jpg)

### 2.2 Creation

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/activity_diagram_CreateExam.jpg)

### 3.2 Narratives
The feature file for this case.
#### Usecase 4: Update Progress bar
```Gherkin
Feature: Use Case 4 Set progress bar to started
    As a USER 
    I want to change the progress bar to started.
    Therefore I will need to start the timer of the topic.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Change progress bar to started
        When The user clicks on an existing topic
        And The user types the Start Timer button
        And The status checkbox isnt checked
        Then The progress bar will change from not started to started

    @postsession-feature:
    Scenario: Change progress bar to finished
        When The user checks the status checkbox
        And The progress bar isnt on finished
        Then The progress bar will change from not started or started to finished
```

### 3.3 Mockups

Below you will find our first wireframes. Those will show you our first thoughts about the look.

![Create exam](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20edit%20exam.PNG)

![Error](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/error.PNG)

![Success message](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/success%20message.PNG)

### 3.4 Created views

We designed a light and a dark mode.

<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam%20light.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/examError_dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/examError_light.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/examSuccess_dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/examSuccess_ligt.png" alt="drawing" width="350"/>

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After performing one of the listed activities, the user can see his progress by the progress bar.

## 6. Function Points
[//]: <Domain Characteristic Table>

[//]: <Complexity Adjustment Table>
