package Factory;

import Factory.components.Button.Button;
import Factory.components.Button.IOSButton;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Dropdown.IOSDropdown;
import Factory.components.Menu.Menu;

public interface UIComponentFactory {  //Factory to produce Product
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
