/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Tony
 */
public class procesos extends Thread{ //extiende o hereda metodos de la clase Thread de java
    public  procesos(String pros){//crear constructor de la clase procesos 
        super (pros);//con esta funcion hereda las propiedades de la clase thread
        
    }
    public void run(){// metodo de ejecucion
        for(int i=0;i<10;i++){
            System.out.println(this.getName());
        }
            
    }
}
