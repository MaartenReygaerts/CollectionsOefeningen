package Queue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueApp {
    public static void main(String[] args) {

        Collection<BurgerOrder> orderList = new PriorityQueue<>();


        orderList.add(new BurgerOrder("CheeseBurger"));
        orderList.add(new BurgerOrder("ChickenBurger"));
        orderList.add(new BurgerOrder("FishBurger"));
        orderList.add(new BurgerOrder("BickyBurger"));

        System.out.println(orderList.toString());


    }
}
