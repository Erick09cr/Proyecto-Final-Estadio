
package Clase;

import java.util.ArrayList;
public class ClaseEstadio {
    public int cedula, graderia,total, palco;
    public String nombre;
    
    public ClaseEstadio(){
        
    }

    public ClaseEstadio(int cedula, int graderia, int palco, String nombre) {
        this.cedula = cedula;
        this.graderia = graderia;
        this.palco=palco;
        this.nombre = nombre;
        
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getGraderia() {
        return graderia;
    }

    public void setGraderia(int graderia) {
        this.graderia = graderia;
    }

    public int getPalco() {
        return palco;
    }

    public void setPalco(int palco) {
        this.palco = palco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    
    public void arrayClaseEstadio(){
        ArrayList ClaseEstadio = new ArrayList();
    }
    //funcion//
    public ArrayList array(){
        ArrayList ClaseEstadio = new ArrayList();
        return ClaseEstadio;
    }
}