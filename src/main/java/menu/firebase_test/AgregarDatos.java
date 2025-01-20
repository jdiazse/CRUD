package menu.firebase_test;

//Abstract: Trabajo Firebase
//Author: Jhon Alexander Diaz Serna

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class AgregarDatos {
    public static void agregarDatos(DatabaseReference database, Scanner scanner) { //Se crea la clase para la creacion de usuarios
        System.out.println("Ingrese el nombre de usuario nuevo:"); //Se les pide su usuario nuevo
        String key = scanner.nextLine();
        System.out.println("Ingrese una nueva clave:");// Se les pide una clave para ascosiarla
        String value = scanner.nextLine();

        Map<String, Object> data = new HashMap<>();//Se crea un mapa para guardar la informacion
        data.put(key, value);

        database.child("Usuarios").updateChildren(data, new DatabaseReference.CompletionListener() {//Se sube esta informacion a la base de datos
            @Override
            public void onComplete(DatabaseError error, DatabaseReference ref) {
                if (error == null) {
                    System.out.println("Usuario creado con exito!");
                } else {
                    System.out.println("Error: " + error.getMessage());
                }
            }
        });
    }
}
