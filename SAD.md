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
| [UC1 Change Theme](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ChangeTheme.md)                                                                             | Oct. 2021 | nEXam-App |
| [UC2 View Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ViewExam.md)                                                                                   | Oct. 2021 | nEXam-App |
| [UC3 Show Timer](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ShowTimer.md)                                                                                 | Oct. 2021 | nEXam-App |
| [UC4 Show Dashboard](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ShowDashboard.md)                                                                         | Oct. 2021 | nEXam-App |
| [UC5 Update Progress Bar](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_UpdatedProgressBar.md)                                                               | Apr. 2022 | nEXam-App |
| [UC6 Send Notifications](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_SendNotifactions.md)                                                                   | Apr. 2022 | nEXam-App |
| [UC7 Create Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_CreateExam.md)                                                                               | Apr. 2022 | nEXam-App |
| [UC8 Edit Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_EditExam.md)                                                                                   | Apr. 2022 | nEXam-App |
| [UC9 Delete Exam](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_DeleteExam.md)                                                                               | Apr. 2022 | nEXam-App |
| [UC10 Create Topic](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_CreateTopic.md)                                                                             | Apr. 2022 | nEXam-App |
| [UC11 Edit Topic](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_EditTopic.md)                                                                                 | Apr. 2022 | nEXam-App |
| [UC12 Delete Topic](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_DeleteTopic.md)                                                                             | Apr. 2022 | nEXam-App |
| [UC13 Show Topic](https://github.com/nEXam-App/nEXam-doc/blob/7869f8d2f7074c54fab07d40a0b7f2b6814a376a/Use_Case_Specification/use_case_ShowTopic.md)                                                                                 | Apr. 2022 | nEXam-App |
| [Test Plan](https://github.com/nEXam-App/nEXam-doc/blob/0d0ce2e8de074a444fa6914afc6e07c656a7acb1/test_plan_template.md)                                   | Apr. 2022 | nEXam-App |
| [SRS](https://github.com/nEXam-App/nEXam-doc/blob/0d0ce2e8de074a444fa6914afc6e07c656a7acb1/SRS.md)                                                  | Oct. 2021 | nEXam-App |

### 1.5 Overview

This document contains the architectural representation, goals and constraints as well as the logical, deployment, implementation and data views.

## 2. Architectural Representation 

This project uses the MVP Pattern for the front end (Android App) and for the backend. So the model (data model, domain specific classes), the view (user interface) and the presenter are separated. The MVP Pattern can be seen in the next picture:

![MVP Android](https://github.com/nEXam-App/nEXam-doc/blob/0106cd6df1207d1bccfdc5f2be6b3ec8280ba805/diagrams/mvp%20android.PNG)

The front end internally follows the MVVM pattern which can be depicted as following. This pattern separates the View components again into a funcional part (the ViewModel) and a purely representational part (View) while the model remains analogous to the back end. 

![MVVM Pattern](https://github.com/nEXam-App/nEXam-doc/blob/ea192e0d8105d75a232d11394428079cb8846336/diagrams/MVVMPattern.png)

## 3. Architectural Goals and Constraints

### MVP

As mentioned in chapter two frontend and backend are using the MVP pattern. This enables a clean software architecture with separate model view and presenter.

### Frontend

The Android App Client is written in Kotlin. In the Frontend no MVP Tool is needed, because the MVP Pattern is integrated into Android development. However, since the App only serves as as frontend the MVP it serves as the V component to the overall application formed by frontend and backend together. For a clean view structure the frontend in itself uses the MVVM (Model View ViewModel) pattern.
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

Here again is the picture with the overview of our MVP model. So it is easier to see the architecture in the following structure of our project.

![MVP Android](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/mvp%20android.PNG)

![MVP from Android Studio](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/mvc%20from%20android%20studio.png)

At this point we want to show you also the architecture of our database:

![Room architecture](https://github.com/nEXam-App/nEXam-doc/blob/4a39680b206200656747039013e22cb649ef97d3/diagrams/RoomLibraryArchitecture.PNG)

### 5.2 Architecturally Significant Design Packages

On this section you can find our class diagrams for the frontend and the backend. We have clearly marked which parts fulfill the model, the view and the controller tasks.

![overlay with uml diagram](https://github.com/nEXam-App/nEXam-doc/blob/fd45157525425d73e1280033d289bfbd07444999/diagrams/overlay%20as%20png.PNG)

As the quality of the the export with the overlay is not the best, here's also the original generated class diagram.

![class diagram](https://github.com/nEXam-App/nEXam-doc/blob/fd45157525425d73e1280033d289bfbd07444999/generated%20uml.png)

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

n/a

<!--[A description of how the software architecture contributes     to all capabilities (other than functionality) of the system: extensibility,     reliability, portability, and so on. If these characteristics have special     significance, for example safety, security or privacy implications, they should     be clearly delineated.]-->
