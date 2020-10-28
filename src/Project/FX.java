package Project;

import java.util.ArrayList;
import java.util.Date;

public class FX implements Comparable<FX>{

    public String fromCurrency;
    public String toCurrency;
    public double price;
    private int timestamp;
    private static int timestamp_count = 0;

    public FX(String toCurrency, String fromCurrency, double price) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.price = price;
        this.timestamp = createTimeStamp();
    }

    public static synchronized int createTimeStamp()
    {
        return timestamp_count++;
    }

    public void displayPrice() {
        System.out.println("From Currency = " + fromCurrency);
        System.out.println("To Currency = " + toCurrency);
        System.out.println("Price = " + price);
        System.out.println();
    }




    @Override
    public int compareTo(FX price) {
        if (price.timestamp < this.timestamp) {
            return -1;
        }else if (price.timestamp > this.timestamp) {
            return 1;
        }
        return 0;
    }
}
