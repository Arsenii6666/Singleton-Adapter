package Task1;

public class Main {
    public static void main(String[] args) {
        User selfUser=new User(1, "Arsenii", "kazymyr.arsenii@ucu.edu.ua", 19);
        User notSelfUser=new User(2, "Oles", "dobosevych@ucu.edu.ua", 31);
        selfUser.save();
        notSelfUser.save();
    }
}