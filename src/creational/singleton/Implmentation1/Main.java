package creational.singleton.Implmentation1;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        RandomClass random = new RandomClass();
    }
}
/*
Creational DP:
{
    Singleton
    Builder
    Prototype
    Factory -> Practical Factory, Factory Method, Abstract Factory
}
1. How will an object be created
2. Where will an object be created
3. How many objects will be created

Structural DP:
{
    Adapter
}
1. How will a class be Structured.
2. How many attributes will be there in a class.
3. How will I talk to 3rd party class.

Behavioural DP:
1. How do classes interact with each other to implement behaviour
2. How is a particular behaviour implemented.
 */

/*
Singleton:
    class for which at max only one object can be created.
    why?
        1. A class whose all objects have to share a common resource.
        2. creation of object can be expensive
        3. class that must be common for everyone in my codebase
    Implementations:
    1. simple
    2. syncronized method
    3. Eager loading
    4. Double check locking (using syncronized)
        {but this break singleton when i am using serializing, so ue enum to create singleton }

    Cons:
    1. When I am doing unit testing, need to mock some attributes/methods with singleton it is not possible
        - many testin frameworks inherit a class to it.
        - some of the time singleton are immutable

     Where to used:
     1. In web framework
        Controller, service, repositories

 */


/*
    Solution for Concurrency
        - Use Syncronized for getInstance() (Issue with the performance occurs).
        - Eager Loading
            i.e private static Database instance = new Database(); (Issue if it is never required,
                                                                    if need to pass some parameters)
        - Double checking locked.
        - Serialization
 */
