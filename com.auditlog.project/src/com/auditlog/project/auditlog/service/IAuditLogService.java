package com.auditlog.project.auditlog.service;

import com.auditlog.project.auditlog.entities.IAuditLogEntity;

public interface IAuditLogService {
	public void insert(IAuditLogEntity auditLogEntity);
}
