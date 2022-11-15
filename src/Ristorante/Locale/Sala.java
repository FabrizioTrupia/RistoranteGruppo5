package Ristorante.Locale;

import Ristorante.Consumatore.Cliente;

import java.util.ArrayList;

public class Sala {

    private int tavoliOccupati;

    private ArrayList<Cliente> tavoli = new ArrayList<>();

    public void setTavoli(ArrayList<Cliente> tavoli) {
        this.tavoli = tavoli;
    }

    public ArrayList<Cliente> getTavoli() {
        return tavoli;
    }

    public int getPostiOccupati() {
        return tavoliOccupati;
    }

    public void setTavoliOccupati(int tavoliOccupati) {
        this.tavoliOccupati = tavoliOccupati;
    }

    public void aggiungiPrenotazione (Cliente cliente){
        if (tavoliOccupati < 100){
            tavoli.add(cliente);
            tavoliOccupati++;
        } else System.out.println("Tutti i tavoli sono occupati");
    }

    public Cliente rimuoviPrenotazione(int Cliente){
        System.out.println("Il tavolo " + tavoli + " è disponibile per prenotazioni");
        return tavoli.remove(Cliente);
    }
}

