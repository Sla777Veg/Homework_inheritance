import java.util.Objects;

public class Flying extends Bird {

    protected String typeMove;

    public Flying(String name, int age, String livingEnvironment, String typeMove) {
        super(name, age, livingEnvironment);

        this.typeMove = Objects.requireNonNullElse(typeMove, "default");
    }

    public String getTypeMove() {
        return typeMove;
    }

    @Override
    public void eat() {
        System.out.printf("%s ест свою еду"+ "\n", this.name);
    }

    @Override
    public void sleep() {
        System.out.printf("%s спит"+ "\n", this.name);
    }

    @Override
    public void move() {
        System.out.printf("%s летает"+ "\n", this.name);
    }

    @Override
    public void Hunt() {
        System.out.printf("%s охотиться с воздуха"+ "\n", this.name);
    }

    @Override
    public String toString() {
        return "NotFlying{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ",typeMove='" + typeMove + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeMove, flying.typeMove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMove);
    }
}
