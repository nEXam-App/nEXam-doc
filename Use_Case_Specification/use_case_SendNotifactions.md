# Use-Case Specification: Send Notifications

## 1. Use-Case
This use case sends notifications to the user, so he studies regularly.

## 2. Flow of Events
### 2.1 Basic flow
The user is regularly reminded about learning. Therefore, the system checks the date and time needed for an exam and sends a push message to the user.

### 2.2 Creation
When creating a new exam, the user is prompted to enter a date. Based on this date and the remaining time of a subject, the system calculates when a message must be sent.

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/8097538a4f7a16b988f95ff470a8f107a398728e/diagrams/activity%20diagram/nEXam-activity%20diagram%20SendNotifications.jpg)

### 3.2 Narratives
The feature file for this use case.
#### Usecase: Send Notifications
```Gherkin
Feature: Use Case Send Notifications
    As a USER 
    I want to be reminded to learn for the exams.
    Therefore I will get notifications as push up message.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Send notifications
        When The systems calculates the need of a message
        And The system generates the push up message wit the <subject>
        And the message is displayed on the screen
        And The user clicks on the message
        Then The App will be started
        And The dashboard is shown

        Examples: Exam
        | subject           |
        | Formale Sprache   |
        | Statistik         |

    @postsession-feature:
    Scenario: Swiping the message away without clicking on it
        When The user swipes the message away 
        Then The app will not be started
        And The user will be reminded later
```

### 3.3 Mockups

Below you will soon find our first wireframes. Those will show you our first thoughts about the look.

### 3.4 Created views

tbd
<!--<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam%20light.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/examError_dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/examError_light.png" alt="drawing" width="350"/>-->

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After the dashboard is shown, the user can navigate to the subject shown in the message.

## 6. Function Points
We calculated 102.7 function points for this use case.

![Function Points](https://github.com/nEXam-App/nEXam-doc/blob/8097538a4f7a16b988f95ff470a8f107a398728e/diagrams/FP/FPSendNotifications.PNG)
