package uax.oop.nightclub.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import uax.oop.nightclub.models.Guest;
import uax.oop.nightclub.models.NightClub;
import uax.oop.nightclub.models.Order;
import uax.oop.nightclub.models.Table;

public class Utils {
    // Funcionalidad 1:
    // Método para registrar nuevos invitados en la discoteca, verificando su edad.
    public ArrayList<Guest> addGuests(Guest myGuest, ArrayList<Guest> myClubGuests, NightClub myNightClub) {
        if (myGuest.getAge() >= 18) {
            myClubGuests.add(myGuest);
            myNightClub.getGuests().add(myGuest);
        }
        return myClubGuests;
    }

    // Funcionalidad 2:
    // Método para mostrar la lista de tablas disponibles.
    // clasificándolas como VIP o normales.
    public Map<String, ArrayList<Table>> listAvailableTables(ArrayList<Table> myTablesList) {
        ArrayList<Table> myAvailableVIPTables = new ArrayList<>();
        ArrayList<Table> myAvailableTables = new ArrayList<>();
        for (Table x : myTablesList) {
            if (x.isIsAvailable() && x.isIsVip()) {
                myAvailableVIPTables.add(x);
            } else if (x.isIsAvailable() && !x.isIsVip()) {
                myAvailableTables.add(x);
            }
        }
        Map<String, ArrayList<Table>> result = new HashMap<>();
        result.put("VIP", myAvailableVIPTables);
        result.put("Normal", myAvailableTables);
        return result;
    }

    // Funcionalidad 3:
    // Método para añadir mesas VIP o normales a 'x' persona/s, comprobar que no se
    // coja una mesa ya reservada, y comprobar que la capacidad de personas en la
    // mesa no se exceda.
    public Table tableManagment(Table myTable, ArrayList<Guest> myGuestList) throws Exception {
        if (myTable.isIsAvailable() == true && myGuestList.size() < myTable.getCapacity()) {
            myTable.getGuestTablesReserved().addAll(myGuestList);
            myTable.setIsAvailable(false);
        } else if (myTable.isIsAvailable() == true && myGuestList.size() > myTable.getCapacity()) {
            throw new Exception("The guests of the list exceeded the permitted number of guests");
        } else {
            throw new Exception("The table isn't avaible");
        }
        return myTable;
    }

    // Funcionalidad 4:
    // Método para realizar pedidos asociados a mesas
    public ArrayList<Order> tablesOrders(ArrayList<Order> myOrdersList, Table myTable) {
        myTable.getOrdersOfTable().addAll(myOrdersList);
        return myOrdersList;
    }

    // Método para calcular costo total de los pedidos de una mesa.
    public double orderTotalPriceOfTable(Table myTable, NightClub myNightClub) {
        double result = 0;
        for (Order x : myTable.getOrdersOfTable()) {
            result += x.getTotalPrice();
            myNightClub.getOrders().add(x);
        }
        return result;
    }

    // Funcionalidad 5
    // Método para mostrar el total de ingresos de la noche.
    public double viewEarnings(NightClub myNightClub) {
        double result = 0;
        for (Order x : myNightClub.getOrders()) {
            result += x.getTotalPrice();
        }
        return result;
    }

    // Método para liberar las mesas de la noche.
    public void liberateTables(NightClub myNightClub) {
        for (Table x : myNightClub.getTables()) {
            x.setIsAvailable(false);
        }
    }

    // Método para listar los invitados que asistieron.
    public ArrayList<String> assistedGuests(NightClub myNightClub) {
        ArrayList<String> myArrayListStrings = new ArrayList<>();
        for (Guest x : myNightClub.getGuests()) {
            myArrayListStrings.add(x.toString());
        }
        return myArrayListStrings;
    }
}