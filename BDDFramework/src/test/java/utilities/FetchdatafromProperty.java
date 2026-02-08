package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants.Constantsdata;

public class FetchdatafromProperty
{
	public static Properties ReadDataFromProperty() throws IOException
	{
		FileReader reader = new FileReader(Constantsdata.PropFilePath);
		Properties prop = new Properties();
		prop.load(reader);
		return prop;
	}
}
