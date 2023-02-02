package designPattern.factory.components;

import designPattern.factory.UIFactory;
import designPattern.factory.components.button.Button;
import designPattern.factory.components.button.WindowsButton;
import designPattern.factory.components.dropdown.DropDown;
import designPattern.factory.components.dropdown.WindowsDropdown;
import designPattern.factory.components.menu.Menu;
import designPattern.factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropdown();
    }
}
