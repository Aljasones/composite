package worker;

import Menu.*;

import Order.Order;
import Order.OrderImpl;
import Waiter.*;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    public void doOrder() {
        List<Menu> menu = new ArrayList<Menu>();
        menu.add(new HotFood());
        menu.add(new DrinkFood());
        Order order = new OrderImpl(new Waiter(), menu);
    }
}
