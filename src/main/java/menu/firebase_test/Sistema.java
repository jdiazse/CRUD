package menu.firebase_test;

//Abstract: Trabajo Firebase
//Author: Jhon Alexander Diaz Serna

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Sistema {//Se crea esta clase para conectar con Firebase

    public static void main(String[] args) throws IOException {
        // Usa la llave JSON unica descargada desde los ajustes de la base de datos en la pagina de Firebase
        FileInputStream serviceAccount = new FileInputStream("C:\\Users\\jdsjh\\OneDrive\\Fotos\\Documentos\\Path\\testpoo-78fac-firebase-adminsdk-fbsvc-845449b724.json"); 
        // Esta es la ubicacion local en mi computadora (puede variar)
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://testpoo-78fac-default-rtdb.firebaseio.com") // Usa el ID/Link de mi proyecto de prueba
                .build();
        FirebaseApp.initializeApp(options);

        DatabaseReference database = FirebaseDatabase.getInstance().getReference();

        // Se crea un Input para el usuario
        Scanner scanner = new Scanner(System.in);

        // Se llama a la funcion menu para que este salga en la consola
        Menu menu = new Menu(database, scanner);
        menu.run();
    }
}