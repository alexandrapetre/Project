package Project;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        // Created a new object array of news
        ArrayList<News> list = new ArrayList<>();
        //Initialize News class as an object
        News news = new News();
        //Initialize newsList class as an object
        listOfNews newsList = new listOfNews();

        //Adding a story to the news section
        list.add(newsList.addStory(news,"Tom Ellis " ,"Lucifer","Devol comes to earth","Netflix, Devil, Holy"));
        System.out.println(list.toString());

        System.out.println();
        System.out.println("-----------------------------------");

        Users users = new Users();

        users.addNewUserProfile("User_1", "user_1@gmail.com", "+40722556677");
        users.addNewUserProfile("User_2", "user_2@gmail.com", "+40721711998");
        users.addNewUserProfile("User_3", "user_3@gmail.com", "+40722556699");
        users.addNewUserProfile("User_4", "user_4@gmail.com", "+40721718930");

        users.displayAllUsers();

        users.changeUserName(1, "User_7");
        users.changeUserEmail(1, "user_7@gmail.com");
        users.changeUserPhoneNumber(1, "+40731888444");
        users.displayUserProfile(1);

        System.out.println();
        System.out.println("-----------------------------------");

        FXPrices prices = new FXPrices();

        prices.addForeignExchangeValue("EUR", "USD", 0.85);
        prices.addForeignExchangeValue("EUR", "GBP", 1.10);
        prices.addForeignExchangeValue("USD", "GBP", 1.29);
        prices.addForeignExchangeValue("RON", "GBP", 5.39);
        prices.addForeignExchangeValue("INR", "EUR", 87.23);
        prices.addForeignExchangeValue("AUD", "EUR", 1.66);
        prices.addForeignExchangeValue("GBP", "AUD", 1.84);
        prices.addForeignExchangeValue("INR", "EUR", 87.70);
        prices.addForeignExchangeValue("USD", "INR", 0.013);
        prices.addForeignExchangeValue("GBP", "CAD", 1.72);
        prices.addForeignExchangeValue("CAD", "EUR", 1.56);
        prices.addForeignExchangeValue("GBP", "CAD", 1.55);
        prices.addForeignExchangeValue("AUD", "EUR", 1.85);
        prices.addForeignExchangeValue("INR", "EUR", 87.89);
        prices.addForeignExchangeValue("INR", "EUR", 87.67);
        prices.addForeignExchangeValue("INR", "EUR", 87.50);

        prices.displayTop10RecentPrices();
        prices.TopMostRecentPricesForCurrencyPair("EUR", "INR", 3);


        System.out.println();
        System.out.println("-----------------------------------");
    }
}
