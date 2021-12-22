package org.gargi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.gargi.model.Company;

public class Assignment {
	public static void main(String[] args) throws IOException {
		Assignment test=new Assignment();
		test.execute();
	}
	Assignment(){/*
		List<Company> companyList=new ArrayList<Company>();
		for(int i=1; i<=10; i++) {
			Company c1 = new Company(new Random().nextInt(10),new Random().nextInt(10)%2==0?true:false);
			companyList.add(c1);
			
		}
		companyList.add(new Company(288.723861d, true));
		stockPriceOrderAsc(companyList);
		stockPriceOrderDesc(companyList);
		stockPriceRoseToday(companyList,Boolean.TRUE);
		stockPriceRoseToday(companyList,Boolean.FALSE);
		searchStockPriceRoseToday(companyList, 288.723861d);*/
	}
	
	public void execute() throws NumberFormatException, IOException {
		List<Company> companyList=new ArrayList<Company>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter no of the companies");
        int companyCount = Integer.parseInt(reader.readLine());

        for(int i=1; i<=companyCount; i++) {        	
        	System.out.println("Enter current stock price of company "+i);
        	double stockPrice=Double.parseDouble(reader.readLine());
        	System.out.println("Whether company's stock price rose today compare to yesterday?");
        	boolean stockPriceRosrToday=Boolean.parseBoolean(reader.readLine());
        	Company company=new Company(stockPrice,stockPriceRosrToday);
        	companyList.add(company);
        }
        while(true) {
        printLine();
        System.out.println("Enter the operation that you want to perform");
        System.out.println("1. Display the companies stock price in ascending order");
        System.out.println("2. Display the companies stock price in descending order");
        System.out.println("3. Display the total no of companies for which stock price rose today");
        System.out.println("4. Display the total no of companies for which stock price declined today");
        System.out.println("5. Search a specific stock price");
        System.out.println("6. press 0 to exit");
        printLine();
        int selected = Integer.parseInt(reader.readLine());
        switch(selected) {
        case 1: stockPriceOrderAsc(companyList);
        	 	break;
        case 2: stockPriceOrderDesc(companyList);
	 			break;
        case 3: stockPriceRoseToday(companyList,Boolean.TRUE);
	 			break;
        case 4: stockPriceRoseToday(companyList,Boolean.FALSE);
	 			break;
        case 5: System.out.println("enter the key value");
        		double stockPriceToBeSearched=Double.parseDouble(reader.readLine());
        		searchStockPriceRoseToday(companyList,stockPriceToBeSearched);
	 			break;
        case 0: System.out.println("Exit successfully");
        		System.exit(0);       
	 			break;
        default:System.out.println("Please enter a valid input");  
        }
        }
        
        
	}
	
	public void displayAllCompanies(List<Company> companyList) {
		companyList.forEach(System.out::println);
	}
	public void printLine() {
		 System.out.println("\n-------------------------------------------------\n");
	}
	public void stockPriceOrderAsc(List<Company> companyList) {
		System.out.println("Stock price in ascending order are :");
		companyList.stream().sorted(Comparator.comparing(Company::getStockPrice)).forEach(company->System.out.print(company+" "));
	}
	public void stockPriceOrderDesc(List<Company> companyList) {
		System.out.println("Stock price in descending order are :");
		companyList.stream().sorted(Comparator.comparing(Company::getStockPrice).reversed()).forEach(company->System.out.print(company+" "));
	}
	public void stockPriceRoseToday(List<Company> companyList,boolean flag) {		
		String check = flag==Boolean.TRUE?"rose":"declined";
		long count=companyList.stream().filter(predicate->predicate.isStockPriceRosrToday()==flag).count();
		System.out.println("Total no of companies for whose stock price "+check+" today :"+count);
	}
	public void searchStockPriceRoseToday(List<Company> companyList, double stockPriceToBeSearched) {
		Optional<Company> companyOptional=companyList.stream().filter(predicate->Double.compare(predicate.getStockPrice(), stockPriceToBeSearched)==0).findAny();
		if(companyOptional.isPresent()) {
			System.out.println("Stock of value "+companyOptional.get()+" is present");
		}else {
			System.out.println("Value not found");
		}
	}
}
