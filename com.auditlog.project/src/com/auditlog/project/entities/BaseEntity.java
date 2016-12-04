package com.auditlog.project.entities;

import java.util.Date;

public class BaseEntity<I> implements IBaseEntity<I> {

	private I id;
	
	private Date creationDate;
	
	private Date validTo;
	
	@Override
	public I getId() {
		return id;
	}

	@Override
	public void setId(I id) {
		this.id = id;
	}

	@Override
	public Date getCreationDate() {
		return creationDate;
	}

	@Override
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public Date getValidTo() {
		return validTo;
	}

	@Override
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

}
