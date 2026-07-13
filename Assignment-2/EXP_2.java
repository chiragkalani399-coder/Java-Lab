class Employee {

    // INSTANCE VARIABLES
    int empid;
    String empname;
    double salary;

    // STATIC VARIABLE
    static String company = "Google";

    // Default Constructor
    Employee() {
        // Java automatically assigns:
        // empid = 0
        // empname = null
        // salary = 0.0
    }

    // Parameterized Constructor
    Employee(int empid, String empname, double salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }

    // Copy Constructor
    Employee(Employee e) {
        this.empid = e.empid;
        this.empname = e.empname;
        this.salary = e.salary;
    }

    // Instance Method
    void displayDetails() {
        System.out.println("Employee ID:              " + empid);
        System.out.println("Employee Name:            " + empname);
        System.out.println("Employee Salary:          " + salary);
        System.out.println("Company:                  " + company);
        System.out.println("***********************************");
        System.out.println("***********************************");
    }

    // Instance Method
    void increaseSalary(double amount) {
        salary += amount;
    }

    // Static Method
    static void showCompany() {
        System.out.println("Company Name: " + company);
        System.out.println();
    }
}

public class EXP_2 {

    public static void main(String[] args) {

        Employee.showCompany();
        // Default Constructor
        Employee e1 = new Employee();

        // Parameterized Constructor
        Employee e2 = new Employee(101, "Rahul", 55000);

        // Copy Constructor
        Employee e3 = new Employee(e2);

        // Increase Salary
        e2.increaseSalary(5000);

        System.out.println("Employee 1 (Default Constructor)");
        e1.displayDetails();

        System.out.println("Employee 2 (Parameterized Constructor)");
        e2.displayDetails();

        System.out.println("Employee 3 (Copy Constructor)");
        e3.displayDetails();
    }
}