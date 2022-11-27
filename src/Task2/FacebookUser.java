package Task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

enum Country {
    Ukraine, USA, Poland;
}


@AllArgsConstructor
public class FacebookUser {
    String getEmail(){
        return email;
    }
    Country getUserCountry(){
        return userCountry;
    }
    LocalDate getUserActiveTime(){
        return getUserActiveTime;
    }
    private String email;
    private Country userCountry;
    private LocalDate getUserActiveTime;
}
