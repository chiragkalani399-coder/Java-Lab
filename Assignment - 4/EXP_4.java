public class EXP_3 {
    public static void main(String[] args) {
        // creating a one primitive variable.
        int marks1 = 88;
        System.out.println("Primitive Variable Value: " + marks1);

        // converting the primitive object into the wrapper class object.
        Integer obj1 = Integer.valueOf(marks1);
        System.out.println("Wrapper class object: " + obj1);
        // this process is called "BOXING".

        // AUTOBOXING.
        int marks2 = 70;
        Integer obj2 = marks2;
        System.out.println("Wrapper class object created using autoboxing: " + obj2);

        // Manual UNBOXING
        Integer obj3 = 33;
        int marks3 = obj3.intValue();
        System.out.println("Primitive datatype using manual unboxing: " + marks3);

        // automatic unboxing
        Integer obj4 = 45;
        int marks4 = obj4;
        System.out.println("Primitive datatype using automatic unboxing: " + marks4);

        // String to int conversion
        String str = "250";
        int num = Integer.parseInt(str);
        System.out.println("Number is: " + num);

        // conversion of a wrapper object to a string
        Integer marks5 = 67;
        String abc = marks5.toString();
        System.out.println("String is: " + abc);

        // arithmetic operations on a wrapper class object.
        Integer marks6 = 10;
        Integer marks7 = 21;
        Integer sum = marks6 + marks7;
        System.out.println("Sum of 2 wrapper class object is: " + sum);

    }
}
