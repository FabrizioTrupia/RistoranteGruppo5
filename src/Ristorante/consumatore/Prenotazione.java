package Ristorante.consumatore;

import java.util.List;

/**
 * La classe che fa riferimento alle prenotazioni cliente
 * @author Fabrizio Trupia , Alessandro Trupia , Nicola Boniello , Andrea Sciscioli
 * @version 2.0
 */


public class Prenotazione {

    private List<Cliente> cliente;

    public Prenotazione(List<Cliente> clienteList) {
        this.cliente = clienteList;
    }

    public void aggiungerePrenotazioni(List<Cliente> clienteList) {

        //Todo aggiungere un solo client o anche solo un cliente
        this.cliente.addAll(clienteList);
    }



    public void stampaPrenotazioni(){
    cliente.forEach(System.out::println);
    }

}

