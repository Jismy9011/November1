package oops;

class Member {
    // Data members
    String name;
    int age;
    String phoneNo;
    String address;
    double salary;

    // Constructor
    public Member(String name, int age, String phoneNo, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;
        this.salary = salary;
    }

    // Method to print member details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone No: " + phoneNo);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    // Constructor
    public Employee(String name, int age, String phoneNo, String address, double salary, String specialization) {
        super(name, age, phoneNo, address, salary);
        this.specialization = specialization;
    }

    // Method to print employee details
    public void printDetails() {
        super.printDetails(); // Call the parent class method
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    String department;

    // Constructor
    public Manager(String name, int age, String phoneNo, String address, double salary, String department) {
        super(name, age, phoneNo, address, salary);
        this.department = department;
    }

    // Method to print manager details
    public void printDetails() {
        super.printDetails(); // Call the parent class method
        System.out.println("Department: " + department);
    }
}

public class MembersMain {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("John Doe", 30, "123-456-7890", "123 Main St", 50000, "Software Engineering");
        
        // Creating a Manager object
        Manager manager = new Manager("Jane Smith", 40, "987-654-3210", "456 Elm St", 80000, "IT Department");
        
        // Printing details of the employee
        System.out.println("Employee Details:");
        employee.printDetails();
        
        System.out.println("\nManager Details:");
        manager.printDetails();
    }
}
