//package hit_2015_07_java_final_project;
//
//import java.sql.Date;
//import java.text.SimpleDateFormat;
//
//public class ConvertUnixToGMT {
//	long unixSeconds = 1372339860;
//	Date date = new Date(unixSeconds*1000L); // *1000 is to convert seconds to milliseconds
//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z"); // the format of your date
//	sdf.setTimeZone(TimeZone.getTimeZone("GMT+2")); // give a timezone reference for formating (see comment at the bottom
//	String formattedDate = sdf.format(date);
//	System.out.println(formattedDate);
//
//}

