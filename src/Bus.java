public class Bus extends Transport {
    @Override
    public void refill() {
        System.out.printf("%s можно заправлять бензином или дизелем на заправке"+ "\n", this.brand);
    }

    public Bus(String brand, String model, String bodyColor, int productionYear, String assemblyCountry, double maxSpeed) {
        super(brand, model, bodyColor, productionYear, assemblyCountry, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", productionYear=" + productionYear +
                ", assemblyCountry='" + assemblyCountry + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
