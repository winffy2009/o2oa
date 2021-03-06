package com.x.attendance.assemble.control.jaxrs.attendanceappealinfo.exception;

import com.x.base.core.project.exception.PromptException;

public class ExceptionAttendanceAppealNotExists extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionAttendanceAppealNotExists( String id ) {
		super("员工打卡申诉信息不存在！ID:" + id );
	}
}
