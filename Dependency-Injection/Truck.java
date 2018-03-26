package injection.dependency;

public class Truck implements TruckSetter {
	private Ford fordTruck;
	
	public Truck() {
	}

	@Override
	public void setTruck(Ford fordTruck) {
		this.fordTruck = fordTruck;
	}
	
	public String viewCars() {
		System.out.println(fordTruck.getTypeCar());
		return fordTruck.getTypeCar();
	}
}
