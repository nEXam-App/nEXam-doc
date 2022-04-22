# Use-Case Specification: Change Theme

## 1. Use-Case
This use case allows users to switch between light and dark theme.

## 2. Flow of Events
### 2.1 Basic flow
The app will use the system default theme.

![Basic Flow](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/basicflow_ChangeTheme.jpg)

## 3. Activity Diagram
### 3.1 Activity Diagram
![Activity Diagram](https://github.com/nEXam-App/nEXam-doc/blob/2559fe2e702bdab4ce9363fa6d51ad84bb05a61d/diagrams/activity%20diagram/activity_diagram_ChangeTheme.jpg)

### 3.2 Narratives
The feature file for this case.
#### Usecase: Change app theme
```Gherkin
Feature: Use Case change the app theme
    As a USER 
    I want to change the theme of the app.
    Therefore I need to change the system default theme.

    Background:
        Given The application has the needed local permissions
        And The user wants to edit all information

    @postsession-feature:
    Scenario Outline: Change the app theme
        When The user changes the system default theme
        Then The app theme is changed 

    Background:
        Given The application has the needed local permissions
```

### 3.3 Mockups

Below you will find two mockups of the same view with different themes.

<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam.png" alt="drawing" width="350"/>
<img src="https://github.com/nEXam-App/nEXam-doc/blob/main/wireframes/create%20exam%20light.png" alt="drawing" width="350"/>

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
After changing the system default theme the app theme will update automaticly. It is not needed to restart the app.

## 6. Function Points
Since Android Studio automatically provides a dark and light mode, we did not create function points for this use case. Instead, this is listed with the other use cases.
