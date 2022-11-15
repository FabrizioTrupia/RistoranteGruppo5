package Ristorante.Consumatore;

public enum EnumTipoCliente {
    ADULTO(false, false, true),
    MINORENNE(false, true, false),
    BAMBINI(true, false, false);


    final public boolean isOverHeighteen;
    final public boolean isTeenage;
    final public boolean isChild;

    EnumTipoCliente(boolean isChild, boolean isTeenage, boolean isOverHeighteen){
        this.isOverHeighteen = isOverHeighteen;
        this.isTeenage = isTeenage;
        this.isChild = isChild;
    }




}
