package Project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FXPrices {

    public ArrayList<FX> prices = new ArrayList<>();

    public FXPrices() {
    }

    public void addForeignExchangeValue(String toCurrency, String fromCurrency, double price) {
        FX new_fx = new FX(toCurrency, fromCurrency, price);
        prices.add(new_fx);
    }

    public void TopMostRecentPricesForCurrencyPair(String fromCurrency, String toCurrency, int numberOfPrices) {
        ArrayList<FX> mostRecent = new ArrayList<>();

        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i).fromCurrency.equals(fromCurrency) && prices.get(i).toCurrency.equals(toCurrency)) {
                mostRecent.add(prices.get(i));
            }
        }

        Collections.sort(mostRecent);

        System.out.println();
        System.out.println("Top " + String.valueOf(numberOfPrices) + " Most Recent Prices For Currency Pair ");
        System.out.println();


        for (int i = 0; i < numberOfPrices; i++)  {
            mostRecent.get(i).displayPrice();
        }
    }

    public void displayPrices(ArrayList<FX> prices) {
        for (int i = 0; i < prices.size(); i++) {
            prices.get(i).displayPrice();
        }

    }

    public void displayTop10RecentPrices() {
        Collections.sort(prices);

        for (int i = 0; i < 10; i++) {
            prices.get(i).displayPrice();
        }

    }
}
