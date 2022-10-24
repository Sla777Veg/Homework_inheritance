import java.util.Objects;

public class Amphibian extends Animal {
    protected String livingEnvironment;

    public void Hunt() {
        System.out.println("Поиск добычи и поедание");
    }

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);

        this.livingEnvironment = Objects.requireNonNullElse(livingEnvironment, "default");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }



    @Override
    public String toString() {
        return "Amphibians{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.printf("%s ест что-то "+ "\n", this.name);
    }

    @Override
    public void sleep() {
        System.out.printf("%s спит"+ "\n", this.name);
    }

    @Override
    public void move() {
        System.out.printf("%s ползает"+ "\n", this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian that = (Amphibian) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
