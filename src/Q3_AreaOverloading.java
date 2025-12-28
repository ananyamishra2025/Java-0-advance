public class Q3_AreaOverloading {

    // Area of Circle
    static double area(double radius) {
        return 3.1416 * radius * radius;
    }

    // Area of Rectangle
    static double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle
    static double area(double base, double height, boolean triangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        System.out.println("Area of Circle = " + area(5));
        System.out.println("Area of Rectangle = " + area(4, 6));
        System.out.println("Area of Triangle = " + area(4, 5, true));
    }
}
