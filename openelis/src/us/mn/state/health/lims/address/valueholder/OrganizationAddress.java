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
* Copyright (C) CIRG, University of Washington, Seattle WA.  All Rights Reserved.
*
*/
package us.mn.state.health.lims.address.valueholder;

import org.apache.commons.validator.GenericValidator;

import us.mn.state.health.lims.common.valueholder.BaseObject;

public class OrganizationAddress extends BaseObject {

	private static final long serialVersionUID = 1L;

	private AddressPK compoundId = new AddressPK();
	private String type;
	private String value;
	private String uniqueIdentifyer;

	public AddressPK getCompoundId() {
		return compoundId;
	}
	public void setCompoundId(AddressPK compoundId) {
		uniqueIdentifyer = null;
		this.compoundId = compoundId;
	}

	public String getId(){
		return compoundId == null ? "0" : compoundId.getTargetId() + compoundId.getAddressPartId();
	}

	public void setOrganizationId(String organizationId){
		uniqueIdentifyer = null;
		compoundId.setTargetId(organizationId);
	}

	public String getOrganizationId(){
		return compoundId == null ? null : compoundId.getTargetId();
	}

	public void setAddressPartId(String addressPartId){
		uniqueIdentifyer = null;
		compoundId.setAddressPartId(addressPartId);
	}

	public String getAddressPartId(){
		return compoundId == null ? null : compoundId.getAddressPartId();
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public void setUniqueIdentifyer(String uniqueIdentifyer) {
		this.uniqueIdentifyer = uniqueIdentifyer;
	}
	public String getUniqueIdentifyer() {
		if( GenericValidator.isBlankOrNull(uniqueIdentifyer)){
			uniqueIdentifyer = getOrganizationId() + "-" + getAddressPartId();
		}

		return uniqueIdentifyer;
	}
}

