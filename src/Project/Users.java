package Project;

import java.util.ArrayList;
import java.util.Date;

public class Users {

    public ArrayList<User> users = new ArrayList<>();

    public Users() {
    }

    public void addNewUserProfile(String name, String emailAddress, String phoneNumber)
    {
       User new_user = new User(name, emailAddress, phoneNumber);
       this.users.add(new_user);
    }


    public void displayAllUsers(){
        for(int i = 0; i < users.size(); i++) {
           users.get(i).displayUser();
           System.out.println();
        }
    }


    public void displayUserProfile(long userID) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userID == userID) {
                users.get(i).displayUser();
                break;
            }
        }
    }

    public void changeUserName(long userID, String newName) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userID == userID) {
                users.get(i).changeName(newName);
                break;
            }
        }
    }

    public void changeUserEmail(long userID, String newEmailAddress) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userID == userID) {
                users.get(i).changeEmail(newEmailAddress);
                break;
            }
        }
    }

    public void changeUserPhoneNumber(long userID, String newPhoneNumber) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userID == userID) {
                users.get(i).changePhoneNumber(newPhoneNumber);
                break;
            }
        }
    }
}
