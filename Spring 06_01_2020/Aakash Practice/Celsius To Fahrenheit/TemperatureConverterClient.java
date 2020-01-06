package springDI;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

import springDI.TemperatureConverter;

public class TemperatureConverterClient {
	public static void main(String args[]) throws Exception {
		Resource res =new ClassPathResource("practice.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		TemperatureConverter temp = 
				(TemperatureConverter) 
				factory.getBean("temperatureConverter");//java.lang.Object
		double fahrenheit = temp.celsiusToFahrenheit(24.0);
		System.out.println("24 degree celsius is "+fahrenheit+" degree fahrenheit");
	}
}
