package ImmoList;

import java.util.ArrayList;
import java.util.Collection;

import java.util.HashSet;
import java.util.function.Predicate;


public class ImmoKantoor {

   private  Collection<House> verkoopLijst = new HashSet<>();

    public ImmoKantoor(){

    }

    public ImmoKantoor(Collection<House> VerkoopLijst) {
        this.verkoopLijst = VerkoopLijst;
    }

    //method
    public void addToSalesList(House HFS){
        verkoopLijst.add(HFS);

    }

    public Collection<House> getVerkoopLijst() {
        return verkoopLijst;
    }

    public void setVerkoopLijst(Collection<House> verkoopLijst) {
        this.verkoopLijst = verkoopLijst;
    }

    //filterMethods
    public void filterAppartment(){

        for (House house: verkoopLijst ) {
            if (!house.getType().equals(HouseType.APPARTMENT)){
                verkoopLijst.remove(house);
            }

        }
        System.out.println(verkoopLijst);
    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (House h : verkoopLijst){
            totalPrice += h.getPrijs();
        }
        return totalPrice;
    }



    @Override
    public String toString() {
        return "ImmoKantoor : \n" +
                "verkoopLijst =\n" + verkoopLijst  ;
    }


}
