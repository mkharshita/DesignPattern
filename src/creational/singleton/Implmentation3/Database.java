package creational.singleton.Implmentation3;

public class Database {

    private static Database instance = new Database();

    private Database(){}

    public static Database getInstance()
    {
        if( instance == null){
            synchronized(instance){
                if(instance == null)
                    instance = new Database();
            }
        }
        return instance;
    }
}
