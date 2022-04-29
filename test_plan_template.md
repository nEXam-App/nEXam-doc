# Test Plan Template

## Table of contents

- [1. Introduction](#1-introduction)
  * [1.1 Purpose](#11-purpose)
  * [1.2 Scope](#12-scope)
  * [1.3 Intended Audience](#13-intended-audience)
  * [1.4 Document Terminology and Acronyms](#14-document-terminology-and-acronyms)
  * [1.5  References](#15--references)
  * [1.6 Document Structure](#16-document-structure)
- [2. Evaluation Mission and Test Motivation](#2-evaluation-mission-and-test-motivation)
  * [2.1 Background](#21-background)
  * [2.2 Evaluation Mission](#22-evaluation-mission)
  * [2.3 Test Motivators](#23-test-motivators)
- [3. Target Test Items](#3-target-test-items)
- [4. Outline of Planned Tests](#4-outline-of-planned-tests)
  * [4.1 Outline of Test Inclusions](#41-outline-of-test-inclusions)
  * [4.2 Outline of Other Candidates for Potential Inclusion](#42-outline-of-other-candidates-for-potential-inclusion)
  * [4.3 Outline of Test Exclusions](#43-outline-of-test-exclusions)
- [5. Test Approach](#5-test-approach)
  * [5.1 Initial Test-Idea Catalogs and Other Reference Sources](#51-initial-test-idea-catalogs-and-other-reference-sources)
  * [5.2 Testing Techniques and Types](#52-testing-techniques-and-types)
    + [5.2.1 Unit Testing](#521-unit-testing)
    + [5.2.2 User Interface Testing](#522-user-interface-testing)
    + [5.2.3 Integration Testing (API Testing)](#523-integration-testing-api-testing)
- [6. Entry and Exit Criteria](#6-entry-and-exit-criteria)
  * [6.1 Test Plan](#61-test-plan)
    + [6.1.1 Test Plan Entry Criteria](#611-test-plan-entry-criteria)
    + [6.1.2 Test Plan Exit Criteria](#612-test-plan-exit-criteria)
    + [6.1.3 Suspension and Resumption Criteria](#613-suspension-and-resumption-criteria)
  * [6.2 Test Cycles](#62-test-cycles)
      - [6.2.1 Test Cycle Entry Criteria](#621-test-cycle-entry-criteria)
      - [6.2.2 Test Cycle Exit Criteria](#622-test-cycle-exit-criteria)
      - [6.2.3 Test Cycle Abnormal Termination](#623-test-cycle-abnormal-termination)
- [7. Deliverables](#7-deliverables)
- [7.1 Test Evaluation Summaries](#71-test-evaluation-summaries)
- [7.2 Reporting on Test Coverage](#72-reporting-on-test-coverage)
- [7.3 Perceived Quality Reports](#73-perceived-quality-reports)
- [7.4 Incident Logs and Change Requests](#74-incident-logs-and-change-requests)
- [7.5 Smoke Test Suite and Supporting Test Scripts](#75-smoke-test-suite-and-supporting-test-scripts)
- [7.6      Additional Work Products](#76------additional-work-products)
  * [7.6.1     Detailed Test Results](#761-----detailed-test-results)
  * [7.6.2     Additional Automated Functional Test Scripts](#762-----additional-automated-functional-test-scripts)
  * [7.6.3     Test Guidelines](#763-----test-guidelines)
  * [7.6.4     Traceability Matrices](#764-----traceability-matrices)
- [8. Testing Workflow](#8-testing-workflow)
- [9. Environmental Needs](#9-environmental-needs)
  * [9.1 Base System Hardware](#91-base-system-hardware)
  * [9.2 Base Software Elements in the Test Environment](#92-base-software-elements-in-the-test-environment)
  * [9.3 Productivity and Support Tools](#93-productivity-and-support-tools)
  * [9.4 Test Environment Configurations](#94-test-environment-configurations)
- [10. Responsibilities, Staffing, and Training Needs](#10-responsibilities-staffing-and-training-needs)
  * [10.1 People and Roles](#101-people-and-roles)
  * [10.2 Staffing and Training Needs](#102-staffing-and-training-needs)
- [11. Iteration Milestones](#11-iteration-milestones)
- [12. Risks, Dependencies, Assumptions, and Constraints](#12-risks-dependencies-assumptions-and-constraints)
- [13. Management Process and Procedures](#13-management-process-and-procedures)

## 1. Introduction

### 1.1 Purpose

The purpose of the Iteration Test Plan is to gather all of the information necessary to plan and control the test effort for a given iteration. It describes the approach to testing the software.
This Test Plan for nEXam supports the following objectives:

- Identifies the items that should be targeted by the tests.
- Identifies the motivation for and ideas behind the test areas to be covered.
- Outlines the testing approach that will be used.
- Identifies the required resources and provides an estimate of the test efforts.

### 1.2 Scope

This test plan will cover tests assuring the functionality of the application's front end, back end and the communication between the two. This document shows the following types of testing:

- Unit Testing
- Integration Testing
- User Interface Testing
- API Testing

Not covered are any tests related to performance and scale or usability.

### 1.3 Intended Audience

This test plan is written primarily for internal documentation reasons. It is meant to provide orientation to the developers to work from and as a documentation to measure the fullfillment of quality requirements against.

### 1.4 Document Terminology and Acronyms

[This subsection provides the definitions of any terms, acronyms, and abbreviations required to properly interpret the Test Plan. Avoid listing items that are generally applicable to the project as a whole and that are already defined in the project's Glossary. Include a reference to the project's Glossary in the References section.]

| Abbr | Abbreviation                        |
|------|-------------------------------------|
| API  | Application Programmable Interface  |
| CI   | Continuous Integration              |
| CD   | Continuous Delivery/Deployment      |
| n/a  | not applicable                      |
| SRS  | Software Requirements Specification |
| tbd  | to be determined                    |
| UI   | User Interface                      |
| VC   | Version Control                     |
| TDD  | Test Driven Development             |

### 1.5  References

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
| [SAD](https://github.com/nEXam-App/nEXam-doc/blob/0d0ce2e8de074a444fa6914afc6e07c656a7acb1/SAD.md)                                                  | Oct. 2021 | nEXam-App |

### 1.6 Document Structure

n/a

## 2. Evaluation Mission and Test Motivation

### 2.1 Background

Testing is used to ensure that the written code does what it is supposed to do. It also prevents future code changes from breaking existing functionality without being noticed. In the context of integration, it can also prevent faulty software states from being included in secured VC branches.

### 2.2 Evaluation Mission

Testing is a crucial phase in the development cycle. It is necessary to fix technical errors and important functional problems. With TDD, we define the test first and can fix bugs before they even occur.

### 2.3 Test Motivators

The tests are used for quality assurance, risk mitigation and to meet functional requirements. Their purpose is to ensure stability for our application.

## 3. Target Test Items

- Android frontend
- Database testing (and APIs)

## 4. Outline of Planned Tests

### 4.1 Outline of Test Inclusions

*Frontend: Android Client*:
- UI testing of views/fragments
- Unit testing

*Database: Room*:
- Unit testing
- Integration testing
- Api testing

<!--TODO maybe add graphic like this: https://github.com/nilskre/CommonPlayground/blob/0228b4c35e72e22177461711436413335903977c/docs/test_plan/testing_overview.png -->

The tests themself will not be tested and will not account into code coverage.

### 4.2 Outline of Other Candidates for Potential Inclusion

n/a

### 4.3 Outline of Test Exclusions

Due to time and resource constraints, we will not do this:
- Stress test
- Load/ performance tests
- Usability tests
- Any further test

## 5. Test Approach

### 5.1 Initial Test-Idea Catalogs and Other Reference Sources

n/a

### 5.2 Testing Techniques and Types

#### 5.2.1 Unit Testing

Unit tests ensure that the tested source code works as expected. Therefore, small parts of the source code are tested independently.

|                       | Description                                                         |
|-----------------------|---------------------------------------------------------------------|
|Technique Objective    | Ensure that the implemented code works as expected                  |
|Technique              | Implement test methos using JUnit Framework (Frontend & Backend)    |
|Oracles                | Test execution logs results                                         |
|Required Tools         | JUnit 4 & 5 Dependencies                                            |
|Success Criteria       | All tests pass. Coverage is above 10% (Frontend) / 60% (Backend)    |
|Special Considerations | -                                                                   |

#### 5.2.2 User Interface Testing

UI testing involves testing the application from the user's perspective. The goal of UI testing is to ensure that the user interface behaves as expected.

|                       | Description                                                         |
|-----------------------|---------------------------------------------------------------------|
|Technique Objective    | Test application automated from the perspective of the user through UI test |
|Technique              | Writing Gherkin .feature files with clearly defined steps and the expected results. Te test implementation of the steps use the Android Espresso library to serve the emulator |
|Oracles                | Expect that the steps of the test are executed successfully and the UI behaves as planned. Test execution logs results to the command line |
|Required Tools         | Dependencies of Cucumber and Espresso (official Android UI test library) and an implementation of a test runner based on JUnit 4 to execute UI tests with Cucumber and Espresso |
|Success Criteria       | All UI tests pass |
|Special Considerations | -                                                                   |

#### 5.2.3 Integration Testing (API Testing)

Api Testing is part of integration testing. Integration tests test multiple modules of an application together. The main goal of Api testing is to ensure, that the provided Apis of the Backend behave as expected.

|                       | Description                                                         |
|-----------------------|---------------------------------------------------------------------|
|Technique Objective    | Test the provided APIs with Cucumber|
|Technique              |For every meaningful api a Gherkin .feature exists and the steps are implemented |
|Oracles                |Test execution logs results to the command line |
|Required Tools         |JUnit, Cucumber, Hamcrest |
|Success Criteria       | All tests pass, Coverage is above 60%|
|Special Considerations | -                                                                   |

## 6. Entry and Exit Criteria

### 6.1 Test Plan

#### 6.1.1 Test Plan Entry Criteria

n/a

#### 6.1.2 Test Plan Exit Criteria

n/a

#### 6.1.3 Suspension and Resumption Criteria

n/a

### 6.2 Test Cycles

##### 6.2.1 Test Cycle Entry Criteria

n/a

##### 6.2.2 Test Cycle Exit Criteria

n/a

##### 6.2.3 Test Cycle Abnormal Termination

n/a


## 7. Deliverables

## 7.1 Test Evaluation Summaries

The project owns a certain amount of tests in the Frontend and Backend. Since we won't to know if problems occur before we push, we agreed on running the tests beforehand and only push if they all passed. Furthermore a code analysis with SonarQube is triggered. We use two different repos for the docs and the source code.

## 7.2 Reporting on Test Coverage

For reporting our test coverage we also use SonarQube.

## 7.3 Perceived Quality Reports

The code quality tool is SonarQube.

## 7.4 Incident Logs and Change Requests

We integrated the tools mentioned above into our GitHub pull request workflow.

<!--TODO maybe screenshot of integration-->

## 7.5 Smoke Test Suite and Supporting Test Scripts

The execution of the tests enables regression testing. With this approach it is clearly visible when changes break exisitng functions and affect the correct behaviour of the application.

## 7.6      Additional Work Products

n/a

### 7.6.1     Detailed Test Results

n/a

### 7.6.2     Additional Automated Functional Test Scripts

n/a

### 7.6.3     Test Guidelines

n/a

### 7.6.4     Traceability Matrices

n/a

## 8. Testing Workflow

1. Local testing in the IDE
2. Commit and Push triggers SonarQube

## 9. Environmental Needs

### 9.1 Base System Hardware

The following table sets forth the system resources for the test effort presented in this Test Plan.

|Resource|Quantity|Name and Type|
|--------|--------|-------------|
|Local test machine|1|Laptop|
|Android Test device|1|Android device|

### 9.2 Base Software Elements in the Test Environment

The following base software elements are required in the test environment for this Test Plan.

| Software Element Name |  Type and Other Notes                        |
|-----------------------|----------------------------------------------|
| Android Studio        | Test Runner / IDE                            |
| JUnit 4 & 5           | Unit testing library                         |
| Espresso              | UI testing library                           |
| Cucumber              | human readable test definitions              |

### 9.3 Productivity and Support Tools

The following tools will be employed to support the test process for this Test Plan.

|Tool Category or Type|Tool Brand Name|
|---------------------|---------------|
|Repository|[github.com](https://github.com/nEXam-App/nEXam)|
|Documents|[github.com](https://github.com/nEXam-App/nEXam-doc)|
|Test Coverage Monitor|[SonarQube](https://www.sonarqube.org/)|
|Metrics Tool|[SonarQube](https://www.sonarqube.org/)|

### 9.4 Test Environment Configurations

n/a

## 10. Responsibilities, Staffing, and Training Needs

### 10.1 People and Roles

This table shows the staffing assumptions for the test effort.

|Role|Person Assigned|Specific Responsibilities or Comments|
|----|---------------|-------------------------------------|
|Test Manager|Simon, Franziska|Provides management oversight|
|Test Designer|Simon, Franziska|Defines the technial approach to the implementation of the test effort|
|Test System Administrator|Simon, Franziska|Ensures test environment and assets are managed and maintained|

### 10.2 Staffing and Training Needs

n/a

## 11. Iteration Milestones

We want to keep over 20% code coverage.

## 12. Risks, Dependencies, Assumptions, and Constraints

| Risk                                    | Mitigation Strategy                                           | Contingency (Risk is realized)                                                                              |
|-----------------------------------------|---------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|
|Code has lots of side effects|Refactor code (Clean Code principles)|publish new refactored tests|
|Test runner is not able to execute tests|Use standard libraries which include working Test Runner|fix test execution configuration|
|UI tests fail|Refactor tests|publish refactored test and restart|

## 13. Management Process and Procedures

n/a
