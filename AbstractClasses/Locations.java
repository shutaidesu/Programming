package AbstractClasses;
import java.util.Objects;


public abstract class Locations {
    private final String type;
    public Locations(String type){
        this.type = type;
    }
    public String getType(){ return type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locations furniture = (Locations) o;
        return Objects.equals(type, furniture.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type); 
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "type='" + type + '\'' +
                '}';
    }
}