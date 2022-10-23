public class Car extends Transport {
    double engineVolume;

    public Car(String brand, String model, double engineVolume, String bodyColor, int productionYear, String assemblyCountry, double maxSpeed) {
        super(brand, model, bodyColor, productionYear, assemblyCountry, maxSpeed);


        if (engineVolume ==0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public void refill() {
        System.out.printf("%s можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках"+ "\n", this.brand);
    }

    @Override
    public String toString() {
        return "Car{" +

                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                "engineVolume=" + engineVolume +
                ", bodyColor='" + bodyColor + '\'' +
                ", productionYear=" + productionYear +
                ", assemblyCountry='" + assemblyCountry + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
