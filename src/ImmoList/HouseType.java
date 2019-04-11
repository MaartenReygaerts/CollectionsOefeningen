package ImmoList;

public enum HouseType {
    APPARTMENT("Appartment"),
    ROW_HOUSE("Row house"),
    VILLA("Villa"),
    CASTLE("Castle");

    private String name;

    HouseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
