package HandlingPropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data {
	public static void main(String[] args)throws IOException {
		FileInputStream fis=new FileInputStream("./data/PropertyFile.property");
		Properties p=new Properties();
		p.load(fis);
		System.out.println(p.getProperty("pwd"));
	}
}
