/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author SSDesth
 */
@XmlType()
public class Canton {
    /*----------Variables----------*/
    
    //caracteristicas demograficas
    private String nombre;
    private int poblacion;
    private double densidad;
    //caracteristicas educativas
    private double alfabetismo;
    //caracteristicas economicas
    private double fuersaDeTrabajo;
    //caracteristicas sociales
    private double extranjeros;
    private double discapacitados;
    
    /*----------Constructor(es)----------*/
    public Canton() {
    }

    /*----------Setters y Getters----------*/
    
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
    
    /*----------metodos especializados----------*/

    @Override
    public String toString() {
        return "Caracteristicas Demograficas" +
                "\nNombre: " + nombre +
                "\nPoblacion: " + poblacion +
                "\nDensidad: " +  densidad +
                "\nCaracteristicas Educativa"+
                "\nAlfabetismo: " + alfabetismo;
    }
    
    
    
}
