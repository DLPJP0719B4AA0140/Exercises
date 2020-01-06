package springDI;

import springDI.TemperatureConverter;



public class TemperatureConverterImpl implements TemperatureConverter {
	
	private double celsius;
	public TemperatureConverterImpl(double celsius) {
		System.out.println("TemperatureConverterImpl() double Parameter");
		this.celsius = celsius;
	}
	
	
	

	
	public double celsiusToFahrenheit(double celsius) {
		System.out.println("celsiusToFahrenheit()");		
		return ((celsius*1.8)+32);
	}
}