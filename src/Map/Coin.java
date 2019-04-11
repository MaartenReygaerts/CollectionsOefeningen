package Map;

public enum Coin {
    CENT1("1 cent"),
    CENT2("2 cent"),
    CENT5("5 cent"),
    CENT10("10 cent"),
    CENT20("20 cent"),
    CENT50("50 cent"),
    EURO1("1 euro"),
    EURO2("2 euro"),
    EURO5("5 euro"),
    EURO10("10 euro"),
    EURO20("20 euro"),
    EURO50("50 euro"),
    EURO100("100 euro"),
    EURO200("200 euro"),
    EURO500("500 euro");

    private String coin;

    Coin(String coin) {
        this.coin = coin;
    }

    public String getCoin() {
        return coin;
    }
}
