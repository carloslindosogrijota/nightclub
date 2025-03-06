package uax.oop.nightclub;

import java.util.ArrayList;
import java.util.Arrays;

import uax.oop.nightclub.models.Guest;
import uax.oop.nightclub.models.NightClub;
import uax.oop.nightclub.models.Order;
import uax.oop.nightclub.models.Table;
import uax.oop.nightclub.utils.Utils;

public class NightclubApplication {

	public static void main(String[] args) {

		// Instancio todas las mesas de la discoteca.
		Table t1 = new Table(4, new ArrayList<>(), true, false, new ArrayList<>(), 1);
		Table t2 = new Table(6, new ArrayList<>(), true, true, new ArrayList<>(), 2);
		Table t3 = new Table(8, new ArrayList<>(), true, false, new ArrayList<>(), 3);
		Table t4 = new Table(4, new ArrayList<>(), false, true, new ArrayList<>(), 4);
		Table t5 = new Table(10, new ArrayList<>(), true, false, new ArrayList<>(), 5);
		Table t6 = new Table(6, new ArrayList<>(), false, false, new ArrayList<>(), 6);

		// Instancio todos los clientes de la discoteca.
		Guest g1 = new Guest(16, "12345678A", false, "Juan Pérez", new ArrayList<>(Arrays.asList(t1)));
		Guest g2 = new Guest(18, "87654321B", false, "María López", new ArrayList<>(Arrays.asList(t1, t2)));
		Guest g3 = new Guest(20, "56781234C", false, "Carlos García", new ArrayList<>(Arrays.asList(t2)));
		Guest g4 = new Guest(22, "23456789D", false, "Ana Torres", new ArrayList<>(Arrays.asList(t2, t3)));
		Guest g5 = new Guest(24, "98765432E", false, "Luis Gómez", new ArrayList<>(Arrays.asList(t3)));
		Guest g6 = new Guest(26, "87654321F", false, "Sofía Herrera", new ArrayList<>(Arrays.asList(t3, t4)));
		Guest g7 = new Guest(28, "76543210G", false, "Ricardo Martínez", new ArrayList<>(Arrays.asList(t4)));
		Guest g8 = new Guest(30, "65432109H", false, "Elena Ramírez", new ArrayList<>(Arrays.asList(t4, t5)));
		Guest g9 = new Guest(32, "54321098I", false, "Fernando Díaz", new ArrayList<>(Arrays.asList(t5)));
		Guest g10 = new Guest(34, "43210987J", false, "Gabriela Suárez", new ArrayList<>(Arrays.asList(t5, t6)));
		Guest g11 = new Guest(36, "32109876K", false, "Pablo Castro", new ArrayList<>(Arrays.asList(t6)));
		Guest g12 = new Guest(38, "21098765L", false, "Carmen López", new ArrayList<>(Arrays.asList(t1, t6)));
		Guest g13 = new Guest(40, "10987654M", false, "Javier Ortega", new ArrayList<>(Arrays.asList(t1, t3)));
		Guest g14 = new Guest(42, "09876543N", false, "Marta Vázquez", new ArrayList<>(Arrays.asList(t2, t5)));
		Guest g15 = new Guest(44, "08765432O", false, "Diego Fernández", new ArrayList<>(Arrays.asList(t3, t6)));
		Guest g16 = new Guest(46, "07654321P", false, "Lucía Domínguez", new ArrayList<>(Arrays.asList(t1, t4)));
		Guest g17 = new Guest(48, "06543210Q", false, "Raúl Sánchez", new ArrayList<>(Arrays.asList(t2, t6)));
		Guest g18 = new Guest(50, "05432109R", false, "Patricia Reyes", new ArrayList<>(Arrays.asList(t5, t1)));
		Guest g19 = new Guest(52, "04321098S", false, "Sergio Mendoza", new ArrayList<>(Arrays.asList(t4, t3)));
		Guest g20 = new Guest(54, "03210987T", false, "Beatriz Herrera", new ArrayList<>(Arrays.asList(t2, t5, t6)));

		// Instancio los pedidos que se hacen para las mesas.
		Order o1 = new Order(1, "Vodka Ciroc", 35);
		Order o2 = new Order(2, "Ron Barceló", 18);
		Order o3 = new Order(3, "Vodka Belberet", 22);
		Order o4 = new Order(4, "Jägermeister", 20);
		Order o5 = new Order(5, "Ron Cacique", 19);
		Order o6 = new Order(6, "Gintonic", 10);
		Order o7 = new Order(7, "Black Label", 40);
		Order o8 = new Order(8, "Ron la recompensa", 25);
		Order o9 = new Order(9, "Mojito", 8);
		Order o10 = new Order(10, "Ginebra", 15);

		ArrayList<NightClub> myNightClub = new ArrayList<>();

		Utils myUtils = new Utils();

		// Método para añadir los invitados aceptados por la discoteca.
		myUtils.addGuests(g20, myNightClub);

	}

}
