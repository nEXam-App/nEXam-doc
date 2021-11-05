# Use-Case Specification: nEXam

## 1. Use-Case
This use case allows useres to have an overview of their learning progress.
You will see an agenda showing when to study which topic.
While studying you should use the in app timer for the optimum experience.

![Use Case](https://github.com/Calco2001/nEXam/blob/main/docs/use%20case%20diagram.jpg)

## 2. Flow of Events
### 2.1 Basic flow
A user will create an exam and list all of them. He can edit them if changes occur or delete them altogether.

![Basic Flow](https://github.com/Calco2001/nEXam/blob/main/docs/basic%20flow.jpg)

### 2.2 Creation
The creation of a new exam, where the user will be asked about the topic and the additional information(subject, content and date).

[//]: <Add Screenshot of create mockup> 

### 2.3 Edit
By editing the user can change information of the exam.

[//]: <Add Screenshot of edit mockup> 

### 2.4 List
The user wants to get an overview, therefore he is given a list of all entires on an agenda.

[//]: <Add Screenshot of list mockup> 

### 2.5 Delete
Perhaps exams are cancelled, so you want to be able to delete them. In case of this scenario we will add a delete button on the edit page.

[//]: <Add Screenshot of delete mockup - button> 
[//]: <Add are you sure popup to avoid accidental deletions> 

## 3. Activity Diagram
### 3. Activity Diagram
![Activity Diagram](https://github.com/Calco2001/nEXam/blob/main/docs/activity%20diagram.jpg)

### 3.2 Narratives
The feature files for the first two use cases.
![UC1](https://github.com/Calco2001/nEXam/blob/main/feature%20files/UC1.feature)
![UC2](https://github.com/Calco2001/nEXam/blob/main/feature%20files/UC2.feature)

### 3.3 Mockups

Below you will find our first wireframes. Those will show you our first thoughts about the look.

![](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/dashboard.PNG)

![](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/create%20edit%20exam.PNG)

![](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/error.PNG)

![](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/success%20message.PNG)

![](https://github.com/Calco2001/nEXam/blob/main/docs/wireframes/exam%20view.PNG)

## 4. Preconditions

Since we don't want to use a large database, we agreed not to have an authentication process. So the only requirements are read and write permissions on the local device.

## 5. Postconditions
### 5.1 Create
After creating a new exam, the user will be redirected to the overview, where all entires will be displayed.

### 5.2 Edit
After the user saved his edits, the updated data will be displayed to the overview.

### 5.3 Delete
After confirming the deletion modal, the exam will be removed from the overview.

## 6. Function Points
[//]: <Domain Characteristic Table>

[//]: <Complexity Adjustment Table>
