package Classes;
import AbstractClasses.Locations;

public final class Stairs extends Locations {
    public Stairs (String type){
        super(type);
    }

    @Override
    public String toString() {
        return ( "И на лестнице послышался быстрый, легкий топоток.");
    }
}