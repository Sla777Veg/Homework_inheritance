import java.util.Objects;

public abstract class Mammal extends Animal {
    protected String livingEnvironment;
    protected int speedMove;

    public abstract void walk();

    public Mammal(String name, int age, String livingEnvironment, int speedMove) {
        super(name, age);

        if (age ==0) {
            this.speedMove = 1;
        } else {
            this.speedMove = speedMove;
        }

        this.livingEnvironment = Objects.requireNonNullElse(livingEnvironment, "default");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public int getSpeedMove() {
        return speedMove;
    }

    public void setSpeedMove(int speedMove) {
        this.speedMove = speedMove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speedMove == mammal.speedMove && Objects.equals(livingEnvironment, mammal.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speedMove);
    }
}
