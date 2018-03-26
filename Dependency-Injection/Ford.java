package injection.dependency;

public class Ford {
	private String typeCar;
	
	public Ford() {
	}
		
	public Ford(String typeCar) {
		this.typeCar = typeCar;
	}
		
	public String getTypeCar() {
		return this.typeCar;
	}
		
	public void setTypeCar(String car) {
		this.typeCar = car;
	}
}
