package com.campusdual.classroom;

public class Exercise09 {

    public static void main(String[] args) {
        doWhileLoop(10);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle do-while, que para cada interacción muestre el siguiente mensaje:
    // Entra con valor: X, sale con valor: X+1
    // Entra con valor: X+1, sale con valor: X+2;
    // etc.
    /**
     * Ejecuta un bucle do-while que imprime el valor actual y el valor del siguiente ciclo.
     *
     * @param num Límite superior del bucle (Y).
     */
    public static void doWhileLoop(int num) {

        if (num <= 0) {
            System.out.println("El límite debe ser un número mayor a 0.");
            return;
        }

        int currentValue = 0;

        do {
            String message = String.format(
                    "Entra con valor: %d, sale con valor: %d",
                    currentValue, currentValue + 1
            );
            System.out.println(message);

            currentValue++;

        }while (currentValue < num);
    }
}