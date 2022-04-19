/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Parqueadero.Menu;

import Parquedero.Clases.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Axel
 */
public class Menú extends javax.swing.JFrame {

   FondoPanel fondo= new FondoPanel();
    AjustarImagen escalar= new AjustarImagen();
    
    public Menú() {
        this.setContentPane(fondo);
        initComponents();
        escalar.EscalarLabel(LabelAñadir, "/Parqueadero/imagenes/carros.png");
        escalar.EscalarLabel(LabelBuscar, "/Parqueadero/imagenes/buscar.png");
        escalar.EscalarLabel(LabelEditar, "/Parqueadero/imagenes/icono_editar.png");
        escalar.EscalarLabel(LabelLista, "/Parqueadero/imagenes/nota.png");
        escalar.EscalarLabel(LabelRetirar, "/Parqueadero/imagenes/carro-deportivo.png");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        leerListaClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        LabelEditar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelAñadir = new javax.swing.JLabel();
        LabelBuscar = new javax.swing.JLabel();
        BotonIngresar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonArchivo = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        BotonRetirar = new javax.swing.JButton();
        LabelRetirar = new javax.swing.JLabel();
        LabelLista = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelEditar.setBackground(new java.awt.Color(0, 255, 255));
        LabelEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelEditar.setForeground(new java.awt.Color(255, 51, 51));
        LabelEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LabelEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 70));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Menú");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 128, 49));

        LabelAñadir.setBackground(new java.awt.Color(0, 255, 255));
        LabelAñadir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelAñadir.setForeground(new java.awt.Color(255, 51, 51));
        LabelAñadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LabelAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 70));

        LabelBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelBuscar.setForeground(new java.awt.Color(255, 0, 0));
        LabelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(LabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 90, 70));

        BotonIngresar.setBackground(new java.awt.Color(204, 255, 204));
        BotonIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonIngresar.setForeground(new java.awt.Color(255, 0, 0));
        BotonIngresar.setText("Ingresar Vehiculo");
        BotonIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 143, 48));

        BotonEditar.setBackground(new java.awt.Color(204, 204, 204));
        BotonEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonEditar.setForeground(new java.awt.Color(255, 0, 51));
        BotonEditar.setText("Editar Registros");
        BotonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 143, 48));

        BotonArchivo.setBackground(new java.awt.Color(153, 255, 255));
        BotonArchivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonArchivo.setForeground(new java.awt.Color(255, 0, 0));
        BotonArchivo.setText("Lista de Clientes");
        BotonArchivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 143, 48));

        BotonBuscar.setBackground(new java.awt.Color(255, 255, 204));
        BotonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonBuscar.setForeground(new java.awt.Color(255, 0, 51));
        BotonBuscar.setText("Buscar");
        BotonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 143, 48));

        BotonRetirar.setBackground(new java.awt.Color(204, 204, 255));
        BotonRetirar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonRetirar.setForeground(new java.awt.Color(255, 0, 0));
        BotonRetirar.setText("Retirar Vehiculo");
        BotonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 143, 48));
        jPanel1.add(LabelRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 90, 70));
        jPanel1.add(LabelLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 90, 70));

        jMenu1.setText("Archivo");

        jMenuItem2.setText("Abrir Archivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void leerListaClientes(){
       try {
           FileInputStream fichero=new FileInputStream("clientes.dat");
           ObjectInputStream lectura_fichero=new ObjectInputStream(fichero);
           ArrayList_Parqueo.listaclientes=(ArrayList<Parqueo>)lectura_fichero.readObject();
           lectura_fichero.close();
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }
    
    private void BotonArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArchivoActionPerformed
  // este debe crear el archivo con la lista de clientes 
  InterfazLista vent0 = new InterfazLista();
  vent0.setVisible(true);
  dispose();
    }//GEN-LAST:event_BotonArchivoActionPerformed

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
       Interfaz_AñadirCliente vent= new Interfaz_AñadirCliente();
       vent.setVisible(true);
       dispose();
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        Interfaz_ID_para_Editar vent2= new Interfaz_ID_para_Editar();
        vent2.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonEditarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        InterfazBusqueda vent3=new InterfazBusqueda();
        vent3.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void BotonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRetirarActionPerformed
        Interfaz_Retirar_Vehiculo vent2= new Interfaz_Retirar_Vehiculo();
        vent2.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonRetirarActionPerformed

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
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonArchivo;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonRetirar;
    private javax.swing.JLabel LabelAñadir;
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelEditar;
    private javax.swing.JLabel LabelLista;
    private javax.swing.JLabel LabelRetirar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables



}


