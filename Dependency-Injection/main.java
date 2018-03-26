package injection.dependency;

public class main {

	public static void main(String[] args) {
		Ford f1 = new Ford("This is a Ford Mustang car.");
		Ford f2 = new Ford("This is a Ford Focus car.");
		Ford f3 = new Ford("This is a Ford Fiesta car.");
		
		Car car1 = new Car(f1);
		Car car2 = new Car(f2);
		Car car3 = new Car(f3);
		
		car1.viewCars();
		car2.viewCars();
		car3.viewCars();
		
		Ford f4 = new Ford("This is a Ford Explorer.");
		
		Suv suv1 = new Suv();
		suv1.setCar(f4);
		
		suv1.viewCars();
		
		Ford f5 = new Ford("This is a Ford F-150 truck.");
		Ford f6 = new Ford("This is a Ford F-250 diesel truck.");
		
		Truck truck1 = new Truck();
		Truck truck2 = new Truck();
		
		truck1.setTruck(f5);
		truck2.setTruck(f6);
		
		truck1.viewCars();
		truck2.viewCars();
	}

}
