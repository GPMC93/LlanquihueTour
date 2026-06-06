package model;

/**
 * Representa a un empleado de la agencia de turismo.
 */
public class Empleado extends Persona {

    private String cargo;
    private double sueldo;

    /**
     * Constructor de la clase Empleado.
     * @param nombre nombre del empleado
     * @param rut rut del empleado
     * @param telefono telefono del empleado
     * @param direccion direccion del empleado
     * @param cargo cargo del empleado
     * @param sueldo sueldo del empleado
     */
    public Empleado(String nombre, Rut rut, String telefono, Direccion direccion, String cargo, double sueldo) {
        super(nombre, rut, telefono, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado -> " + super.toString() +
                ", Cargo: " + cargo +
                ", Sueldo: " + sueldo;
    }
}