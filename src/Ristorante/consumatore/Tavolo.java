package Ristorante.consumatore;

import Ristorante.enums.EnumTavoli;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * The type Tavolo.
 */
public class Tavolo {
    private EnumTavoli tipoTavolo;
    private Integer numeroTavolo;
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

/*
    //TODO rivedere come modificare
    public void assegnaPosti(Prenotazione prenotazione){
        for (Integer i = 0; i < tipoTavolo.getPostiTavolo(); i++) {
            clientiOccupanti.add(prenotazione.getCliente().get(i));
            prenotazione.getCliente().remove(i);
        }
    }
//TODO da rivedere
    public void svuotaTavolo(){
        clientiOccupanti.clear();
        System.out.println("il tavolo e stato liberato");
    }*/

}
