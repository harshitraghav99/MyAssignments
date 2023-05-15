package BasicDS.Question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student [] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("marks of Student "+i+" in Subjects A,B,C");
            students[i]=new Student();
            int subjectA = scanner.nextInt();
            int subjectB = scanner.nextInt();
            int subjectC = scanner.nextInt();
            students[i].setSubjectA(subjectA);
            students[i].setSubjectB(subjectB);
            students[i].setSubjectC(subjectC);
        }
        Student stud = new Student();
        System.out.println(stud.studentsTotalMarksInAllSubjects(students));


    }
}
