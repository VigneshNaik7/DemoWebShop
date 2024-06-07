package GenericPackages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements FrameWorkConstant{
	public String ToReadDataFromPropertyFile( String key) throws IOException {
		FileInputStream fis = new FileInputStream(propertyfile);
		Properties p = new Properties();
		p.load(fis);
		
		String value= p.getProperty(key);
		
		return value;
		
	}
	
}
