package com.auditlog.project.auditlog.impl;

import com.auditlog.project.auditlog.IOperation;

public enum DefaultAuditLogOperation implements IOperation{

	save, update, delete, read;

	
}
