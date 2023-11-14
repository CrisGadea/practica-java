import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        // Declaración de variables y constantes en Java
        //int numero = 10;

        // Constantes
        //final String fecha_nacimiento = "18/12/1996";

        //System.out.println("Nací el día: " + fecha_nacimiento);
        //System.out.println("Hola mundo desde Java");

        // Array de 10 nombres en Java
        //String nombres [];
        // Inicializo el Array
        //nombres = new String[10];

        //int edad = 20;

        // Asigno valores al Array
        // 0 1 2 3 4 5 6 7 8 9

        // En el primer índice, asigno el nombre Cristian
//        nombres[0] = "Cristian";
//        nombres[1] = "Juan";
//        nombres[2] = "Micaela";
//        nombres[3] = "Gio";
//        nombres[4] = "Gloria";
//        nombres[5] = "Carmen";

        //System.out.println(nombres[0]);

//        for (int i = 0; i < nombres.length; i++){
//            System.out.println(nombres[i]);
//        }

        // FOR EACH: por cada elemento del array, partiendo desde el elemento del indice 0
        // recorremos los elementos uno por uno hasta el último nombres[0]-nombres[9]
//        for (String nombre: nombres) {
//            if (nombre != null) System.out.println(nombre);
//        }

        //int i = 0;
        // DO WHILE
//        do {
//            if (nombres[i] != null) System.out.println(nombres[i]);
//            i++;
//        }while (i < nombres.length);

        //String respuesta;

        // Operador ternario condicion ? (resultado ok) : (resultado negativo)
        //respuesta = edad > 18 ? "Es mayor de edad" : "Es menor de edad";

        //System.out.println(respuesta);


        // Actividad: Tabla de multiplicar dinámica por consola

        // System.out.print/println: Mostarmos datos por consola
        // Para capturar datos por teclado declaramos un objeto del tipo Scanner
//        Scanner sc = new Scanner(System.in);
//
//        int opcion = 0;
//        while (opcion != 3){
//            System.out.println("---------- Menú ----------");
//            System.out.println("Ingrese una opción:");
//            System.out.println("1) Ingresar número");
//            System.out.println("2) Mostrar tabla del numero (hasta el 10)");
//            System.out.println("3) Salir");
//            opcion = sc.nextInt();
//            int number = 0;
//            switch (opcion){
//                case 1:
//                    System.out.println("Ingrese el número para obtener su tabla de multiplicar:");
//                    numero = sc.nextInt();
//                    break;
//                case 2:
//                    for (int j = 0; j <= 10; j++){
//                        System.out.println(numero + " * " + j + " = " + numero * j);
//                    }
//                    break;
//                case 3:
//                    System.out.println("Salimos del sistema");
//                    break;
//                default:
//                    System.out.println("Ingrese una opción correcta");
//            }
//        }



        // POO Clase Animal
        // Instanciar un objeto de la clase Animal
        Animal firulais = new Animal("Firulais", "caniche", "marrón", 2, "perro");

        System.out.println("Primera ejecución: " + firulais.getNombre());
        firulais.setNombre("Firulaisito");
        System.out.println("Segunda ejecución: " + firulais.getNombre());

    }
}
