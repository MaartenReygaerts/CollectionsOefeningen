package Opdracht5;

import java.util.*;

public class QueueApp {
    public static void main(String[] args) {

        Comparator<BurgerOrder> nameOrder = Comparator.comparing(BurgerOrder::getName);
        Comparator<BurgerOrder> numberOrder = Comparator.comparing(BurgerOrder::getNumber);

        Queue<BurgerOrder> burgers = new PriorityQueue<>();


        burgers.add(new BurgerOrder("CheeseBurger",1));
        burgers.add(new BurgerOrder("ChickenBurger",20));
        burgers.add(new BurgerOrder("FishBurger",3));
        burgers.add(new BurgerOrder("BickyBurger",4));

        System.out.println(burgers.toString());


    }
}
