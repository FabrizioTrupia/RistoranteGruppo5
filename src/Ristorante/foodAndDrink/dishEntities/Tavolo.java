package Ristorante.foodAndDrink.dishEntities;

import Ristorante.consumatore.Cliente;
import Ristorante.consumatore.Prenotazione;

import java.util.ArrayList;
import java.util.List;

public class Tavolo {
    private Integer posti;
    private List<Cliente> clientiOccupanti = new ArrayList<>();


    public Tavolo(Integer posti){
        this.posti= posti;
    }

    public void assegnaPosti(Prenotazione prenotazione){
        for (Integer i = 0; i < posti; i++) {
            clientiOccupanti.add(prenotazione.getCliente().get(i));
            prenotazione.getCliente().remove(i);
        }
    }

    public void svuotaTavolo(){
        clientiOccupanti.clear();
        System.out.println("il tavolo e stato liberato");
    }

    public Integer getPosti() {
        return posti;
    }



    public void setPosti(Integer posti) {
        this.posti = posti;
    }

    public List<Cliente> getClientiOccupanti() {
        return clientiOccupanti;
    }

    public void setClientiOccupanti(List<Cliente> clientiOccupanti) {
        this.clientiOccupanti = clientiOccupanti;
    }
}
