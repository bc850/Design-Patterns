import java.util.Observable;

public class WeatherStation extends Observable {
	private String weather;
	
	public WeatherStation(String weather) {
		this.weather = weather;
	}
	
	public String getWeather() {
		return weather;
	}
	
	public void setWeather(String weather) {
		this.weather = weather;
		setChanged();
		notifyObservers();
	}
}
