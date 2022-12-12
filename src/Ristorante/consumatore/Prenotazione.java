package Ristorante.consumatore;

import java.time.LocalDateTime;


/**
 * La classe che fa riferimento alle prenotazioni del cliente
 *
 * @author Fabrizio Trupia, Alessandro Trupia, Nicola Boniello, Andrea Sciscioli, Alina Mustata
 * @version 3.0
 */
public class Prenotazione {

    private Integer postiRichiesti;
    private Cliente cliente;
    private LocalDateTime orarioPrenotazione;

    /**
     * Inizializza una nuova Prenotazione
     *
     * @param postiRichiesti     posti richiesti dal cliente
     * @param cliente            il cliente che fa la prenotazione
     * @param orarioPrenotazione orario della prenotazione
     */
    public Prenotazione(Cliente cliente, Integer postiRichiesti, LocalDateTime orarioPrenotazione) {
        this.postiRichiesti = postiRichiesti;
        this.cliente = cliente;
        this.orarioPrenotazione = orarioPrenotazione;
    }
    public Integer getPostiRichiesti() {
        return postiRichiesti;
    }

    public void setPostiRichiesti(Integer postiRichiesti) {
        this.postiRichiesti = postiRichiesti;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getOrarioPrenotazione() {
        return orarioPrenotazione;
    }

    public void setOrarioPrenotazione(LocalDateTime orarioPrenotazione) {
        this.orarioPrenotazione = orarioPrenotazione;
    }

    /**
     * Stampa prenotazione
     */
    public void stampaPrenotazione() {
        System.out.println( "Prenotazione -" +
                " postiRichiesti: " + postiRichiesti +
                " cliente: " + cliente +
                " orarioPrenotazione: " + orarioPrenotazione);
    }
}