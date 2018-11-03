
package Logica;

import Datos.Pais;
import UI.FrmInicio;
import javax.swing.JFrame;

/**
 *
 * @author SSDesth
 */
public class ControladorPrincipal {
    /*----------variables----------*/
    private Pais miPais;
    private JFrame ventana;
    /*----------Contructor(es)----------*/
    /**
     * Contructor default de la clase
     */
    public ControladorPrincipal() {
        this.miPais= new Pais();
    }
    
    /*----------Setters y getters----------*/

    public Pais getMiPais() {
        return miPais;
    }

    public void setMiPais(Pais miPais) {
        this.miPais = miPais;
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }
    
    /*----------Metodos especificos---------*/
    public void frmInicial(){
        ventana= new FrmInicio();
        ventana.setVisible(true);
    }
}
