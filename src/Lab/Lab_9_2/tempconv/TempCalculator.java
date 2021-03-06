package Lab.Lab_9_2.tempconv;
/** TempCalculator models conversion between Celsius and Fahrenheit */ 
public class TempCalculator { 
	
	/** celsiusIntoFahrenheit translates degrees Celsius into Fahrenheit
	 * @param c - the degrees in Celsius
	 * @return the equivalent degrees in Fahrenheit */ 
	public double celsiusIntoFahrenheit(double c) { 
		return ((9.0/5.0) * c) + 32; 
	}

	/** fahrenheitIntoCelsius translates degrees Fahrenheit into Celsius 
	 * @param f - the degrees in Fahrenheit
	 * @return the equivalent degrees in Celsius */
	public double fahrenheitIntoCelsius(double f) { 
		return (f - 32) * (5.0/9.0); 
	}
}