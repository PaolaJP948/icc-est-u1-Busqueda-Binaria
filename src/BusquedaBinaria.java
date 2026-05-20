import models.Product;

public class BusquedaBinaria {
    public void sortByName(Product[] products){

        for( int i= 0; i< products.length - 1; i++){

            boolean swap = false;
            for(int j=0; j < products.length -1 -i ; j++){
                if(products[j]. getNombre().compareTo(products[j+1].getNombre()) > 0 ){
                    Product aux = products[ j];
                    products[j] = products[j+1];
                    products[j+1] = aux;

                    swap = true;
                }
                    
            }
            if(!swap){
                break;
            }
        }
    }
                
    public int findByName(Product[] products, String nombre){
         int bajo = 0;
        int alto = products.length - 1;

        while( bajo <= alto){
            //definamos punto medio
            int central = (bajo + alto)/2;
            //comparemos con la clave
            if (products[central].getNombre().equals(nombre)){
                return central;
            }
            // si voy a eer izq o derecha
            if(products[central].getNombre().compareTo(nombre)> 0){
                bajo = central +1;

            }else{
                alto = central - 1;
            }
            //si es igual, retornamos el punto medio
            //si es mayor actualizamos el index correspondiente
        }
        return -1; //no encontrado
    }

    

}
