package Ristorante.consumatore;
import java.util.ArrayList;
/**
 * La classe che fa riferimento alle prenotazioni dei tavoli
 * @author Andrea Sciscioli
 * @version 1
 */


public class Prenotazione {

    private final ArrayList<Cliente> riservato = new ArrayList<>();

    public void aggiungiPrenotazione (Cliente cliente){
        riservato.add(cliente);
    }

    public void rimuoviPrenotazione(Cliente cliente){
        riservato.remove(cliente);
    }

    public void stampaPrenotoazioni(){
        for (Cliente listaPrenotazioni : riservato){
            System.out.println(listaPrenotazioni);
        }
    }
}

