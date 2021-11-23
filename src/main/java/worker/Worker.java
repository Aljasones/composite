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
        menu.add(HotFood.Builder.newInstance("carbonara", 50)
                .description("some desc")
                .build());
        menu.add(DrinkFood.Builder.newInstance("coffee", 20)
                .description("some desc")
                .build());
        Order order = new OrderImpl(new Waiter(), menu, 1);

        System.out.println("Order: " + order.showOrder());
    }
}
