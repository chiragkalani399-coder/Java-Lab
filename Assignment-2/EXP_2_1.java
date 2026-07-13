class Student {
    int rollNo;
    String name;
    double marks;

    static String college = "SIT Pune";

    Student() {

    }

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.marks = s.marks;
    }

    void displaydetails() {
        System.out.println("Student College:             " + college);
        System.out.println("Student Roll Number:         " + rollNo);
        System.out.println("Student Name:                " + name);
        System.out.println("Student marks:               " + marks);
        System.out.println("************************************");
        System.out.println("************************************");
    }

    void updatemarks(double bonus) {
        marks = marks + bonus;
    }

    static void collegename() {
        System.out.println("College is: " + college);
        System.out.println();
    }
}

public class EXP_2_1 {
    public static void main(String[] args) {
        Student.collegename();

        Student s1 = new Student();

        Student s2 = new Student(68, "Gaurav Singh", 85.5);

        s2.updatemarks(4.5);

        Student s3 = new Student(s2);

        System.out.println("-----Student s1 Details-----");
        s1.displaydetails();

        System.out.println("-----Student s2 Details-----");
        s2.displaydetails();

        System.out.println("-----Student s3 Details-----");
        s3.displaydetails();

    }
}