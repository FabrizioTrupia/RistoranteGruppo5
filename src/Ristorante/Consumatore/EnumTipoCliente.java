package Ristorante.Consumatore;

/**
 * Enumerazione fascia età cliente
 */
public enum EnumTipoCliente {
    ADULTO(false, false, true),
    MINORENNE(false, true, false),
    BAMBINI(true, false, false);

    /**
     * variabile booleana: ha più di 18 anni il cliente?
     */
    final public boolean isOverHeighteen;

    /**
     * variabile booleana: è un teenager il cliente?
     */
    final public boolean isTeenage;

    /**
     * variabile booleana: è un bambino il cliente?
     */
    final public boolean isChild;

    /**
     * Metodo costruttore enumerazione tipo cliente
     * @param isChild -> è un bambino?
     * @param isTeenage - > è un teenager?
     * @param isOverHeighteen -> è un adulto?
     */
    EnumTipoCliente(boolean isChild, boolean isTeenage, boolean isOverHeighteen){
        this.isOverHeighteen = isOverHeighteen;
        this.isTeenage = isTeenage;
        this.isChild = isChild;
    }




}
