package com.auditlog.project.locale;

import java.net.URL;

import com.auditlog.project.config.HelperTypeMode;
import com.auditlog.project.config.IProperties;

public enum PropertiesName implements IProperties{
	config,
	audit_config,
	I18N_en,
	I18N_fa;

	@Override
	public String getAddress() {
		String propertiesAddress=null;
		if(HelperTypeMode.getInstance().getTypeMode().equals(ETypeMode.dev)){
			URL url = this.getClass().getProtectionDomain().getCodeSource().getLocation();
			propertiesAddress = url.toString();
			propertiesAddress = propertiesAddress.substring(6, propertiesAddress.length()-1);
		}
		return propertiesAddress;
	}

}
