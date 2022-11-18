package Ristorante.Consumatore;

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
    private tipoGustiCliente gusti;

    /**
     * metodo costruttore cliente
     * @param cognome --> cognome del cliente
     * @param gusti --> gusto del cliente
     */
    public Cliente(String cognome, tipoGustiCliente gusti) {
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


    public tipoGustiCliente getGusti() {
        return gusti;
    }

    public void setGusti(tipoGustiCliente gusti) {
        this.gusti = gusti;
    }
}