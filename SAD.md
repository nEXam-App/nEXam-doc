# nEXam - Software Architecture Document 

## Table of contents
- [Table of contents](#table-of-contents)
- [1. Introduction](#1-introduction)
    - [1.1 Purpose](#11-purpose)
    - [1.2 Scope](#12-scope)
    - [1.3 Definitions, Acronyms and Abbreviations](#13-definitions-acronyms-and-abbreviations)
    - [1.4 References](#14-references)
    - [1.5 Overview](#15-overview)
- [2. Architectural Representation](#2-architectural-representation)
- [3. Architectural Goals and Constrains](#3-architectural-goals-and-constraints)
- [4. Use-Case View](#4-use-case-view)
    - [4.1 Use-Case Realizations](#41-use-case-realizations)
- [5. Logical view](#5-logical-view)
    - [5.1 Overview](#51-overview)
    - [5.2 Architecturally Significant Design Packages](#52-architecturally-significant-design-packages)
- [6. Process View](#6-process-view)
- [7. Deployment View](#7-deployment-view)
- [8. Implementation View](#8-implementation-view)
    - [8.1 Overview](#81-overview)
    - [8.2 Layers](#82-layers)
- [9. Data View (optional)](#9-data-view-optional)
- [10. Size and Performance](#10-size-and-performance)
- [11. Quality](#11-quality)

## 1. Introduction

### 1.1 Purpose

This document provides an overview of our software architecture. With several different architectural views it depicts different aspects of the system. It is intended to capture and convey the significant architectural decisions which have been made for the system.

### 1.2 Scope

This document describes the architecture of the nEXam project.

### 1.3 Definitions, Acronyms and Abbreviations

| Abbreviation | Explanation                         |
| ------------ | ----------------------------------- |
| API          | Application programming interface   |
| MVC          | Model view controller               |
| REST         | Representational state transfer     |
| SDK          | Software development kit            |
| SRS          | Software Requirements Specification |
| UC           | Use Case                            |
| VCS          | Version control system              |
| n/a          | not applicable                      |
| tbd          | to be determined                    |
| OUCD         | overall Use Case Diagram            |
| FAQ          | Frequently asked Questions          |

### 1.4 References

| Title                                                   | Date      | Publishing organization |
| ------------------------------------------------------------------------|:----------:|------------------------- |
| [Blog](https://nexam955203221.wordpress.com/)           | Oct. 2021 | nEXam-App |
| [GitHub Repository](https://github.com/nEXam-App/nEXam) | Oct. 2021 | nEXam-App |
| [UC1 Change Theme](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ChangeTheme.md)                                                                               | Apr. 2022 | nEXam-App |
| [UC2 View Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ViewExam.md)                                                                                   | Oct. 2021 | nEXam-App |
| [UC3 Show Dashboard](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ShowDashboard.md)                                                                         | Oct. 2021 | nEXam-App |
| [UC4 Create Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_CreateExam.md)                                                                               | Apr. 2022 | nEXam-App |
| [UC5 Edit Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_EditExam.md)                                                                                   | Apr. 2022 | nEXam-App |
| [UC6 Delete Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_DeleteExam.md)                                                                               | Apr. 2022 | nEXam-App |
| [UC7 Start Stop Timer](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_StartStopTimer.md) 
| [UC8 Set Exam finished](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_setExamFinished.md)                                                                               | Apr. 2022 | nEXam-App |                                                                              | Apr. 2022 | nEXam-App |
| [Test Plan](https://github.com/nEXam-App/nEXam-doc/blob/0d0ce2e8de074a444fa6914afc6e07c656a7acb1/test_plan_template.md)                                   | Apr. 2022 | nEXam-App |
| [SRS](https://github.com/nEXam-App/nEXam-doc/blob/0d0ce2e8de074a444fa6914afc6e07c656a7acb1/SRS.md)                                                  | Oct. 2021 | nEXam-App |

### 1.5 Overview

This document contains the architectural representation, goals and constraints as well as the logical, deployment, implementation and data views.

## 2. Architectural Representation 

This project follows the MVVM pattern which can be depicted as following. This pattern separates the View components into a funcional part (the ViewModel) and a purely representational part (View) while the model remains analogous to the back end. 

![MVVM Pattern](https://github.com/nEXam-App/nEXam-doc/blob/ea192e0d8105d75a232d11394428079cb8846336/diagrams/MVVMPattern.png)

## 3. Architectural Goals and Constraints

### MVVM

As mentioned in chapter two frontend and backend are using the MVVM pattern. This enables a clean software architecture with separate model view and ViewModel.

### Frontend

The Android App Client is written in Kotlin. For a clean view structure the frontend itself uses the MVVM (Model View ViewModel) pattern.
MVVM:
- Model: domain specific classes modeled after backend classes
- View: activities
- ViewModel: specific functionalities and network operations

### Backend
The backend is also written in Kotlin. As a database we use the Room persistence library, which provides an abstraction layer over SQLite to allow fluent database access while harnessing the full power of SQLite.

## 4. Use-Case View

![OUCD](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/nEXam-use%20case%20diagram.jpg)

### 4.1 Use-Case Realizations

n/a

## 5. Logical View

### 5.1 Overview

Here again is the picture with the overview of our MVVM model. So it is easier to see the architecture in the following structure of our project.

![MVVM Pattern](https://github.com/nEXam-App/nEXam-doc/blob/ea192e0d8105d75a232d11394428079cb8846336/diagrams/MVVMPattern.png)

![MVVM from Android Studio](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/mvc%20from%20android%20studio.png)

At this point we want to show you also the architecture of our database:

![Room architecture](https://github.com/nEXam-App/nEXam-doc/blob/4a39680b206200656747039013e22cb649ef97d3/diagrams/RoomLibraryArchitecture.PNG)

### 5.2 Architecturally Significant Design Packages

On this section you can find our class diagrams for the frontend and the backend. We have clearly marked which parts fulfill the model, the view and the viewmodel tasks.

![overlay with uml diagram](https://github.com/nEXam-App/nEXam-doc/blob/97a03b5bd5ca7b32cee5362947e51f57d0ccf2bd/diagrams/umlDiagrams/uml%20important%20files_designPattern.png)

## 6. Process View

n/a

## 7. Deployment View 

Here you can see our deployement view diagram: 

![deployment diagram](https://github.com/nEXam-App/nEXam-doc/blob/2a007547b934fd3fec273b92bae162f9db293d7d/diagrams/deployment-android.jpg)

## 8. Implementation View 

n/a

### 8.1 Overview

n/a

### 8.2 Layers

n/a

## 9. Data View (optional)

Below you can see our db schema diagram and our class diagram:

<!--TODO update-->

![db schema](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/DB-Schema.jpg)

![class diagram](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/nEXam-UML%20class%20diagram.jpg)

## 10. Size and Performance 

n/a

## 11. Quality 

We're using some design patterns since the beginning. Therefore, you can find a listing of them in our [blog post](https://nexam955203221.wordpress.com/2022/05/19/se2-week-7-design-patterns/).
In the following overlay are the patterns marked with green:

![overlay with uml diagram](https://github.com/nEXam-App/nEXam-doc/blob/97a03b5bd5ca7b32cee5362947e51f57d0ccf2bd/diagrams/umlDiagrams/uml%20important%20files_designPattern.png)
