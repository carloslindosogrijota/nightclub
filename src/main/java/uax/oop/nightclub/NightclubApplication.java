package uax.oop.nightclub;

import uax.oop.nightclub.models.Guest;
import uax.oop.nightclub.utils.Tools;
public class NightclubApplication {

	public static void main(String[] args) {

		Tools t = new Tools();
		Guest g1 = new Guest("23874348A", "Pepe", 18, false);
		Guest g2 = new Guest("37347347B", "Pepa", 20, false);
		Guest g3 = new Guest("61523653X", "Raúl", 19, true);

	}

}
