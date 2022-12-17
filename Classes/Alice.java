package Classes;
import Interface.*;
import AbstractClasses.Human;

public final class Alice extends Human implements Verb, Shaking{

    public Alice(String name){
        super(name);
        System.out.println("Человек - " + name + " успешно создан.");
    }

    @Override
    public void verb() {
        System.out.println("совершенно забыла,");
    }

    @Override
    public void shake() {
        System.out.println("И " + getName() + " задрожала.");
    }

    @Override
    public String toString() {
        return getName();
    }

}