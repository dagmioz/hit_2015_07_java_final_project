package hit_2015_07_java_final_project;

public class WeatherDataServiceException extends Exception
{
//כל בעיה שיש לי והיא לא אקספשן גוואי מובנה ליצור פה אקספשן עצמאי
	private static final long serialVersionUID = 1997753363232807009L;

    public WeatherDataServiceException()

    {}

	
	public WeatherDataServiceException(String message)

    {

        super(message);

    }
	
	public WeatherDataServiceException(Throwable cause)

    {

        super(cause);

    }



    public WeatherDataServiceException(String message, Throwable cause)

    {

        super(message, cause);

    }



    public WeatherDataServiceException(String message, Throwable cause,

                                       boolean enableSuppression, boolean writableStackTrace)

    {

        super(message, cause, enableSuppression, writableStackTrace);

    }
}
