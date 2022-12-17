package AbstractClasses;
import java.util.Objects;
import Enum.Status;

public abstract class Human  {
    private final String name;

    private Status status = Status.NORMAL;
    public Human(String name){
        this.name = name;
    }
    public String getName(){ return name; }
    public void changeStatus(Status status){
        String msg = "";
        if (status == Status.NORMAL){
            msg = "normal";
        }else if (status == Status.TREMBLED){
            msg = "misunderstanding";
        }else if (status == Status.NOTSCARED){
            msg = "нечего бояться";
        }else if (status == Status.GUESSED) {
        	msg = "догадалась";
        }
        System.out.println(toString() + " изменения статуса на " + msg + '.');
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                status == human.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}