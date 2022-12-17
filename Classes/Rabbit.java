package Classes;
import java.util.Objects;
import AbstractClasses.Human;

public final class Rabbit extends Human{

    public Rabbit(String name){
        super(name);
        System.out.println("Персонаж - " + name + " успешно создан.");
    }

    public void Seek() {
    	System.out.println(getName() + " бежит искать её.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rabbit rabbit = (Rabbit) o;
        return Objects.equals(getName(), rabbit.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Rabbit";
    }

}