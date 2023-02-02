package designPattern.factory;

import designPattern.factory.components.button.Button;
import designPattern.factory.components.dropdown.DropDown;
import designPattern.factory.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();
}
