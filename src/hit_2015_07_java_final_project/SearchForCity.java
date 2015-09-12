package hit_2015_07_java_final_project;

import org.json.JSONException;

public class SearchForCity {
	public WeatherData runSearchForCity(Location loc) throws JSONException, Exception
	{
		WeatherDataServiceFactory run = WeatherDataServiceFactory.getInstancec();
		
		String url = WeatherDataServiceFactory.OPEN_WEATHER_MAP;
		 @SuppressWarnings("static-access")
		 IWeatherDataService service= run.getWeatherData(url+loc.getCity()+","+loc.getCountry()+"&units=metric&type=accurate");
		 
		 WeatherData data = service.getWeatherData(loc);
		 System.out.println(data.toString());
		return data;
		
	}

}
