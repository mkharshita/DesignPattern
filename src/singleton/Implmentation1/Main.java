package singleton.Implmentation1;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        RandomClass random = new RandomClass();
    }
}
/*
    Solution for Concurrency
        - Use Syncronized for getInstance() (Issue with the performance occurs).
        - Eager Loading
            i.e private static Database instance = new Database(); (Issue if it is never required,
                                                                    if need to pass some parameters)
        - Double checking locked.
        - Serialization
 */
