package oops;

public class Vehicle {
		    public void drive() {
		        System.out.println("Driving a vehicle");
		    }
		}

		class Car extends Vehicle {
		    @Override
		    public void drive() {
		        System.out.println("repairing a car");
		    }
		
		    public static void main(String[] args) {
		        Vehicle myVehicle = new Vehicle();
		        myVehicle.drive(); 

		        Car myCar = new Car();
		        myCar.drive(); 
		    }
	}


