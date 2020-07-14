import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class PropertyReader {

	private String propertyPath="config.properties";
	Properties properties;
	
	public PropertyReader() throws IOException
	{
		BufferedReader reader= new BufferedReader(new FileReader(propertyPath));
		properties = new Properties();
		properties.load(reader);
		reader.close();
	}
	
	public String getDriverPath()
	{
		String driverpath=properties.getProperty("driverPath");
		if(driverpath!=null)
		return driverpath;
		else
			throw new RuntimeException("driverPath not specified in property file");
		
	}
	public String getURL()
	{
		String url=properties.getProperty("url");
		if(url!=null)
		return url;
		else
			throw new RuntimeException("url not specified in property file");
		
	}
}
