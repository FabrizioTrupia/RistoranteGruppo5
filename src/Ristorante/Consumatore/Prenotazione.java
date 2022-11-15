package Ristorante.Consumatore;

import Ristorante.Consumatore.Cliente;

import java.util.ArrayList;

public class Prenotazione {
    Integer tavoliDaOccupare;
    private ArrayList<Cliente> prenotazione = new ArrayList<>();

    public Prenotazione (ArrayList<Cliente> prenotazione){
        this.prenotazione = prenotazione;
        if (prenotazione.size() <= 4){
            this.tavoliDaOccupare = 1;
        } else if (prenotazione.size() > 4 && prenotazione.size() <= 6){
            this.tavoliDaOccupare = 2;
        } else this.tavoliDaOccupare = 2 + (((prenotazione.size() -6)/2) + ((prenotazione.size()-6)%2));
    }





}

