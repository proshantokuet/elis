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
 * Copyright (C) ITECH, University of Washington, Seattle WA.  All Rights Reserved.
 *
 */
package us.mn.state.health.lims.reports.action.implementation;

import us.mn.state.health.lims.common.util.ConfigurationProperties;
import us.mn.state.health.lims.common.util.ConfigurationProperties.Property;

public class HaitiNonConformityBySectionReason extends NonConformityBySectionReason {
	private boolean isLNSP = true;

	public HaitiNonConformityBySectionReason(boolean isLNSP) {
		this.isLNSP = isLNSP;
	}

	@Override
	protected String errorReportFileName() {
		return HAITI_ERROR_REPORT;
	}

	@Override
	protected String getHeaderName() {
		return "HaitiHeader.jasper";
	}

	@Override
	protected void createReportParameters() throws IllegalStateException {
		super.createReportParameters();
		reportParameters.put("supportStudy", "false");
		reportParameters.put("supportService", "false");
		reportParameters.put("supportSiteSubject", "false");
		if (isLNSP) {
			reportParameters.put("siteLogo", useLogo ? "HaitiLNSP.jpg" : null);
			reportParameters.put("labName1", ConfigurationProperties.getInstance().getPropertyValue(Property.SiteName));
			reportParameters.put("labName2", "");
		} else {
			reportParameters.put("siteLogo", useLogo ? "labLogo.jpg" : null);
			reportParameters.put("labName1", ConfigurationProperties.getInstance().getPropertyValue(Property.SiteName));
			reportParameters.put("labName2", " ");
		}
	}
}
