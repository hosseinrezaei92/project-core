package com.auditlog.project.entities;

public interface IBaseLogicallyEntity<I> extends IBaseEntity<I>, IBaseLogicallyEntityConstants {

	public boolean isLogicallyDeleted();

	public void setIsLogicallyDeleted(boolean deleted);

}
