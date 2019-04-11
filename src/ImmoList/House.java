package ImmoList;

import java.util.Objects;

public class House implements Comparable<House>{

    private double oppervlakte;
    private int kamers;
    private double prijs;
    private HouseType type;

    //constructor
    public House(double oppervlakte, int kamers, double prijs, HouseType type) {
        this.oppervlakte = oppervlakte;
        this.kamers = kamers;
        this.prijs = prijs;
        this.type = type;
    }

    //getters en setters
    public double getOppervlakte() {
        return oppervlakte;
    }

    public void setOppervlakte(double oppervlakte) {
        this.oppervlakte = oppervlakte;
    }

    public int getKamers() {
        return kamers;
    }

    public void setKamers(int kamers) {
        this.kamers = kamers;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public HouseType getType() {
        return type;
    }

    public void setType(HouseType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        House house = (House) o;
        return Double.compare(house.getOppervlakte(), getOppervlakte()) == 0 &&
                getKamers() == house.getKamers() &&
                Double.compare(house.getPrijs(), getPrijs()) == 0 &&
                getType() == house.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOppervlakte(), getKamers(), getPrijs(), getType());
    }

    @Override
    public String toString() {
        return "House {" +
                "oppervlakte = " + oppervlakte +
                ", kamers = " + kamers +
                ", prijs = " + prijs +
                ", type = " + type +
                '}'+  "\n";
    }
    @Override
    public int compareTo(House o) {
        return (int) this.getPrijs() - (int)o.getPrijs();
    }
}
