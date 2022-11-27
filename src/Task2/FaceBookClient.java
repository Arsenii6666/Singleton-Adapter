package Task2;

import java.time.LocalDate;

public class FaceBookClient implements Client{
    public FacebookUser user;
    public FaceBookClient(FacebookUser user){
        this.user=user;
    }
    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getUserActiveTime();
    }
}
