package Ristorante.consumatore;

import java.util.List;

/**
 * La classe che fa riferimento alle prenotazioni cliente
 * @author Fabrizio Trupia, Alessandro Trupia, Nicola Boniello, Andrea Sciscioli
 * @version 2.0
 */


public class Prenotazione {

    private List<Cliente> cliente;
    //TODO numero di posti richiesti, nome cliente / oggetto Cliente, data/ora


    public Prenotazione(List<Cliente> clienteList) {
        this.cliente = clienteList;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }
//TODO da rivedere
    public void aggiungerePrenotazioni(List<Cliente> clienteList) {
        //Todo aggiungere un solo cliente
        this.cliente.addAll(clienteList);
        cliente.addAll(clienteList);
    }

    public void stampaPrenotazioni() {
        cliente.forEach(System.out::println);
    }


}