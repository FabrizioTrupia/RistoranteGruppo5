public class Cliente {
    private String cognome;
    private Integer age;
    private EnumTipoCliente type;

    public Cliente(String cognome, Integer age){
        this.cognome = cognome;
        this.age = age;
        if (0 < age && age < 12){
        this.type = EnumTipoCliente.BAMBINI;
        } else if (12 < age && age < 18){
            this.type = EnumTipoCliente.MINORENNE;
        } else this.type = EnumTipoCliente.ADULTO;
    }
    public void infoCliente(){
        System.out.println(getCognome() + " anni: " + getAge() + "(Classe cliente:" + getType() + ")");
    }


    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public EnumTipoCliente getType() {
        return type;
    }

    public void setType(EnumTipoCliente type) {
        this.type = type;
    }
}
