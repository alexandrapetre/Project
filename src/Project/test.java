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


    }
}
