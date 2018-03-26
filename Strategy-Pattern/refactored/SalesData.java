package refactored;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SalesData {

	ReadDataBehavior rdb;
	
	static String fileName;
	static String companyname;
	static ArrayList<Double> dailySales = new ArrayList<>();
	static ArrayList<Double> dailyTaxes = new ArrayList<>();
	static int numDaysOpen;
	static double salesTotal;
	static double taxTotal;
	static double salesAvg;
	static double taxAvg;
	static String longPlusTaxes = "long+taxes";
	static String brief = "brief";
	static String fancy = "fancy";
	
	public static void main(String[] args) {
		
		Company company = new Company();
		RDBComposition rdbcomp = new RDBComposition();
		
		// change RDBFormatOne and RDBFormatTwo at runtime
		rdbcomp.setReadDataBehavior(new RDBFormatTwo());
		try {
			company = rdbcomp.readData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		company.computeSalesAverage();
		company.computeTaxAverage();
		dailySales = company.getDailySales();
		dailyTaxes = company.getDailyTaxes();
		numDaysOpen = company.getNumDaysOpen();
		salesTotal = company.getSalesTotal();
		salesAvg = company.getSalesAvg();
		taxTotal = company.getTaxTotal();
		taxAvg = company.getTaxAvg();
		companyname = company.getCompanyName();
		
		ReportComposition repbehav = new ReportComposition();
		
		// change Short(), Long(), LongPlusTaxes() at runtime
		repbehav.setReportBehavior(new LongPlusTaxes());
		
		// change fancy and brief at runtime
		System.out.println(repbehav.getReport(fancy, company));
		
	}
}