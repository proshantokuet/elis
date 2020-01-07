<%@ page language="java"
	contentType="text/html; charset=utf-8"
	import="java.util.Date,
	us.mn.state.health.lims.common.action.IActionConstants" %>

<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/labdev-view" prefix="app" %>

<bean:define id="formName" value='<%= (String)request.getAttribute(IActionConstants.FORM_NAME) %>' />

<%!

String allowEdits = "true";

%>

<%
if (request.getAttribute(IActionConstants.ALLOW_EDITS_KEY) != null) {
 allowEdits = (String)request.getAttribute(IActionConstants.ALLOW_EDITS_KEY);
}

%>

<script language="JavaScript1.2">
function validateForm(form) {
    return validateSourceOfSampleForm(form);
}
</script>

<table>
		<tr>
						<td class="label">
							<bean:message key="sourceofsample.id"/>:
						</td>	
						<td> 
							<app:text name="<%=formName%>" property="id" allowEdits="false"/>
						</td>
		</tr>
		<tr>
						<td class="label">
							<bean:message key="sourceofsample.description"/>:<span class="requiredlabel">*</span>
						</td>	
						<td> 
    						<%--bugzilla 1393 increase size to 40--%>
							<html:text name="<%=formName%>" property="description" size="40"/>
						</td>
		 </tr>
 		<tr>
						<td class="label">
							<bean:message key="sourceofsample.domain"/>:<span class="requiredlabel">*</span>
						</td>	
						<td> 
					   	<html:select name="<%=formName%>" property="domain">
					   	  <app:optionsCollection 
										name="<%=formName%>" 
							    		property="domains" 
										label="code" 
										value="code"  
							   			allowEdits="true"
							/>
                        
					   </html:select>

						</td>
		</tr>
 		<tr>
		<td>&nbsp;</td>
		</tr>
</table>

<html:javascript formName="sourceOfSampleForm"/>

