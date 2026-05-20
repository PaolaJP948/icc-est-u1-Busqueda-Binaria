package controllers;

import models.Persona;

public class BusquedaBinariaEdad {
  

    public int findPersonByAge(Persona[] persons, int edadBuscada) {

        sortPersonByAge(persons);

        int bajo = 0;
        int alto = persons.length - 1; 

        while(bajo <= alto){

            int centro = (bajo + alto)/2;
            int valorDelCentro = persons[centro].getEdad();

            for(int i= bajo; i <= alto; i++){
                System.out.print(persons[i].getEdad());

                if( i < alto){
                    System.out.print("|");
                }
            }

            System.out.println();

            String direccion = " ";

            if(valorDelCentro == edadBuscada){
                direccion = "-->  ENCONTRADO ";  
            }else if (valorDelCentro < edadBuscada){
                direccion="-->  DERECHA"; 
            } else{
                direccion = "-->  IZQUIERDA";

            }

            System.out.println("bajo=" + bajo + "    alto=" + alto + "    centro="
                    + centro + "    valorCentro="
                    + valorDelCentro + "  " + direccion);
            if (valorDelCentro == edadBuscada){
                return centro;

            }
            if(valorDelCentro > edadBuscada){
                alto = centro - 1;
            }else{
                bajo = centro + 1;
            }

        }
        return -1;

    }
      public void sortPersonByAge(Persona[]  persons){

        for( int i= 0; i< persons.length - 1; i++){

            boolean swap = false;
            for(int j=0; j < persons.length -1 -i ; j++){
                if(persons[j]. getEdad() > persons[j+1].getEdad()){
                    Persona aux = persons[ j];
                    persons[j] = persons[j+1];
                    persons[j+1] = aux;

                    swap = true;
                }
                    
            }
            if(!swap){
                break;
            }
        }
    }


}




