package Task3;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization авторизація = new Authorization();
        if (авторизація.авторизуватися(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
