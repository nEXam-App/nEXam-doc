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
    - [3.7 Online User Documentation and Help System Requirements](#37-online-user-documentation-and-help-system-requirements)
    - [3.8 Purchased Components](#38-purchased-components)
    - [3.9 Interfaces](#39-interfaces)
    - [3.10 Licensing Requirements](#310-licensing-requirements)
    - [3.11 Legal, Copyright And Other Notices](#311-legal-copyright-and-other-notices)
    - [3.12 Applicable Standards](#312-applicable-standards)
- [4. Supporting Information](#4-supporting-information)

## 1. Introduction

<!--[The introduction of the **Software Architecture Document**     should provide an overview of the entire **Software Architecture Document**.     It should include the purpose, scope, definitions, acronyms, abbreviations,     references, and overview of the **Software Architecture Document**.]-->

### 1.1 Purpose

<!--This document provides a comprehensive architectural overview     of the system, using a number of different architectural views to depict different     aspects of the system. It is intended to capture and convey the significant     architectural decisions which have been made on the system.-->

<!--[This section defines the purpose of the **Software     Architecture Document**, in the overall project documentation, and     briefly describes the structure of the document. The specific audiences for     the document should be identified, with an indication of how they are expected     to use the document.]-->

This Software Requirements Specification (SRS) describes all specifications for the application "nEXam". It includes an overview about this project and its vision, detailed information about the planned features and boundary conditions of the development process.

### 1.2 Scope

<!--[A brief description of what the Software Architecture Document     applies to; what is affected or influenced by this document.]-->

The project is to be implemented as an Android app with the possibility of offering it for iOS at a later date. The planned scope for the first and second semesters is shown in the [OUCD](#3-specific-requirements). More information about the use cases can be found in the 
[use-case specification](https://github.com/nEXam-App/nEXam-doc/tree/main/Use_Case_Specification) folder.

Actors of this app are students.

### 1.3 Definitions, Acronyms and Abbreviations

<!--[This subsection should provide the definitions of all terms,     acronyms, and abbreviations required to properly interpret the **Software     Architecture Document**. This information may be provided by     reference to the project Glossary.]-->

| Abbreviation | Explanation                         |
| ------------ | ----------------------------------- |
| SRS          | Software Requirements Specification |
| UC           | Use Case                            |
| n/a          | not applicable                      |
| tbd          | to be determined                    |
| OUCD          | overall Use Case Diagram            |
| FAQ          | Frequently asked Questions          |

### 1.4 References

<!--[This subsection should provide a complete list of all documents     referenced elsewhere in the **Software Architecture Document**.     Each document should be identified by title, report number (if applicable),     date, and publishing organization. Specify the sources from which the references     can be obtained. This information may be provided by reference to an appendix     or to another document.]-->

| Title                                               |    Date    | Publishing organization |
| --------------------------------------------------- | :--------: | ----------------------- |
| [nEXam blog](https://nexam955203221.wordpress.com/) | 05.10.2021 | nEXam-App               |
| [GitHub](https://github.com/nEXam-App/nEXam)        | 05.10.2021 | nEXam-App               |
| [Documents](https://github.com/nEXam-App/nEXam-doc) | 06.04.2022 | nEXam-App               |

### 1.5 Overview

<!--[This subsection should describe what the rest of the **Software     Architecture Document** contains and explain how the **Software     Architecture Document** is organized.]-->

The following chapters provide an overview of this project with vision and Overall Use Case Diagram. The third chapter (Requirements Specification) delivers more details about the specific requirements in terms of functionality, usability and design parameters. Finally, there is a chapter with supporting information. 
    
## 2. Overall Description 
<!--[This section describes what software architecture is for     the current system, and how it is represented. Of the **Use-Case**,     **Logical**, **Process**, **Deployment**,     and **Implementation Views**, it enumerates the views that are     necessary, and for each view, explains what types of model elements it contains.]-->

“nEXam” will be an app that allows you to plan when you should start studying before an exam and how much time you should spend on it. 

How does it work? 
You need to enter your exam information, including date, subject, and  topic. Based on this information, the app will create an agenda of when you  should study which topic. While learning, you can run the in-app timer,  so the app changes the background color of the topic to visualize  what has already been learned. You should be able to export the iCal file to import it to the calendar of your choice.

## 3. Specific Requirements

![OUCD](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/nEXam-use%20case%20diagram.jpg)

- Green: First semester
- Yellow: Second semester

### 3.1 Functionality

This section explains the different use cases you can see in the use case diagram and their functionality. For more information, see our [Use Case Specification](https://github.com/nEXam-App/nEXam-doc/tree/main/docs/Use_Case_Specification).

#### 3.1.1 Dashboard

This use case covers the default view. The upper part contains the exams, the lower part contains the timer, which can be used to stop the time for the individual exams in the future.

#### 3.1.2 Agenda View

Here you can make various adjustments for the dashboard. Among other things, you can select how the exams are displayed, and you can access the individual subchapters for the exams. There are also two designs for the light and dark modes.

### 3.2 Usability
We plan to make the user interface as intuitive and self-explanatory as possible so that the user feels as comfortable as possible when using the app. While there will be a FAQ document available, it should not be necessary to use it.

In addition, we also want to pay attention to accessibility, as Android Studio will automatically give you hints and tips about it. Thus, it should correspond to the current time and also meet future demands.

#### 3.2.1 No training time needed
Our goal is that a user installs the application, opens it and is able to use all features without any explanation or help.

#### 3.2.2 Familiar Feeling
We want to implement an app with familiar designs and functions. This way the user is able to interact in familiar ways with the app without having to get to know new interfaces.

#### 3.2.3 Language

The language of the nEXam app will be English, so people around the world are able to understand and use our application.

### 3.3 Reliability

The app should be available throughout, as it runs locally on your own phone. During development, there may be a loss of functionality, but this should ideally be intercepted by tests beforehand.

### 3.4 Performance

#### 3.4.1 Storage
Smartphones do not offer much storage space. Therefore, we strive to keep the required storage space as small as possible despite the local storage in an XML file. 

#### 3.4.2 App perfomance
To provide the best app performance, we try to keep the response time as low as possible. This significantly improves the user experience and also makes the app more likely to be used for exam preparation.

### 3.5 Supportability

#### 3.5.1 Coding Standards
We will write the code using all the common standards for clean code. For example, we will name our variables and methods after their functions. This will keep the code easy to read for everyone and make further development much easier. Also, we will follow the structure of the framework to make it easier for ourselves to get back into the structure of the app or to allow others to get into the project more easily.

#### 3.5.2 Testing Strategy
The application should ideally have a high test coverage and all important functionalities and edge cases should be tested. Further errors in the implementation will be detected immediately, and it will be easier to localize the error. With the current state we have written two feature files, we will look into testing in more detail next semester.

### 3.6 Design Constraints
We strive for a modern and easy-to-use design for the user interface as well as for the architecture of our application. To achieve this, the functionalities are kept as modular as possible.

Since we want to program an iOS and Android app, we chose Kotlin as our programming language. We also use the common MVP architecture of Android to keep the frontend and the backend separate and to keep the possibility open to switch to other architectures without making adjustments in several places.

We discarded our planned database, SQLite, because of the small amount of data. Instead, the data is stored within an XML file.

For our version control and project management we will use [GitHub](https://github.com/nEXam-App/nEXam) and [YouTrack](https://dhbw-karlsruhe.myjetbrains.com/youtrack/dashboard?id=fc14affe-ae44-4123-8d77-b5828e4aa5eb).

### 3.7 Online User Documentation and Help System Requirements
The operation of the app should be as intuitive as possible, so it does not need any further documentation. In case the user requires help, we expect to implement a “Help” button in the app, which will include a FAQ.

### 3.8 Purchased Components
We do not use any purchased components so far. If there will be purchased components in the future, we will list them here.

### 3.9 Interfaces

The following user interfaces are implemented: 

Dashboard - lists all current exams and contains the timer for the selected exam. Here it is possible to create new exams and start the timer.

Create exam - provides the fields for a new exam and for the first subject. Also, it should be possible to edit the information of the selected exam here. 

Error message - a page displaying the error that occurred and the possibility to edit the field with the invalid data or return to the dashboard 

Success message - hopefully this message will appear after creating an exam. It contains the name of the current exam and the possibility to return to the dashboard or view the newly created exam.

### 3.10 Licensing Requirements

n/a

### 3.11 Legal, Copyright, and Other Notices
The logo is licensed to the nEXam team and may only be used for the application. We take no responsibility for incorrect data or errors in the application.

### 3.12 Applicable Standards


During development, we will follow the usual clean code standards and naming conventions. We will also follow the structure of the Native Android Framework.

## 4. Supporting Information
tbd
