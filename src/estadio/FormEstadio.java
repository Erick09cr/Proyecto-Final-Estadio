
package estadio;

import javax.swing.*;
import java.util.ArrayList;
import BasedeDatos.ArrayListEstadio;
import Clase.ClaseEstadio;

public class FormEstadio extends javax.swing.JFrame {

    int index = -1;
    ArrayListEstadio arrayEst = new ArrayListEstadio();
    
    public FormEstadio() {
        initComponents();
        
        Tcedula.setEnabled(true);
        Tnombre.setEnabled(true);
        Tgraderia.setEnabled(true);
        Tpalco.setEnabled(true);
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tnombre = new javax.swing.JTextField();
        Tgraderia = new javax.swing.JTextField();
        Tpalco = new javax.swing.JTextField();
        Bcomprar = new javax.swing.JButton();
        Bfactura = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();
        Tcedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Estadio Nacional");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 178, 37));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cédula");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gradería Sombra");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Palco");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        Tnombre.setToolTipText("");
        Tnombre.setName("Tnombre"); // NOI18N
        Tnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnombreActionPerformed(evt);
            }
        });
        getContentPane().add(Tnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 147, 174, -1));

        Tgraderia.setName("Tgraderia"); // NOI18N
        getContentPane().add(Tgraderia, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 223, 68, -1));

        Tpalco.setName("Tpalco"); // NOI18N
        getContentPane().add(Tpalco, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 58, -1));

        Bcomprar.setText("Comprar");
        Bcomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcomprarActionPerformed(evt);
            }
        });
        getContentPane().add(Bcomprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 394, -1, -1));
        Bcomprar.getAccessibleContext().setAccessibleName("Bcomprar");

        Bfactura.setText("Factura");
        Bfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(Bfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 394, -1, -1));

        Bsalir.setText("Salir");
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });
        getContentPane().add(Bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 394, -1, -1));
        Bsalir.getAccessibleContext().setAccessibleName("Bsalir");

        Tcedula.setName("Tcedula"); // NOI18N
        getContentPane().add(Tcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 83, 174, -1));
        Tcedula.getAccessibleContext().setAccessibleName("");

        jLabel7.setText("Precio de Gradería Sombra : 5000");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 250, 30));

        jLabel8.setText("Precio de Palco: 12000");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnombreActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        dispose();
    }//GEN-LAST:event_BsalirActionPerformed

    private void BcomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcomprarActionPerformed
        boolean v = false;
        if(Tcedula.getText().isEmpty()|| Tnombre.getText().isEmpty()
        || Tgraderia.getText().isEmpty() || 
        Tpalco.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "No se permiten espacios en blanco");
        }
        else{
            int ced = Integer.parseInt(Tcedula.getText());
            for(int i = 0; i<arrayEst.array_ClaseEstadio.size();i++) {
                ClaseEstadio est= (ClaseEstadio)arrayEst.array_ClaseEstadio.get(i);
                if(arrayEst.array_ClaseEstadio.get(i).getCedula()==ced){
                    v = true;
                }
            }
            if(v == true){
                JOptionPane.showMessageDialog(null,"El codigo ya existe, ingrese otro codigo");
            }
            else{
                int cedula = Integer.parseInt(Tcedula.getText());
                String nombre = String.valueOf(Tnombre.getText());
                int graderia = Integer.parseInt(Tgraderia.getText());
                int palco = Integer.parseInt(Tpalco.getText());
                
               
                //metodo de agregar//
                arrayEst.Comprar(cedula, graderia, palco, nombre);
            }
        }
        
        Tcedula.setText("");
        Tnombre.setText("");
        Tgraderia.setText("");
        Tpalco.setText("");
      
       
       
      
                                       

    }//GEN-LAST:event_BcomprarActionPerformed

    private void BfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfacturaActionPerformed
         FormFactura fac = new FormFactura();
          fac.setVisible(true);
       
    }//GEN-LAST:event_BfacturaActionPerformed
/**/

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEstadio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcomprar;
    private javax.swing.JButton Bfactura;
    private javax.swing.JButton Bsalir;
    private javax.swing.JTextField Tcedula;
    private javax.swing.JTextField Tgraderia;
    private javax.swing.JTextField Tnombre;
    private javax.swing.JTextField Tpalco;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}