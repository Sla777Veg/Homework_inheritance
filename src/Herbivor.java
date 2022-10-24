import java.util.Objects;

public class Herbivor extends Mammal {
    protected String typeFood;

    public void graze() {
        System.out.printf("%s пасется на лугу"+ "\n", this.name);
    }


    public Herbivor(String name, int age, String livingEnvironment, int speedMove, String typeFood) {
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

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    @Override
    public void walk() {

    }

    @Override
    public String toString() {
        return "Herbivores{" +
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
        Herbivor that = (Herbivor) o;
        return Objects.equals(typeFood, that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}
