package com.auditlog.project.user;

import java.util.HashMap;
import java.util.Map;

import com.auditlog.project.entities.BaseLogicallyEntity;
import com.auditlog.project.entities.ICompairator;

public class UserEntity extends BaseLogicallyEntity<String> implements IUserEntity,ICompairator{

	private String name;
	private String family;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getFamily() {
		return family;
	}

	@Override
	public void setFamily(String family) {
		this.family = family;		
	}

	//we need Map<T,T> !!
	@Override
	public Map<Object, Object> compareTo(Object o) {
		Map<Object, Object> differencesField = new HashMap<Object, Object>();
		if(o instanceof UserEntity){
			String nameCacheValue = getName().toUpperCase();
			String nameNewValue = ((UserEntity)o).getName().toUpperCase();
			String familyCacheValue = getFamily().toUpperCase();
			String familyNewValue = ((UserEntity)o).getFamily().toUpperCase();

			if(!nameCacheValue.equals(nameNewValue)){
				differencesField.put(NAME, "The value of "+NAME+" "+nameCacheValue+" change to "+nameNewValue);
			}
		    if(!familyCacheValue.equals(familyNewValue)){
		    	differencesField.put(FAMILY, "the old calue is "+familyCacheValue+"and the new value is"+familyNewValue);
		    }
		    //For base entity should be implements this method for their fields too!!
		}else{
			//TODO suitable message!
		}
		return differencesField;
	}

}
