package Opdracht1;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {

        //Maak een programma dat de gebruiker om een aantal getallen vraagt. Gebruik hiervoor de klasse Scanner met haar methode nextInt().
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();


        System.out.println("Geef een getal in :");

        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());


        System.out.println("De lijst:");
        System.out.println(list);

        //sum van de getallen in de list
        int sum = list.stream()
                .mapToInt(a -> a)
                .sum();
        System.out.println("Sum is " + sum);

        //gemiddelde zoeken
        OptionalDouble average = list.stream()
                .mapToDouble(value -> value)
                .average();
        System.out.println("Average is " + average);
    }
}
