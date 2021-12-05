# nEXam - Software Requirements Specification 

## Table of contents
- [Table of contents](#table-of-contents)
- [Introduction](#1-introduction)
    - [Purpose](#11-purpose)
    - [Scope](#12-scope)
    - [Definitions, Acronyms and Abbreviations](#13-definitions-acronyms-and-abbreviations)
    - [References](#14-references)
    - [Overview](#15-overview)
- [Architectural representation](#2-architectural-representation)
    - [Vision](#21-vision)
    - [Use Case Diagram](#22-use-case-diagram)
	- [Technology Stack](#23-technology-stack)
	- [Model view controller](#24-model_view_controller)
- [Architectural Goals and Constrains](#3-architectural-goals-and-constraints)
    - [Functionality](#31-functionality)
    - [Usability](#32-usability)
    - [MVC tool](#33-mvc-tool)
    
      <!--[Reliability](#33-reliability)-->
    
      <!--[Performance](#34-performance)-->
    
      <!--[Supportability](#35-supportability)-->
    
      <!--[Design Constraints](#36-design-constraints)-->
    
      <!--[Online User Documentation and Help System Requirements](#37-on-line-user-documentation-and-help-system-requirements)-->
    
      <!--[Purchased Components](#purchased-components)-->
    
      <!--[Interfaces](#39-interfaces)-->
    
      <!--[Licensing Requirements](#310-licensing-requirements)-->
    
      <!--[Legal, Copyright And Other Notices](#311-legal-copyright-and-other-notices)-->
    
      <!--[Applicable Standards](#312-applicable-standards)-->
- [Use-Case View](#4-use-case-view)
    - [Use Case Diagram](#41-use-case-diagram)
    - [Use-Case Realizations](#42-use-case-realizations)
- [Logical view](#5-logical-view)
    - [Overview](#51-overview)
    -  [Architecturally Significant Design Packages](#52-architecturally-significant-design-packages)
- [Process View](#6-process-view)
- [Deployment View](#7-deployment-view)
- [Implementation View](#8-implementation-view)
    - [Overview](#81-overview)
    - [Layers](#82-layers)
- [Data View (optional)](#9-data-view-(optional))
- [Size and Performance](#10-size-and-performance)
- [Quality](#11-quality)

## 1. Introduction

<!--[The introduction of the **Software Architecture Document**     should provide an overview of the entire **Software Architecture Document**.     It should include the purpose, scope, definitions, acronyms, abbreviations,     references, and overview of the **Software Architecture Document**.]-->

### 1.1 Purpose

<!--This document provides a comprehensive architectural overview     of the system, using a number of different architectural views to depict different     aspects of the system. It is intended to capture and convey the significant     architectural decisions which have been made on the system.-->

<!--[This section defines the purpose of the **Software     Architecture Document**, in the overall project documentation, and     briefly describes the structure of the document. The specific audiences for     the document should be identified, with an indication of how they are expected     to use the document.]-->

This Software Requirements Specification (SRS) describes all specifications for the application "nEXam". It includes an overview about this project and its vision, detailed information about the planned features and boundary conditions of the development process.

### 1.2 Scope

<!--[A brief description of what the Software Architecture Document     applies to; what is affected or influenced by this document.]-->

The project is going to be realized as an Android and iOs App. The planned scope till end of december is shown in the [use-case specification](https://github.com/Calco2001/nEXam/blob/main/docs/Use-Case%20Specification.md#1-use-case).

Actors of this app are students.

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
| [nEXam blog](https://nexam955203221.wordpress.com/) | 18.10.2018 | nEXam-Team              |
| [GitHub](https://github.com/Calco2001/nEXam)        | 18.10.2018 | nEXam-Team              |

### 1.5 Overview

<!--[This subsection should describe what the rest of the **Software     Architecture Document** contains and explain how the **Software     Architecture Document** is organized.]-->

The following chapter provides an overview of this project with vision and Overall Use Case Diagram. The third chapter (Requirements Specification) delivers more details about the specific requirements in terms of functionality, usability and design parameters. Finally there is a chapter with supporting information. 
    
## 2. Architectural Representation 
<!--before: Overall Description-->

<!--[This section describes what software architecture is for     the current system, and how it is represented. Of the **Use-Case**,     **Logical**, **Process**, **Deployment**,     and **Implementation Views**, it enumerates the views that are     necessary, and for each view, explains what types of model elements it contains.]-->

### 2.1 Vision

“nEXam” will be an app which helps you plan out when you should start learning before an exam and how much time you should spend learning. 

How does it work?
You need to enter your exam information, including date, subject and  topic. Based on this information the app will create an agenda when you  should study which topic. While studying you can run the in app timer,  so the app will change the background color of the topic to visualise  what has already been learned. Also you should be able to export the  iCal file to import it in your calendar of choice.

### 2.3 Technology Stack
The app should be available on iOS and Android.

We all agreed to use VS Code as our IDE because it gives us more  flexibility to use other programming languages (if needed) in the same  application. Yes we have to adjust and customize the VS Code a bit, but  we think that’s fine. Some of us have also had great experiences with  the ‘Live Share’ extension, which allows us to work on code together and simultaneously. This is usefull when more than one person is working on a topic or someone needs help. 

As we mentioned in our first blog we will use Kotlin and SQLite. 

The main argument why we will use Kotlin (even if nobody has any  experience with it) is usability. With Kotlin we are able to create the  front- and backend, also Kotlin provides us with the possibility to  develop the app for Android and iOS without a huge additional workload.

We will use SQLite to store some data. Our goal would be to not need a large database and store all the data we need on the client. There will be no need to ‘work’ with the client’s data and everything should be  able to run only on the user’s device. 

### 2.4 Model view controller

## 3. Architectural Goals and Constraints
<!--before: Specific Requirements-->

<!--[This section describes the software requirements and objectives     that have some significant impact on the architecture, for example, safety,     security, privacy, use of an off-the-shelf product, portability, distribution,     and reuse. It also captures the special constraints that may apply: design     and implementation strategy, development tools, team structure, schedule,     legacy code, and so on.]-->

### 3.1 Functionality
This section will explain the different use cases, you could see in the Use Case Diagram, and their functionality.  
More information is available at our [Use-Case-Specification](https://github.com/Calco2001/nEXam/blob/main/docs/Use-Case%20Specification.md).

### 3.2 Usability
We plan on designing the user interface as intuitive and self-explanatory as possible to make the user feel as comfortable as possible using the app. Though an FAQ document will be available, it should not be necessary to use it.

### 3.3 MVC tool

#### <!--3.2.1 No training time needed-->
<!--Our goal is that a user installs the android application, opens it and is able to use all features without any explanation or help.-->

#### <!--3.2.2 Familiar Feeling-->
<!--We want to implement an app with familiar designs and functions. This way the user is able to interact in familiar ways with the app without having to get to know new interfaces.-->

### <!--3.3 Reliability-->

#### <!--3.3.1 Availability-->

#### <!--3.3.2 Defect Rate-->

### <!--3.4 Perfomance-->

#### <!--3.4.1 Capacity-->

#### <!--3.4.2 Storage--> 
<!--Smartphones don't provide much storage. Therefore we are aiming to keep the needed storage as small as possible.-->

#### <!--3.4.3 App perfomance / Response time-->
<!--To provide the best App perfomance we aim to keep the response time as low as possible. This will make the user experience much better.-->

### <!--3.5 Supportability-->

#### <!--3.5.1 Coding Standards-->
<!--We are going to write the code by using all of the most common clean code standards. For example we will name our variables and methods by their functionalities. This will keep the code easy to read by everyone and make further developement much easier.-->

#### <!--3.5.2 Testing Strategy-->
<!--The application will have a high test coverage and all important functionalities and edge cases should be tested. Further mistakes in the implementation will be discovered instantly and it will be easy to locate the error.--> 

### <!--3.6 Design Constraints-->
<!--We are trying to provide a modern and easy to handle design for the UI aswell as for the architecture of our application. To achieve that the functionalities will be kept as modular as possible.-->

<!--Because we are progamming an Android App we chose Java as our programming language. Also we are using the common MVC-architecture to keep the front end and back end seperated. For a clean front end structure we use MVVM.-->
<!--To make the communication between the two parts easy, we will implement a RESTful-API between them which will provide the data in JSON-Format.--> 
<!--The supported Platforms will be:-->

<!--Android 4.4 and higher-->

<!--Java 8 and higher-->

### <!--3.7 On-line User Documentation and Help System Requirements-->
<!--The usage of the app should be as intuitive as possible so it won't need any further documentation. If the user needs some help we will implement a "Help"-Button in the App which includes a FAQ and a formular to contact the developement team.-->

### <!--3.8 Purchased Components-->
<!--We don't have any purchased components yet. If there will be purchased components in the future we will list them here.-->

### <!--3.9 Interfaces-->

#### <!--3.9.1 User Interfaces-->
<!--The User interfaces that will be implented are:-->

<!--Dashboard - lists all session and makes it possible to filter sessions-->

<!--Session Page - shows detailed information about the session and makes it possible to connect session attendants for example via messaging system-->

<!--Login - this page is used to log in--> 

<!--Register - provides a registration form-->

<!--Overwiew of personal sessions - shows all the sessions a user participates in-->

<!--Friend List - friends can be added-->

<!--Profile - makes it possible to post information about yourself, might provide messaging feature, also shows additional information about users (for example: Language, country, favorite games, etc.)-->

<!--Settings - shows the settings-->

#### <!--3.9.2 Hardware Interfaces-->
<!--(n/a)-->

#### <!--3.9.3 Software Interfaces-->
<!--The app will be runnable on Android 4.4 and higher. iOS won't be featured at the moment.-->

#### <!--3.9.4 Communication Interfaces-->
<!--The server and hardware will communicate using the http protocol.--> 

### <!--3.10 Licensing Requirements-->

### <!--3.11 Legal, Copyright, and Other Notices-->
<!--The logo is licensed to the Common Playground Team and is only allowed to use for the application. We do not take responsibilty for any incorrect data or errors in the application.-->

### <!--3.12 Applicable Standards-->

<!--The development will follow the common clean code standards and naming conventions. Also we will create a definition of d which will be added here as soon as its complete.-->

## 4. Use-Case View

OVERALL USE CASE DIAGRAM

### 4.1 Use Case Diagram

![OUCD](https://github.com/Calco2001/nEXam/blob/main/docs/diagrams/use%20case%20diagram.jpg)

- Green: Planned till end of december

<!--before: Supporting Information-->

<!--[This section lists use cases or scenarios from the use-case     model if they represent some significant, central functionality of the final     system, or if they have a large architectural coverage - they exercise many     architectural elements, or if they stress or illustrate a specific, delicate     point of the architecture.]-->

<!--For any further information you can contact the Common Playground Team or check our [Common Playground Blog](http://commonplayground.wordpress.com).--> 
<!--The Team Members are:-->

<!-- Picture-Link definitions: -->

### 4.2 Use-Case Realizations

<!--[This section illustrates how the software actually works     by giving a few selected use-case (or scenario) realizations, and explains     how the various design model elements contribute to their functionality.]-->

## 5. Logical View

<!--[This section describes the architecturally significant parts     of the design model, such as its decomposition into subsystems and packages.     And for each significant package, its decomposition into classes and class     utilities. You should introduce architecturally significant classes and describe     their responsibilities, as well as a few very important relationships, operations,     and attributes.]-->

### 5.1 Overview

<!--[This subsection describes the overall decomposition of the     design model in terms of its package hierarchy and layers.]-->

ADD HIGH LEVEL DIAGRAM

### 5.2 Architecturally Significant Design Packages

ADD CLASS DIAGRAM WITH CLEARLY MARKED SECTIONS OF MVC

<!--[For each significant package, include a subsection with its     name, its brief description, and a diagram with all significant classes and     packages contained within the package.--> 

<!--For each significant class in the package, include its name,     brief description, and, optionally a description of some of its major responsibilities,     operations and attributes.]-->

## 6. Process View

<!--[This section describes the system's decomposition into lightweight     processes (single threads of control) and heavyweight processes (groupings     of lightweight processes). Organize the section by groups of processes that     communicate or interact. Describe the main modes of communication between     processes, such as message passing, interrupts, and rendezvous.]-->

## 7. Deployment View 

ADD UML-DIAGRAM WITH SERVER/CLIENT ARCHITECTURE

<!--[This section describes one or more physical network (hardware)     configurations on which the software is deployed and run. It is a view of     the Deployment Model. At a minimum for each configuration it should indicate     the physical nodes (computers, CPUs) that execute the software, and their     interconnections (bus, LAN, point-to-point, and so on.) Also include a mapping     of the processes of the **Process View** onto the physical nodes.]-->

## 8. Implementation View 

n/a

<!--[This section describes the overall structure of the implementation     model, the decomposition of the software into layers and subsystems in the     implementation model, and any architecturally significant components.]-->

### <!--8.1 Overview-->

<!--[This subsection names and defines the various layers and     their contents, the rules that govern the inclusion to a given layer, and     the boundaries between layers. Include a component diagram that shows the     relations between layers. ]-->

### <!--8.2 Layers-->

<!--[For each layer, include a subsection with its name, an enumeration     of the subsystems located in the layer, and a component diagram.]-->

## 9. Data View (optional)

<!--[A description of the persistent data storage perspective     of the system. This section is optional if there is little or no persistent     data, or the translation between the Design Model and the Data Model is trivial.]-->

Below you can see our db schema diagram and our class diagram:

![db schema](https://github.com/Calco2001/nEXam/blob/main/docs/diagrams/DB-Schema.jpg)

![class diagram](https://github.com/Calco2001/nEXam/blob/main/docs/diagrams/UML%20class%20diagram.jpg)

## 10. Size and Performance 

n/a

<!--[A description of the major dimensioning characteristics of     the software that impact the architecture, as well as the target performance     constraints.]-->

## 11. Quality 

n/a

<!--[A description of how the software architecture contributes     to all capabilities (other than functionality) of the system: extensibility,     reliability, portability, and so on. If these characteristics have special     significance, for example safety, security or privacy implications, they should     be clearly delineated.]-->
