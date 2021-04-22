package vista;

import clases.Juego;
import javax.swing.JOptionPane;

public class vistaPruebas extends javax.swing.JFrame {

    public vistaPruebas() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.lblvehiculo1.setText(frmConductor.c1.getNombre());
        this.lblvehiculo2.setText(frmConductor.c2.getNombre());
        this.lblvehiculo3.setText(frmConductor.c3.getNombre());

        lblvehiculo1.setLocation(0, lblvehiculo1.getLocation().y);
        lblvehiculo2.setLocation(0, lblvehiculo2.getLocation().y);
        lblvehiculo3.setLocation(0, lblvehiculo3.getLocation().y);

        this.btnPodio.setVisible(false);
    }

    boolean inicio = false;
    boolean fin = false;
    int avance1 = 0;
    int avance2 = 0;
    int avance3 = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPruebas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblvehiculo3 = new javax.swing.JLabel();
        lblvehiculo2 = new javax.swing.JLabel();
        lblvehiculo1 = new javax.swing.JLabel();
        barrera = new javax.swing.JLabel();
        btnPodio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPruebas.setText("LANZAR DADOS");
        btnPruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebasActionPerformed(evt);
            }
        });

        lblvehiculo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/segundo.png"))); // NOI18N
        lblvehiculo3.setText("Jugador 3");

        lblvehiculo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/auto .png"))); // NOI18N
        lblvehiculo2.setText("Jugador 2");

        lblvehiculo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/segundo.png"))); // NOI18N
        lblvehiculo1.setText("Jugador 1");

        barrera.setBackground(new java.awt.Color(51, 51, 255));
        barrera.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblvehiculo2)
                    .addComponent(lblvehiculo3)
                    .addComponent(lblvehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(barrera, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(barrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblvehiculo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(lblvehiculo2)
                        .addGap(119, 119, 119)
                        .addComponent(lblvehiculo1)))
                .addContainerGap())
        );

        btnPodio.setText("TABLA DE GANADORES");
        btnPodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPodioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnPruebas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 524, Short.MAX_VALUE)
                .addComponent(btnPodio)
                .addGap(133, 133, 133))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPodio)
                    .addComponent(btnPruebas))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebasActionPerformed

        if (!inicio) {

            inicio = true;
            frmConductor.v1.setEtiqueta(lblvehiculo1);
            frmConductor.v2.setEtiqueta(lblvehiculo2);
            frmConductor.v3.setEtiqueta(lblvehiculo3);

            avance1 = avanzar();

            frmConductor.v1.avanzar(avance1);
            frmConductor.v1.setRecorrido(frmConductor.v1.getRecorrido() + avance1 * 10);

            avance2 = avanzar();

            frmConductor.v2.avanzar(avance2);
            frmConductor.v2.setRecorrido(frmConductor.v2.getRecorrido() + avance2 * 10);

            avance3 = avanzar();

            frmConductor.v3.avanzar(avance3);
            frmConductor.v3.setRecorrido(frmConductor.v3.getRecorrido() + avance3 * 10);

        } else {

            avance1 = avanzar();
            frmConductor.v1.avanzar(avance1);
            frmConductor.v1.setRecorrido(frmConductor.v1.getRecorrido() + avance1 * 10);

            avance2 = avanzar();
            frmConductor.v2.avanzar(avance2);
            frmConductor.v2.setRecorrido(frmConductor.v2.getRecorrido() + avance2 * 10);

            avance3 = avanzar();
            frmConductor.v3.avanzar(avance3);
            frmConductor.v3.setRecorrido(frmConductor.v3.getRecorrido() + avance3 * 10);

            if (frmConductor.v1.getRecorrido() >= frmRecorrido.recorrido) {

                JOptionPane.showMessageDialog(null, "GANADOR " + frmConductor.v1.getConductor().getNombre());
                frmConductor.v1.getConductor().setPosicion(1);
                fin = true;

                if (frmConductor.v2.getRecorrido() > frmConductor.v3.getRecorrido()) {

                    frmConductor.v2.getConductor().setPosicion(2);
                    frmConductor.v3.getConductor().setPosicion(3);

                } else {

                    frmConductor.v2.getConductor().setPosicion(3);
                    frmConductor.v3.getConductor().setPosicion(2);
                }
                reset();
                ActualizarPodio();
                this.btnPruebas.setVisible(false);
                this.btnPodio.setVisible(true);
            }
            if (frmConductor.v2.getRecorrido() >= frmRecorrido.recorrido) {

                JOptionPane.showMessageDialog(null, "GANADOR " + frmConductor.v2.getConductor().getNombre());
                frmConductor.v2.getConductor().setPosicion(1);
                fin = true;

                if (frmConductor.v1.getRecorrido() > frmConductor.v3.getRecorrido()) {

                    frmConductor.v1.getConductor().setPosicion(2);
                    frmConductor.v3.getConductor().setPosicion(3);

                } else {

                    frmConductor.v1.getConductor().setPosicion(3);
                    frmConductor.v3.getConductor().setPosicion(2);
                }
                reset();
                ActualizarPodio();
                this.btnPruebas.setVisible(false);
                this.btnPodio.setVisible(true);
            }
            if (frmConductor.v3.getRecorrido() >= frmRecorrido.recorrido) {

                JOptionPane.showMessageDialog(null, "GANADOR " + frmConductor.v3.getConductor().getNombre());
                frmConductor.v3.getConductor().setPosicion(1);
                fin = true;

                if (frmConductor.v2.getRecorrido() > frmConductor.v1.getRecorrido()) {

                    frmConductor.v2.getConductor().setPosicion(2);
                    frmConductor.v1.getConductor().setPosicion(3);

                } else {

                    frmConductor.v2.getConductor().setPosicion(3);
                    frmConductor.v1.getConductor().setPosicion(2);
                }
                reset();
                ActualizarPodio();
                this.btnPruebas.setVisible(false);
                this.btnPodio.setVisible(true);
            }

        }
    }//GEN-LAST:event_btnPruebasActionPerformed

    private void btnPodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPodioActionPerformed
        frmPodio pd = new frmPodio();
        pd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPodioActionPerformed

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
            java.util.logging.Logger.getLogger(vistaPruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaPruebas().setVisible(true);
            }
        });
    }

    public static int avanzar() {
        return ((int) (Math.random() * 6 + 1)) * 10;
    }

    public static void ActualizarPodio() {
        Juego juego = new Juego();
        if (!juego.registrarPodio(frmConductor.v1.getConductor().getNombre(), frmConductor.v1.getConductor().getPosicion()) || !juego.registrarPodio(frmConductor.v2.getConductor().getNombre(), frmConductor.v2.getConductor().getPosicion()) || !juego.registrarPodio(frmConductor.v3.getConductor().getNombre(), frmConductor.v3.getConductor().getPosicion())) {
            JOptionPane.showMessageDialog(null, "Error en la consulta");
        } else {
            JOptionPane.showMessageDialog(null, "Podio Actual " + "\n"
                    + frmConductor.v1.getConductor().getNombre() + " " + frmConductor.v1.getConductor().getPosicion() + "\n"
                    + frmConductor.v2.getConductor().getNombre() + " " + frmConductor.v2.getConductor().getPosicion() + "\n"
                    + frmConductor.v3.getConductor().getNombre() + " " + frmConductor.v3.getConductor().getPosicion()
            );
        }
    }

    public static void reset() {
        frmConductor.v1.setRecorrido(0);
        frmConductor.v2.setRecorrido(0);
        frmConductor.v3.setRecorrido(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barrera;
    private javax.swing.JButton btnPodio;
    private javax.swing.JButton btnPruebas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblvehiculo1;
    private javax.swing.JLabel lblvehiculo2;
    private javax.swing.JLabel lblvehiculo3;
    // End of variables declaration//GEN-END:variables
}
