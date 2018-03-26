
public class MainClass {

	public static void main(String[] args) {
		String eightyFiveAndSunny = "85 Degrees and Sunny!";
		String thirtyFiveAndRaining = "35 Degrees and Raining.";
		
		WeatherStation ws = new WeatherStation(eightyFiveAndSunny);
		
		TallahasseeWCTV tTV = new TallahasseeWCTV();
		AlbanyWALB aTV = new AlbanyWALB();
		
		ws.addObserver(tTV);
		ws.addObserver(aTV);
		
		ws.setWeather(thirtyFiveAndRaining);
		
		ws.deleteObserver(tTV);
		
		ws.setWeather(eightyFiveAndSunny);
	}

}
