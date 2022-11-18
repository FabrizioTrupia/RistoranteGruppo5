package Ristorante.Consumatore;



public class Cliente {
    private String cognome;

    private EnumTipoCliente type;


    private tipoGustiCliente gusti;

    public Cliente(String cognome, EnumTipoCliente type, tipoGustiCliente gusti) {
        this.cognome = cognome;
        this.type = type;
        this.gusti = gusti;
    }


    public void infoCliente() {
        System.out.println(getCognome() + " fascia " + getType() + "(Classe cliente:" + getType() + ")");
    }


    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public EnumTipoCliente getType() {
        return type;
    }

    public void setType(EnumTipoCliente type) {
        this.type = type;
    }

    public tipoGustiCliente getGusti() {
        return gusti;
    }

    public void setGusti(tipoGustiCliente gusti) {
        this.gusti = gusti;
    }
}