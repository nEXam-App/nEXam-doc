# Use-Case Specification: Create Topic

## 1. Use-Case
This use case allows users to create a new topic.

## 2. Flow of Events
### 2.1 Basic flow
A user will add a topic to an existing exam. He can edit them if changes occur or delete them altogether.

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/basic%20flow.jpg)

### 2.2 Creation
During the creation of a new topic the user is asked, to enter the topic and the difficulty level.
Based on the difficulty level the topic will be safed with an amount of time the user should spend studying.

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/activity_diagram_CreateExam.jpg)

### 3.2 Narratives
The feature file for the first case.
#### Usecase 1: Create Topic
```Gherkin
Feature: Use Case 1 Create Topic
    As a USER 
    I want to add a new topic to an existing exam.
    Therefore I will be asked for the topic difficulty level.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Add new topic
        When the user clicks on the Add topic button
        And the user types the topic <topic>
        And the user select a difficulty level <difficulty level>
        And the user clicks on the Save button
        And all the data is valid
        Then the topic is added 
        And a progress bar will be created and setted to not started
        And the success message with <topic> is shown

        Examples: Exam
        | topic                 | difficulty level  |
        | Regulaere Ausdruecke  |       4           |
        | Deskriptive Statistik |       3           |

    @postsession-feature:
    Scenario: Leaving the Activity Add topic without adding a topic
        When the user presses the Back button 
        Then no topic is added
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
