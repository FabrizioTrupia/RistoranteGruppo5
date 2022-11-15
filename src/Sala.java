import java.util.ArrayList;

public class Sala {

    private Integer tavoliOccupati;

    private ArrayList<Prenotazione> tavoli = new ArrayList<>();

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
        if (tavoliOccupati < 100){
            tavoli.add(prenotazione);
            tavoliOccupati++;
        } else System.out.println("Tutti i tavoli sono occupati");
    }

    public void rimuoviPrenotazione(int prenotazione){
        System.out.println("Il tavolo " + tavoli + " è disponibile per prenotazioni");
        tavoli.remove(prenotazione);
    }
}

