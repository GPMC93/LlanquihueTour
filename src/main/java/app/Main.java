package app;

import model.Direccion;
import model.Empleado;
import model.Persona;
import model.Rut;

/**
 * Clase principal para probar el sistema Llanquihue Tour.
 */
public class Main {

    /**
     * Método principal del programa.
     * @param args argumentos de ejecución
     */
    public static void main(String[] args) {

        try {
            Direccion direccion1 = new Direccion("Av. Vicente Perez Rosales", "Llanquihue", "120");
            Direccion direccion2 = new Direccion("Calle Techada", "Puerto Varas", "450");
            Direccion direccion3 = new Direccion("Av. Gramado", "Puerto Varas", "980");

            Rut rut1 = new Rut("12345678-9");
            Rut rut2 = new Rut("11222333-4");
            Rut rut3 = new Rut("15987654-3");

            Persona persona1 = new Persona("Carla Munoz", rut1, "987654321", direccion1);
            Persona persona2 = new Persona("Luis Herrera", rut2, "976543210", direccion2);

            Empleado empleado1 = new Empleado(
                    "Maria Soto",
                    rut3,
                    "965432198",
                    direccion3,
                    "Guia Turistico",
                    850000
            );

            System.out.println("=== REGISTRO LLANQUIHUE TOUR ===");
            System.out.println(persona1);
            System.out.println(persona2);
            System.out.println(empleado1);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}