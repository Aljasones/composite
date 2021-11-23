package Order;

import Menu.Menu;
import Waiter.Waiter;

import java.util.List;

public class OrderImpl implements Order {
    private Waiter waiter;
    private List<Menu> orderedPosition;

    public OrderImpl(Waiter waiter, List<Menu> orderedPosition) {
        this.orderedPosition = orderedPosition;
        this.waiter = waiter;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public List<Menu> getMenuList() {
        return orderedPosition;
    }

    public String showOrder() {
        return "Waiter " + waiter.getName() +
                "menu " + orderedPosition.toString();
    }
}
