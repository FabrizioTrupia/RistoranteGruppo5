package Ristorante.consumatore;

import Ristorante.enums.MenuTypeEnum;

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

    /**
     * metodo costruttore cliente
     * @param cognome --> cognome del cliente
     * @param gusti --> gusto del cliente
     */
    public Cliente(String cognome, MenuTypeEnum gusti) {
        this.cognome = cognome;
        this.gusti = gusti;
    }
    @Override
    public String toString() {
        return "Prenotazione cliente : " + cognome;
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

    /**
     * Metodo info cliente
     */
    public void infoCliente() {
        System.out.println("Cliente: " + this.cognome + " Gusto cliente: " + this.gusti);
    }



}