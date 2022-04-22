# Use-Case Specification: Show Topic

## 1. Use-Case
This use case allows users to show an existing topic.

## 2. Flow of Events
### 2.1 Basic flow
A user will create an exam with a topic and list all of them. He can edit them if changes occur or delete them altogether.

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/861925ad9fd5208579205441ed99b85b9dc07c43/diagrams/nEXam-basic%20flow%20topic.jpg)

### 2.2 Creation
During the creation of a new topic, the user is asked, to enter the topic and optional information about the exam. This information will be shown with this use case.

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/ad7ca060f4a6e9fb497dceb4d3a9f3b8aff8e19f/diagrams/activity%20diagram/nEXam-activity%20diagram%20ShowTopic.jpg)

### 3.2 Narratives
The feature file for this use case.
#### Usecase: Show Topic
```Gherkin
Feature: Use Case Show Topic
    As a USER 
    I want to show an existing topic.
    Therefore I will open a topic to see the data.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Show Topic
        When The user clicks on the an existing topic
        Then The data will be loaded in the topic
        And The topic view is shown
```

### 3.3 Mockups

Below you will find our first wireframes. Here you can see our initial thoughts on the look, as the topic will be analogous to exam.

![Show exam](https://github.com/nEXam-App/nEXam-doc/blob/ad7ca060f4a6e9fb497dceb4d3a9f3b8aff8e19f/wireframes/exam%20view.PNG)

### 3.4 Created views

We will design a light and a dark mode.

<!--<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam%20light.png" alt="drawing" width="350"/>-->

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After the topic is shown, the user has the opportunity to edit it.

## 6. Function Points
We calculated 112.45 function points for this use case.

![Function Points](https://github.com/nEXam-App/nEXam-doc/blob/ad7ca060f4a6e9fb497dceb4d3a9f3b8aff8e19f/diagrams/FP/FPShowTopic.PNG)
