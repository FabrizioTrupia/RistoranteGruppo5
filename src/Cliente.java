public class Cliente {
    private String cognome;
    private Integer age;
    private EnumTipoCliente type;

    public Cliente(String cognome, Integer age, EnumTipoCliente type  ){
        this.cognome = cognome;
        this.age = age;
        this.type = type;
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
