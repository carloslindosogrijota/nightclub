package uax.oop.nightclub.test;

import java.util.ArrayList;
import java.util.Arrays;

import uax.oop.nightclub.models.Guest;
import uax.oop.nightclub.models.NightClub;
import uax.oop.nightclub.models.Order;
import uax.oop.nightclub.models.Table;
import uax.oop.nightclub.utils.Utils;

public class UtilsTest {
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

   ArrayList<Guest> myGuestsList = new ArrayList<>();
   ArrayList<Table> myTablesList = new ArrayList<>();
   ArrayList<Order> myOrdersList = new ArrayList<>();
   NightClub myNightClubItems = new NightClub(myGuestsList, myTablesList, myOrdersList);

   Utils myUtils = new Utils();

   public void runTests() throws Exception {
      // Método para añadir los invitados aceptados por la discoteca.
      myUtils.addGuests(g1, myNightClubItems);
      myUtils.addGuests(g2, myNightClubItems);
      myUtils.addGuests(g3, myNightClubItems);
      myUtils.addGuests(g4, myNightClubItems);
      myUtils.addGuests(g5, myNightClubItems);
      myUtils.addGuests(g6, myNightClubItems);
      myUtils.addGuests(g7, myNightClubItems);
      myUtils.addGuests(g8, myNightClubItems);
      myUtils.addGuests(g9, myNightClubItems);
      myUtils.addGuests(g10, myNightClubItems);

      // Método para mostrar la lista de mesas disponibles.
      myUtils.listAvailableTables(myNightClubItems);

      // Método para añadir mesas VIP o normales a invitados.
      myUtils.tableManagment(t1, g2);
      myUtils.tableManagment(t3, g3);
      myUtils.tableManagment(t3, g4);
      myUtils.tableManagment(t3, g5);
      myUtils.tableManagment(t3, g6);

      // Método para realizar pedidos asociados a mesas
      myUtils.tablesOrders(o1, t1);
      myUtils.tablesOrders(o7, t3);

      // Método para calcular costo total de los pedidos de una mesa.
      myUtils.orderTotalPriceOfTable(t6, myNightClubItems);

      // Método para mostrar el total de ingresos de la noche.
      myUtils.viewEarnings(myNightClubItems);

      // Método para liberar las mesas de la noche.
      // myUtils.liberateTables(myNightClubItems);

      // Método para listar los invitados que asistieron.
      myUtils.assistedGuests(myNightClubItems);
   }
}