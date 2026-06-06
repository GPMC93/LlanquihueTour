package model;

/**
 * Representa la dirección de una persona.
 */
public class Direccion {

    private String calle;
    private String comuna;
    private String numero;

    /**
     * Constructor de la clase Direccion.
     * @param calle nombre de la calle
     * @param comuna comuna de residencia
     * @param numero número de la dirección
     */
    public Direccion(String calle, String comuna, String numero) {
        this.calle = calle;
        this.comuna = comuna;
        this.numero = numero;
    }

    /**
     * Obtiene la calle.
     * @return calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Modifica la calle.
     * @param calle nueva calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene la comuna.
     * @return comuna
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Modifica la comuna.
     * @param comuna nueva comuna
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * Obtiene el número.
     * @return número
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Modifica el número.
     * @param numero nuevo número
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Retorna una descripción legible de la dirección.
     * @return texto con la dirección
     */
    @Override
    public String toString() {
        return calle + " " + numero + ", " + comuna;
    }
}