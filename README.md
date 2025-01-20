# Explicación y demostración del código
## Clases
La aplicación se divide en 5 clases distintas, esto para organizarla de manera relativamente sencilla de entender, tres de estas clases se encargan de hacer las funciones de eliminar, editar y agregar datos a la base mientras las otras dos se encargan de "menu" crear el menu y conectarlo con las funciones y "sistema" de conectar don firebase y obtener la clave .JSON que esta de manera local en el PC.

 ![image](https://github.com/user-attachments/assets/563efb6e-0c43-43c3-bfdd-0c536a67926a)

## Código en ejecución y actualizaciones en Firebase
Al ejecutar desde la clase main (sistema) la aplicación se despliega el siguiente menú desde la consola con el cual interactuara el usuario.

![image](https://github.com/user-attachments/assets/82b2a06a-fc73-47e1-b128-05b7856faf66)

### Opción 1
Al usar la primera opción nos pide un usuario y una clave las cuales guarda en el RealTime DataBase de Firebase a forma de llaves.

![image](https://github.com/user-attachments/assets/0ae69585-174f-407d-b6c0-63618cac2242) ![image](https://github.com/user-attachments/assets/34bb0461-5272-4e09-9416-d2bbf19c9a3c)


### Opción 2
Al usar la segunda opción te pide un usuario existente al cual le quieres cambiar la clave, seguido de esto te pide una nueva clave, y por último actualiza la informacion en la RealTime DataBase.

![image](https://github.com/user-attachments/assets/dfc13145-d39a-4724-85c4-d0a86656db5d) ![image](https://github.com/user-attachments/assets/74e8fbe3-268d-49f1-919b-94624bfbad02)


### Opción 3
Al usar la tercera opción solo se le pedira el nombre de usuario que quiera eliminar, esto eliminara tambien la clave asociada.

![image](https://github.com/user-attachments/assets/17ab43e4-1ff6-4db1-bbfb-d2c5fb1f2f7e) ![image](https://github.com/user-attachments/assets/24a2b1d5-ccbc-4ce8-a466-f7bc256f8a7a)


### Opción 4
La última opción hace lo que su nombre índica y termina con la aplicación.


![image](https://github.com/user-attachments/assets/af28b9eb-cc59-433d-89bb-9de4417afe11)



