package menu.firebase_test;

//Abstract: Trabajo Firebase
//Author: Jhon Alexander Diaz Serna

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import java.util.Scanner;

class EliminarDatos {//Se crea una clase para eliminar datos en este caso usuarios
    public static void eliminarDatos(DatabaseReference database, Scanner scanner) {
        System.out.println("Ingrese el usuario que desea eliminar:");//se pide el usuario a eliminar
        String key = scanner.nextLine();

        database.child("Usuarios").child(key).removeValue(new DatabaseReference.CompletionListener() {//Elimina el usuario de la base de datos
            @Override
            public void onComplete(DatabaseError error, DatabaseReference ref) {
                if (error == null) {
                    System.out.println("Usuario eliminado con exito!");
                } else {
                    System.out.println("Error: " + error.getMessage());
                }
            }
        });
    }
}
