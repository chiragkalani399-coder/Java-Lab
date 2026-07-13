import java.util.Scanner;

public class EXP_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String empid = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        String salary = scanner.nextLine();
        System.out.print("Enter Bonus: ");
        String bonus = scanner.nextLine();

        // converting String to Wrapper objects.

        Integer emp_id = Integer.valueOf(empid);
        Double basicsalary = Double.valueOf(salary);
        Double bonusamount = Double.valueOf(bonus);

        System.out.println("*****Displaying Wrapper Class Objects*****");
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Basic Salary: " + basicsalary);
        System.out.println("Bonus Amount: " + bonusamount);

        if (emp_id.intValue() < 0) {
            System.out.println("Employee ID Cannot be Negative");
            System.exit(0);
        }
        if (basicsalary.doubleValue() < 0) {
            System.out.println("Salary Cannot be Negative");
            System.exit(0);
        }
        if (bonusamount.doubleValue() < 0) {
            System.out.println("Bonus Amount Cannot Be Negative");
            System.exit(0);
        }
        Double netsalary = basicsalary + bonusamount;

        System.out.println("-----Employee Payroll System-----");
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Basic Salary: " + basicsalary);
        System.out.println("Bonus Amount: " + bonusamount);
        System.out.println("Net Salary: " + netsalary);

        scanner.close();

    }
}
