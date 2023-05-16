package net.salesianos.dualingo;

import java.util.Scanner;

import net.salesianos.utiles.ClasificadorDePalabras;

public class MainDualingo{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        ClasificadorDePalabras clasificador = new ClasificadorDePalabras();

        System.out.println("Bienvenido al clasificador de palabras.");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Existe palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. Ver palabras por inicial");
            System.out.println("6. Cerrar programa");

            int opcion = scanner.nextInt();
            scanner.nextLine();
}
}
};