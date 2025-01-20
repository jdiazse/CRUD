package menu.firebase_test;

//Abstract: Trabajo Firebase
//Author: Jhon Alexander Diaz Serna

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import java.util.Scanner;

class EditarDatos { //Se crea una clase para editar datos en este caso cambiar la clave
    public static void editarDatos(DatabaseReference database, Scanner scanner) {
        System.out.println("Ingrese su nombre de usuario:");//Se les pide el nombre de usuario a editar
        String key = scanner.nextLine();
        System.out.println("Ingrese su nueva clave:");//Se les pide una nueva clave
        String newValue = scanner.nextLine();

        database.child("Usuarios").child(key).setValue(newValue, new DatabaseReference.CompletionListener() {//Se actualiza la base de datos
            @Override
            public void onComplete(DatabaseError error, DatabaseReference ref) {
                if (error == null) {
                    System.out.println("Clave cambiada con exito!");
                } else {
                    System.out.println("Error : " + error.getMessage());
                }
            }
        });
    }
}
