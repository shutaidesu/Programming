package Classes;
import AbstractClasses.Locations;

public final class House extends Locations{
    House(String type){
        super(type);
    }

    @Override
    public String toString() {
        return "дом";
    }
}