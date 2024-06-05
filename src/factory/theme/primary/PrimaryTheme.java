package factory.theme.primary;

import factory.theme.Theme;
import factory.theme.ThemeComponentFactory;

public class PrimaryTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new PrimaryThemeFactory();
    }
}
