package Ristorante.Consumatore;

import Ristorante.Consumatore.Prenotazione;

import java.util.ArrayList;

public class Sala {
    private Integer tavoliTotali;

    private Integer tavoliOccupati;

    private ArrayList<Prenotazione> tavoli = new ArrayList<>();

    private Sala(Integer tavoliTotali){
        this.tavoliTotali = tavoliTotali;
    }


    public void setTavoli(ArrayList<Prenotazione> tavoli) {
        this.tavoli = tavoli;
    }

    public ArrayList<Prenotazione> getTavoli() {
        return tavoli;
    }

    public Integer getPostiOccupati() {
        return tavoliOccupati;
    }

    public void setTavoliOccupati(Integer tavoliOccupati) {
        this.tavoliOccupati = tavoliOccupati;
    }

    public void aggiungiPrenotazione (Prenotazione prenotazione){
        if (tavoliTotali - tavoliOccupati > prenotazione.getTavoliDaOccupare()){
            tavoli.add(prenotazione);
            tavoliOccupati += prenotazione.getTavoliDaOccupare();
            if (prenotazione.getTavoliDaOccupare() == 1) {
                System.out.println("abbiamo prenotato un tavolo per voi");
            } else System.out.println("abbiamo unito " + prenotazione.getTavoliDaOccupare() + "tavoli");
        } else System.out.println("Tutti i tavoli sono occupati");
    }

    public void rimuoviPrenotazione(int prenotazione){
        System.out.println("Il tavolo " + tavoli + " è disponibile per prenotazioni");
        tavoliOccupati -= tavoli.get(prenotazione).getTavoliDaOccupare();
        tavoli.remove(prenotazione);
    }
}

