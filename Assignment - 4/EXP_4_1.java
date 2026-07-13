public class EXP_3_1 {
    public static void main(String[] args) {
        String math_marks = "80";
        String physics_marks = "70";
        String chem_marks = "90";

        System.out.println("Marks of Different Subjects(out of 100) in String Format:");
        System.out.println("Math Marks: " + math_marks);
        System.out.println("Physics Marks: " + physics_marks);
        System.out.println("Chemistry Marks: " + chem_marks);

        // Converting marks in Integer format from String format.
        int marks_math = Integer.parseInt(math_marks);
        int marks_physics = Integer.parseInt(physics_marks);
        int marks_chem = Integer.parseInt(chem_marks);

        System.out.println("****************************");
        System.out.println("****************************");

        System.out.println("Marks of Different Subjects(out of 100) after conversion in Integer Format:");
        System.out.println("Math Marks: " + marks_math);
        System.out.println("Physics Marks: " + marks_physics);
        System.out.println("Chemistry Marks: " + marks_chem);

        int total = marks_math + marks_physics + marks_chem;
        System.out.println();
        System.out.println("Total marks: " + total);

    }
}