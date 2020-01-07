/*
* The contents of this file are subject to the Mozilla Public License
* Version 1.1 (the "License"); you may not use this file except in
* compliance with the License. You may obtain a copy of the License at
* http://www.mozilla.org/MPL/ 
* 
* Software distributed under the License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
* License for the specific language governing rights and limitations under
* the License.
* 
* The Original Code is OpenELIS code.
* 
* Copyright (C) The Minnesota Department of Health.  All Rights Reserved.
*/
package us.mn.state.health.lims.common.exception;


/**
 * benzd1
 * Base exception used by the LIMS. Unless special handling can be done with an
 * exception, errors should throw this exception. In the UI portion of the
 * application, this base exception can be caught and an error page displayed.
 * 
 * Specialized exceptions should extend this class.
 */
//bugzilla 2393
public class LIMSCannotCreateXMLException extends LIMSException {
	public LIMSCannotCreateXMLException(String message) {
		super(message);
	}
}