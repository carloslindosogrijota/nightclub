package uax.oop.nightclub.utils;

import java.util.ArrayList;

import uax.oop.nightclub.models.*;

public class tools {
    public boolean checkAge(Guest client){
        return client.getAge() >= 18 ? true : false;
    }
    public Guest reserveTable(Guest c, ArrayList<Guest> arr){
        for (Guest x : arr) {
            if (x.getDni().equals(c.getDni()) && x.isHasReservation() == false) {
                x.setHasReservation(true);
            } else if (x.getDni().equals(c.getDni()) && x.isHasReservation() == true){
                throw new Error("El cliente ya tiene una reserva ");
            }
        }
                return c;
    }
}
