package uax.oop.nightclub.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import uax.oop.nightclub.models.Guest;
import uax.oop.nightclub.models.NightClub;
import uax.oop.nightclub.models.Order;
import uax.oop.nightclub.models.Table;

public class Utils {
    // Método para registrar nuevos invitados en la discoteca, verificando su edad.
    public String addGuests(Guest myGuest, NightClub myNightClub) {
        String result = null;
        if (myGuest.getAge() >= 18) {
            myNightClub.getGuests().add(myGuest);
            result += "The guest " + myGuest + "has been added to the list. At " + LocalDate.now() + " - "
                    + LocalTime.now();
        }
        return result;
    }

    // Método para mostrar la lista de mesas disponibles.
    // clasificándolas como VIP o normales.
    public Map<String, ArrayList<Table>> listAvailableTables(NightClub myNightClub) {
        ArrayList<Table> myAvailableVIPTables = new ArrayList<>();
        ArrayList<Table> myAvailableTables = new ArrayList<>();
        for (Table x : myNightClub.getTables()) {
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

    // Método para añadir mesas VIP o normales a 'x' persona/s, comprobar que no se
    // coja una mesa ya reservada, y comprobar que la capacidad de personas en la
    // mesa no se exceda.
    public String tableManagment(Table myTable, Guest myGuest) throws Exception {
        String result = null;
        if (myTable.isIsAvailable() == true && myTable.getCapacity() <= myTable.getCapacityLimity()) {
            myTable.getGuestTablesReserved().add(myGuest);
            myTable.setIsAvailable(false);
            myTable.setCapacity(myTable.getCapacity() + 1);
            result += "The guests of the list have added to the table " + myTable.getTableId();
        } else if (myTable.isIsAvailable() == true && myTable.getCapacity() > myTable.getCapacityLimity()) {
            result += "The guests of the list exceeded the permitted number of guests";
            throw new Exception("The guests of the list exceeded the permitted number of guests");
        } else {
            result += "The table isn't avaible";
            throw new Exception("The table isn't avaible");
        }
        return result;
    }

    // Método para realizar pedidos asociados a mesas
    public String tablesOrders(NightClub myNightClub, Table myTable) {
        myTable.getOrdersOfTable().addAll(myNightClub.getOrders());
        return "The following orders have been added to the " + myTable;
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

    // Método para mostrar el total de ingresos de la noche.
    public double viewEarnings(NightClub myNightClub) {
        double result = 0;
        for (Order x : myNightClub.getOrders()) {
            result += x.getTotalPrice();
        }
        return result;
    }

    // Método para liberar las mesas de la noche.
    public String liberateTables(NightClub myNightClub) {
        for (Table x : myNightClub.getTables()) {
            x.setIsAvailable(false);
        }
        return "The tables has been liberated.";
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