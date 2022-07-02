# Use-Case Specification: Delete Topic

## 1. Use-Case
This use case allows users to delete an existing topic.

## 2. Flow of Events
### 2.1 Basic flow
A user will delete an existing topic. 

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/48fb0651dfb06617b7f788927c06c29b4fdcf83f/diagrams/nEXam-basic%20flow%20topic.jpg)

### 2.2 Creation

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/644cb5ffeaec9f091a81d516f04789365744a34f/diagrams/activity%20diagram/nEXam-activity%20diagram%20(delete%20topic).jpg)

### 3.2 Narratives
The feature file for this use case.
#### Usecase: Delete Topic
```Gherkin
Feature: Use Case Delete Topic
    As a USER 
    I want to delete an existing topic.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Delete Topic
        When the user clicks on an existig topic
        And the user clicks on edit topic
        And the user clicks on the delete button
        And the user confirms delete
        Then the topic will be deleted

    @postsession-feature:
    Scenario: Leaving the Activity delete topic without deleting an topic
        When the user presses the Back button 
        Then no topic is deleted
        And The user returns to the previous screen
```

### 3.3 Mockups

Below you will find our first wireframes for an exam. Here you can see our initial thoughts on the look, as the topic will be analogous to exam.

![Create exam](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20edit%20exam.PNG)

### 3.4 Created views

We will design a light and a dark mode.

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After deleting an exisiting topic, the user will be redirected to the exam.

## 6. Function Points
We calculated 111.8 function points for this use case.

![function points](https://github.com/nEXam-App/nEXam-doc/blob/48fb0651dfb06617b7f788927c06c29b4fdcf83f/diagrams/FP/FPDeleteTopic.PNG)
