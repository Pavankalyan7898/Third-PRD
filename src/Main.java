import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anotherStudent;

        do {

            // =====================================================
            //                  CAMPUSTRACK
            // =====================================================

            System.out.println("========================================================");
            System.out.println("                     CAMPUSTRACK");
            System.out.println("========================================================");
            System.out.println("        Student Academic Management System");
            System.out.println("--------------------------------------------------------");

            // =====================================================
            //                  STUDENT PROFILE
            // =====================================================

            System.out.print("Enter student ID: ");
            String studentId = sc.next();

            sc.nextLine();

            System.out.print("Enter full name: ");
            String fullName = sc.nextLine();

            int age;

            while (true) {
                System.out.print("Enter age: ");
                age = sc.nextInt();

                if (age >= 15 && age <= 35) {
                    System.out.println("Age accepted.");
                    break;
                } else {
                    System.out.println(
                            "Invalid age. Enter a value between 15 and 35."
                    );
                }
            }

            System.out.print("Enter email: ");
            String email = sc.next();

            // =====================================================
            //                  COURSE SELECTION
            // =====================================================

            int courseChoice;
            String courseName = "";
            double baseSemesterFee = 0;

            while (true) {

                System.out.println();
                System.out.println("Select course:");
                System.out.println("1. BCA");
                System.out.println("2. B.Sc Computer Science");
                System.out.println("3. B.E/B.Tech");
                System.out.println("4. MCA");
                System.out.println("5. Other");

                System.out.print("Enter course choice: ");
                courseChoice = sc.nextInt();

                switch (courseChoice) {

                    case 1:
                        courseName = "BCA";
                        baseSemesterFee = 35000;
                        break;

                    case 2:
                        courseName = "B.Sc Computer Science";
                        baseSemesterFee = 30000;
                        break;

                    case 3:
                        courseName = "B.E/B.Tech";
                        baseSemesterFee = 50000;
                        break;

                    case 4:
                        courseName = "MCA";
                        baseSemesterFee = 45000;
                        break;

                    case 5:
                        courseName = "Other";
                        baseSemesterFee = 25000;
                        break;

                    default:
                        System.out.println(
                                "Invalid course choice. Select a value from 1 to 5."
                        );
                        continue;
                }

                System.out.println("Course selected: " + courseName);
                break;
            }

            // =====================================================
            //                  SEMESTER
            // =====================================================

            int semester;

            while (true) {

                System.out.print("Enter semester (1-8): ");
                semester = sc.nextInt();

                if (semester >= 1 && semester <= 8) {
                    break;
                } else {
                    System.out.println(
                            "Invalid semester. Enter a value between 1 and 8."
                    );
                }
            }

            sc.nextLine();

            System.out.print("Enter career goal: ");
            String careerGoal = sc.nextLine();

            // =====================================================
            //                  SUBJECT MARKS
            // =====================================================

            int javaMarks;
            int sqlMarks;
            int webTechnologyMarks;
            int aptitudeMarks;
            int communicationMarks;

            while (true) {
                System.out.print("Enter Java marks: ");
                javaMarks = sc.nextInt();

                if (javaMarks >= 0 && javaMarks <= 100) {
                    break;
                }

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );
            }

            while (true) {
                System.out.print("Enter SQL marks: ");
                sqlMarks = sc.nextInt();

                if (sqlMarks >= 0 && sqlMarks <= 100) {
                    break;
                }

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );
            }

            while (true) {
                System.out.print("Enter Web Technology marks: ");
                webTechnologyMarks = sc.nextInt();

                if (webTechnologyMarks >= 0 && webTechnologyMarks <= 100) {
                    break;
                }

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );
            }

            while (true) {
                System.out.print("Enter Aptitude marks: ");
                aptitudeMarks = sc.nextInt();

                if (aptitudeMarks >= 0 && aptitudeMarks <= 100) {
                    break;
                }

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );
            }

            while (true) {
                System.out.print("Enter Communication marks: ");
                communicationMarks = sc.nextInt();

                if (communicationMarks >= 0 && communicationMarks <= 100) {
                    break;
                }

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );
            }

            // =====================================================
            //                  TOTAL AND PERCENTAGE
            // =====================================================

            int totalMarks =
                    javaMarks
                    + sqlMarks
                    + webTechnologyMarks
                    + aptitudeMarks
                    + communicationMarks;

            double percentage = (double) totalMarks / 5;

            // =====================================================
            //                  ACADEMIC RESULT
            // =====================================================

            boolean javaPassed = javaMarks >= 35;
            boolean sqlPassed = sqlMarks >= 35;
            boolean webPassed = webTechnologyMarks >= 35;
            boolean aptitudePassed = aptitudeMarks >= 35;
            boolean communicationPassed = communicationMarks >= 35;

            boolean academicPassed =
                    javaPassed
                    && sqlPassed
                    && webPassed
                    && aptitudePassed
                    && communicationPassed
                    && percentage >= 40;

            String academicResult;
            String grade;

            if (academicPassed) {
                academicResult = "PASSED";

                if (percentage >= 85) {
                    grade = "A+";
                } else if (percentage >= 75) {
                    grade = "A";
                } else if (percentage >= 65) {
                    grade = "B";
                } else if (percentage >= 50) {
                    grade = "C";
                } else {
                    grade = "D";
                }

            } else {
                academicResult = "FAILED";
                grade = "F";
            }

            // =====================================================
            //                  ATTENDANCE
            // =====================================================

            int totalClasses;

            while (true) {

                System.out.print("Enter total classes conducted: ");
                totalClasses = sc.nextInt();

                if (totalClasses >= 1 && totalClasses <= 300) {
                    break;
                }

                System.out.println(
                        "Invalid value. Total classes must be between 1 and 300."
                );
            }

            int classesAttended;

            while (true) {

                System.out.print("Enter classes attended: ");
                classesAttended = sc.nextInt();

                if (classesAttended >= 0
                        && classesAttended <= totalClasses) {
                    break;
                }

                System.out.println(
                        "Invalid attendance. Attended classes cannot exceed "
                        + totalClasses + "."
                );
            }

            double attendancePercentage =
                    ((double) classesAttended / totalClasses) * 100;

            boolean attendancePassed = attendancePercentage >= 75;

            String attendanceStatus =
                    attendancePassed ? "REGULAR" : "SHORTAGE";

            // =====================================================
            //                  ASSIGNMENTS
            // =====================================================

            int assignmentCount;

            while (true) {

                System.out.print(
                        "How many assignment scores do you want to enter? "
                );

                assignmentCount = sc.nextInt();

                if (assignmentCount >= 1 && assignmentCount <= 10) {
                    break;
                }

                System.out.println(
                        "Invalid number. Enter a value between 1 and 10."
                );
            }

            int assignmentTotal = 0;
            int validAssignmentCount = 0;

            for (int i = 1; i <= assignmentCount; i++) {

                System.out.print(
                        "Enter score for assignment "
                        + i
                        + " (0-10, -1 to finish): "
                );

                int assignmentScore = sc.nextInt();

                if (assignmentScore == -1) {
                    System.out.println(
                            "Assignment entry completed early."
                    );
                    break;
                }

                if (assignmentScore < -1 || assignmentScore > 10) {
                    System.out.println(
                            "Invalid score. Assignment "
                            + i
                            + " skipped."
                    );
                    continue;
                }

                assignmentTotal += assignmentScore;
                validAssignmentCount++;

                System.out.println("Assignment score accepted.");
            }

            double assignmentAverage;

            if (validAssignmentCount > 0) {
                assignmentAverage =
                        (double) assignmentTotal / validAssignmentCount;
            } else {
                assignmentAverage = 0.00;
            }

            boolean assignmentPassed =
                    validAssignmentCount > 0
                    && assignmentAverage >= 5;

            String assignmentStatus =
                    assignmentPassed
                    ? "SATISFACTORY"
                    : "NEEDS IMPROVEMENT";

            // =====================================================
            //                  SCHOLARSHIP
            // =====================================================

            double scholarshipPercentage;

            if (academicPassed
                    && percentage >= 85
                    && attendancePercentage >= 85) {

                scholarshipPercentage = 10;

            } else if (academicPassed
                    && percentage >= 75
                    && attendancePercentage >= 75) {

                scholarshipPercentage = 5;

            } else {

                scholarshipPercentage = 0;
            }

            double scholarshipAmount =
                    baseSemesterFee * scholarshipPercentage / 100;

            double finalPayableFee =
                    baseSemesterFee - scholarshipAmount;

            // =====================================================
            //                  FEE PAYMENT
            // =====================================================

            double amountPaid;

            while (true) {

                System.out.printf(
                        "Final payable fee: ₹%.2f%n",
                        finalPayableFee
                );

                System.out.print("Enter amount paid: ");
                amountPaid = sc.nextDouble();

                if (amountPaid >= 0
                        && amountPaid <= finalPayableFee) {
                    break;
                }

                System.out.println(
                        "Invalid amount. Enter a value from 0 to "
                        + finalPayableFee
                        + "."
                );
            }

            double feeBalance =
                    finalPayableFee - amountPaid;

            String feeStatus =
                    feeBalance == 0
                    ? "PAID"
                    : "PENDING";

            // =====================================================
            //                  FINAL CLEARANCE
            // =====================================================

            boolean cleared =
                    academicPassed
                    && attendancePassed
                    && assignmentPassed
                    && feeBalance == 0;

            String finalStatus =
                    cleared
                    ? "CLEARED FOR NEXT SEMESTER"
                    : "ACTION REQUIRED";

            // =====================================================
            //                  STUDENT REPORT
            // =====================================================

            System.out.println();
            System.out.println("========================================================");
            System.out.println("                 STUDENT SEMESTER REPORT");
            System.out.println("========================================================");

            System.out.printf("%-28s: %s%n", "Student ID", studentId);
            System.out.printf("%-28s: %s%n", "Student Name", fullName);
            System.out.printf("%-28s: %d%n", "Age", age);
            System.out.printf("%-28s: %s%n", "Email", email);
            System.out.printf("%-28s: %s%n", "Course", courseName);
            System.out.printf("%-28s: %d%n", "Semester", semester);
            System.out.printf("%-28s: %s%n", "Career Goal", careerGoal);

            System.out.println();
            System.out.println("---------------- ACADEMIC SUMMARY --------------------");

            System.out.printf("%-28s: %d%n", "Java Marks", javaMarks);
            System.out.printf("%-28s: %d%n", "SQL Marks", sqlMarks);
            System.out.printf(
                    "%-28s: %d%n",
                    "Web Technology Marks",
                    webTechnologyMarks
            );
            System.out.printf(
                    "%-28s: %d%n",
                    "Aptitude Marks",
                    aptitudeMarks
            );
            System.out.printf(
                    "%-28s: %d%n",
                    "Communication Marks",
                    communicationMarks
            );
            System.out.printf(
                    "%-28s: %d/500%n",
                    "Total Marks",
                    totalMarks
            );
            System.out.printf(
                    "%-28s: %.2f%%%n",
                    "Percentage",
                    percentage
            );
            System.out.printf(
                    "%-28s: %s%n",
                    "Academic Result",
                    academicResult
            );
            System.out.printf(
                    "%-28s: %s%n",
                    "Grade",
                    grade
            );

            System.out.println();
            System.out.println("---------------- ATTENDANCE SUMMARY ------------------");

            System.out.printf(
                    "%-28s: %d%n",
                    "Classes Conducted",
                    totalClasses
            );
            System.out.printf(
                    "%-28s: %d%n",
                    "Classes Attended",
                    classesAttended
            );
            System.out.printf(
                    "%-28s: %.2f%%%n",
                    "Attendance Percentage",
                    attendancePercentage
            );
            System.out.printf(
                    "%-28s: %s%n",
                    "Attendance Status",
                    attendanceStatus
            );

            System.out.println();
            System.out.println("---------------- ASSIGNMENT SUMMARY ------------------");

            System.out.printf(
                    "%-28s: %d%n",
                    "Valid Assignments",
                    validAssignmentCount
            );
            System.out.printf(
                    "%-28s: %d%n",
                    "Assignment Total",
                    assignmentTotal
            );
            System.out.printf(
                    "%-28s: %.2f%n",
                    "Assignment Average",
                    assignmentAverage
            );
            System.out.printf(
                    "%-28s: %s%n",
                    "Assignment Status",
                    assignmentStatus
            );

            System.out.println();
            System.out.println("---------------- FEE SUMMARY -------------------------");

            System.out.printf(
                    "%-28s: ₹%.2f%n",
                    "Base Semester Fee",
                    baseSemesterFee
            );
            System.out.printf(
                    "%-28s: %.0f%%%n",
                    "Scholarship Percentage",
                    scholarshipPercentage
            );
            System.out.printf(
                    "%-28s: ₹%.2f%n",
                    "Scholarship Amount",
                    scholarshipAmount
            );
            System.out.printf(
                    "%-28s: ₹%.2f%n",
                    "Final Payable Fee",
                    finalPayableFee
            );
            System.out.printf(
                    "%-28s: ₹%.2f%n",
                    "Amount Paid",
                    amountPaid
            );
            System.out.printf(
                    "%-28s: ₹%.2f%n",
                    "Fee Balance",
                    feeBalance
            );
            System.out.printf(
                    "%-28s: %s%n",
                    "Fee Status",
                    feeStatus
            );

            System.out.println();
            System.out.println("---------------- FINAL STATUS ------------------------");

            System.out.printf(
                    "%-28s: %s%n",
                    "Semester Clearance",
                    finalStatus
            );

            // =====================================================
            //                  FAILED CONDITIONS
            // =====================================================

            System.out.println();
            System.out.println("---------------- FAILED CONDITIONS -------------------");

            boolean anyFailure = false;

            if (javaMarks < 35) {
                System.out.println("- Java marks are below 35.");
                anyFailure = true;
            }

            if (sqlMarks < 35) {
                System.out.println("- SQL marks are below 35.");
                anyFailure = true;
            }

            if (webTechnologyMarks < 35) {
                System.out.println(
                        "- Web Technology marks are below 35."
                );
                anyFailure = true;
            }

            if (aptitudeMarks < 35) {
                System.out.println("- Aptitude marks are below 35.");
                anyFailure = true;
            }

            if (communicationMarks < 35) {
                System.out.println(
                        "- Communication marks are below 35."
                );
                anyFailure = true;
            }

            if (percentage < 40) {
                System.out.println(
                        "- Overall percentage is below 40%."
                );
                anyFailure = true;
            }

            if (attendancePercentage < 75) {
                System.out.println(
                        "- Attendance is below 75%."
                );
                anyFailure = true;
            }

            if (validAssignmentCount == 0) {
                System.out.println(
                        "- No valid assignment score was entered."
                );
                anyFailure = true;
            } else if (assignmentAverage < 5) {
                System.out.println(
                        "- Assignment average is below 5.00."
                );
                anyFailure = true;
            }

            if (feeBalance > 0) {
                System.out.println(
                        "- Semester fee is pending."
                );
                anyFailure = true;
            }

            if (!anyFailure) {
                System.out.println("None");
            }

            // =====================================================
            //                  RECOMMENDATIONS
            // =====================================================

            System.out.println();
            System.out.println("---------------- RECOMMENDATIONS ---------------------");

            boolean recommendationDisplayed = false;

            if (javaMarks < 35
                    || sqlMarks < 35
                    || webTechnologyMarks < 35
                    || aptitudeMarks < 35
                    || communicationMarks < 35) {

                System.out.println(
                        "Revisit the failed subject and complete "
                        + "additional practice."
                );

                recommendationDisplayed = true;
            }

            if (percentage < 40) {

                System.out.println(
                        "Improve overall academic performance."
                );

                recommendationDisplayed = true;
            }

            if (attendancePercentage < 75) {

                System.out.println(
                        "Attend classes regularly and clear "
                        + "the attendance shortage."
                );

                recommendationDisplayed = true;
            }

            if (validAssignmentCount == 0
                    || assignmentAverage < 5) {

                System.out.println(
                        "Complete assignments consistently and "
                        + "maintain an average of at least 5.00."
                );

                recommendationDisplayed = true;
            }

            if (feeBalance > 0) {

                System.out.println(
                        "Pay the pending semester fee before clearance."
                );

                recommendationDisplayed = true;
            }

            if (!recommendationDisplayed) {

                System.out.println(
                        "Maintain the current performance "
                        + "in the next semester."
                );
            }

            System.out.println(
                    "========================================================"
            );

            // =====================================================
            //                  ANOTHER STUDENT
            // =====================================================

            while (true) {

                System.out.println();
                System.out.println(
                        "Do you want to process another student?"
                );
                System.out.println("1. Yes");
                System.out.println("0. No");

                System.out.print("Enter choice: ");
                anotherStudent = sc.nextInt();

                if (anotherStudent == 1 || anotherStudent == 0) {
                    break;
                }

                System.out.println(
                        "Invalid choice. Enter 1 for Yes or 0 for No."
                );
            }

        } while (anotherStudent == 1);

        System.out.println();
        System.out.println("Thank you for using CampusTrack.");

        sc.close();
    }
}