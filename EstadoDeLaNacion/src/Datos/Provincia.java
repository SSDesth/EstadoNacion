
package Datos;

import java.util.*;

/**
 *
 * @author SSDesth
 */
public class Provincia {
    /*----------variables----------*/
    private String nombre;
    private List<Canton> listaCantones;
      
    /*----------setters y getters----------*/
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Canton> getListaCantones() {
        return listaCantones;
    }

  
    public void setListaCantones(List<Canton> listaCantones) {    
        this.listaCantones = listaCantones;
    }

    /*----------metodos especializados----------*/
    /**
     * metodo encargadod e buscar un canton en espesifico y retornarlo
     * @param nombre : String
     * @return Canton
     */
    public Canton RetornarCanton(String nombre) {
        for (Canton aux:listaCantones){
            if(aux.getNombre().equals(nombre)){
                return  aux;
            }
        }
        return null;
    }
    
    
    
}
