package Ristorante.consumatore;

import Ristorante.foodAndDrink.TipoPortate;

/**
 * La classe che fa riferimento ai clienti
 * @author Andrea Sciscioli
 * @version 1
 */

public class Cliente {

    /**
     * cognome dei clienti
     */
    private String cognome;

    /**
     * gusto del cliente
     */
    private TipoPortate gusti;

    /**
     * metodo costruttore cliente
     * @param cognome --> cognome del cliente
     * @param gusti --> gusto del cliente
     */
    public Cliente(String cognome, TipoPortate gusti) {
        this.cognome = cognome;
        this.gusti = gusti;
    }

    /**
     * Metodo info cliente
     */
    public void infoCliente() {
        System.out.println("Cliente: " + getCognome() + " Gusto cliente: " + getGusti());
    }


    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    public TipoPortate getGusti() {
        return gusti;
    }

    public void setGusti(TipoPortate gusti) {
        this.gusti = gusti;
    }
}