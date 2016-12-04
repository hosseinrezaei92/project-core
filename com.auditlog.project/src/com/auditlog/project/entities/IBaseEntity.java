package com.auditlog.project.entities;

import java.util.Date;

public interface IBaseEntity<I> extends IBaseEntityConstants {

	public I getId();

	public void setId(I id);

	public Date getCreationDate();

	public void setCreationDate(Date creationDate);

	public Date getValidTo();

	public void setValidTo(Date validTo);
	
}
