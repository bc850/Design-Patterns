package refactored;

import java.util.ArrayList;

public class Company {
	
	ArrayList<Double> dailySales = new ArrayList<>();
	ArrayList<Double> dailyTaxes = new ArrayList<>();
	int numDaysOpen;
	double salesTotal;
	double taxTotal;
	double salesAvg;
	double taxAvg;
	String companyname;
	
	public ArrayList<Double> getDailySales() {
		return this.dailySales;
	}
	
	public ArrayList<Double> getDailyTaxes() {
		return this.dailyTaxes;
	}
	
	public int getNumDaysOpen() {
		return this.numDaysOpen;
	}
	
	public double getSalesTotal() {
		return this.salesTotal;
	}
	
	public double getSalesAvg() {
		return this.salesAvg;
	}
	
	public double getTaxTotal() {
		return this.taxTotal;
	}
	
	public double getTaxAvg() {
		return this.taxAvg;
	}
	
	public String getCompanyName() {
		return this.companyname;
	}
	
	public void setDailySales(ArrayList<Double> dailySales) {
		this.dailySales = dailySales;
	}
	
	public void setDailyTaxes(ArrayList<Double> dailyTaxes) {
		this.dailyTaxes = dailyTaxes;
	}
	
	public void setNumDaysOpen(int numDaysOpen) {
		this.numDaysOpen = numDaysOpen;
	}
	
	public void setCompanyName(String companyname) {
		this.companyname = companyname;
	}
	
	public void computeSalesAverage() {
		double sum = 0.0;
		for(double sales : dailySales) {
			sum += sales;
		}
		salesTotal = sum;
		salesAvg = sum/numDaysOpen;
	}

	public void computeTaxAverage() {
		double sum = 0.0;
		for(double sales : dailyTaxes) {
			sum += sales;
		}
		taxTotal = sum;
		taxAvg = sum/numDaysOpen;
	}
}
