package Project;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class User {

    public long userID;
    public String name;
    public String emailAddress;
    public String phoneNumber;
    public SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.mm.yyyy HH:mm:ss");
    public Date joiningDate;
    private static long idCounter = 1;

    public User() {
    }

    public User(String name, String emailAddress, String phoneNumber) {
        this.userID = createID();
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.joiningDate = new Date();
    }

    public void displayUser() {
        System.out.println("User id = " + userID);
        System.out.println("Name = " + name);
        System.out.println("Email = " + emailAddress);
        System.out.println("Phone number = " + phoneNumber);
        System.out.println("Join date = " + joiningDate);
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeEmail(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void changePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public static synchronized long createID()
    {
        return idCounter++;
    }





}
