package com.auditlog.project.user;

import com.auditlog.project.entities.IBaseLogicallyEntity;

public interface IUserEntity extends IBaseLogicallyEntity<String>, IUserEntityConstant{
	public String getName();
	public void setName(String name);
	public String getFamily();
	public void setFamily(String family);
}
