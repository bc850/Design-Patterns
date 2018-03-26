package refactored;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RDBFormatOne implements ReadDataBehavior {
	String fileName = "../CA3/refactored/liard.txt";
	String companyName;
	int numDaysOpen;
	ArrayList<Double> dailySales = new ArrayList<>();
	ArrayList<Double> dailyTaxes = new ArrayList<>();
	
	public Company readData() throws FileNotFoundException {
		File inFile = new File(fileName);
		Scanner input = new Scanner( inFile );
		int numDays = 0;
		companyName = input.nextLine();
		input.nextLine();
		input.nextLine();
		while(input.hasNextLine()) {
			String day = input.nextLine();
			String[] tokens = day.split("\t");
			if(tokens.length==2) {
				numDaysOpen++;
				double salesAndTax = Double.parseDouble(tokens[1]);
				double sales = salesAndTax/1.07;
				sales = Math.round(sales*100.0)/100.0;
				double tax = sales*0.07;
				tax = Math.round(tax*100.0)/100.0;
				double discrepancy = sales+tax-salesAndTax;
				tax -= discrepancy;
				dailySales.add(sales);
				dailyTaxes.add(tax);
			}
		}
		input.close();
		Company company = new Company();
		company.setDailySales(dailySales);
		company.setDailyTaxes(dailyTaxes);
		company.setNumDaysOpen(numDaysOpen);
		company.setCompanyName(companyName);
		return company;
	}
}
