package com.test1;

public class LoanIntelligentQuotaListValueCategory {
	private String loanIqSourceSystemValueCatCode;
	private String loanIqSourceSystemValueCatName;
	private String loanIqSourceSystemValueCatDescription;
	private String loanIqSourceSystemValueCatDefinition;
	private long authorizerId;
	private String owner;
	private String psIds;
	private long serviceNameId;
	private String creationDate;
	private String modifiedDate;

	public LoanIntelligentQuotaListValueCategory() {

	}

	public LoanIntelligentQuotaListValueCategory(String loanIqSourceSystemValueCatCode,
			String loanIqSourceSystemValueCatName, String loanIqSourceSystemValueCatDescription,
			String loanIqSourceSystemValueCatDefinition, long authorizerId, String owner, String psIds,
			long serviceNameId, String creationDate, String modifiedDate) {
		super();
		this.loanIqSourceSystemValueCatCode = loanIqSourceSystemValueCatCode;
		this.loanIqSourceSystemValueCatName = loanIqSourceSystemValueCatName;
		this.loanIqSourceSystemValueCatDescription = loanIqSourceSystemValueCatDescription;
		this.loanIqSourceSystemValueCatDefinition = loanIqSourceSystemValueCatDefinition;
		this.authorizerId = authorizerId;
		this.owner = owner;
		this.psIds = psIds;
		this.serviceNameId = serviceNameId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public String getLoanIqSourceSystemValueCatCode() {
		return loanIqSourceSystemValueCatCode;
	}

	public void setLoanIqSourceSystemValueCatCode(String loanIqSourceSystemValueCatCode) {
		this.loanIqSourceSystemValueCatCode = loanIqSourceSystemValueCatCode;
	}

	public String getLoanIqSourceSystemValueCatName() {
		return loanIqSourceSystemValueCatName;
	}

	public void setLoanIqSourceSystemValueCatName(String loanIqSourceSystemValueCatName) {
		this.loanIqSourceSystemValueCatName = loanIqSourceSystemValueCatName;
	}

	public String getLoanIqSourceSystemValueCatDescription() {
		return loanIqSourceSystemValueCatDescription;
	}

	public void setLoanIqSourceSystemValueCatDescription(String loanIqSourceSystemValueCatDescription) {
		this.loanIqSourceSystemValueCatDescription = loanIqSourceSystemValueCatDescription;
	}

	public String getLoanIqSourceSystemValueCatDefinition() {
		return loanIqSourceSystemValueCatDefinition;
	}

	public void setLoanIqSourceSystemValueCatDefinition(String loanIqSourceSystemValueCatDefinition) {
		this.loanIqSourceSystemValueCatDefinition = loanIqSourceSystemValueCatDefinition;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPsIds() {
		return psIds;
	}

	public void setPsIds(String psIds) {
		this.psIds = psIds;
	}

	public long getServiceNameId() {
		return serviceNameId;
	}

	public void setServiceNameId(long serviceNameId) {
		this.serviceNameId = serviceNameId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
