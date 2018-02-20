/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peliculas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author colsam-17
 */
public class Netflix {
    private ArrayList<Pelicula> listaPelicula = new ArrayList<>();

    public Netflix() {
    }
    public void agregarPelicula(Pelicula p){
        listaPelicula.add(p);
    }
    public void eliminarPelicula(Pelicula p){
        listaPelicula.remove(p);
    }
    public void mostrarLista(){
        Iterator<Pelicula> element = listaPelicula.iterator();
        while(element.hasNext()){
            Pelicula p = element.next();
            System.out.println(p.toString());
        }
    }
}
