/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncrdesarrollo.construcciongraficasprimitivas;

import com.ncrdesarrollo.construcciongraficasprimitivas.clases.DibujarAcopladas;
import com.ncrdesarrollo.construcciongraficasprimitivas.clases.DibujarCirculos;
import com.ncrdesarrollo.construcciongraficasprimitivas.clases.DibujarLineas;
import com.ncrdesarrollo.construcciongraficasprimitivas.clases.DibujarPoligono;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Norbey
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);

    }

    void HacerLineas() {
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 200, 290, 200, 200);
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 250, 260, 250, 170);
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 350, 260, 350, 170);
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 300, 290, 300, 200);
        
        //techo
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 200, 200, 250, 170);
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 250, 170, 350, 170);
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 350, 170, 300, 200);
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 300, 200, 200, 200);
        
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 200, 290, 250, 260);
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 250, 260, 350, 260);
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 350, 260, 300, 290);
        DibujarLineas.HacerLinea(panel_lineas.getGraphics(), 300, 290, 200, 290);
    }
    
    void Cucarron(){
        
        DibujarCirculos.HacerCapaRoja(panel_circulos.getGraphics(), 200, 200, 180, 180);
        DibujarCirculos.HacerLineaCentro(panel_circulos.getGraphics(), 290, 240, 290, 380);
        DibujarCirculos.HacerCirculoCentro(panel_circulos.getGraphics(), 265, 265, 50, 50);
        
        DibujarCirculos.HacerCirculoAmarillo(panel_circulos.getGraphics(), 230, 240, 20, 20);
        DibujarCirculos.HacerCirculoAmarillo(panel_circulos.getGraphics(), 215, 283, 20, 20);
        DibujarCirculos.HacerCirculoAmarillo(panel_circulos.getGraphics(), 230, 325, 20, 20);
        
        DibujarCirculos.HacerCirculoAmarillo(panel_circulos.getGraphics(), 330, 240, 20, 20);
        DibujarCirculos.HacerCirculoAmarillo(panel_circulos.getGraphics(), 345, 283, 20, 20);
        DibujarCirculos.HacerCirculoAmarillo(panel_circulos.getGraphics(), 330, 325, 20, 20);
        
        DibujarCirculos.HacerCirculoOjo(panel_circulos.getGraphics(), 260, 173, 30, 30);
        DibujarCirculos.HacerCirculoOjo(panel_circulos.getGraphics(), 285, 173, 30, 30);
        
        DibujarCirculos.HacerCirculoOjoBlanco(panel_circulos.getGraphics(), 270, 175, 15, 15);
        DibujarCirculos.HacerCirculoOjoBlanco(panel_circulos.getGraphics(), 290, 175, 15, 15);
        
        DibujarCirculos.HacerCirculoPatasAzules(panel_circulos.getGraphics(), 170, 200, 15, 15);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 185, 208, 200, 203);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 200, 203, 220, 230);
        
        DibujarCirculos.HacerCirculoPatasVerdes(panel_circulos.getGraphics(), 140, 275, 15, 15);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 150, 275, 165, 260);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 165, 260, 200, 265);
        
        DibujarCirculos.HacerCirculoPatasNaranjas(panel_circulos.getGraphics(), 175, 390, 15, 15);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 183, 390, 183, 370);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 183, 370, 215, 343);
        
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 355, 230, 380, 205);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 380, 205, 370, 180);
        DibujarCirculos.HacerCirculoPatasAzules(panel_circulos.getGraphics(), 365, 175, 15, 15);
        
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 373, 260, 410, 255);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 410, 255, 425, 275);
        DibujarCirculos.HacerCirculoPatasVerdes(panel_circulos.getGraphics(), 422, 272, 15, 15);
        
        DibujarCirculos.HacerCirculoPatasNaranjas(panel_circulos.getGraphics(), 415, 378, 15, 15);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 360, 343, 400, 360);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 400, 360, 417, 380);
        
        //dibujar las antenas
        DibujarCirculos.HacerCirculoOjo(panel_circulos.getGraphics(), 245, 150, 10, 10);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 250, 155, 270, 155);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 270, 155, 270, 180);
        
        DibujarCirculos.HacerCirculoOjo(panel_circulos.getGraphics(), 320, 150, 10, 10);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 320, 155, 305, 155);
        DibujarCirculos.HacerLineaPata(panel_circulos.getGraphics(), 305, 155, 305, 200);
    }
    
    void Gallo(){
        
        DibujarPoligono.Poligono1(panel_poligonos.getGraphics());
        DibujarPoligono.Poligono2(panel_poligonos.getGraphics());
        DibujarPoligono.Poligono3(panel_poligonos.getGraphics());
        DibujarPoligono.Poligono4(panel_poligonos.getGraphics());
        DibujarPoligono.Poligono5(panel_poligonos.getGraphics());
        DibujarPoligono.Poligono6(panel_poligonos.getGraphics());
        DibujarPoligono.Poligono7(panel_poligonos.getGraphics());
        DibujarPoligono.Poligono8(panel_poligonos.getGraphics());
        DibujarPoligono.Poligono9(panel_poligonos.getGraphics());
        DibujarPoligono.Poligono10(panel_poligonos.getGraphics());
        
        DibujarPoligono.HacerCirculoPata(panel_poligonos.getGraphics(), 200, 329, 50, 10);
    }
    
    void Acopladas(){
    
        DibujarAcopladas.Chasis(panel_acopladas.getGraphics());
        DibujarAcopladas.CirculoRueda(panel_acopladas.getGraphics(), 145, 260, 20, 20);
        DibujarAcopladas.CirculoRueda(panel_acopladas.getGraphics(), 115, 230, 80, 80);
        DibujarAcopladas.CirculoRueda(panel_acopladas.getGraphics(), 300, 260, 20, 20);
        DibujarAcopladas.CirculoRueda(panel_acopladas.getGraphics(), 270, 230, 80, 80);
        DibujarAcopladas.Cabina1(panel_acopladas.getGraphics());
        DibujarAcopladas.Cabina2(panel_acopladas.getGraphics());
        DibujarAcopladas.Cabina3(panel_acopladas.getGraphics());
        DibujarAcopladas.Cabina4(panel_acopladas.getGraphics());
        DibujarAcopladas.Bomper(panel_acopladas.getGraphics());
        DibujarAcopladas.Chimenea(panel_acopladas.getGraphics());
        DibujarAcopladas.Poligono(panel_acopladas.getGraphics());
        DibujarAcopladas.BomperTrasero1(panel_acopladas.getGraphics());
        DibujarAcopladas.BomperTrasero2(panel_acopladas.getGraphics());
        
        //dibujando el bagon 1
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 190, 240, 190, 170);
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 218, 170, 218, 240);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 190,160,28,20,0,180);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 190,230,28,20,180,180);
        //bagon 2
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 220, 240, 220, 170);
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 248, 170, 248, 240);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 220,160,28,20,0,180);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 220,230,28,20,180,180);
        //bagon 3
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 250, 240, 250, 170);
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 278, 170, 278, 240);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 250,160,28,20,0,180);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 250,230,28,20,180,180);
        //bagon 4
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 280, 240, 280, 170);
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 308, 170, 308, 240);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 280,160,28,20,0,180);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 280,230,28,20,180,180);
        //bagon 5
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 310, 240, 310, 170);
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 338, 170, 338, 240);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 310,160,28,20,0,180);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 310,230,28,20,180,180);
        //bagon 3
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 340, 240, 340, 170);
        DibujarAcopladas.HacerLinea(panel_acopladas.getGraphics(), 368, 170, 368, 240);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 340,160,28,20,0,180);
        DibujarAcopladas.Arco(panel_acopladas.getGraphics(), 340,230,28,20,180,180);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_lineas = new javax.swing.JPanel();
        btn_lineas = new javax.swing.JButton();
        panel_circulos = new javax.swing.JPanel();
        btn_circulo = new javax.swing.JButton();
        panel_poligonos = new javax.swing.JPanel();
        btn_poligono = new javax.swing.JButton();
        panel_acopladas = new javax.swing.JPanel();
        btn_acopladas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(562, 562));

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_lineas.setBackground(new java.awt.Color(255, 255, 255));
        btn_lineas.setForeground(new java.awt.Color(102, 102, 102));
        btn_lineas.setText("Clic aquí para mostrar el dibujo");
        btn_lineas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lineasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_lineasLayout = new javax.swing.GroupLayout(panel_lineas);
        panel_lineas.setLayout(panel_lineasLayout);
        panel_lineasLayout.setHorizontalGroup(
            panel_lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lineasLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btn_lineas)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        panel_lineasLayout.setVerticalGroup(
            panel_lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lineasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_lineas)
                .addContainerGap(483, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lineas", panel_lineas);

        btn_circulo.setBackground(new java.awt.Color(255, 255, 255));
        btn_circulo.setForeground(new java.awt.Color(102, 102, 102));
        btn_circulo.setText("Clic aquí para mostrar el dibujo");
        btn_circulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_circuloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_circulosLayout = new javax.swing.GroupLayout(panel_circulos);
        panel_circulos.setLayout(panel_circulosLayout);
        panel_circulosLayout.setHorizontalGroup(
            panel_circulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_circulosLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btn_circulo)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        panel_circulosLayout.setVerticalGroup(
            panel_circulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_circulosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_circulo)
                .addContainerGap(483, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Circulos", panel_circulos);

        btn_poligono.setBackground(new java.awt.Color(255, 255, 255));
        btn_poligono.setForeground(new java.awt.Color(102, 102, 102));
        btn_poligono.setText("Clic aquí para mostrar el dibujo");
        btn_poligono.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_poligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_poligonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_poligonosLayout = new javax.swing.GroupLayout(panel_poligonos);
        panel_poligonos.setLayout(panel_poligonosLayout);
        panel_poligonosLayout.setHorizontalGroup(
            panel_poligonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_poligonosLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btn_poligono)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        panel_poligonosLayout.setVerticalGroup(
            panel_poligonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_poligonosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_poligono)
                .addContainerGap(483, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Polígonos", panel_poligonos);
        panel_poligonos.getAccessibleContext().setAccessibleName("Lineas");

        btn_acopladas.setBackground(new java.awt.Color(255, 255, 255));
        btn_acopladas.setForeground(new java.awt.Color(102, 102, 102));
        btn_acopladas.setText("Clic aquí para mostrar el dibujo");
        btn_acopladas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_acopladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acopladasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_acopladasLayout = new javax.swing.GroupLayout(panel_acopladas);
        panel_acopladas.setLayout(panel_acopladasLayout);
        panel_acopladasLayout.setHorizontalGroup(
            panel_acopladasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_acopladasLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btn_acopladas)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        panel_acopladasLayout.setVerticalGroup(
            panel_acopladasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_acopladasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_acopladas)
                .addContainerGap(483, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Imagenes acopladas", panel_acopladas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lineasActionPerformed
        // TODO add your handling code here:

        //btn_lineas.setVisible(false);
        HacerLineas();
    }//GEN-LAST:event_btn_lineasActionPerformed

    private void btn_circuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_circuloActionPerformed
        // TODO add your handling code here:
        Cucarron();
    }//GEN-LAST:event_btn_circuloActionPerformed

    private void btn_poligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_poligonoActionPerformed
        // TODO add your handling code here:
        Gallo();
    }//GEN-LAST:event_btn_poligonoActionPerformed

    private void btn_acopladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acopladasActionPerformed
        // TODO add your handling code here:
        Acopladas();
    }//GEN-LAST:event_btn_acopladasActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acopladas;
    private javax.swing.JButton btn_circulo;
    private javax.swing.JButton btn_lineas;
    private javax.swing.JButton btn_poligono;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel_acopladas;
    private javax.swing.JPanel panel_circulos;
    private javax.swing.JPanel panel_lineas;
    private javax.swing.JPanel panel_poligonos;
    // End of variables declaration//GEN-END:variables
}
