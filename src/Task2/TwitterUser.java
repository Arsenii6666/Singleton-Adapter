package Task2;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public class TwitterUser {
    String getCountry(){
        return country;
    }
    String getUserMail(){
        return userMail;
    }
    String getLastActiveTime(){
        return lastActiveTime;
    }
    private String userMail;
    private String country;
    private String lastActiveTime;
}
