package refactored;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RDBFormatTwo implements ReadDataBehavior {
	String fileName = "../CA3/refactored/bb.txt";
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
		while(input.hasNextLine()) {
			String day = input.nextLine();
			String[] tokens = day.split("\t");
			if(tokens.length==2) {
				numDaysOpen++;
				dailySales.add(Double.parseDouble(tokens[0]));
				dailyTaxes.add(Double.parseDouble(tokens[1]));
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
