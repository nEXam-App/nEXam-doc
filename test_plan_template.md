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
    - [2.1 Vision](#21-vision)
    - [2.2 Use Case Diagram](#22-use-case-diagram)
	- [2.3 Technology Stack](#23-technology-stack)
- [3. Architectural Goals and Constrains](#3-architectural-goals-and-constraints)
    - [3.1 Functionality](#31-functionality)
    - [3.2 Usability](#32-usability)
    - [3.3 Reliability](#33-reliability)
    - [3.4 Performance](#34_performance)
    - [3.5 Supportability](#35-supportability)
    - [3.6 Design Constraints](#36-design-constraints)
    - [3.7 Online User Documentation and Help System Requirements](#37-online-user-documentation-and-help-system-requirements)
    - [3.8 Purchased Components](#purchased-components)
    - [3.9 Interfaces](#39-interfaces)
    - [3.10 Legal, Copyright And Other Notices](#310-legal-copyright-and-other-notices)
    - [3.11 Applicable Standards](#311-applicable-standards)
- [4. Use-Case View](#4-use-case-view)
    - [4.1 Use-Case Realizations](#41-use-case-realizations)
- [5. Logical view](#5-logical-view)
    - [5.1 Overview](#51-overview)
    -  [5.2 Architecturally Significant Design Packages](#52-architecturally-significant-design-packages)
- [6. Process View](#6-process-view)
- [7. Deployment View](#7-deployment-view)
- [8. Implementation View](#8-implementation-view)
    - [8.1 Overview](#81-overview)
    - [8.2 Layers](#82-layers)
- [9. Data View (optional)](#9-data-view-(optional))
- [10. Size and Performance](#10-size-and-performance)
- [11. Quality](#11-quality)

## 1. Introduction

<!--[The introduction of the **Software Architecture Document**     should provide an overview of the entire **Software Architecture Document**.     It should include the purpose, scope, definitions, acronyms, abbreviations,     references, and overview of the **Software Architecture Document**.]-->

### 1.1 Purpose

<!--This document provides a comprehensive architectural overview     of the system, using a number of different architectural views to depict different     aspects of the system. It is intended to capture and convey the significant     architectural decisions which have been made on the system.-->

<!--[This section defines the purpose of the **Software     Architecture Document**, in the overall project documentation, and     briefly describes the structure of the document. The specific audiences for     the document should be identified, with an indication of how they are expected     to use the document.]-->

In this Software Architecture Document (SAD), we want you to get a closer look at our project. In here you can find a detailed description of our project "nEXam" and how the two main components, frontend and backend, are interacting with each other. It is intended to capture and convey the significant architectural decisions which have been made on the system.

### 1.2 Scope

<!--[A brief description of what the Software Architecture Document     applies to; what is affected or influenced by this document.]-->

In here you can find different views and architecture components of nEXam, including classes, controller and data.

### 1.3 Definitions, Acronyms and Abbreviations

<!--[This subsection should provide the definitions of all terms,     acronyms, and abbreviations required to properly interpret the **Software     Architecture Document**. This information may be provided by     reference to the project Glossary.]-->

| Abbreviation | Explanation                         |
| ------------ | ----------------------------------- |
| SRS          | Software Requirements Specification |
| UC           | Use Case                            |
| n/a          | not applicable                      |
| tbd          | to be determined                    |
| UCD          | overall Use Case Diagram            |
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

The next chapter provides the architectural goals and constraints, followed by the use cases and their realizations. Chapters five to nine deals with the views. Finally, there is information about the size and performance, as well as the quality. The next chapter provides the architectural goals and constraints, followed by the use cases and their realizations. Chapters five to nine deals with the views. Finally, there is information about the size and performance, as well as the quality.

## 2. Architectural Representation 

<!--[This section describes what software architecture is for     the current system, and how it is represented. Of the **Use-Case**,     **Logical**, **Process**, **Deployment**,     and **Implementation Views**, it enumerates the views that are     necessary, and for each view, explains what types of model elements it contains.]-->

Since we plan to create an Android and iOS app, we use the framework automatically provided by Android Studio. Below you can find the general MVP diagram.

![MVP Android](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/mvp%20android.PNG)

## 3. Architectural Goals and Constraints

<!--[This section describes the software requirements and objectives     that have some significant impact on the architecture, for example, safety,     security, privacy, use of an off-the-shelf product, portability, distribution,     and reuse. It also captures the special constraints that may apply: design     and implementation strategy, development tools, team structure, schedule,     legacy code, and so on.]-->

As already mentioned should the app be available on iOS and Android.

In the beginning, we all agreed to use VS Code as our IDE because it gives us more flexibility to use other programming languages (if needed) in the same application. Yes, we have to customize VS Code a bit, but we think that's fine. Some of us have also had good experiences with the 'Live Share' extension, which allows us to work on code together and simultaneously. This is useful when more than one person is working on a topic or someone needs help.


However, when we started developing views for the frontend, we found that Android Studio suited our needs better. So we switched to Android Studio. There we were able to create the views relatively easily. Moreover, the program pays attention to accessibility and offers the possibility to consider a dark and light theme from the beginning. The Native Android framework provided us with the structure. The only disadvantage was that we had to change our Maven project to a Gradle project, which was relatively easy to do. For testing purposes or for the demo, the opening of the app within a virtual cell phone was of great help.

As we mentioned in our first blog, we wanted to use Kotlin and SQLite. 

The main argument why we will use Kotlin (even if nobody has experience with it) is usability. With Kotlin, we are able to create the front-end and back-end. Also, Kotlin gives us the possibility to develop the app for Android and iOS without a lot of extra work.

We wanted to use SQLite to store some data. Our goal is not to need a big database and store all the data we need on the client. There will be no need to “work” with the client's data, and everything should be able to run only on the user's device. After further consideration, we found that instead of an additional database, we can also access the data through an XML file. We filled this with test data, which can also already be displayed in the app.

## 4. Use-Case View
<!--[This section lists use cases or scenarios from the use-case     model if they represent some significant, central functionality of the final     system, or if they have a large architectural coverage - they exercise many     architectural elements, or if they stress or illustrate a specific, delicate     point of the architecture.]-->

![OUCD](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/nEXam-use%20case%20diagram.jpg)

Green: Planned till end of December

### 4.1 Use-Case Realizations

<!--[This section illustrates how the software actually works     by giving a few selected use-case (or scenario) realizations, and explains     how the various design model elements contribute to their functionality.]-->

* [Use Case - Create Exam](https://github.com/nEXam-App/nEXam-doc/blob/main/Use_Case_Specification/use_case_CreateExam.md)
* [Use Case - Edit Exam](https://github.com/nEXam-App/nEXam-doc/blob/main/Use_Case_Specification/use_case_EditExam.md)
* [Use Case - Change Theme](https://github.com/nEXam-App/nEXam-doc/blob/main/Use_Case_Specification/use_case_ChangeTheme.md)

## 5. Logical View

<!--[This section describes the architecturally significant parts     of the design model, such as its decomposition into subsystems and packages.     And for each significant package, its decomposition into classes and class     utilities. You should introduce architecturally significant classes and describe     their responsibilities, as well as a few very important relationships, operations,     and attributes.]-->

### 5.1 Overview

<!--[This subsection describes the overall decomposition of the     design model in terms of its package hierarchy and layers.]-->

Here again is the picture with the overview of our MVP model. So it is easier to see the architecture in the following structure of our project.

![MVP Android](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/mvp%20android.PNG)

### 5.2 Architecturally Significant Design Packages

![MVP from Android Studio](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/mvc%20from%20android%20studio.png)

<!--[For each significant package, include a subsection with its     name, its brief description, and a diagram with all significant classes and     packages contained within the package.--> 

<!--For each significant class in the package, include its name,     brief description, and, optionally a description of some of its major responsibilities,     operations and attributes.]-->

## 6. Process View

n/a

<!--[This section describes the system's decomposition into lightweight     processes (single threads of control) and heavyweight processes (groupings     of lightweight processes). Organize the section by groups of processes that     communicate or interact. Describe the main modes of communication between     processes, such as message passing, interrupts, and rendezvous.]-->

## 7. Deployment View 

n/a

<!--ADD UML-DIAGRAM WITH SERVER/CLIENT ARCHITECTURE-->

<!--[This section describes one or more physical network (hardware)     configurations on which the software is deployed and run. It is a view of     the Deployment Model. At a minimum for each configuration it should indicate     the physical nodes (computers, CPUs) that execute the software, and their     interconnections (bus, LAN, point-to-point, and so on.) Also include a mapping     of the processes of the **Process View** onto the physical nodes.]-->

## 8. Implementation View 

n/a

<!--[This section describes the overall structure of the implementation     model, the decomposition of the software into layers and subsystems in the     implementation model, and any architecturally significant components.]-->

### 8.1 Overview

<!--[This subsection names and defines the various layers and     their contents, the rules that govern the inclusion to a given layer, and     the boundaries between layers. Include a component diagram that shows the     relations between layers. ]-->

n/a

### 8.2 Layers

<!--[For each layer, include a subsection with its name, an enumeration     of the subsystems located in the layer, and a component diagram.]-->

n/a

## 9. Data View (optional)

<!--[A description of the persistent data storage perspective     of the system. This section is optional if there is little or no persistent     data, or the translation between the Design Model and the Data Model is trivial.]-->

Below you can see our db schema diagram and our class diagram:

![db schema](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/DB-Schema.jpg)

![class diagram](https://github.com/nEXam-App/nEXam-doc/blob/main/diagrams/nEXam-UML%20class%20diagram.jpg)

## 10. Size and Performance 

n/a

<!--[A description of the major dimensioning characteristics of     the software that impact the architecture, as well as the target performance     constraints.]-->

## 11. Quality 

n/a

<!--[A description of how the software architecture contributes     to all capabilities (other than functionality) of the system: extensibility,     reliability, portability, and so on. If these characteristics have special     significance, for example safety, security or privacy implications, they should     be clearly delineated.]-->
