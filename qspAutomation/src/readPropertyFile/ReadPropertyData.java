package readPropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");
		Properties prop=new Properties();
		
		prop.load(fis);
		String un = prop.getProperty("username");
		System.out.println(un);
		
		String pass = prop.getProperty("password");
		System.out.println(pass);
		
		String Browser = prop.getProperty("browser");
		System.out.println(Browser);

	}

}
