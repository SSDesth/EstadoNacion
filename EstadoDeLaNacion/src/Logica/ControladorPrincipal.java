
package Logica;

import Datos.*;
import UI.*;
import java.io.File;
import javax.swing.JFrame;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

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
    
    public void frmVentanaPrincipal(){
        ventana.dispose();
        ventana= new FrmVentanaPrincipal();
        ventana.setVisible(true);
    }
    
     /**
     * Este metodo Busca un archivo XML en el URL dado y carga la tabla
     * periodica
     *
     * @param URL: String
     */
    public void leerXML(String URL) {
        try {
            //--------Crea el contexto JAXB--------//
            JAXBContext ctx = JAXBContext.newInstance(Pais.class);
            //--------Crea la clase que permite leer archivo XML
            Unmarshaller ums = ctx.createUnmarshaller();

            miPais = (Pais) ums.unmarshal(new File(URL)); //error

        } catch (JAXBException ex) {
            System.out.println(ex.toString());
        }

    }
    
    public Canton RetornarCanton(String entradaProvincia,String entradaCanton){
        return miPais.RetornarCanton(entradaProvincia, entradaCanton);
    }
    
    public Provincia RetornarProvincia(String entradaProvincia){
        return miPais.RetornarProvincia(entradaProvincia);
    }
}
