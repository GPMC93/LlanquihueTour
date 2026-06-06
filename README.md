# LlanquihueTour

Proyecto Java orientado a objetos para modelar personas vinculadas a una agencia de turismo.

## Descripción
Este proyecto representa parte del sistema de Llanquihue Tour, aplicando encapsulamiento, composición, herencia y organización en paquetes.

## Estructura del proyecto
- `model`
    - `Direccion`
    - `Rut`
    - `Persona`
    - `Empleado`
- `app`
    - `Main`

## Funcionalidades implementadas
- Clase base `Persona`
- Clase de composición `Direccion`
- Clase de validación `Rut`
- Clase derivada `Empleado`
- Uso de constructores, getters, setters y `toString()`
- Validación simple del RUT con excepción `IllegalArgumentException`

## Ejecución
1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `app.Main`.
3. Revisar la salida en consola.