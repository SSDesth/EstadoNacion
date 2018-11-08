
package Datos;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SSDesth
 */
@XmlRootElement
public class Pais  {
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

    @Override
    public String toString() {
        String salida="";
        for(Provincia aux:listaProvincias){
            salida+=aux.toString()+"\n\n";
        }
        return salida;
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
    
    /**
     * Metodo encargado  de retornar una provincia en espesifico
     * 
     * @param nombreProvincia:string
     * @return Provincia
     */
    public Provincia RetornarProvincia(String nombreProvincia) {
        for (Provincia aux:listaProvincias){
            if(aux.getNombre().equals(nombreProvincia)){
                return aux;
            }
        }
        return null;
    }
    
    
}
