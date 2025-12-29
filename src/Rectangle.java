class Rectangle {

    double length;
    double breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    double area() {
        return length * breadth;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 4);
        Rectangle r2 = new Rectangle(10, 3);

        System.out.println("Area of Rectangle 1 = " + r1.area());
        System.out.println("Area of Rectangle 2 = " + r2.area());
    }
}
