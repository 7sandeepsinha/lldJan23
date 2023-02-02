package designPattern.factory;

import designPattern.factory.components.button.Button;
import designPattern.factory.components.dropdown.DropDown;
import designPattern.factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.WINDOWS);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        Button button= uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();
    }
}

//TODO: add a new platform for MAC
