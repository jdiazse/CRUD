package menu.firebase_test;

//Abstract: Trabajo Firebase
//Author: Jhon Alexander Diaz Serna

import com.google.firebase.database.DatabaseReference;
import java.util.Scanner;


class Menu {
    private DatabaseReference database;
    private Scanner scanner;

    public Menu(DatabaseReference database, Scanner scanner) {
        this.database = database;
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            // Muestra el menu en la consola
            System.out.println("Que desea hacer hoy?:");
            System.out.println("1. Crear usuario");
            System.out.println("2. Cambiar clave");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Salir");

            // Con un scanner interactua con el usuario
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Un switch para llamar las funciones de otras clases
            switch (choice) {
                case 1:
                    AgregarDatos.agregarDatos(database, scanner);
                    break;
                case 2:
                    EditarDatos.editarDatos(database, scanner);
                    break;
                case 3:
                    EliminarDatos.eliminarDatos(database, scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }
}