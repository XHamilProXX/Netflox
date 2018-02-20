/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Peliculas.Netflix;
import Peliculas.Pelicula;

/**
 *
 * @author colsam-17
 */
public class pruebapeli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula p1= new Pelicula (1,"Rambo",120,"Accion");
        Pelicula p2= new Pelicula (2,"Cars",90,"Infantil");
        Pelicula p3= new Pelicula (3,"Barney",700,"Accion,Terror");
        Netflix n = new Netflix();
        n.agregarPelicula(p1);
        n.agregarPelicula(p2);
        n.agregarPelicula(p3);
        n.mostrarLista();
        n.eliminarPelicula(p3);
        n.mostrarLista();
        System.out.println("La pelicula: "+ p1.getNombre()+"tiene una duracion de "+ p1.getDuracion());
        
   }
    
}
