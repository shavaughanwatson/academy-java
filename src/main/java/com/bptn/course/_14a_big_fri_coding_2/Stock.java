package com.bptn.course._14a_big_fri_coding_2;

public class Stock {

	// Create instance variables
	private String tickerSymbol;
	private String companyName;
	private int price;
	private double percentChange;
	private int totalShares;
	private long marketCap;

	// Constructor
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickerSymbol;
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0;
		this.marketCap = totalShares * price;
	}

	// Create the methods
	public void adjustPrice(int change) {
		int newPrice = this.price + change;
		this.price = newPrice;

		double newPercentage = (double) change / this.price * 100;
		this.percentChange = newPercentage;

		long newMarketCap = this.price * this.totalShares;
		this.marketCap = newMarketCap;
	}

	public String toString() {
		String stockInfo = "Ticker Symbol: " + this.tickerSymbol.toUpperCase() + "\n" + "Company: " + this.companyName
				+ "\n" + "Current Price: " + "$" + this.price + " (" + this.percentChange + "%" + ")" + "\n"
				+ "Market Cap: " + "$" + this.marketCap;
		return stockInfo;
	}

	// Don't modify the code below:
	public static void main(String[] args) {
		Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
		System.out.println(stock);
		stock.adjustPrice(20);
		System.out.println(stock);
	}
}
