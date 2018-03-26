package refactored;

import java.io.FileNotFoundException;

public class ReportComposition implements ReportBehavior {
	
	private ReportBehavior repb;
	
	public void setReportBehavior(ReportBehavior repb) {
		this.repb = repb;
	}
	
	public String getReport(String hType, Company company) {
		// TODO Auto-generated method stub
		return this.repb.getReport(hType, company);
	}

	public String shortHeader() {
		return this.repb.shortHeader();
	}

	public String fancyHeader() {
		return this.repb.fancyHeader();
	}
}
