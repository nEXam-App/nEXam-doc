# Use-Case Specification: Delete Topic

## 1. Use-Case
This use case allows users to delete an existing topic.

## 2. Flow of Events
### 2.1 Basic flow
A user will delete an existing topic. 

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/basic%20flow.jpg)

### 2.2 Creation

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/activity_diagram_CreateExam.jpg)

### 3.2 Narratives
The feature file for the first case.
#### Usecase 1: Delete Topic
```Gherkin
Feature: Use Case 1 Create Topic
    As a USER 
    I want to delete existing topic.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Delete Topic
        When the user clicks on an existig topic
        And the user clicks on the delete button
        Then the topic will be deleted

       

    @postsession-feature:
    Scenario: Leaving the Activity delete topic without deleting an topic
        When the user presses the Back button 
        Then no topic is deleted
        And The user returns to the previous screen
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
After adding a new topic, the user will be redirected to the overview, where all entries will be displayed.

## 6. Function Points
[//]: <Domain Characteristic Table>

[//]: <Complexity Adjustment Table>
