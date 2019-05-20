package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.google.common.base.CharMatcher;

import base.base;

public class commonMethods extends base{
	
	public Properties readProperties() throws IOException
	{
		FileReader reader = new FileReader("C:\\eclipse-workspace\\Zoopla\\src\\configFiles\\config.properties");
		Properties prop = new Properties();
		prop.load(reader);
		return prop;
	}
	
	public String changeToDigit(String word)
	{
		String result = CharMatcher.digit().retainFrom(word);
		return result;
	}

}
