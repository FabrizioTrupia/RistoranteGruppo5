package Ristorante.Consumatore;

import Ristorante.Consumatore.Cliente;

import java.util.ArrayList;

/**
 * La classe che fa riferimento alle prenotazioni dei tavoli
 * @author Andrea Sciscioli
 * @version 1
 */
public class Prenotazione {

    /**
     * tavoli occupati
     */
    private Integer tavoliDaOccupare;

    /**
     * array list delle prenotazioni fatte dai clienti
     */
    private ArrayList<Cliente> prenotazione = new ArrayList<>();

    /**
     * metodo costruttore
     * @param prenotazione
     */
    public Prenotazione (ArrayList<Cliente> prenotazione){
        this.prenotazione = prenotazione;
        if (prenotazione.size() <= 4){
            this.tavoliDaOccupare = 1;
        } else if (prenotazione.size() > 4 && prenotazione.size() <= 6){
            this.tavoliDaOccupare = 2;
        } else this.tavoliDaOccupare = 2 + (((prenotazione.size() -6)/2) + ((prenotazione.size()-6)%2));
    }


    public Integer getTavoliDaOccupare() {
        return tavoliDaOccupare;
    }

    public void setTavoliDaOccupare(Integer tavoliDaOccupare) {
        this.tavoliDaOccupare = tavoliDaOccupare;
    }

    public ArrayList<Cliente> getPrenotazione() {
        return prenotazione;
    }

    public void setPrenotazione(ArrayList<Cliente> prenotazione) {
        this.prenotazione = prenotazione;
    }
}

