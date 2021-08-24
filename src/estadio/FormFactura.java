
package estadio;

import javax.swing.*;
import java.util.ArrayList;
import BasedeDatos.ArrayListEstadio;
import Clase.ClaseEstadio;
import estadio.FormEstadio;
 
public class FormFactura extends javax.swing.JFrame {

    int index = -1;
    ArrayListEstadio arrayEst = new ArrayListEstadio();
    
        public FormFactura() {
        initComponents();
        
        Tcedula.setEnabled(true);
        Tnombre.setEnabled(false);
        Tgraderia.setEnabled(false);
        Tpalco.setEnabled(false);
        Ttotal.setEnabled(false);
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tcedula = new javax.swing.JTextField();
        Tnombre = new javax.swing.JTextField();
        Tgraderia = new javax.swing.JTextField();
        Tpalco = new javax.swing.JTextField();
        Ttotal = new javax.swing.JTextField();
        Facturar = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Factura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 19, -1, -1));

        jLabel2.setText("Cedula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, -1, -1));

        jLabel4.setText("Graderia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, -1, -1));

        jLabel5.setText("Palco");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 234, -1, -1));

        jLabel6.setText("Total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 298, -1, -1));

        Tcedula.setName("Tcedula"); // NOI18N
        getContentPane().add(Tcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 61, 81, -1));

        Tnombre.setName("Tnombre"); // NOI18N
        getContentPane().add(Tnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 115, 81, -1));

        Tgraderia.setName("Tgraderia"); // NOI18N
        getContentPane().add(Tgraderia, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 173, 68, -1));

        Tpalco.setName("Tpalco"); // NOI18N
        getContentPane().add(Tpalco, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 231, 68, -1));

        Ttotal.setName("Ttotal"); // NOI18N
        getContentPane().add(Ttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 295, 68, -1));

        Facturar.setText("Facturar");
        Facturar.setName("Bfacturar"); // NOI18N
        Facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturarActionPerformed(evt);
            }
        });
        getContentPane().add(Facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 352, -1, -1));

        Bsalir.setText("Salir");
        Bsalir.setName("Bsalir"); // NOI18N
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });
        getContentPane().add(Bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 352, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        dispose();
    }//GEN-LAST:event_BsalirActionPerformed

    private void FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturarActionPerformed
         boolean v = false;
        
        if(Tcedula.getText().isEmpty()){

            JOptionPane.showMessageDialog(null,
                "Ingrese un numero de cedula");
        }
        else{
            int cod = Integer.parseInt(Tcedula.getText());
            for (int i = 0; i<arrayEst.array_ClaseEstadio.size();i++){
                ClaseEstadio est= (ClaseEstadio)arrayEst.array_ClaseEstadio.get(i);

                if(arrayEst.array_ClaseEstadio.get(i).getCedula() == cod){
                    v = true;
                   
                }
            }
            if (v ==true){
              
                for (int i = 0; i<arrayEst.array_ClaseEstadio.size(); i++){

                     ClaseEstadio est= (ClaseEstadio)arrayEst.array_ClaseEstadio.get(i);

                    if(arrayEst.array_ClaseEstadio.get(i).getCedula() == cod){
                        
                        Tcedula.setText(String.valueOf(est.getCedula()));
                        Tnombre.setText(est.getNombre());
                        Tgraderia.setText(String.valueOf(est.getGraderia()));
                        Tpalco.setText(String.valueOf(est.getPalco()));
                        
                        String totalP = Tpalco.getText();
                        String totalG = Tgraderia.getText();
                        
                        int totp = Integer.parseInt(totalP)*12000;
                        int totg = Integer.parseInt(totalG)*5000;
                        int total = totp+totg;
                        Ttotal.setText( ""+total);
                        
                    }
                    
                }
               
                    
            }
            else{
                JOptionPane.showMessageDialog(null,
                    "Compra no encontrada");
            }
        }
               
    }//GEN-LAST:event_FacturarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsalir;
    private javax.swing.JButton Facturar;
    private javax.swing.JTextField Tcedula;
    private javax.swing.JTextField Tgraderia;
    private javax.swing.JTextField Tnombre;
    private javax.swing.JTextField Tpalco;
    private javax.swing.JTextField Ttotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
