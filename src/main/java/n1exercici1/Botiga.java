package n1exercici1;

import n1exercici1.models.Producte;
import n1exercici1.models.Venda;
import n1exercici1.models.VendaBuidaException;

import java.util.ArrayList;

public class Botiga {

	public static void funcionamentBotiga() {
	ArrayList <Producte>llistaProductes = new ArrayList<>();
       
	llistaProductes.add(new Producte("sabata", 52.05));
	llistaProductes.add(new Producte("ordinador", 200.5));
	llistaProductes.add(new Producte("llapis", 1.4));

        Venda venda = new Venda(llistaProductes, 20);

        venda.afegirProducte(new Producte("ulleres", 12.5));
        venda.afegirProducte(new Producte("teclat", 8.0));
		
	  try {

          int[] array = {1,2};
          System.out.println(array[3]); 

      } catch (ArrayIndexOutOfBoundsException ex) {
          System.out.println("S'ha produït una excepció " + ex.getMessage());
      }
    }

}
