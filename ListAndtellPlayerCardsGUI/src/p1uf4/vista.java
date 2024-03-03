/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1uf4;

import generated.CartaType;
import generated.ClashType;
import generated.JugadorType;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBException;
import pràctica.pkg3.pkg1.jabx.binding.i.unmarshaller.Controlador;

/**
 *
 * @author AluCiclesGS1
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    public vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        nomJugador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taulaJugadors = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCartes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("List Players");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nomJugador.setText("Player Name");
        nomJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomJugadorActionPerformed(evt);
            }
        });

        taulaJugadors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nom", "Copes", "Nivell"
            }
        ));
        jScrollPane1.setViewportView(taulaJugadors);

        TableCartes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nom", "Nivell", "Rareza"
            }
        ));
        jScrollPane2.setViewportView(TableCartes);

        jLabel1.setText("List of player");

        jLabel2.setText("List of player cards");

        jButton3.setText("List Cards");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws JAXBException {//GEN-FIRST:event_jButton4ActionPerformed

        ClashType c = Controlador.carrega("./clash.xml");
        ArrayList<JugadorType> jugadors =(ArrayList<JugadorType>) c.getJugador();
        DefaultTableModel model = (DefaultTableModel) taulaJugadors.getModel();
        model.setRowCount(0);
        for(JugadorType jug: jugadors){
            
           
            //System.out.println(jug.getNom());
            Vector oneRow = new Vector();
            oneRow.add(jug.getNom());
            oneRow.add((jug.getCopes()));
            oneRow.add(Integer.toString(jug.getNivell()));
            oneRow.add(jug.getClan());
            model.addRow(oneRow);
            taulaJugadors.setModel(model);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        ClashType c = null;
        try {
            c = Controlador.carrega("./clash.xml");
        } catch (JAXBException ex) {
            Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<JugadorType> jugadors =(ArrayList<JugadorType>) c.getJugador();
        DefaultTableModel model = (DefaultTableModel) taulaJugadors.getModel();
        model.setRowCount(0);
        for(JugadorType jug: jugadors){
            
           
            //System.out.println(jug.getNom());
            Vector oneRow = new Vector();
            oneRow.add(jug.getNom());
            oneRow.add((jug.getCopes()));
            oneRow.add(Integer.toString(jug.getNivell()));
            oneRow.add(jug.getClan());
            model.addRow(oneRow);
            taulaJugadors.setModel(model);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nomJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomJugadorActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_nomJugadorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       try {
            // TODO add your handling code here:
            ClashType c = null;

            c = Controlador.carrega("./clash.xml");

            ArrayList<JugadorType> jugadors = (ArrayList<JugadorType>) c.getJugador();

            for (JugadorType jug : jugadors) {

                if (jug.getNom().equals(nomJugador.getText())) {

                    ArrayList<CartaType> cartes = (ArrayList<CartaType>) jug.getCarta();
                    DefaultTableModel model = (DefaultTableModel) TableCartes.getModel();
                    model.setRowCount(0);
                    for (CartaType car : cartes) {
 
                        //System.out.println(jug.getNom());
                        Vector oneRow = new Vector();
                        oneRow.add(car.getNomcart());
                        oneRow.add(Integer.toString(car.getNivellcart()));
                        oneRow.add(car.getRaresa());
                        model.addRow(oneRow);
                        TableCartes.setModel(model);
                    }

                }

             
            }
        } catch (JAXBException ex) {
            Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableCartes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomJugador;
    private javax.swing.JTable taulaJugadors;
    // End of variables declaration//GEN-END:variables
}
