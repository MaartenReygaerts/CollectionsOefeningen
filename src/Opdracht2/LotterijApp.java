package Opdracht2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class LotterijApp {
    public static void main(String[] args) {

        Collection<Integer> listPlayer = new HashSet<>();
        Collection<Integer> listComputer = new HashSet<>();

        listPlayer.add(1);
        listPlayer.add(23);
        listPlayer.add(44);
        listPlayer.add(35);
        listPlayer.add(12);
        listPlayer.add(5);


        Random rand = new Random();

        while (listComputer.size() <= 6) {
            int randomGetal = rand.nextInt(45) + 1;
            listComputer.add(randomGetal);

        }

        System.out.println("PlayerList" + listPlayer);
        System.out.println("ComputerList" + listComputer);

        listPlayer.retainAll(listComputer);
        System.out.println(listPlayer);




    }
}
