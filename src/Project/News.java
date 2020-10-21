package Project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class News {
    private String author;
    private String title;
    private String text;
    private String tags;
    private String publishTime;
    private int amountOfStory;
    private int storyID;


    public News() {
        // I have set a format type in which publishTime will be recorded.
            this.publishTime = null;
            this.storyID = 0;
            this.author = null;
            this.title = null;
            this.text = null;
            this.tags = null;
            this.amountOfStory = 0;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public int getAmountOfStory() {
        return amountOfStory;
    }

    public void setAmountOfStory(int amountOfStory) {
        this.amountOfStory = amountOfStory;
    }

    public int getStoryID() {
        return storyID;
    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    @Override
    public String toString() {
        return "News{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", tags='" + tags + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", amountOfStory=" + amountOfStory +
                ", storyID=" + storyID +
                '}';
    }
}
