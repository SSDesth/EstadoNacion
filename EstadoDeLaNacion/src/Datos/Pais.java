
package Datos;

import java.util.List;

/**
 *
 * @author SSDesth
 */
public class Pais {
    /*----------Variables----------*/
    private List<Provincia> listaProvincias;
    
    /*----------Constructor(es)----------*/
    public Pais(){}

    /*----------Setters y Getters---------*/

    public List<Provincia> getListaProvincias() {
        return listaProvincias;
    }

    public void setListaProvincias(List<Provincia> listaProvincias) {
        this.listaProvincias = listaProvincias;
    }
    
    /*----------Metodos especielizados---------*/
    
    /**
     * Metodo encargado de buscar una provincia y luego llamar a su metodo de 
     * busqueda de cantons para luego retornar este ultimo
     * 
     * @param nombreProvincia : String
     * @param nombreCanton : String
     * @return Canton
     */
    public Canton RetornarCanton(String nombreProvincia, String nombreCanton) {
        for (Provincia aux:listaProvincias){
            if(aux.getNombre().equals(nombreProvincia)){
                return aux.RetornarCanton(nombreCanton);
            }
        }
        return null;
    }
    
    
}
