package Hashset;

import java.util.*;

public class AppHashSet {
    public static void main(String[] args) {

      //Gebruik in dit programma nu een HashSet
        Scanner input = new Scanner(System.in);
        Collection<Integer> list = new HashSet<>();


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


