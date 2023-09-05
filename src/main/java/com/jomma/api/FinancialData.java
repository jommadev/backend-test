package com.jomma.api;

public class FinancialData {
    private String prodName;
    private double lastValue;
    private double yearToDate;

    // Constructor with parameters
    public FinancialData(String prodName, double lastValue, double yearToDate) {
        this.prodName = prodName;
        this.lastValue = lastValue;
        this.yearToDate = yearToDate;
    }

    // Getter and setter methods
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getLastValue() {
        return lastValue;
    }

    public void setLastValue(double lastValue) {
        this.lastValue = lastValue;
    }

    public double getYearToDate() {
        return yearToDate;
    }

    public void setYearToDate(double yearToDate) {
        this.yearToDate = yearToDate;
    }
}
