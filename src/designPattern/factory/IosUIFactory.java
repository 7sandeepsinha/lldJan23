package designPattern.factory;

import designPattern.factory.UIFactory;
import designPattern.factory.components.button.Button;
import designPattern.factory.components.button.IosButton;
import designPattern.factory.components.dropdown.DropDown;
import designPattern.factory.components.dropdown.IosDropDrown;
import designPattern.factory.components.menu.IosMenu;
import designPattern.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDrown();
    }
}
