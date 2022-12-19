package Ristorante.consumatore;

import Ristorante.enums.EnumTavoli;

import java.time.LocalDateTime;


/**
 * La classe che fa riferimento alle prenotazioni del cliente
 *
 * @author Fabrizio Trupia, Alessandro Trupia, Nicola Boniello, Andrea Sciscioli, Alina Mustata
 * @version 3.0
 */
public class Prenotazione {

    private EnumTavoli misuraTavolo;
    private Cliente cliente;
    private LocalDateTime orarioPrenotazione;

    /**
     * Inizializza una nuova Prenotazione
     *
     * @param misuraTavolo     posti richiesti dal cliente sotto forma di misura tavolo(mini, piccolo, famiglia, ecc)
     * @param cliente            il cliente che fa la prenotazione
     * @param orarioPrenotazione orario della prenotazione
     */

    public Prenotazione(Cliente cliente, EnumTavoli misuraTavolo, LocalDateTime orarioPrenotazione) {
        this.misuraTavolo = misuraTavolo;
        this.cliente = cliente;
        this.orarioPrenotazione = orarioPrenotazione;
    }

    public EnumTavoli getMisuraTavolo() {
        return misuraTavolo;
    }

    public void setMisuraTavolo(EnumTavoli misuraTavolo) {
        this.misuraTavolo = misuraTavolo;
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
                " misura tavolo: " + misuraTavolo +
                " cliente: " + cliente +
                " orario prenotazione: " + orarioPrenotazione);
    }
}