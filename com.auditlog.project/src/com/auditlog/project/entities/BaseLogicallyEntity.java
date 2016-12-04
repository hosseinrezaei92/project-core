package com.auditlog.project.entities;

public class BaseLogicallyEntity<I> extends BaseEntity<I> implements IBaseLogicallyEntity<I> {

	private boolean logicallyDeleted;
	
	@Override
	public boolean isLogicallyDeleted() {
		return logicallyDeleted;
	}

	@Override
	public void setIsLogicallyDeleted(boolean deleted) {
		logicallyDeleted = deleted;
	}
}