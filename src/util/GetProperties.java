package util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties {
	public GetProperties(){}
	public static String GetValueByKey(String path, String key){
		// TODO Auto-generated method stub
		String result="";
		//result String
		File proPerty =new File(path);
		//property file
		InputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(proPerty));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties p=new Properties();
		try {
			p.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result=p.getProperty(key);
		return result;
	}
	
	
}
