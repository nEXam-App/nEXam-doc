# Use-Case Specification: Edit Topic

## 1. Use-Case
This use case allows users to edit the infos of an existing topic.

## 2. Flow of Events
### 2.1 Basic flow
A user will add a topic and list all of them. He can edit them if changes occur or delete them altogether.

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/basic%20flow.jpg)

### 2.2 Edit
By editing the user can change all the info he wants for the current topic. The data will be validated afterwards.

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/activity_diagram_EditInfo.jpg)

### 3.2 Narratives
The feature files for the use case.
#### Usecase 2: Edit Exam
```Gherkin
Feature: Use Case 2 edit an existing Exam
    As a USER 
    I want to edit the information of an existing topic.
    Therefore I will get shown the topic, remaining time and status of the selected topic.

    Background:
        Given The application has the needed local permissions
        And At least one exam is existing with at least one topic
        And The user wants to edit all information

    @postsession-feature:
    Scenario Outline: Edit topic of an existing topic
        When The user clicks on the existing topic in the Exam view
        And The user edit the topic <topic>
        And The user clicks on the Save button
        And All the data is valid
        Then The topic is updated 
        And The success message with <topic> is shown

        Examples: Exam
        | topic                   |
        | Regulaere Ausdruecke    |
        | Deskriptive Statistik   |

    @postsession-feature:
    Scenario: Leaving the Activity Edit Topic without edditing a topic
        When The user presses the Back button 
        Then No exam is updated
        And The user returns to the previous screen
```

### 3.3 Wireframes

Below you will find our first wireframes. Those will show you our first thoughts about the look.

![Edit exam](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20edit%20exam.PNG)

![Error](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/error.PNG)

![Success message](https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/success%20message.PNG)

3.4 Created views

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

### 5.2 Edit
After the user saved his edits, the updated data will be displayed in the overview.

### 5.3 Delete
After confirming the deletion modal, the exam will be removed from the overview.

## 6. Function Points
[//]: <Domain Characteristic Table>

[//]: <Complexity Adjustment Table>
