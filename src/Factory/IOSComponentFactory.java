package Factory;

import Factory.components.Button.Button;
import Factory.components.Button.IOSButton;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Dropdown.IOSDropdown;
import Factory.components.Menu.IOSManu;
import Factory.components.Menu.Menu;

public class IOSComponentFactory implements UIComponentFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IOSManu();
    }
}
