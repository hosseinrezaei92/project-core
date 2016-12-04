package com.auditlog.project.locale;

import java.io.IOException;
import java.util.MissingResourceException;
import java.util.Properties;

import com.auditlog.project.config.HelperConfig;

public class HelperI18N {
	public static String LOCALIZATION = getLocalization();
	private static Properties LOCALIZATION_PROPERTIES = getLocalizationBundle();

	private static String getLocalization() {
		String localization = null;// en or fa
		try {
			localization = HelperConfig.getInstance().getValue(
					PropertiesName.config, ConfigProp.LOCALE);//$NON-NLS-1$
		} catch (IOException e) {
			System.err.println("Error ! " + e.getMessage());
		}
		return localization;
	}

	private static Properties getLocalizationBundle() {
		try {
			if (LOCALIZATION.equals("fa")) {
				LOCALIZATION_PROPERTIES = HelperConfig.getInstance().readProperties(PropertiesName.I18N_fa);
			} else {
				LOCALIZATION_PROPERTIES = HelperConfig.getInstance().readProperties(PropertiesName.I18N_en);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return LOCALIZATION_PROPERTIES;
	}

	public static String getString(String key) {
		try {
			return (String) LOCALIZATION_PROPERTIES.get(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
