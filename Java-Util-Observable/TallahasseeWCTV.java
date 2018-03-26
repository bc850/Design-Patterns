import java.util.Observable;
import java.util.Observer;

public class TallahasseeWCTV implements Observer {
	private WeatherStation station;
	
	public void update(Observable o, Object arg) {
		station = (WeatherStation) o;
		System.out.println("Tallahassee WCTV got the weather: " + station.getWeather());
	}
}
