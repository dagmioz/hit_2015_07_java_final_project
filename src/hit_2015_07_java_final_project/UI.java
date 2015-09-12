package hit_2015_07_java_final_project;

import java.awt.EventQueue;

import org.json.JSONException;

import javax.imageio.ImageIO;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import javax.swing.JTextPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import java.awt.Color;

public class UI 
{

	private JFrame frame;
	private JTextField CitySearchTextBox;
	private JLabel CityNameLable;
	private JLabel CountryLable;
	private JLabel WeatherConditionLable;
	private JLabel AvarageMaximumTemperatureLable;
	WeatherData weatherData = new WeatherData();
	
	String[] splits;
	String message= "";
	Location location = new Location();
	private JLabel CountryNameFromJSON;
	private JLabel WeatherConditionFromJSON;
	private JLabel AvarageMaximumTemperatureFromJSON;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public UI() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setForeground(Color.WHITE);
	//	JLabel label = new JLabel((Icon) new ImageIcon(ImageIO.read(new File("C:\\Users\\Oz\\Dropbox\\Java Project's\\Java-SE\\hit_2015_07_java_final_project\\download.jpg"))));
	//	getFrame().setContentPane(label);
		frame.setBounds(100, 100, 922, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToWeather = new JLabel("Welcome To Weather Station");
		lblWelcomeToWeather.setBounds(251, 11, 196, 14);
		frame.getContentPane().add(lblWelcomeToWeather);
		
		CitySearchTextBox = new JTextField();
		CitySearchTextBox.setText("Type Here the City Name You Want To Search");
		CitySearchTextBox.setBounds(335, 41, 261, 20);
		frame.getContentPane().add(CitySearchTextBox);
		CitySearchTextBox.setColumns(10);
		
		JButton SearchButton = new JButton("Search");
		
		SearchButton.setBounds(606, 40, 89, 23);
		frame.getContentPane().add(SearchButton);
		
		CityNameLable = new JLabel("City Name");
		CityNameLable.setBounds(494, 86, 154, 14);
		frame.getContentPane().add(CityNameLable);
		
		CountryLable = new JLabel("Country");
		CountryLable.setBounds(494, 111, 129, 14);
		frame.getContentPane().add(CountryLable);
		
		WeatherConditionLable = new JLabel("WeatherCondition");
		WeatherConditionLable.setBounds(494, 129, 172, 14);
		frame.getContentPane().add(WeatherConditionLable);
		
		AvarageMaximumTemperatureLable = new JLabel("Avarage Maximum Temperature");
		AvarageMaximumTemperatureLable.setBounds(494, 179, 196, 14);
		frame.getContentPane().add(AvarageMaximumTemperatureLable);
		
		JLabel CityNameFromJSON = new JLabel("");
		CityNameFromJSON.setBounds(712, 86, 148, 14);
		frame.getContentPane().add(CityNameFromJSON);
		CityNameFromJSON.setText(weatherData.getCity());
		
		CountryNameFromJSON = new JLabel("");
		CountryNameFromJSON.setBounds(712, 111, 46, 14);
		frame.getContentPane().add(CountryNameFromJSON);
		CountryNameFromJSON.setText(weatherData.getCountry());
		
		WeatherConditionFromJSON = new JLabel("");
		WeatherConditionFromJSON.setBounds(712, 129, 148, 14);
		frame.getContentPane().add(WeatherConditionFromJSON);
		WeatherConditionFromJSON.setText(weatherData.getWeather_desc());
		
		AvarageMaximumTemperatureFromJSON = new JLabel("");
		AvarageMaximumTemperatureFromJSON.setBounds(712, 179, 46, 14);
		frame.getContentPane().add(AvarageMaximumTemperatureFromJSON);
		AvarageMaximumTemperatureFromJSON.setText(weatherData.getAvg_max_temp());
		
		JLabel AvarageCurrentTemperatureLable = new JLabel("Avarage Current Temperature");
		AvarageCurrentTemperatureLable.setBounds(494, 154, 186, 14);
		frame.getContentPane().add(AvarageCurrentTemperatureLable);
		
		JLabel AvarageCurrentTemperatureFromJson = new JLabel("");
		AvarageCurrentTemperatureFromJson.setBounds(712, 154, 46, 14);
		frame.getContentPane().add(AvarageCurrentTemperatureFromJson);
		
		JLabel AvarageMinimumTempretureLable = new JLabel("Avarage Minimum Tempreture");
		AvarageMinimumTempretureLable.setBounds(494, 204, 186, 14);
		frame.getContentPane().add(AvarageMinimumTempretureLable);
		
		JLabel AvarageMinimumTempretureFromJson = new JLabel("");
		AvarageMinimumTempretureFromJson.setBounds(712, 204, 46, 14);
		frame.getContentPane().add(AvarageMinimumTempretureFromJson);
		
		JLabel HumidityLable = new JLabel("Humidity");
		HumidityLable.setBounds(494, 229, 156, 14);
		frame.getContentPane().add(HumidityLable);
		
		JLabel HumidityFromJson = new JLabel("");
		HumidityFromJson.setBounds(712, 229, 46, 14);
		frame.getContentPane().add(HumidityFromJson);
		
		JLabel WindSpeedLable = new JLabel("Wind Speed");
		WindSpeedLable.setBounds(494, 254, 154, 14);
		frame.getContentPane().add(WindSpeedLable);
		
		JLabel WindSpeedFromJson = new JLabel("");
		WindSpeedFromJson.setBounds(712, 254, 46, 14);
		frame.getContentPane().add(WindSpeedFromJson);
		
		SearchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String CityName = CitySearchTextBox.getText();
				location.setCity(CityName);
			
			SearchForCity runSearch = new SearchForCity();
			try
			{
			weatherData = runSearch.runSearchForCity(location);
			CityNameFromJSON.setText(weatherData.getCity());
			CountryNameFromJSON.setText(weatherData.getCountry());
			WeatherConditionFromJSON.setText(weatherData.getWeather_desc());
			AvarageCurrentTemperatureFromJson.setText(weatherData.getAvg_current_temp()+" C");
			AvarageMaximumTemperatureFromJSON.setText(weatherData.getAvg_max_temp()+" C");
			AvarageMinimumTempretureFromJson.setText(weatherData.getAvg_min_temp()+" C");
			HumidityFromJson.setText(weatherData.getHumidity()+" %");
			WindSpeedFromJson.setText(weatherData.getWind_speed()+" Km");
			}
			catch (JSONException e1)
			{
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
				
		}
	public JFrame getFrame() {
		return frame;
	}
	}
