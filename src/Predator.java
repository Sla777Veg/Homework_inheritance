import java.util.Objects;

public class Predator extends Mammal {

    protected String typeFood;
    public void Hunt() {
        System.out.printf("%s выслеживает жертву и поедает"+ "\n", this.name);
    }

    public Predator(String name, int age, String livingEnvironment, int speedMove, String typeFood) {
        super(name, age, livingEnvironment, speedMove);

        this.typeFood = Objects.requireNonNullElse(typeFood, "default");
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    @Override
    public void eat() {
        System.out.printf("%s ест добычу"+ "\n", this.name);
    }

    @Override
    public void sleep() {
        System.out.printf("%s спит"+ "\n", this.name);
    }

    @Override
    public void move() {
        System.out.printf("%s быстро бегает"+ "\n", this.name);
    }

    @Override
    public void walk() {
        System.out.printf("%s прогулка в лесах и джунглях"+ "\n", this.name);
    }

    @Override
    public String toString() {
        return "Predators{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", speedMove=" + speedMove + '\'' +
                ", typeFood='" + typeFood + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeFood, predator.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}
