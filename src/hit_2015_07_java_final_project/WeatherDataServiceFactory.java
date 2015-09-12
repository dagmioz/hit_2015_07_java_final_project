package hit_2015_07_java_final_project;

public class WeatherDataServiceFactory 
{
	public static final String OPEN_WEATHER_MAP = "http://api.openweathermap.org/data/2.5/weather?q=";
	
	private static WeatherDataServiceFactory firstInstance = null;
	private WeatherDataServiceFactory(){ }
	public static WeatherDataServiceFactory getInstancec()
	{
		if(firstInstance == null)
		{
			firstInstance = new WeatherDataServiceFactory();
		}
		return firstInstance;
	}
	
	public static  IWeatherDataService getWeatherData(String url){
    	if(url.contains(OPEN_WEATHER_MAP)){
    		try{
    		 WeatherDataServiceGetCurrentData wd = new WeatherDataServiceGetCurrentData();
    		 wd.setUrl(url);
            return wd ;
    		}catch(Exception e){
    			e.printStackTrace();
    		}
         }
		return null;
    }
}
