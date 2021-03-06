# nEXam - Software Requirements Specification 

## Table of contents
- [Table of contents](#table-of-contents)
- [1. Introduction](#1-introduction)
    - [1.1 Purpose](#11-purpose)
    - [1.2 Scope](#12-scope)
    - [1.3 Definitions, Acronyms and Abbreviations](#13-definitions-acronyms-and-abbreviations)
    - [1.4 References](#14-references)
    - [1.5 Overview](#15-overview)
- [2. Overall Description](#2-overall-description)
- [3. Specific Requirements](#3-specific-requirements)
    - [3.1 Functionality](#31-functionality)
    - [3.2 Usability](#32-usability)
    - [3.3 Reliability](#33-reliability)
    - [3.4 Performance](#34-performance)
    - [3.5 Supportability](#35-supportability)
    - [3.6 Design Constraints](#36-design-constraints)
    - [3.7 Complexity](#37-complexity)
    - [3.8 Online User Documentation and Help System Requirements](#38-online-user-documentation-and-help-system-requirements)
    - [3.9 Purchased Components](#39-purchased-components)
    - [3.10 Interfaces](#310-interfaces)
    - [3.11 Licensing Requirements](#311-licensing-requirements)
    - [3.12 Legal, Copyright And Other Notices](#312-legal-copyright-and-other-notices)
    - [3.13 Applicable Standards](#313-applicable-standards)
- [4. Supporting Information](#4-supporting-information)

## 1. Introduction

### 1.1 Purpose

This Software Requirements Specification (SRS) describes all specifications for the application "nEXam". It includes an overview about this project and its vision, detailed information about the planned features and boundary conditions of the development process.

### 1.2 Scope

The project is to be implemented as an Android app with the possibility of offering it for iOS at a later date.

Actors of this app are students.

Planned use cases are:
- Show Dashboard: This use case covers the default view and contains the exams.
- Change Theme: The app will use the system default setting. Therefore we must provide a light and dark mode. The user has no need to change it itself.
- Exam: There are three use cases for this subitem. These are the typical CRUD operations, so create, edit, delete and view exam belong here.
- Set finished: The exams can be set on finished to show an additional label and change the priority on the dashboard.
- Timer: A timer is shown in the detail view of an existing exam. It's possible to start and stop it, and it will count the estimated effort down. 

### 1.3 Definitions, Acronyms and Abbreviations

| Abbreviation | Explanation                         |
| ------------ | ----------------------------------- |
| SRS          | Software Requirements Specification |
| UC           | Use Case                            |
| n/a          | not applicable                      |
| tbd          | to be determined                    |
| OUCD         | overall Use Case Diagram            |
| FAQ          | Frequently asked Questions          |

### 1.4 References

| Title                                               |    Date    | Publishing organization |
| --------------------------------------------------- | :--------: | ----------------------- |
| [nEXam blog](https://nexam955203221.wordpress.com/) | 05.10.2021 | nEXam-App               |
| [GitHub](https://github.com/nEXam-App/nEXam)        | 05.10.2021 | nEXam-App               |
| [Documents](https://github.com/nEXam-App/nEXam-doc) | 06.04.2022 | nEXam-App               |

### 1.5 Overview

The following chapters provide an overview of this project with vision and Overall Use Case Diagram. The third chapter (Requirements Specification) delivers more details about the specific requirements in terms of functionality, usability and design parameters. Finally there is a chapter with supporting information.
    
## 2. Overall Description 

### 2.1 Vision

???nEXam??? will be an app that allows you to plan when you should start studying before an exam and how much time you should spend on it. 

How does it work? 
You need to enter your exam information, including date, subject, difficulty and topics. Based on this information, the app will create an agenda of when you  should study which topic. While learning, you can run the in-app timer,  so you can keep track of the time spent on an individual exam. Future You should also be able to export the iCal file to import it to the calendar of your choice.

### 2.2 Use Case Diagram

The planned scope for the first and second semesters is shown in the OUCD. More information about the use cases can be found in the [use-case specification](https://github.com/nEXam-App/nEXam-doc/tree/main/Use_Case_Specification) folder.

![OUCD](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/nEXam-use%20case%20diagram.jpg)

- Green: First semester
- Yellow: Second semester

### 2.3 Technology Stack

The technology we use is:
- Backend: Gradle, SQLite with room
- Frontend: Android with Kotlin and XML
- IDE: Visual Studio and Android Studio
- Project Management: Youtrack, GitHub
- Testing: Cucumber, Espresso with Green Coffee, JUnit
- Metrics: SonarCloud

## 3. Specific Requirements

### 3.1 Functionality

This section explains the different use cases you can see in the use case diagram and their functionality.

Until December we plan to implement:
- 3.1.1 Change Theme
- 3.1.2 View Exam
- 3.1.3 Show Timer
- 3.1.4 Show Dashboard

Until June, we want to implement:
- 3.1.5 Start / Stop Timer
- 3.1.6 Create Exam
- 3.1.7 Edit Exam
- 3.1.8 Delete Exam
- 3.1.9 Set Exam finished


#### 3.1.1 Change Theme

The app will use the system default setting. Therefore we must provide a light and dark mode. The user has no need to change it itself.

[Change Theme](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ChangeTheme.md)

#### 3.1.2 View Exam

On the dashboard the user can see the existing exams with their subject. If he clicks on one, he will get more information in the show exam view.

[View Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ViewExam.md)

#### 3.1.3 Show Timer

In the topic the user gets a timer with a displayed time. This will be calculated with the entered difficulty by create topic. By clicking on the start button the user can keep track of his time spent learning.

[Show Timer](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ShowTimer.md)

#### 3.1.4 Show Dashboard

This use case covers the default view and contains the existing exams.

[Show Dashboard](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ShowDashboard.md)

#### 3.1.5 Start/Stop Timer

The estimated time can be counted down by a start Timer button. As well, the Timer can be stopped by another button.

[Start / Stop Timer](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_StartStopTimer.md)

#### 3.1.6-3.1.9 Exam

There are four use cases for this subitem. These are three of the typical CRUD operations, so create, edit and delete an exam. Additional you can use a switchbutton to set the selected Exam on 'finished'. This will show an additional label. Also it will effect the sorting on the dashboard.

[Create Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_CreateExam.md)

[Edit Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_EditExam.md)

[Delete Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_DeleteExam.md)

[Finish Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_setExamFinished.md)

#### 3.1.10 Agenda View

Here you can make various adjustments for the dashboard. Among other things, you can select how the exams are displayed, and you can access the individual subchapters for the exams. There are also two designs for the light and dark modes. - tbd

#### 3.1.11 Topics

Instead of an input text field directly by the exam, it should be possible in the future to enter separate topics for one exam. Here you also have the CRUD use cases. -tbd

[Create Topic](https://github.com/nEXam-App/nEXam-doc/blob/main/Use_Case_Specification/use_case_CreateTopic.md)

[Show Topic](https://github.com/nEXam-App/nEXam-doc/blob/main/Use_Case_Specification/use_case_ShowTopic.md)

[Edit Topic](https://github.com/nEXam-App/nEXam-doc/blob/main/Use_Case_Specification/use_case_EditTopic.md)

[Delete Topic](https://github.com/nEXam-App/nEXam-doc/blob/main/Use_Case_Specification/use_case_DeleteTopic.md)

### 3.2 Usability

We plan to make the user interface as intuitive and self-explanatory as possible so that the user feels as comfortable as possible when using the app. We will use familiar icons to navigate, already known from other typical applications. Our goal is that a user installs the application, opens it and is able to use all features without any explanation or help.

In addition, we also want to pay attention to accessibility, as Android Studio will automatically give you hints and tips about it. Thus, it should correspond to the current time and also meet future demands.

The language of the nEXam app will be English, so people around the world are able to understand and use our application. If we have enough time we will add translations for German.

### 3.3 Reliability

The app should be available throughout, as it runs locally on your own phone. During development, there may be a loss of functionality, but this should ideally be intercepted by tests beforehand.

### 3.4 Performance

#### 3.4.1 Storage

Smartphones do not offer much storage space. Therefore, we strive to keep the required storage space as small as possible and save it in a local room database. 

#### 3.4.2 App perfomance

To provide the best app performance, we try to keep the response time as low as possible. This significantly improves the user experience and also makes the app more likely to be used for exam preparation. Queries for the database will only be performed if changes occur to increase the user experience.

### 3.5 Supportability

#### 3.5.1 Coding Standards

We will write the code using all the common standards for clean code. For example, we will name our variables and methods after their functions. This will keep the code easy to read for everyone and make further development much easier. Also, we will follow the structure of the framework to make it easier for ourselves to get back into the structure of the app or to allow others to get into the project more easily.

#### 3.5.2 Testing Strategy

The application should ideally have a high test coverage and all important functionalities and edge cases should be tested. Further errors in the implementation will be detected immediately, and it will be easier to localize the error.

### 3.6 Design Constraints

We strive for a modern and easy-to-use design for the user interface as well as for the architecture of our application. To achieve this, the functionalities are kept as modular as possible.

Since we want to have to opportunity to provide the app as iOS and Android app, we chose Kotlin as our programming language. We also use the common MVVM architecture of Android to keep the frontend and the backend separate and to keep the possibility open to switch to other architectures without making adjustments in several places.

For our version control and project management we will use [GitHub](https://github.com/nEXam-App/nEXam) and [YouTrack](https://dhbw-karlsruhe.myjetbrains.com/youtrack/dashboard?id=fc14affe-ae44-4123-8d77-b5828e4aa5eb).

### 3.7 Complexity

We calculated function points for the use cases and plotted them in a graph along with the required time. This allowed us to estimate how much time the new use cases could take.

![fp vs. time](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/diagrams/FP/functionPointAnalysisTimeSpent.PNG)

Here's the current state of the function points after the second semester.

![fp end of semster two](https://github.com/nEXam-App/nEXam-doc/blob/2feaddbbb0ac8bfb74f424a8ead4554201d3f21d/diagrams/FP/newFunctionPoints.PNG)

### 3.8 Online User Documentation and Help System Requirements

The operation of the app should be as intuitive as possible, so it does not need any further documentation. In case the user requires help, Future Us can implement a ???Help??? button in the app, which will include a FAQ.

### 3.9 Purchased Components

We do not use any purchased components so far. If there will be purchased components in the future, we will list them here.

### 3.10 Interfaces

The following user interfaces are implemented: 

Dashboard - lists all current exams. Here it is possible to create new exams.

Create/ Edit Exam - provides the fields for a new exam. Also, it should be possible to edit the information of the selected exam here. 

View Exam - shows detailed information about an exam and the estimated time. Also, it provides the opportunity to start and stop the timer for the suggested time. It is possible here to navigate to edit exam.

Delete Exam - is a User Dialog, to make sure only exams are deleted if the user really wants it.

Set Exam finished - similar to delete exams, there is a Confirm Dialog. If an exam is finished, it is clearly marked on the dashboard and in the detail view of an exam.

### 3.11 Licensing Requirements

n/a

### 3.12 Legal, Copyright, and Other Notices
The logo is licensed to the nEXam team and may only be used for the application. We take no responsibility for incorrect data or errors in the application.

### 3.13 Applicable Standards

During development, we will follow the usual clean code standards and naming conventions. We will also follow the structure of the Native Android Framework.

## 4. Supporting Information
For any further information you can contact the nEXam team or check out our mentioned blog post. The team members are Simon Reichle and Franziska Ommer.
