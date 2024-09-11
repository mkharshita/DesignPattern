package creational.factory.theme.primary;

import creational.factory.theme.Theme;
import creational.factory.theme.ThemeComponentFactory;

public class PrimaryTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new PrimaryThemeFactory();
    }
}
