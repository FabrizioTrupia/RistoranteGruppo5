package Ristorante.consumatore;

import Ristorante.consumatore.Cliente;
import Ristorante.consumatore.Prenotazione;
import Ristorante.foodAndDrink.EnumTavoli;

import java.util.ArrayList;
import java.util.List;


public class Tavolo {
    private EnumTavoli tipoTavolo;
    private List<Cliente> clientiOccupanti = new ArrayList<>();


    public Tavolo(EnumTavoli tipoTavolo){
        this.tipoTavolo= tipoTavolo;
    }

    public void assegnaPosti(Prenotazione prenotazione){
        for (Integer i = 0; i < tipoTavolo.getPostiTavolo(); i++) {
            clientiOccupanti.add(prenotazione.getCliente().get(i));
            prenotazione.getCliente().remove(i);
        }
    }

    public void svuotaTavolo(){
        clientiOccupanti.clear();
        System.out.println("il tavolo e stato liberato");
    }

    public Integer getPosti() {
        return tipoTavolo.getPostiTavolo();
    }





    public List<Cliente> getClientiOccupanti() {
        return clientiOccupanti;
    }

    public void setClientiOccupanti(List<Cliente> clientiOccupanti) {
        this.clientiOccupanti = clientiOccupanti;
    }
}
