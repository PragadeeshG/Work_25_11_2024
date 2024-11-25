package com.test1;

public class LoanIntelligentQuotaListValueScreen {
	private Integer screenId;
	private Integer sourceSystemCode;
	private String federalScheme;
	private String reportingRegime;
	private String revenueService;
	private String actionIds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LoanIntelligentQuotaListValueScreen() {

	}

	public LoanIntelligentQuotaListValueScreen(Integer screenId, Integer sourceSystemCode, String federalScheme,
			String reportingRegime, String revenueService, String actionIds, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.screenId = screenId;
		this.sourceSystemCode = sourceSystemCode;
		this.federalScheme = federalScheme;
		this.reportingRegime = reportingRegime;
		this.revenueService = revenueService;
		this.actionIds = actionIds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Integer getSourceSystemCode() {
		return sourceSystemCode;
	}

	public void setSourceSystemCode(Integer sourceSystemCode) {
		this.sourceSystemCode = sourceSystemCode;
	}

	public String getFederalScheme() {
		return federalScheme;
	}

	public void setFederalScheme(String federalScheme) {
		this.federalScheme = federalScheme;
	}

	public String getReportingRegime() {
		return reportingRegime;
	}

	public void setReportingRegime(String reportingRegime) {
		this.reportingRegime = reportingRegime;
	}

	public String getRevenueService() {
		return revenueService;
	}

	public void setRevenueService(String revenueService) {
		this.revenueService = revenueService;
	}

	public String getActionIds() {
		return actionIds;
	}

	public void setActionIds(String actionIds) {
		this.actionIds = actionIds;
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

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
