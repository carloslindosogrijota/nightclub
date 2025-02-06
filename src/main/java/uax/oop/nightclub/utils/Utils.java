package uax.oop.nightclub.utils;

import java.util.ArrayList;

import uax.oop.nightclub.models.Guest;
import uax.oop.nightclub.models.Order;
import uax.oop.nightclub.models.Table;

public class Utils {
    
// --------------------------------------------------------------------
    // Funcionalidad 1:

// --------------------------------------------------------------------

    
// --------------------------------------------------------------------
    // Funcionalidad 2:
    // Método para añadir mesas VIP o normales a 'x' persona/s, comprobar que no se coja una mesa ya reservada, y comprobar que la capacidad de personas en la mesa no se exceda.
    public String tableManagment(Table myTable, ArrayList<Guest> myGuestList) throws Exception {
        String resultado="";
        if(myTable.isIsAvailable()==true && myGuestList.size()<myTable.getCapacity() && myTable.isIsVip()){
            myTable.getGuestTablesReserved().addAll(myGuestList);
            myTable.setIsAvailable(false);
            resultado += "The guests of the list have added to the VIP table " + myTable.getTableId();
        }
        if(myTable.isIsAvailable()==true && myGuestList.size()<myTable.getCapacity() && !myTable.isIsVip()){
            myTable.getGuestTablesReserved().addAll(myGuestList);
            myTable.setIsAvailable(false);
            resultado += "The guests of the list have added to the table " + myTable.getTableId();
        } else if (myTable.isIsAvailable()==true && myGuestList.size()>myTable.getCapacity()){
            throw new Exception ("The guests of the list exceeded the permitted number of guests");
        }else {
            throw new Exception ("The table isn't avaible");
        }
        return resultado;
    }
    //Método para mostrar la Lista de tablas disponibles.
    public ArrayList<String> viewTables(ArrayList<Table> myTablesList) {
        ArrayList<String> myAvailableTables = new ArrayList<>();
        for (Table x : myTablesList) {
            if(x.isIsAvailable()){
                myAvailableTables.add(x.toString());
            }
        }
        return myAvailableTables;
    }
// --------------------------------------------------------------------
    // Funcionalidad 3:

// --------------------------------------------------------------------

    
// --------------------------------------------------------------------
    // Funcionalidad 4:
    // Método para realizar pedidos asociados a mesas
    public String tablesOrders(ArrayList<Order> myOrdersList, Table myTable) {
        myTable.getOrdersOfTable().addAll(myOrdersList);
        return "The following orders have been added to the " + myTable;
    }
    // Método para calcular costo total de los pedidos de una mesa.
    public double orderTotalPriceOfTable (Table myTable) {
        double result = 0;
        for (Order x : myTable.getOrdersOfTable()) {
            result += x.getTotalPrice();
        }
        return result;
    }
// --------------------------------------------------------------------
}
