package refactored;

public interface ReportBehavior {
	public String getReport(String hType, Company company);
	public String shortHeader();
	public String fancyHeader();
}
