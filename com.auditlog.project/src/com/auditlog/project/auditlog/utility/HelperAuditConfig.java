package com.auditlog.project.auditlog.utility;

import java.io.IOException;
import java.util.Properties;

import com.auditlog.project.config.HelperConfig;
import com.auditlog.project.locale.PropertiesName;

public class HelperAuditConfig {

	private static HelperAuditConfig INSTANCE;

	private Properties auditProperties;

	private HelperAuditConfig() throws IOException{
		auditProperties =  HelperConfig.getInstance().readProperties(PropertiesName.audit_config);
	}
	
	public static HelperAuditConfig getInstance() throws IOException{
		if(INSTANCE == null){
			synchronized (HelperAuditConfig.class) {
				if(INSTANCE == null){
					INSTANCE = new HelperAuditConfig();
				}
			}
		}
		return INSTANCE;
	}
	
	
	public Properties getAuditProperties(){
		return auditProperties;
	}
}
