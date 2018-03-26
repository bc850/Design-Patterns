package refactored;

public class Short implements ReportBehavior {

	String compname;
	
	public String getReport(String hType, Company company) {
		compname = company.getCompanyName();
		StringBuilder rpt = new StringBuilder();
		if(hType.equals("brief"))
			rpt.append(shortHeader());
		else if(hType.equals("fancy"))
			rpt.append(fancyHeader());
		rpt.append("Day Open: " + company.getNumDaysOpen() + "\n");
		String line = String.format("Total Sales: $%,.2f\n", company.getSalesTotal());
		rpt.append(line);
		line = String.format("Average Sales: $%,.2f\n", company.getSalesAvg());
		rpt.append(line);
		return rpt.toString();
	}

	public String shortHeader() {
		StringBuilder rpt = new StringBuilder();
		rpt.append("Company: " + compname + "\n");
		return rpt.toString();
	}

	public String fancyHeader() {
		String rpt;
		
		rpt = "*********************************\n";
		rpt += "* Company: " + compname + "\n";
		rpt += "*********************************\n";
		return rpt;
	}

}
