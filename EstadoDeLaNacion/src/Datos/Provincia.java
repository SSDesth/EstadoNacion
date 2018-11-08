package Datos;

import java.util.*;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author SSDesth
 */
@XmlType()
public class Provincia {

    /*----------variables----------*/
    private String nombre;
    private int poblacion;
    private double densidad;
    private double superficie;
    //caracteristicas educativas
    private double alfabetismo;
    //caracteristicas economicas
    private double fuersaDeTrabajo;
    //caracteristicas sociales
    private double extranjeros;
    private double discapacitados;
    private List<Canton> listaCantones;

    /*----------setters y getters----------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    public double getAlfabetismo() {
        return alfabetismo;
    }

    public void setAlfabetismo(double alfabetismo) {
        this.alfabetismo = alfabetismo;
    }

    public double getFuersaDeTrabajo() {
        return fuersaDeTrabajo;
    }

    public void setFuersaDeTrabajo(double fuersaDeTrabajo) {
        this.fuersaDeTrabajo = fuersaDeTrabajo;
    }

    public double getExtranjeros() {
        return extranjeros;
    }

    public void setExtranjeros(double extranjeros) {
        this.extranjeros = extranjeros;
    }

    public double getDiscapacitados() {
        return discapacitados;
    }

    public void setDiscapacitados(double discapacitados) {
        this.discapacitados = discapacitados;
    }

    public List<Canton> getListaCantones() {
        return listaCantones;
    }

    public void setListaCantones(List<Canton> listaCantones) {
        this.listaCantones = listaCantones;
    }

    @Override
    public String toString() {
        String salida = "";
        salida += "Caracteristicas Demograficas" 
                + "\nNombre: " + nombre
                + "\nPoblacion: " + poblacion
                + "\nDensidad: " + densidad + " personas por Km2"
                + "\nSuperficie: " + superficie + " Km2"
                + "\nCantidad de Cantones: " + listaCantones.size()
                + "\n"
                + "\nCaracteristicas Educativa"
                + "\nAlfabetismo: " + alfabetismo + "%"
                + "\n"
                + "\nCaracteristicas Economicas"
                + "\nFuerza de trabajo: " + fuersaDeTrabajo + "%"
                + "\n"
                + "\nCaracteristicas Sociales"
                + "\nExtranjeros: " + extranjeros + "%"
                + "\nPersonas con alguna discapacidad: " + discapacitados + "%";
        /*for (Canton aux : listaCantones) {
            salida += aux.toString() + "\n";
        }*/
        return salida;
    }

    /*----------metodos especializados----------*/
    /**
     * metodo encargadod e buscar un canton en espesifico y retornarlo
     *
     * @param nombre : String
     * @return Canton
     */
    public Canton RetornarCanton(String nombre) {
        for (Canton aux : listaCantones) {
            if (aux.getNombre().equals(nombre)) {
                return aux;
            }
        }
        return null;
    }

}
