import java.util.Objects;

public abstract class Transport {
    protected final String brand;
    protected final String model;
    protected String bodyColor;
    protected final int productionYear;
    protected final String assemblyCountry;
    protected double maxSpeed;

    public abstract void refill();

    public Transport(String brand, String model, String bodyColor, int productionYear, String assemblyCountry, double maxSpeed) {

        if (maxSpeed <=0) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }

        this.brand = Objects.requireNonNullElse(brand, "default");

        this.model = Objects.requireNonNullElse(model, "default");

        this.assemblyCountry = Objects.requireNonNullElse(assemblyCountry, "Россия");

        this.bodyColor = Objects.requireNonNullElse(bodyColor, "белый ");

        if (productionYear ==0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
    }

    //Геттеры
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
    //Сеттеры
    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
