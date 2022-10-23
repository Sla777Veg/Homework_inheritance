import java.util.Objects;

public class NotFlying extends Bird {

    protected String typeMove;
    public void walk() {
        System.out.println("Гуляет по траве");
    }


    public NotFlying(String name, int age, String livingEnvironment, String typeMove) {
        super(name, age, livingEnvironment);

        this.typeMove = Objects.requireNonNullElse(typeMove, "default");
    }

    public String getTypeMove() {
        return typeMove;
    }


    @Override
    public void eat() {
        System.out.printf("%s ест рыбу"+ "\n", this.name);
    }

    @Override
    public void sleep() {
        System.out.printf("%s спит"+ "\n", this.name);
    }

    @Override
    public void move() {
        System.out.printf("%s бегает"+ "\n", this.name);
    }

    @Override
    public void Hunt() {
        System.out.printf("%s охотиться на суше"+ "\n", this.name);
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
        NotFlying notFlying = (NotFlying) o;
        return Objects.equals(typeMove, notFlying.typeMove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMove);
    }
}
