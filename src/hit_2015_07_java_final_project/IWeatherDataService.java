package hit_2015_07_java_final_project;
import java.io.IOException;
import org.json.JSONException;
public interface IWeatherDataService 
{
    public WeatherData getWeatherData(Location location) throws WeatherDataServiceException, JSONException, IOException;;
    //���� �� ����� ��� �"� ������ ��� ���� ����� ������ �������
    //�������� ��� ������� ����� ����� �� ���� ������� ����� ���� �� �����
    //���������� ��� ����� ��� ������, ������ ����� �� ���� ���������� ���
    	
}
