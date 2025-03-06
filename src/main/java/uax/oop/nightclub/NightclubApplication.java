package uax.oop.nightclub;

import java.util.ArrayList;
import java.util.Arrays;

import uax.oop.nightclub.models.Guest;
import uax.oop.nightclub.models.NightClub;
import uax.oop.nightclub.models.Order;
import uax.oop.nightclub.models.Table;
import uax.oop.nightclub.utils.Utils;

public class NightclubApplication {

	public static void main(String[] args) throws Exception {

		// Instancio todas las mesas de la discoteca.
		Table t1 = new Table(0, 9, new ArrayList<>(), true, true, new ArrayList<>(), 1);
		Table t2 = new Table(0, 9, new ArrayList<>(), true, true, new ArrayList<>(), 2);
		Table t3 = new Table(0, 4, new ArrayList<>(), true, false, new ArrayList<>(), 3);
		Table t4 = new Table(0, 4, new ArrayList<>(), true, false, new ArrayList<>(), 4);
		Table t5 = new Table(0, 4, new ArrayList<>(), true, false, new ArrayList<>(), 5);
		Table t6 = new Table(0, 4, new ArrayList<>(), true, false, new ArrayList<>(), 6);

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

		ArrayList<Table> myTablesList = new ArrayList<>(Arrays.asList(t1, t2, t3, t4, t5, t6));
		ArrayList<Guest> myGuestsList = new ArrayList<>(Arrays.asList(g1, g2, g3, g4, g5, g6, g7, g8, g9, g10));
		ArrayList<Order> myOrdersList = new ArrayList<>(Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10));
		NightClub myNightClubItems = new NightClub(myGuestsList, myTablesList, myOrdersList);

		Utils myUtils = new Utils();

		// Método para añadir los invitados aceptados por la discoteca.
		System.out.println("\n\n------------------ THE GUESTS ----------------------------");
		System.out.println(myUtils.addGuests(g1, myNightClubItems));
		System.out.println(myUtils.addGuests(g3, myNightClubItems));
		System.out.println(myUtils.addGuests(g4, myNightClubItems));
		System.out.println(myUtils.addGuests(g5, myNightClubItems));
		System.out.println(myUtils.addGuests(g6, myNightClubItems));
		System.out.println(myUtils.addGuests(g7, myNightClubItems));
		System.out.println(myUtils.addGuests(g8, myNightClubItems));
		System.out.println(myUtils.addGuests(g9, myNightClubItems));
		System.out.println(myUtils.addGuests(g10, myNightClubItems));
		System.out.println("---------------------------------------------------------\n\n\n");

		// Método para mostrar la lista de mesas disponibles.
		System.out.println("------------------ AVAILABLE TABLES ----------------------------");
		System.out.println(myUtils.listAvailableTables(myNightClubItems));
		System.out.println("---------------------------------------------------------\n\n\n");

		System.out.println("------------------ ADDED TABLES ----------------------------");
		// Método para añadir mesas VIP o normales a invitados.
		System.out.println(myUtils.tableManagment(t1, g2));
		System.out.println(myUtils.tableManagment(t3, g3));
		System.out.println(myUtils.tableManagment(t3, g4));
		System.out.println(myUtils.tableManagment(t3, g5));
		System.out.println(myUtils.tableManagment(t3, g6));
		System.out.println("---------------------------------------------------------\n\n\n");

		System.out.println("------------------ THE ORDERS ----------------------------");
		// Método para realizar pedidos asociados a mesas
		System.out.println(myUtils.tablesOrders(o1, t1));
		System.out.println(myUtils.tablesOrders(o7, t3));
		System.out.println("---------------------------------------------------------\n\n\n");

		System.out.println("------------------ TOTAL COST OF A TABLE ----------------------------");
		// Método para calcular costo total de los pedidos de una mesa.
		System.out.println(myUtils.orderTotalPriceOfTable(t6));
		System.out.println("---------------------------------------------------------\n\n\n");

		System.out.println("------------------ ALL EARNINGS ----------------------------");
		// Método para mostrar el total de ingresos de la noche.
		System.out.println(myUtils.viewEarnings(myNightClubItems));
		System.out.println("---------------------------------------------------------\n\n\n");

		System.out.println("------------------ UNDO ALL TABLES ----------------------------");
		// Método para liberar las mesas de la noche.
		System.out.println(myUtils.liberateTables(myNightClubItems));
		System.out.println("---------------------------------------------------------\n\n\n");

		System.out.println("------------------ ASSISTED GUESTS  ----------------------------");
		// Método para listar los invitados que asistieron.
		System.out.println(myUtils.assistedGuests(myNightClubItems));
		System.out.println("---------------------------------------------------------");
	}

}