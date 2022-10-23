import java.util.Objects;

public abstract class Bird extends Animal {

    protected String livingEnvironment;
    public abstract void Hunt();

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age);

        this.livingEnvironment = Objects.requireNonNullElse(livingEnvironment, "default");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(livingEnvironment, bird.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
