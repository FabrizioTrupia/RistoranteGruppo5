package Ristorante.consumatore;

import Ristorante.foodAndDrink.dishEntities.Tavolo;

import java.util.List;

/**
 * La classe che fa riferimento alle prenotazioni cliente
 * @author Fabrizio Trupia , Alessandro Trupia , Nicola Boniello , Andrea Sciscioli
 * @version 2.0
 */


public class Prenotazione {

    private List<Cliente> cliente;


    private String nominativo;


    public Prenotazione(List<Cliente> clienteList) {
        this.cliente = clienteList;
    }

    public void aggiungerePrenotazioni(List<Cliente> clienteList) {
        cliente.addAll(clienteList);
    }

    public void stampaPrenotazioni(Tavolo tavolo){

        cliente.forEach(System.out::println);

    }
    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }
    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

}

