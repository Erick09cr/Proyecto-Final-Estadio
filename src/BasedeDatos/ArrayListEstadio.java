
package BasedeDatos;

import Clase.ClaseEstadio;
import java.util.ArrayList;
import javax.swing.*;


public class ArrayListEstadio {
    public static ArrayList<ClaseEstadio> array_ClaseEstadio = new ArrayList<ClaseEstadio>();
    
    public void Comprar(int cedula, int graderia, int palco, String nombre){
      
        ClaseEstadio est = new ClaseEstadio();
     
        est.setCedula(cedula);
        est.setNombre(nombre); 
        est.setGraderia(graderia);
        est.setPalco(palco);
        
        
        
        
        array_ClaseEstadio.add(est);
        
        JOptionPane.showMessageDialog(null,"Compra con exito");
        
    }
       public ClaseEstadio getEstadio(int index){
        return (ClaseEstadio) array_ClaseEstadio.get(index);
    }
    
        public int encuentra_Estadio(int cedula){
        int index = -1;
        for(int i=0; i<array_ClaseEstadio.size(); i++){
            ClaseEstadio emp = (ClaseEstadio)array_ClaseEstadio.get(i);
            if(emp.getCedula()== cedula){
                index = i;
            }
        }
        return index;
    }
    
    
}
