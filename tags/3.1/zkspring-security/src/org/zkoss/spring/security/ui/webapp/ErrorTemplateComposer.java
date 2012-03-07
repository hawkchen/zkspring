/* ErrorTemplateComposer.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Oct 7, 2008 5:53:46 PM, Created by henrichen
}}IS_NOTE

Copyright (C) 2008 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.spring.security.ui.webapp;

//import org.springframework.security.ui.AccessDeniedHandlerImpl;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;

/**
 * Controller codes for /web/zul/zkspring/security/errorTemplate.zul
 * @author henrichen
 * @since 1.0
 */
public class ErrorTemplateComposer extends GenericForwardComposer {
	//override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		session.setAttribute(AccessDeniedHandlerImpl.SPRING_SECURITY_ACCESS_DENIED_EXCEPTION_KEY, 
				arg.get(AccessDeniedHandlerImpl.SPRING_SECURITY_ACCESS_DENIED_EXCEPTION_KEY));
	}
	public void onClose() {
		session.removeAttribute(AccessDeniedHandlerImpl.SPRING_SECURITY_ACCESS_DENIED_EXCEPTION_KEY);
	}
}

