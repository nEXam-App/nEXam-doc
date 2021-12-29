Feature: Use Case 2 change the app theme
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