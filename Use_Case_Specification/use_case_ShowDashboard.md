# Use-Case Specification: Show Dashboard

## 1. Use-Case
This use case shows the user the dashboard when he opens the app or clicks the dashboard button.

## 2. Flow of Events
### 2.1 Basic flow
A user will open the app or clicks the corresponding button. Therefore, he will be navigated to the dashboard view. Here he can see already created exams and has the possibility to add more.

### 2.2 Creation
While the view is loading, the systems fill the belonging text view with the existing exams from the database. Only the title will be visible, so the users are not confused with too much information at the same point.

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/81110067eca9360f0dd356b023b2782b6d20422a/diagrams/activity%20diagram/nEXam-activity%20diagram%20ShowDashboard.jpg)

### 3.2 Narratives
The feature file for this use case.
#### Usecase: Show Dashboard
```Gherkin
Feature: Use Case Show Dashboard
    As a USER 
    I want to open the app or navigate to the dashboard from another view.
    Therefore, I will need to open the app or click the corresponding button.

    Background:
        Given The application has the needed local permissions

    @postsession-feature:
    Scenario Outline: Show Dashboard
        When The user clicks on the App Icon or the Dashboard button
        Then The dashboard with is shown
        And the text view is loaded with the exams from the database
```

### 3.3 Mockups

Below you will find our first wireframe. This will show you our first thoughts about the look.

![Show Dashboard](https://github.com/nEXam-App/nEXam-doc/blob/81110067eca9360f0dd356b023b2782b6d20422a/wireframes/dashboard.PNG)

### 3.4 Created views

We designed a light and a dark mode.

<img src="https://github.com/nEXam-App/nEXam-doc/blob/81110067eca9360f0dd356b023b2782b6d20422a/wireframes/dashboard_dark.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/81110067eca9360f0dd356b023b2782b6d20422a/wireframes/dashboard_light.png" alt="drawing" width="350"/>

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After showing the dashboard, the user can add more exams with the create exam button or navigate to an existing exam by clicking it.

## 6. Function Points
We calculated 90.35 function points for this use case.

![Function Points](https://github.com/nEXam-App/nEXam-doc/blob/81110067eca9360f0dd356b023b2782b6d20422a/diagrams/FP/FPCreateDashboard.PNG)
