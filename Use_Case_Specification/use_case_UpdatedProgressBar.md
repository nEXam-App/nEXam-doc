# Use-Case Specification: Update Progress Bar

## 1. Use-Case
This use case allows users to update the progress bar.

## 2. Flow of Events
### 2.1 Basic flow
A user starts or finishes learning a topic. Therefore, the progress bar of a topic will be updated. 

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/de7ca120f8f833eb6c871575df7fb7b9599263e0/diagrams/activity%20diagram/nEXam-activity%20diagram%20UpdateProgressBar.jpg)

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

Below you will shortly find our first wireframes. Those will show you our first thoughts about the look.

<!--![Create exam](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20edit%20exam.PNG)-->

### 3.4 Created views

We will designe a light and a dark mode.

<!--<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam%20light.png" alt="drawing" width="350"/>-->

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After performing one of the listed activities, the user can see his progress by the progress bar.

## 6. Function Points
We calculated 128.7 function points for this use case.

![function points](https://github.com/nEXam-App/nEXam-doc/blob/de7ca120f8f833eb6c871575df7fb7b9599263e0/diagrams/FP/FPUpdateProgressBar.PNG)
