import java.util.Scanner;

import controllers.BusquedaBinariaEdad;
import models.Persona;
import models.Product;


public class App {
    public static void main(String[] args) throws Exception {


        Scanner teclado = new Scanner(System.in);
        BusquedaBinariaEdad buscador = new BusquedaBinariaEdad();

        System.out.println("Ingrese el numero de personas: ");
        int cantidad = teclado.nextInt();
        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la Persona: ");
            System.out.print(" Nombre: ");
            String nombre = teclado.next();

            int edad = -1;

            while (edad < 0) {
                System.out.print(" Edad: ");
                edad = teclado.nextInt();
                if (edad < 0) {
                    System.out.println("la edad no puede se menor a cero: ");

                }
            }
            personas[i] = new Persona(nombre, edad);

        }
        System.out.print("Valor de la edad a buscar: ");
        int edadBuscada = teclado.nextInt();
        System.out.println();

        int indiceResultado = buscador.findPersonByAge(personas, edadBuscada);

        if (indiceResultado != -1) {
            System.out.println("La persona con la edad " + edadBuscada + " es " + personas[indiceResultado].getNombre());
        } else {
            System.out.println("No se encontro ninguna persona con la edad " + edadBuscada);
        }
        teclado.close();

        //Main del trabajo en clase

        System.out.println("                                 ");
        System.out.println("                                 ");
        System.out.println("                                 ");
        System.out.println("----------Productos----------");

        Product[]  products = {
            new Product("Laptop", 20),
            new Product("Smartphone", 25),
            new Product("Tablet", 10),
            new Product("Monitor", 5),
            new Product("Keyboard", 15),

        };

        BusquedaBinaria bBinaria = new BusquedaBinaria();

        bBinaria.sortByName(products);

        for (Product product : products){
            System.out.println(product);
        }
        int res = bBinaria.findByName(products, "Monitor");
        if (res >= 0){
            System.out.println("Entre en pos =  " + res);

        }else{
            System.out.println("No se encontro");
        }
    }
}
