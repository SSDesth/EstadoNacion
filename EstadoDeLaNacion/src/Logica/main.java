/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author SSDesth
 */
public class main {
    public static ControladorPrincipal micontrolador;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      micontrolador = new ControladorPrincipal();
      micontrolador.leerXML("src/Archivos/Pais.xml");
      System.out.println(micontrolador.getMiPais().toString());
      micontrolador.frmInicial();
      
      
    }
    
}
