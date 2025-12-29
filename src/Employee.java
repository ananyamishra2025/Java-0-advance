class Employee {

    int id;
    String name;
    double salary;

    // Constructor to initialize employee details
    Employee(int id, String name, double salary) {
        this.id = id;        // this.id → instance variable
        this.name = name;    // name → parameter
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {

        // Creating two objects
        Employee e1 = new Employee(101, "Ananya", 50000);
        Employee e2 = new Employee(102, "Kausik", 60000);

        // Displaying details
        e1.display();
        e2.display();
    }
}
