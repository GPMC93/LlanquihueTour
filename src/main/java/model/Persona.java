package model;

/**
 * Representa a una persona vinculada a la agencia de turismo.
 */
public class Persona {

    private String nombre;
    private Rut rut;
    private String telefono;
    private Direccion direccion;

    /**
     * Constructor de la clase Persona.
     * @param nombre nombre de la persona
     * @param rut rut de la persona
     * @param telefono teléfono de la persona
     * @param direccion dirección de la persona
     */
    public Persona(String nombre, Rut rut, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Obtiene el nombre.
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el rut.
     * @return rut de la persona
     */
    public Rut getRut() {
        return rut;
    }

    /**
     * Modifica el rut.
     * @param rut nuevo rut
     */
    public void setRut(Rut rut) {
        this.rut = rut;
    }

    /**
     * Obtiene el teléfono.
     * @return teléfono de la persona
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Modifica el teléfono.
     * @param telefono nuevo teléfono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la direccion.
     * @return direccion de la persona
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Modifica la direccion.
     * @param direccion nueva direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Retorna una descripcion legible de la persona.
     * @return informacion de la persona en texto
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", RUT: " + rut +
                ", Telefono: " + telefono +
                ", Direccion: " + direccion;
    }
}