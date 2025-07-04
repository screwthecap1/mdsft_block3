package hotel.extra;

public enum Prices {
    ECONOMY(100),
    STANDART(150),
    LUX(250),
    ULTRALUX(500);

    private final int price;

    Prices(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
