package injection.dependency;

public class Car {
	
	//dependency
	//Ford fordCar = new Ford("This is a Ford Mustang car.");
	
	Ford fordCar; // removed the "new" operator
		
	public Car(Ford fordCar) {
		this.fordCar = fordCar;
	}
	
	public String viewCars() {
		System.out.println(fordCar.getTypeCar());
		return fordCar.getTypeCar();
	}
}
