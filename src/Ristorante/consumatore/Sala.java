package Ristorante.consumatore;


import java.time.LocalDateTime;
import java.util.List;

/**
 * La classe Sala usata per gestire i tavoli(prenotare un tavolo)
 * e stampare i dettagli dei tavoli dentro la sala

 */
public class Sala {
    private final String nomeSala;
    private final List<Tavolo> listaTavoli;

    /**
     * Inizializza una Sala
     *
     * @param nomeSala    nome sala
     * @param listaTavoli lista tavoli
     */
    public Sala(String nomeSala,List<Tavolo> listaTavoli) {
        this.listaTavoli = listaTavoli;
        this.nomeSala = nomeSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }


    /**
     * Prenota tavolo
     *
     * @param cliente            il cliente che fa la prenotazione
     * @param postiRichiesti     i posti richiesti dal cliente
     * @param orarioPrenotazione l'orario della prenotazione
     */
    public void prenotaTavolo(Cliente cliente, Integer postiRichiesti, LocalDateTime orarioPrenotazione){
        for(Tavolo tavolo : listaTavoli){
            if(tavolo.getTipoTavolo().getPostiTavolo() >= postiRichiesti){
                tavolo.aggiungiPrenotazione(new Prenotazione(cliente, postiRichiesti, orarioPrenotazione));
                return;
            }
        }
        System.out.println("Nessun tavolo disponibile per " + cliente.getCognome());
    }

    /**
     * Stampa sala
     */
    public void stampaSala(){
        System.out.println("Nome Sala: " + this.nomeSala);
        for(Tavolo tavolo : listaTavoli){
            tavolo.stampaTavolo();
        }
    }
}
