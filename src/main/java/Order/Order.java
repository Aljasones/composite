package Order;

import Menu.Menu;
import Waiter.Waiter;

import java.util.List;

public interface Order {
    Waiter getWaiter();
    List<Menu> getMenuList();

}
