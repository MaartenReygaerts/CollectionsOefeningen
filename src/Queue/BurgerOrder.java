package Queue;

public class BurgerOrder  {
    private String name;
    private int number;


    //constructor
    public BurgerOrder() {

    }

    public BurgerOrder(String name) {
        this.name = name;
        this.number = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BurgerOrder{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
