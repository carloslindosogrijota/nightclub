package uax.oop.nightclub;

import uax.oop.nightclub.models.Guest;
import uax.oop.nightclub.models.Table;

public class NightclubApplication {

	public static void main(String[] args) {

		// Se instancia los clientes de la discoteca
		Guest g1 = new Guest(16, "12345678A", false, "Juan Pérez", 2);
		Guest g2 = new Guest(18, "87654321B", false, "María López", 1);
		Guest g3 = new Guest(20, "56781234C", false, "Carlos García", 3);
		Guest g4 = new Guest(30, "34567890D", false, "Laura Fernández", 2);
		Guest g5 = new Guest(40, "09876543E", false, "Pedro Sánchez", 4);
		Guest g6 = new Guest(40, "09876543E", false, "Pedro Sánchez", 4);

		Table t1 = new Table(1);
		Table t2 = new Table(2);
		Table t3 = new Table(3);
		Table t4 = new Table(4);
	}

}
