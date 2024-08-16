package Factory;
import Factory.components.Button.AndriodButton;
import Factory.components.Button.Button;
import Factory.components.Button.IOSButton;
import Factory.components.Dropdown.AndriodDropdown;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Dropdown.IOSDropdown;
import Factory.components.Menu.AndriodMenu;
import Factory.components.Menu.IOSManu;
import Factory.components.Menu.Menu;

public class AndroidComponentFactory implements UIComponentFactory {


    @Override
    public Button createButton() {
        return new AndriodButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndriodDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IOSManu();
    }
}
