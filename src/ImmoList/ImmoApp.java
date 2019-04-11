package ImmoList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class ImmoApp {
    public static void main(String[] args) {
        ImmoKantoor immoKantoor = new ImmoKantoor();

      House house1 = new House(200,6,400000,HouseType.APPARTMENT);
      House house2 = new House(180,5,280000,HouseType.ROW_HOUSE);
      House house3 = new House(500,8,700000,HouseType.CASTLE);
      House house4 = new House(300,6,597000,HouseType.APPARTMENT);
      House house5 = new House(210,4,275000,HouseType.APPARTMENT);
      House house6 = new House(270,7,450000,HouseType.VILLA);
      House house7 = new House(120,3,180000,HouseType.ROW_HOUSE);
      House house8 = new House(200,6,400000,HouseType.ROW_HOUSE);
      House house9 = new House(200,5,400000,HouseType.APPARTMENT);
      House house10 = new House(300,6,300000,HouseType.APPARTMENT);
      House house11 = new House(700,18,1800000,HouseType.CASTLE);
      House house12 = new House(264,9,755000,HouseType.APPARTMENT);
      House house13 = new House(423,2,200000,HouseType.APPARTMENT);
      House house14 = new House(640,6,499000,HouseType.VILLA);
      House house15 = new House(280,4,320000,HouseType.ROW_HOUSE);
      House house16 = new House(320,3,299000,HouseType.APPARTMENT);
      House house17 = new House(100,1,100000,HouseType.APPARTMENT);
      House house18 = new House(450,7,509000,HouseType.VILLA);
      House house19 = new House(320,12,999999,HouseType.VILLA);
      House house20 = new House(456,7,750000,HouseType.APPARTMENT);

      immoKantoor.addToSalesList(house1);
      immoKantoor.addToSalesList(house2);
      immoKantoor.addToSalesList(house3);
      immoKantoor.addToSalesList(house4);
      immoKantoor.addToSalesList(house5);
      immoKantoor.addToSalesList(house6);
      immoKantoor.addToSalesList(house7);
      immoKantoor.addToSalesList(house8);
      immoKantoor.addToSalesList(house9);
      immoKantoor.addToSalesList(house10);
      immoKantoor.addToSalesList(house11);
      immoKantoor.addToSalesList(house12);
      immoKantoor.addToSalesList(house13);
      immoKantoor.addToSalesList(house14);
      immoKantoor.addToSalesList(house15);
      immoKantoor.addToSalesList(house16);
      immoKantoor.addToSalesList(house17);
      immoKantoor.addToSalesList(house18);
      immoKantoor.addToSalesList(house19);
      immoKantoor.addToSalesList(house20);

        System.out.println(immoKantoor);


        System.out.println("***** Alle appartementen *****");

        immoKantoor.getVerkoopLijst().stream()
                .filter(s -> s.getType().equals(HouseType.APPARTMENT) )
                .collect(Collectors.toList())
                .forEach(System.out :: println);

        System.out.println("***** Alle huizen met 4 kamers en minder als 500.000 *****");

        immoKantoor.getVerkoopLijst()
                .stream()
                .filter(s -> s.getKamers()>4 && s.getPrijs()<500000)
                .forEach(System.out::println);

        System.out.println("***** Print eerste 3 goedkoopste huizen *****");
        immoKantoor.getVerkoopLijst()
                .stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("***** tel alle prijzen van de te verkopen huizen bij elkaar op *****");

        System.out.println(immoKantoor.calculateTotalPrice());

    }

}
