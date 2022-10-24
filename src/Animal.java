import java.util.Objects;

public abstract class Animal {
    public String name;
    public final int age;

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public Animal(String name, int age) {

        this.name = Objects.requireNonNullElse(name, "default");

        if (age ==0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
