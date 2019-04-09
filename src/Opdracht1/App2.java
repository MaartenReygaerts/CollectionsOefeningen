package Opdracht1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        boolean end = false;
        while (!end) {
            System.out.println("Geef een woord in: ");
            String zin2 = input.next();
            list.add(zin2);
            System.out.println(list);
            if (zin2.endsWith(".")) {
                end = true;
            }

        }
        System.out.println("***** Druk de zin in omgekeerde volgore af. ******");
        for (int i =0,j=list.size()-1;i<j;i++){
            list.add(i,list.remove(j));
        }
        //Collections.reverse(list);
        System.out.println("***** Na de reverse for-loop *****");
        System.out.println(list);

        System.out.println("***** Count van elementen in de list *****");
        int count = list.size();
        System.out.println(count);
        System.out.println("***** verzameling opsommen in strings *****");
        Collections.reverse(list);
       Stream.of(list).forEach(System.out::println);

        list.stream().forEach(System.out::println);
    }
}
