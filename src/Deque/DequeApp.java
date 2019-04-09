package Deque;

import java.util.ArrayDeque;
import java.util.Deque;
public class DequeApp {
    public static void main(String[] args) {
        Deque<String> persons = new ArrayDeque<>();

        persons.offerFirst("Maarten");
        persons.offerFirst("Mathias");
        persons.offerLast("Karen");
        persons.offerLast("Joke Schauvliege");
        persons.offerLast("Swaggy De Block");
        while(persons.size()>=2) {
            System.out.printf("%s + %s%n", persons.pollFirst() , persons.pollLast());
        }
        if(persons.size() == 1) {
            System.out.printf("Left over: %s%n", persons.pollFirst());
        }
    }
}
