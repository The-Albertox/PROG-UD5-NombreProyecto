package net.salesianos.dualingo;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
    
    switch (opcion) {
        case 1:
            System.out.println("Añadir una palabra:");
            String wordToAdd = scanner.nextLine();
            clasificador.addWord(wordToAdd);
            System.out.println("Palabra agregada correctamente.");
            break;
        case 2:
            System.out.println("Ingrese una palabra para eliminarla:");
            String wordToDelete = scanner.nextLine();
            if (clasificador.getWordsByInitial().values().removeIf(list -> list.contains(wordToDelete))) {
                System.out.println("Palabra eliminada correctamente.");
            } else {
                System.out.println("La palabra no estaba almacenada.");
            }
            break;
        case 3:
            System.out.println("ponga una palabra para buscarla:");
            String wordToFind = scanner.nextLine();
            boolean exists = false;
            for (List<String> words : clasificador.getWordsByInitial().values()) {
                if (words.contains(wordToFind)) {
                    exists = true;
                    break;
                }
            }
            if (exists) {
                System.out.println("La palabra se ha encontrado.");
            } else {
                System.out.println("La palabra no se ha encontrado.");
            }
            break;
        case 4:
            System.out.println("mostrar iniciales disponibles:");
            Set<Character> initials = clasificador.getInitials();
            for (char initial : initials) {
                System.out.println(initial);
            }
            break;
        case 5:
            System.out.println("Ingrese una inicial:");
            char initialToDisplay = scanner.nextLine().charAt(0);
            List<String> wordsByInitial = clasificador.getWordsByInitial(initialToDisplay);
            if (wordsByInitial.isEmpty()) {
                System.out.println("No hay palabras almacenadas con esa inicial.");
            } else {
                System.out.println("Palabras que comienzan con " + initialToDisplay + ":");
                for (String word : wordsByInitial) {
                    System.out.println(word);
                }
            }
            break;
        case 6:
            System.out.println("¡Hasta luego!");
            System.exit(0);
            break;
        default:
            System.out.println("Opción inválida.");
    }
}
}
};