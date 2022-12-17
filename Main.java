import AbstractClasses.Human;
import Classes.*;
import Enum.Status;
import Interface.*;

public class Main {
	public static void main(String[] args) {
		
		Alice alice = new Alice("Алиса");
		Rabbit rabbit = new Rabbit("Кролик");
		
		Stairs stairs = new Stairs("лестница");
		
		System.out.println(stairs.toString());
		rabbit.Seek();
		alice.changeStatus(Status.GUESSED);
		alice.shake();
		
	}
}
