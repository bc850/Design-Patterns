package injection.dependency;

public class Suv {
	Ford fordCar;
	
	public Suv() {	
	}
	
	public void setCar(Ford fordCar) {
		this.fordCar = fordCar;
	}
	
	public String viewCars() {
		System.out.println(fordCar.getTypeCar());
		return fordCar.getTypeCar();
	}
}
