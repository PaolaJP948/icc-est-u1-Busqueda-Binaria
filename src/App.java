import models.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product[]  products = {
            new Product("Laptop", 20),
            new Product("Smartphone", 25),
            new Product("Tablet", 10),
            new Product("Monitor", 5),
            new Product("Keyboard", 15),
        };

        BusquedaBinaria bBinaria = new BusquedaBinaria();
        for (Product product : products){
            System.out.println(Product);
        }
        int rest = bBinaria.findByName(products, "Monitor");
        if (res >= 0){
            System.out.println("Entre en pos =  " + res);

        }else{
            System.out.println("No se encontro");
        }
    }
}
