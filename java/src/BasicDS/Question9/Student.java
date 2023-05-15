package BasicDS.Question9;

public class Student {
    private int subjectA,subjectB,subjectC;

    public Student() {
        this.subjectA=0;
        this.subjectB=0;
        this.subjectC=0;
    }
    public int getSubjectA() {
        return subjectA;
    }

    public int getSubjectB() {
        return subjectB;
    }

    public int getSubjectC() {
        return subjectC;
    }

    public void setSubjectA(int subjectA) {
        this.subjectA = subjectA;
    }

    public void setSubjectC(int subjectC) {
        this.subjectC = subjectC;
    }

    public void setSubjectB(int subjectB) {
        this.subjectB = subjectB;
    }

    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int sum=0;
        for (Student student : students) {
            sum += student.getSubjectA() + student.getSubjectB() + student.getSubjectC();
        }
        return sum;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int sum = studentsTotalMarksInAllSubjects(students);
        double avg = sum/students.length;
        return avg;
    }
//    public int[] subjectWiseMarks(Student[] students,String subjectName);
    public int subjectATotalByStudents(Student[] students) {
        int sum=0;
        for (Student student:students) {
            sum+=student.getSubjectA();
        }
        return sum;
    }
    public int subjectBTotalByStudents(Student[] students) {
        int sum=0;
        for (Student student:students) {
            sum+=student.getSubjectB();
        }
        return sum;
    }
    public int subjectCTotalByStudents(Student[] students) {
        int sum=0;
        for (Student student:students) {
            sum+=student.getSubjectC();
        }
        return sum;
    }

//    public int subjectTotalByStudents(int[] marks)

    public double subjectAAverageByStudents(int[] marks,Student[] students) {
        int sum = subjectATotalByStudents(students);
        double avg = sum/students.length;
        return avg;
    }
    public double subjectBAverageByStudents(int[] marks,Student[] students) {
        int sum = subjectBTotalByStudents(students);
        double avg = sum/students.length;
        return avg;
    }
    public double subjectCAverageByStudents(int[] marks,Student[] students) {
        int sum = subjectCTotalByStudents(students);
        double avg = sum/students.length;
        return avg;
    }
}
