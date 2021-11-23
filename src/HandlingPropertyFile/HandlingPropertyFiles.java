package HandlingPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFiles {

	public static void main(String[] args) throws IOException {
//		FileReader fis=new FileReader("./data/commondata.property");
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String un=p.getProperty("username");
		String pwd=p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}
}
