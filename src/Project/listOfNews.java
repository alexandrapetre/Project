package Project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class listOfNews {
    private ArrayList<String> listOfTags;
    private ArrayList<News> stories;
    private int storyAmount;

    public listOfNews() {
        this.listOfTags = new ArrayList<>();
        this.stories = new ArrayList<>();
        this.storyAmount = 0;
    }

    //addStory - String author, String title, String text, String tags
    //Adds new story to the system with given author, title, text
    //and tags. It should use current time as story publish time and also generate a unique
    //identifier for each added story.
    //This function returns the news object.
    public News addStory(News n,String author, String title, String text, String tags){
        //This stores the current date when this story was added.
        Date currentDate = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        //Every story added the current amountOfStory is recorded to the storyID.
        //++ goes first because it needs to be added straight away.
        n.setStoryID(++this.storyAmount);
        n.setAuthor(author);
        n.setTitle(title);
        n.setText(text);
        n.setTags(tags);
        //Here I format the current date and store it in the publishTime
        //This will be the time the book is published, when it is added to the system.
        n.setPublishTime(df.format(currentDate));
        //This increments the amount of story added to the system
        n.setAmountOfStory(this.storyAmount);

        return n;
    }



    //markStoryAsRead - int storyID
    //Marks the stories that have been read once
    //displayTopTenNews - no parameters
    //Prints top 10 stories (Author, title and text formatted nicely) based on the numbers of times they were read
    //Order from most read to least read
    //displayStoriesForAuthor - String Author
    //Prints all the stories for a given author (Author, title and text formatted nicely)
    //displayStoriesWithTags - List listOfTags
    //Prints all stories which has one or more of the given tags in the list.
    //Also, the order of the stories take into account how many tags have been matched
    //(The more tags matched, the higher up the story should be)
    //Print (Author, title and text formatted nicely)
}