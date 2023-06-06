For Object Oriented Programming subject during our freshman third semester. 

(June 5, 2023)

Things to improve on:
- Data access within the project.
- Code readability and proper blocking.
- Sticking to one style for the project.
- Error handling skills.
- Organization of code and visuals.

Demo: https://youtu.be/4e8t_-1lURg
App Preview: https://imgur.com/a/Y6CLNj0

Insctructions:
Create  a  mobile  application  that  can  enact  thelogic  and system  architecture  below. The  interface  and  design is  depends  on the developers preference.
Things to consider:

Login Activity:

Accepts username and password.
The password character in the input field should be hidden.
The correct credentials should be stored in a variable.
If the user enters the wrong username or password, display an error message on the screen (toast message).
If the user enters an empty username or password, display an error message on the screen (toast message).
If the user enters the correct credentials, proceed to the menu activity.
Menu Activity:

The activity will act as a portal for encoding student grades and student information.
The user can logout of his/her account.
Info_Encode Activity:

The activity will ask for the last name, first name, course, year, email address, contact number, and birth year of the student.
Year, contact number, and birth year should only accept numbers as input.
If any of the required details are empty, an error message should appear on the screen (toast message).
If the user meets the requirements, proceed to the view information activity.
The user can go back to the menu.
Grade_Encode activity:

The activity will ask for the last name, first name, attendance, four quizzes, and the exam of the student.
Attendance, four quizzes, and examination should only accept input between 1 and 100.
If the user tries to input a value lower than 1 or higher than 100 for attendance, quizzes, or examination, an error message should appear on the screen (toast message).
If any of the mentioned required details are empty, an error message should appear on the screen (toast message).
The user can go back to the menu.
Info_View Activity:

The activity will display the last name, first name, course, year, email address, contact number, birth year, and age of the student.
The age should be automatically computed by the application.
The user can go back to the menu.
Grade_View Activity:

The activity will display the last name, first name, attendance, four quizzes, exam, average, status, and remarks of the student.
The average is composed of 20% attendance, 30% quizzes, and 50% examination.
If the average is 60 and above, the status is Passed. Otherwise, Failed.
The remarks are identified by the following average criteria:
96-100 = 4.00
90-95 = 3.50
84-89 = 3.00
78-83 = 2.50
72-77 = 2.00
66-71 = 1.50
60-65 = 1.00
0-59 = INC
The user can go back to the menu.
