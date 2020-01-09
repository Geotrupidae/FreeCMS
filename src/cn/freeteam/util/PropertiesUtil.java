package cn.freeteam.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * 工具类
 * @author freeteam
 *
 */
public class PropertiesUtil {

	//获取配置文件的配置
	public static String getConfig(String path,String name){
		InputStream sins=null;
		String value="";
//		String propertirsPath = PropertiesUtil.class.getClassLoader().getResource(path).getPath();
		try {
			Properties loginprop = new Properties();
			sins = PropertiesUtil.class.getClassLoader().getResourceAsStream(path);
			loginprop.load(sins);
			value=loginprop.getProperty(name);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (sins!=null) {
		        try {
					sins.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return value;
		}
	}
}
