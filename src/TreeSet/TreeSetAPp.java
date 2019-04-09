package TreeSet;

import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetAPp {
    public static void main(String[] args) {

        Collection<String> list = new TreeSet<>();

        Scanner input = new Scanner(System.in);

        boolean end = false;
        while (!end) {
            System.out.println("Geef een woord in: ");
            String zin = input.next();
            list.add(zin);
            System.out.println(list);
            if (zin.endsWith(".")) {
                end = true;
            }

        }
        System.out.println(list);

        System.out.println(((TreeSet<String>) list).first());
        System.out.println(((TreeSet<String>) list).last());
    }
}
