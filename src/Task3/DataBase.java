package Task3;

public class DataBase extends БазаДаних implements DataBaseInterface {

    @Override
    public String getUserData() {
        return super.отриматиДаніКористувача();
    }

    @Override
    public String getStaticData() {
        return super.отриматиСтатистичніДані();
    }
}
