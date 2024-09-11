package creational.factory.theme.dark;

import creational.factory.theme.Theme;
import creational.factory.theme.ThemeComponentFactory;

public class DarkTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new DarkThemeFactory();
    }
}
