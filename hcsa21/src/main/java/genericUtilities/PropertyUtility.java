package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
public String readingDataFromPropertyFile(String Key) throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/credentials.properties");
	Properties property=new Properties();
	property.load(fis);
	String value = property.getProperty(Key);
	return value;
}
}
