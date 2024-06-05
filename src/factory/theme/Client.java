package factory.theme;

import factory.theme.primary.PrimaryTheme;

public class Client {
    public static void main(String[] args) {
        Theme primaryTheme = new PrimaryTheme();
        ThemeComponentFactory componentFactory = primaryTheme.createComponentFactory();
        Button button = componentFactory.createButton();
        Menu menu = componentFactory.createMenu();
    }
}
