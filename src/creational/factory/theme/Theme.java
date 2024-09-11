package creational.factory.theme;

//Step - 1 : Create Parent Class
//Step - 2 : Create SubClass
//Step - 3 : Create component creational.factory
//Step - 4 : Add Factory Method
public abstract class Theme {
    private String name;
    private String primaryColor;
    private String authorName;

    // Factory of factories - Abstract Factory
    public abstract ThemeComponentFactory createComponentFactory();
}
