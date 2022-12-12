package Ristorante.consumatore;

import Ristorante.enums.EnumTavoli;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Tavolo.
 */
public class Tavolo {
    private EnumTavoli tipoTavolo;
    private Integer numeroTavolo;
    private final List<Prenotazione> listaPrenotazioni = new ArrayList<>();
//lista prenotazioni

    /**
     * Inizializza un Tavolo
     *
     * @param tipoTavolo   tipo del tavolo (grande, medio, piccolo)
     * @param numeroTavolo numero del tavolo (identificativo)
     */
    public Tavolo(EnumTavoli tipoTavolo, Integer numeroTavolo){
        this.tipoTavolo= tipoTavolo;
        this.numeroTavolo = numeroTavolo;
    }

    public EnumTavoli getTipoTavolo() {
        return tipoTavolo;
    }

    public void setTipoTavolo(EnumTavoli tipoTavolo) {
        this.tipoTavolo = tipoTavolo;
    }

    public Integer getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(Integer numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    /**
     * Aggiungi prenotazione al tavolo
     *
     * @param prenotazione la prenotazione da aggiungere al tavolo
     */
    public void aggiungiPrenotazione(Prenotazione prenotazione){
        listaPrenotazioni.add(prenotazione);
    }

    /**
     * Stampa tavolo
     * stampa i dettagli del tavolo e le sue prenotazioni.
     */
    public void stampaTavolo(){
        System.out.println("Numero del tavolo: " + numeroTavolo +
                " Tipo tavolo: " + tipoTavolo);
        for(Prenotazione prenotazione : listaPrenotazioni){
            prenotazione.stampaPrenotazione();
        }
    }
}
