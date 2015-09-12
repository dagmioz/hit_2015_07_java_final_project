package hit_2015_07_java_final_project;
import java.io.IOException;
import org.json.JSONException;
public interface IWeatherDataService 
{
    public WeatherData getWeatherData(Location location) throws WeatherDataServiceException, JSONException, IOException;;
    //חושף רק מתודה אחת ע"פ החתימה שלה ניתן לראות שמקבלת לוקיישן
    //הלוקיישן הוא אובייקט גוואי שיודע גם לקבל אובייקט גוואי ולפי זה לפעול
    //האינטרפייס הוא הממשק לכל המערכת, המערכת תעבוד על גביי האינטרפייס הזה
    	
}
