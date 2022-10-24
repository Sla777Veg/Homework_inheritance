import java.util.Objects;

public class Train extends Transport  {
    protected double price;
    protected double travelTime;
    protected String stationDeparture;
    protected String stationEnding;
    protected int amountWagons;

    public Train(String brand, String model, String bodyColor, int productionYear, String assemblyCountry,
                 double maxSpeed, double price, double travelTime, String stationDeparture, String stationEnding, int amountWagons) {
        super(brand, model, bodyColor, productionYear, assemblyCountry, maxSpeed);

        this.stationDeparture = Objects.requireNonNullElse(stationDeparture, "default");

        this.stationEnding = Objects.requireNonNullElse(stationEnding, "default");

        if (amountWagons <=0) {
            this.amountWagons = 10;
        } else {
            this.amountWagons = amountWagons;
        }

        if (price <=0) {
            this.price = 1000;
        } else {
            this.price = price;
        }

        if (travelTime <=0) {
            this.travelTime = 1;
        } else {
            this.travelTime = travelTime;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getStationDeparture() {
        return stationDeparture;
    }

    public void setStationDeparture(String stationDeparture) {
        this.stationDeparture = stationDeparture;
    }

    public String getStationEnding() {
        return stationEnding;
    }

    public void setStationEnding(String stationEnding) {
        this.stationEnding = stationEnding;
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    public void setAmountWagons(int amountWagons) {
        this.amountWagons = amountWagons;
    }

    @Override
    public void refill() {
        System.out.printf("%s заправляется дизелем"+ "\n", this.brand);
    }

    @Override
    public String toString() {
        return "Train{" +

                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", productionYear=" + productionYear +
                ", assemblyCountry='" + assemblyCountry + '\'' +
                ", maxSpeed=" + maxSpeed +
                "price=" + price +
                ", travelTime=" + travelTime +
                ", stationDeparture='" + stationDeparture + '\'' +
                ", stationEnding='" + stationEnding + '\'' +
                ", amountWagons=" + amountWagons +
                '}';
    }
}


