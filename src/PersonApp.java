import java.util.Collection;
import java.util.HashSet;

public class PersonApp {
    public static void main(String[] args) {

       Collection<Person> list = new HashSet<>();
       Person person = new Person("Maarten","Reygaerts","Man",21,72,186);
       Person person2 = new Person("Mathias","Limbourg","Undefined",22,95,182);
       Person person3 = new Person("Brecht","rechtsVanMij","Man",30,80,183);
       Person person4 = new Person("Brecht","rechtsVanMij","Man",30,80,183);
       Person person5 = new Person("Brecht","rechtsVanMij","Man",30,80,183);

       list.add(person);
       list.add(person2);
       list.add(person3);
       list.add(person4);
       list.add(person5);

       list.forEach(System.out::println);
    }
}
