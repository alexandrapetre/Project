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

    }
}
