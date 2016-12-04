package com.auditlog.project.auditlog;

import com.auditlog.project.auditlog.entities.IAuditLogEntity;
import com.auditlog.project.user.IUserEntity;

public interface IAuditLogCreator<T> {

	public IAuditLogEntity log(IUserEntity user, IOperation operation, @SuppressWarnings("unchecked") T... object);

	public IAuditLogEntity log(IUserEntity user, IOperation operation, IDescription description, @SuppressWarnings("unchecked") T... object);

}
