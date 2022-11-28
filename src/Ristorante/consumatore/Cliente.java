package Ristorante.consumatore;

import Ristorante.foodAndDrink.MenuTypeEnum;

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
    private MenuTypeEnum gusti;

    private String dataPrenotazione;


    /**
     * metodo costruttore cliente
     * @param cognome --> cognome del cliente
     * @param gusti --> gusto del cliente
     */
    public Cliente(String cognome, MenuTypeEnum gusti, String dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
        this.cognome = cognome;
        this.gusti = gusti;
    }

    @Override
    public String toString() {
        return "Prenotazione cliente : " + cognome + ". Data prenotazione : " + dataPrenotazione;
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


    public MenuTypeEnum getGusti() {
        return gusti;
    }

    public void setGusti(MenuTypeEnum gusti) {
        this.gusti = gusti;
    }
}