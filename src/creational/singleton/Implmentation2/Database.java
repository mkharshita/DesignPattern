package creational.singleton.Implmentation2;

public class Database {

    private static Database instance = new Database();

    private Database(){}

    //Syncronized public static Database getInstance()
    public static Database getInstance()
    {
        return instance;
    }
}
