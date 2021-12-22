package org.gargi.model;

public class Company {
	private double stockPrice;
	private boolean stockPriceRosrToday;

	public Company(double stockPrice, boolean stockPriceRosrToday) {
		super();
		this.stockPrice = stockPrice;
		this.stockPriceRosrToday = stockPriceRosrToday;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public boolean isStockPriceRosrToday() {
		return stockPriceRosrToday;
	}

	public void setStockPriceRosrToday(boolean stockPriceRosrToday) {
		this.stockPriceRosrToday = stockPriceRosrToday;
	}
	/*
	 * @Override public String toString() { return "Company [stockPrice=" +
	 * stockPrice + ", stockPriceRosrToday=" + stockPriceRosrToday + "]"; }
	 */

	@Override
	public String toString() {
		return String.valueOf(stockPrice);
	}

}
