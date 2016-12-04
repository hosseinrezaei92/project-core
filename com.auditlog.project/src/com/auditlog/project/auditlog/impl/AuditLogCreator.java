package com.auditlog.project.auditlog.impl;


import com.auditlog.project.auditlog.IAuditLogCreator;
import com.auditlog.project.auditlog.IDescription;
import com.auditlog.project.auditlog.IOperation;
import com.auditlog.project.auditlog.entities.AuditLogEntity;
import com.auditlog.project.auditlog.entities.IAuditLogEntity;
import com.auditlog.project.auditlog.service.IAuditLogService;
import com.auditlog.project.locale.HelperI18N;
import com.auditlog.project.user.IUserEntity;

/**
 * @author Hossein
 *
 */
public class AuditLogCreator<T> implements IAuditLogCreator<T>{

	private IAuditLogService service;
	
	public AuditLogCreator(IAuditLogService service) {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unused")
	private static String locale = HelperI18N.LOCALIZATION;

	@Override
	public IAuditLogEntity log(IUserEntity user, IOperation operation, @SuppressWarnings("unchecked") T... object) {
		IAuditLogEntity result = new AuditLogEntity();
		// TODO Auto-generated method stub
		service.insert(result);
		return result;
	}

	@Override
	public IAuditLogEntity log(IUserEntity user, IOperation operation, IDescription description, @SuppressWarnings("unchecked") T... object) {
		IAuditLogEntity result = new AuditLogEntity();
		// TODO Auto-generated method stub
		
		return result;
	}

}
