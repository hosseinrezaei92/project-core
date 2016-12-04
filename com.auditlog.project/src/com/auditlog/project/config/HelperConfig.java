package com.auditlog.project.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.auditlog.project.locale.ETypeMode;

public class HelperConfig {

	private static volatile HelperConfig instance=null;

	private HelperConfig() {
	}
	
	public static HelperConfig getInstance(){
		if(instance==null){
			synchronized (HelperConfig.class) {
				if(instance==null){
					instance = new HelperConfig();
				}
			}
		}
		return instance;
	}
	
	public Properties readProperties(IProperties propertiesName) throws IOException{
		
		Properties properties = new Properties();
		String propertiesAddress = getPropertiesAddress(propertiesName);
		FileInputStream in = new FileInputStream(propertiesAddress);
		properties.load(in);
		in.close();
		return properties;
	}
	
	public void updateValue(IProperties propertiesName, String key, String newValue) throws IOException{

		Properties properties  = readProperties(propertiesName);
		if(properties.containsKey(key)){
			String propertiesAddress = getPropertiesAddress(propertiesName);
			FileOutputStream out = new FileOutputStream(propertiesAddress);
			properties.setProperty(key, newValue);
			properties.store(out, null);
			out.close();
		}else{
			System.err.println("Error ! the key is not exist !");
		}
		
	}
	
	public String getValue(IProperties propertiesName, String key) throws IOException{
		Properties properties  = readProperties(propertiesName);
		String value=null;
		if(properties.containsKey(key)){
			value = (String)properties.get(key);
		}else{
			System.err.println("Error ! the key is not exist !");
		}
		return value;
	}
	
	private String getPropertiesAddress(IProperties propertiesName) {
		String currentPath;
		String sourceFolderAddress;
		String absolutePropertiesName = propertiesName.toString()+".properties";
		
		if(HelperTypeMode.getInstance().getTypeMode().equals(ETypeMode.dev)){
			currentPath = propertiesName.getAddress();
			sourceFolderAddress = ConfigResourceAddress.RESOURSE_ADDRESS_DEV_MODE;
		}else{
			currentPath = System.getProperty("user.dir");
			sourceFolderAddress = ConfigResourceAddress.RESOURSE_ADDRESS_BUILD_MODE;
		}
		
		String PropertiesAddress = currentPath + sourceFolderAddress + absolutePropertiesName;
		return PropertiesAddress;
	}
	
}
