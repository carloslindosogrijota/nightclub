package uax.oop.nightclub.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import uax.oop.nightclub.models.Guest;
import uax.oop.nightclub.models.Order;
import uax.oop.nightclub.models.Table;

public class Utils {
    // Funcionalidad 1:

    // Método para registrar nuevos invitados en la discoteca, verificando su edad.
    public ArrayList<Guest> addGuests(Guest myGuest, ArrayList<Guest>myClubGuests ) {
        if(myGuest.getAge()>=18){
            myClubGuests.add(myGuest);
        }
        return myClubGuests;
    }


    // Funcionalidad 2:

    // Método para mostrar la lista de tablas disponibles.
    // clasificándolas como VIP o normales.
    public Map<String, ArrayList<String>> listAvailableTables(ArrayList<Table> myTablesList) {
        ArrayList<String> myAvailableVIPTables = new ArrayList<>();
        ArrayList<String> myAvailableTables = new ArrayList<>();

        for (Table x : myTablesList) {
            if (x.isIsAvailable() && x.isIsVip()) {
                myAvailableVIPTables.add(x.toString());
            }
            else if (x.isIsAvailable() && !x.isIsVip()) {
                myAvailableTables.add(x.toString());
            }
        }
        Map <String, ArrayList<String>> result = new HashMap<>();
        result.put("VIP", myAvailableVIPTables);
        result.put("Normal", myAvailableTables);

        return result;
    }


    // Funcionalidad 3:

    // Método para añadir mesas VIP o normales a 'x' persona/s, comprobar que no se
    // coja una mesa ya reservada, y comprobar que la capacidad de personas en la
    // mesa no se exceda.
    public String tableManagment(Table myTable, ArrayList<Guest> myGuestList) throws Exception {
        String result="";
        if (myTable.isIsAvailable() == true && myGuestList.size() < myTable.getCapacity()) {
            myTable.getGuestTablesReserved().addAll(myGuestList);
            myTable.setIsAvailable(false);
            result += "The guests of the list have added to the table " + myTable.getTableId();
        } else if (myTable.isIsAvailable() == true && myGuestList.size() > myTable.getCapacity()) {
            result += "The guests of the list exceeded the permitted number of guests";
            throw new Exception("The guests of the list exceeded the permitted number of guests");
        } else {
            result += "The table isn't avaible";
            throw new Exception("The table isn't avaible");
        }
        return result;
    }


    // Funcionalidad 4:

    // Método para realizar pedidos asociados a mesas
    public String tablesOrders(ArrayList<Order> myOrdersList, Table myTable) {
        myTable.getOrdersOfTable().addAll(myOrdersList);
        return "The following orders have been added to the " + myTable;
    }
    // Método para calcular costo total de los pedidos de una mesa.
    public double orderTotalPriceOfTable(Table myTable) {
        double result = 0;
        for (Order x : myTable.getOrdersOfTable()) {
            result += x.getTotalPrice();
        }
        return result;
    }
}