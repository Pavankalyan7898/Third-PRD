# CampusTrack - Student Academic Management System

## Project Title

**CampusTrack - Student Academic Management System**

## Project Type

Individual Java Console Application

## Programming Language

Java

## Project Difficulty

Beginner

## Author

**D. Pavan Kalyan**

---

## 1. Project Introduction

CampusTrack is a Java console-based Student Academic Management System.

The application collects and processes information about one student at a time. It manages student profile details, course and semester information, subject marks, attendance, assignment performance, scholarship eligibility, semester fees, and final semester clearance.

After processing the information, the program generates a detailed student semester report.

The program also displays failed conditions and provides recommendations for improvement.

---

## 2. Problem Statement

A college needs to evaluate a student's academic performance using different criteria such as marks, attendance, assignments, and fee payment.

CampusTrack provides a simple console-based solution to:

* Collect student details
* Select a course
* Record semester information
* Record marks for five subjects
* Calculate total marks and percentage
* Determine academic result and grade
* Calculate attendance percentage
* Process assignment scores
* Calculate scholarship
* Calculate semester fee balance
* Determine semester clearance
* Display failed conditions
* Display recommendations

---

## 3. Features

### Student Profile

The program accepts:

* Student ID
* Full name
* Age
* Email
* Course
* Semester
* Career goal

The full name and career goal support spaces by using `nextLine()`.

---

### Course Selection

The program provides five course choices:

| Choice | Course                | Base Semester Fee |
| -----: | --------------------- | ----------------: |
|      1 | BCA                   |           ₹35,000 |
|      2 | B.Sc Computer Science |           ₹30,000 |
|      3 | B.E/B.Tech            |           ₹50,000 |
|      4 | MCA                   |           ₹45,000 |
|      5 | Other                 |           ₹25,000 |

A `switch` statement is used to select the course and assign the corresponding semester fee.

---

## 4. Subject Marks

The program accepts marks for five subjects:

1. Java
2. SQL
3. Web Technology
4. Aptitude
5. Communication

Each mark must be between **0 and 100**.

The marks are stored in separate variables.

---

## 5. Academic Calculation

The total marks are calculated as:

```text
Total Marks =
Java + SQL + Web Technology + Aptitude + Communication
```

The maximum marks are:

```text
500
```

The percentage is calculated using explicit type casting:

```text
Percentage = (double) totalMarks / 5
```

The percentage is displayed with two decimal places.

---

## 6. Academic Result

A student must satisfy all the following conditions:

* Java marks >= 35
* SQL marks >= 35
* Web Technology marks >= 35
* Aptitude marks >= 35
* Communication marks >= 35
* Percentage >= 40

If all conditions are satisfied:

```text
Academic Result = PASSED
```

Otherwise:

```text
Academic Result = FAILED
```

The program checks each subject separately, so a high overall percentage cannot hide a failed subject.

---

## 7. Grade Calculation

The grade is calculated using an `if-else-if` structure.

| Percentage / Result      | Grade |
| ------------------------ | ----- |
| Academic criteria failed | F     |
| 85 or above              | A+    |
| 75 - 84.99               | A     |
| 65 - 74.99               | B     |
| 50 - 64.99               | C     |
| 40 - 49.99               | D     |

---

## 8. Attendance Management

The program accepts:

* Total classes conducted
* Classes attended

Total classes must be between **1 and 300**.

Classes attended cannot be greater than the total classes conducted.

Attendance percentage is calculated as:

```text
Attendance Percentage =
((double) classesAttended / totalClasses) * 100
```

Attendance status is determined as:

```text
75% or above = REGULAR
Below 75%    = SHORTAGE
```

A ternary operator is used for the attendance status.

---

## 9. Assignment Management

The program allows the user to enter between **1 and 10 assignment scores**.

Each assignment score must normally be between:

```text
0 and 10
```

The special value:

```text
-1
```

is used to finish assignment entry early.

### Assignment Processing

The program uses a `for` loop.

If the score is `-1`:

```text
break
```

is used to stop the assignment loop.

If the score is below `-1` or above `10`:

```text
continue
```

is used to skip the invalid assignment.

Valid scores are added to the assignment total.

---

## 10. Assignment Average

If at least one valid assignment is entered:

```text
Assignment Average =
(double) assignmentTotal / validAssignmentCount
```

If no valid assignment is entered:

```text
Assignment Average = 0.00
```

The assignment criteria is passed when:

```text
At least one valid assignment
AND
Assignment average >= 5
```

The assignment status is:

```text
SATISFACTORY
```

or:

```text
NEEDS IMPROVEMENT
```

---

## 11. Scholarship Calculation

The scholarship depends on academic performance and attendance.

### 10% Scholarship

The student receives 10% when:

```text
Academic criteria passed
AND
Percentage >= 85
AND
Attendance >= 85
```

### 5% Scholarship

The student receives 5% when:

```text
Academic criteria passed
AND
Percentage >= 75
AND
Attendance >= 75
```

### No Scholarship

All other cases receive:

```text
0%
```

The 10% condition is checked first.

---

## 12. Scholarship Amount

The scholarship amount is calculated as:

```text
Scholarship Amount =
Base Semester Fee * Scholarship Percentage / 100
```

The final payable fee is:

```text
Final Payable Fee =
Base Semester Fee - Scholarship Amount
```

---

## 13. Fee Management

The program asks the user to enter the amount already paid.

The amount paid must be:

```text
0 <= Amount Paid <= Final Payable Fee
```

The fee balance is calculated as:

```text
Fee Balance =
Final Payable Fee - Amount Paid
```

Fee status is determined using a ternary operator:

```text
Fee Balance == 0
    PAID

Fee Balance > 0
    PENDING
```

All monetary values are displayed with two decimal places.

---

## 14. Final Semester Clearance

The student is cleared for the next semester only when all four conditions are satisfied:

```text
Academic criteria passed
AND
Attendance >= 75%
AND
Assignment criteria passed
AND
Fee balance == 0
```

If all conditions are satisfied:

```text
CLEARED FOR NEXT SEMESTER
```

Otherwise:

```text
ACTION REQUIRED
```

---

## 15. Failed Conditions

When a student does not satisfy the required conditions, the program displays the applicable reasons.

Possible failed conditions include:

```text
- Java marks are below 35.
- SQL marks are below 35.
- Web Technology marks are below 35.
- Aptitude marks are below 35.
- Communication marks are below 35.
- Overall percentage is below 40%.
- Attendance is below 75%.
- Assignment average is below 5.00.
- No valid assignment score was entered.
- Semester fee is pending.
```

The program checks these conditions independently.

---

## 16. Recommendations

The program provides recommendations based on the failed conditions.

### Failed Subject

```text
Revisit the failed subject and complete additional practice.
```

### Low Percentage

```text
Improve overall academic performance.
```

### Attendance Shortage

```text
Attend classes regularly and clear the attendance shortage.
```

### Assignment Failure

```text
Complete assignments consistently and maintain an average of at least 5.00.
```

### Pending Fee

```text
Pay the pending semester fee before clearance.
```

### All Conditions Passed

```text
Maintain the current performance in the next semester.
```

---

## 17. Concepts Used

This project uses basic Java concepts including:

* `Scanner`
* Variables
* Primitive data types
* `String`
* Arithmetic operators
* Relational operators
* Logical operators
* Explicit type casting
* `if`
* `else if`
* `else`
* Compound conditions
* `switch`
* Ternary operator
* `while`
* `for`
* `do-while`
* `break`
* `continue`
* `print`
* `println`
* `printf`

---

## 18. Concepts Not Used

The project does not use:

* Arrays
* Collections
* User-defined methods
* Additional user-defined classes
* Constructors
* Exception handling
* File handling
* Database connectivity
* Inheritance
* Streams
* Lambda expressions
* GUI
* Web development

The program logic is written inside the `main` method.

---

## 19. Project Structure

```text
Third-PRD/
│
├── README.md
│
├── src/
│   └── Main.java
│
├── pseudocode/
│   └── pseudocode.txt
│
└── output/
    ├── test-case-1.txt
    ├── test-case-2.txt
    ├── test-case-3.txt
    ├── test-case-4.txt
    └── test-case-5.txt
```

---

## 20. Pseudocode

The project pseudocode is stored in:

```text
pseudocode/pseudocode.txt
```

It describes the complete flow of the application:

1. Start the program
2. Create Scanner
3. Display welcome screen
4. Read student profile
5. Validate age
6. Select course
7. Validate semester
8. Read career goal
9. Read five subject marks
10. Calculate total and percentage
11. Determine academic result
12. Determine grade
13. Read attendance
14. Calculate attendance percentage
15. Process assignments
16. Calculate assignment average
17. Calculate scholarship
18. Calculate payable fee
19. Read amount paid
20. Calculate fee balance
21. Determine final clearance
22. Display failed conditions
23. Display recommendations
24. Ask whether another student should be processed
25. End the program

---

## 21. Test Cases

### Test Case 1 - All Conditions Passed

Input values:

```text
Course: B.E/B.Tech
Java: 88
SQL: 82
Web Technology: 79
Aptitude: 76
Communication: 80

Attendance: 102/120

Assignments:
8, 9, 7, 8, 9

Amount Paid: ₹47500
```

Expected result:

```text
Academic Result     : PASSED
Grade               : A
Attendance Status   : REGULAR
Assignment Status   : SATISFACTORY
Fee Status          : PAID
Semester Clearance  : CLEARED FOR NEXT SEMESTER
```

Output file:

```text
output/test-case-1.txt
```

---

### Test Case 2 - Failed Subject

Input:

```text
Java: 90
SQL: 90
Web Technology: 90
Aptitude: 30
Communication: 90
```

Expected result:

```text
Total Marks         : 390/500
Percentage          : 78.00%
Academic Result     : FAILED
Grade               : F
Semester Clearance  : ACTION REQUIRED
```

Failed condition:

```text
- Aptitude marks are below 35.
```

Output file:

```text
output/test-case-2.txt
```

---

### Test Case 3 - Boundary Values

Input:

```text
All five subject marks: 40
Classes conducted: 100
Classes attended: 75
Assignment scores: 5, 5, 5
Fee: Completely paid
```

Expected result:

```text
Percentage             : 40.00%
Academic Result        : PASSED
Grade                  : D
Attendance Percentage  : 75.00%
Attendance Status      : REGULAR
Assignment Average     : 5.00
Assignment Status      : SATISFACTORY
Semester Clearance     : CLEARED FOR NEXT SEMESTER
```

Output file:

```text
output/test-case-3.txt
```

---

### Test Case 4 - Attendance Shortage and Pending Fee

Input:

```text
Academic Result: Passed
Classes conducted: 100
Classes attended: 70
Assignment average: 7.00
Final payable fee: ₹35000
Amount paid: ₹20000
```

Expected result:

```text
Attendance Percentage  : 70.00%
Attendance Status      : SHORTAGE
Fee Balance            : ₹15000.00
Fee Status             : PENDING
Semester Clearance     : ACTION REQUIRED
```

Failed conditions:

```text
- Attendance is below 75%.
- Semester fee is pending.
```

Output file:

```text
output/test-case-4.txt
```

---

### Test Case 5 - Assignment Break and Continue

Input:

```text
Assignment 1: 8
Assignment 2: 15
Assignment 3: 6
Assignment 4: -1
```

Expected processing:

```text
Assignment 1 accepted.
Assignment 2 skipped.
Assignment 3 accepted.
Assignment entry completed early.
```

Expected result:

```text
Valid Assignments      : 2
Assignment Total       : 14
Assignment Average     : 7.00
Assignment Status      : SATISFACTORY
```

Output file:

```text
output/test-case-5.txt
```

---

## 22. Sample Input

```text
Enter student ID: STU101
Enter full name: Ananya Rao
Enter age: 20
Enter email: ananya@gmail.com

Select course:
1. BCA
2. B.Sc Computer Science
3. B.E/B.Tech
4. MCA
5. Other

Enter course choice: 3
Enter semester (1-8): 4
Enter career goal: Become a Java backend developer

Enter Java marks: 88
Enter SQL marks: 82
Enter Web Technology marks: 79
Enter Aptitude marks: 76
Enter Communication marks: 80

Enter total classes conducted: 120
Enter classes attended: 102

How many assignment scores do you want to enter? 5

Enter score for assignment 1 (0-10, -1 to finish): 8
Enter score for assignment 2 (0-10, -1 to finish): 9
Enter score for assignment 3 (0-10, -1 to finish): 7
Enter score for assignment 4 (0-10, -1 to finish): 8
Enter score for assignment 5 (0-10, -1 to finish): 9

Final payable fee: ₹47500.00
Enter amount paid: 47500
```

---

## 23. Sample Output

```text
========================================================
                 STUDENT SEMESTER REPORT
========================================================
Student ID                 : STU101
Student Name               : Ananya Rao
Age                        : 20
Email                      : ananya@gmail.com
Course                     : B.E/B.Tech
Semester                   : 4
Career Goal                : Become a Java backend developer

---------------- ACADEMIC SUMMARY --------------------
Java Marks                 : 88
SQL Marks                  : 82
Web Technology Marks       : 79
Aptitude Marks             : 76
Communication Marks        : 80
Total Marks                : 405/500
Percentage                 : 81.00%
Academic Result            : PASSED
Grade                      : A

---------------- ATTENDANCE SUMMARY ------------------
Classes Conducted          : 120
Classes Attended           : 102
Attendance Percentage      : 85.00%
Attendance Status          : REGULAR

---------------- ASSIGNMENT SUMMARY ------------------
Valid Assignments          : 5
Assignment Total           : 41
Assignment Average         : 8.20
Assignment Status          : SATISFACTORY

---------------- FEE SUMMARY -------------------------
Base Semester Fee          : ₹50000.00
Scholarship Percentage     : 5%
Scholarship Amount         : ₹2500.00
Final Payable Fee          : ₹47500.00
Amount Paid                : ₹47500.00
Fee Balance                : ₹0.00
Fee Status                 : PAID

---------------- FINAL STATUS ------------------------
Semester Clearance         : CLEARED FOR NEXT SEMESTER

---------------- FAILED CONDITIONS -------------------
None

---------------- RECOMMENDATIONS ---------------------
Maintain the current performance in the next semester.
========================================================
```

---

## 24. How to Run the Program

### Compile

Open the terminal in the project folder and run:

```bash
javac src/Main.java
```

### Run

```bash
java -cp src Main
```

The program will start and ask for student information through the console.

---

## 25. Java Technical Explanation

The JDK is used to develop and compile the Java program.

The Java compiler converts the Java source code into bytecode.

The JRE provides the environment required to run the program.

The JVM executes the generated bytecode.

The same bytecode can run on different operating systems that have a compatible JVM, making Java platform-independent.

---

## 26. Conclusion

CampusTrack is a beginner-level Java console application that demonstrates the use of fundamental Java programming concepts.

The application collects student information, validates input, calculates academic results, evaluates attendance and assignments, calculates scholarship and fees, determines semester clearance, and generates a detailed student report.

The project provides practical experience with variables, operators, conditional statements, loops, `switch`, `Scanner`, type casting, `break`, `continue`, ternary operators, and formatted output.

---

## Author

**D. Pavan Kalyan**
