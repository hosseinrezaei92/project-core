package com.auditlog.project.config;

import com.auditlog.project.locale.ETypeMode;


public class HelperTypeMode {
	private static volatile HelperTypeMode instance=null;

	private HelperTypeMode() {
	}
	
	public static HelperTypeMode getInstance(){
		if(instance==null){
			synchronized (HelperTypeMode.class) {
				if(instance==null){
					instance = new HelperTypeMode();
				}
			}
		}
		return instance;
	}
	
	public ETypeMode getTypeMode(){
		return ConfigTypeMode.TYPE_MODE;
	}
}
