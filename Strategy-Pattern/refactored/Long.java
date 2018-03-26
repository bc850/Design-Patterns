package refactored;

public class Long implements ReportBehavior {

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
		line = String.format("Total Taxes: $%,.2f\n", company.getTaxTotal());
		rpt.append(line);
		line = String.format("Average Taxes: $%,.2f\n", company.getTaxAvg());
		rpt.append(line);
		rpt.append("\nSales:\n");
		int i=1;
		for(double sales : company.getDailySales()) {
			rpt.append(String.format("$%,.2f ", sales));
			if(i%5==0) rpt.append("\n");
			i++;
		}
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
