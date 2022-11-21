package Ristorante.consumatore;

/**
 * La classe che fa riferimento alle prenotazioni dei tavoli
 * @author Andrea Sciscioli
 * @version 1
 */
public class Prenotazione {

    /**
     * numero persone per singola prenotazione
     */
    private Integer numeroPersone;


    /**
     * Metodo costruttore vuoto
     */
    public Prenotazione() {
    }

    /**
     * Metodo aggiungi una prenotazione
     * @param numeroPersone -> numero persone che prenotano un tavolo
     * @param cliente -> classe cliente
     */
    public void aggiungiPrenotazione (Integer numeroPersone , Cliente cliente){
        this.numeroPersone = numeroPersone;
        System.out.println("Per il cliente: " + cliente.getCognome() + " è' stato prenotato un tavolo per " + getNumeroPersone() + " persone");
    }


    public Integer getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(Integer numeroPersone) {
        this.numeroPersone = numeroPersone;
    }

}

