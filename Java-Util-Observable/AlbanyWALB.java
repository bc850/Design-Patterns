import java.util.Observable;
import java.util.Observer;

public class AlbanyWALB implements Observer {
	private WeatherStation station;
	
	public void update(Observable o, Object arg) {
		station = (WeatherStation) o;
		System.out.println("Albany WALB got the weather: " + station.getWeather());
	}
}
