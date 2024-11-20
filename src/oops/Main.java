//package oops;
//
// class  {
//	// Base class
//	class Member {
//		String name;
//		int age;
//		String phoneNo;
//		String address;
//		double salary;
//
//		public Member(String name, int age, String phoneNo, String address, double salary) {
//			this.name = name;
//			this.age = age;
//			this.phoneNo = phoneNo;
//			this.address = address;
//			this.salary = salary;
//		}
//
//		public void printDetails() {
//			System.out.println("Name: " + name);
//			System.out.println("Age: " + age);
//			System.out.println("Phone No: " + phoneNo);
//			System.out.println("Address: " + address);
//			System.out.printf("Salary: $%.2f%n", salary);
//		}
//	}
//
//	// Derived class for Employee
//	class Employee extends Member {
//		String specialization;
//
//		public Employee(String name, int age, String phoneNo, String address, double salary, String specialization) {
//			super(name, age, phoneNo, address, salary);
//			this.specialization = specialization;
//		}
//
//		@Override
//		public void printDetails() {
//			super.printDetails();
//			System.out.println("Specialization: " + specialization);
//		}
//	}
//
//	class Manager extends Member {
//		String department;
//
//		public Manager(String name, int age, String phoneNo, String address, double salary, String department) {
//			super(name, age, phoneNo, address, salary);
//			this.department = department;
//		}
//
//		public void printDetails() {
//			super.printDetails();
//			System.out.println("Department: " + department);
//		}
//	}
//
//	public class Main {
//		public static void main(String[] args) {
//
//       Employee employee = new Employee("John Doe", 30, "123-456-7890", "123 Main St", 5000.0, "Software Engineering");
//			// Manager manager = new Manager("Bob", 40, "987-654-3210", "456 Oak St", 80000,
//			// "Project Management");
//
//			System.out.println("Employee Details:");
//			// employee.printDetails();
//
//			System.out.println("\nManager Details:");
//			// manager.printDetails();
//		}
//	}
//}
