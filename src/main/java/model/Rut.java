package model;

/**
 * Representa un RUT Chileno con validación básica de formato.
 */
public class Rut {

    private String numero;

    /**
     * Constructor de la clase Rut.
     * @param numero rut en formato 12345678-9 o 12345678-K
     */
    public Rut(String numero) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("El RUT no puede estar vacío.");
        }

        if (!numero.matches("[0-9]+-[0-9kK]")) {
            throw new IllegalArgumentException("El formato del RUT no es válido.");
        }

        this.numero = numero;
    }

    /**
     * Obtiene el número de RUT.
     * @return número de RUT
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Modifica el número de RUT validando el formato.
     * @param numero nuevo RUT
     */
    public void setNumero(String numero) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("El RUT no puede estar vacío.");
        }

        if (!numero.matches("[0-9]+-[0-9kK]")) {
            throw new IllegalArgumentException("El formato del RUT no es válido.");
        }

        this.numero = numero;
    }

    /**
     * Retorna una descripción legible del RUT.
     * @return texto con el RUT
     */
    @Override
    public String toString() {
        return "RUT: " + numero;
    }
}