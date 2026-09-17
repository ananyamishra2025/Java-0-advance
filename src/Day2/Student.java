package Day2;

public class Student {
    static String college = "GMIT"; // static variable
    String name;                    // instance variable

    void show() {
        int rollNo = 101;           // local variable
        System.out.println(name + " " + rollNo + " " + college);
    }

    String title = "Ananya";
    int[] marks = {90, 80, 85};//non-primitive data type

}
