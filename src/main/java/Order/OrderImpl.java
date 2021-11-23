package Order;

import Menu.Menu;
import Waiter.Waiter;

import java.util.List;

public class OrderImpl implements Order {
    private int tableNumber;
    private Waiter waiter;
    private List<Menu> orderedPosition;

    public OrderImpl(Waiter waiter, List<Menu> orderedPosition, int number) {
        this.tableNumber = number;
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
        return "Table " + tableNumber +
               "Waiter " + waiter.getName() +
               "menu " + orderedPosition.toString();
    }

    public void deleteMenuFromOrder() {
        orderedPosition.clear();
    }

    public void addToMenuFromOrder(Menu val) {
        orderedPosition.add(val);
    }

    public int getBill() {
        int result = 0;

        for (Menu m : orderedPosition) {
            result = result + m.getPrice();
        }
        return result;
    }
}
