package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class MapApp {
    public static void main(String[] args) {
        Map<Coin, Integer> wallet = new LinkedHashMap<>();
        wallet.put(Coin.CENT1,2);
        wallet.put(Coin.CENT20,4);
        wallet.put(Coin.EURO2,1);
        wallet.put(Coin.EURO1,2);
        wallet.put(Coin.EURO5,1);

        System.out.println(wallet.get(Coin.EURO5));
        System.out.println(wallet.get(Coin.CENT20));

        for (Coin s : wallet.keySet()){
            System.out.println(s.getCoin() + ": " + wallet.get(s));
        }
    }
}
