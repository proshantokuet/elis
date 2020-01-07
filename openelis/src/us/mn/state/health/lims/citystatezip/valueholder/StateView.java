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
package us.mn.state.health.lims.citystatezip.valueholder;

import us.mn.state.health.lims.common.valueholder.BaseObject;

public class StateView extends BaseObject  {

	private String state;
	
	public StateView() {
		super();
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

}
