package com.br.processamentoimagem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Eduar
 */
public class Home extends javax.swing.JFrame {

    private Imagem imgA;
    private Imagem imgB;
    private Imagem imgResult;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();

        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        btnCarregarImgA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                var filter = new FileNameExtensionFilter("Imagens", "jpg", "jpeg", "png", "bmp", "tiff", "tif");

                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(filter);
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        BufferedImage img = ImageIO.read(selectedFile);
                        imgA = new Imagem(img);
                        labelImgA.setIcon(new ImageIcon(imgA.getImg()));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        btnCarregarImgB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                var filter = new FileNameExtensionFilter("Imagens", "jpg", "jpeg", "png", "bmp", "tiff", "tif");

                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(filter);
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        BufferedImage img = ImageIO.read(selectedFile);
                        imgB = new Imagem(img);
                        labelImgB.setIcon(new ImageIcon(imgB.getImg()));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCarregarImgA = new javax.swing.JButton();
        labelResultado = new javax.swing.JLabel();
        labelImgA = new javax.swing.JLabel();
        btnEscalaCinza = new javax.swing.JButton();
        btnBinario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelImgB = new javax.swing.JLabel();
        btnCarregarImgB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBinario1 = new javax.swing.JButton();
        btnBinario2 = new javax.swing.JButton();
        btnBinario3 = new javax.swing.JButton();
        btnBinario4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCarregarImgA.setText("Carregar Imagem A");
        btnCarregarImgA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarImgAActionPerformed(evt);
            }
        });

        btnEscalaCinza.setText("Escala de Cinza");
        btnEscalaCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalaCinzaActionPerformed(evt);
            }
        });

        btnBinario.setText("Binário");
        btnBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinarioActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Imagem A");
        jLabel2.setToolTipText("");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Imagem B");
        jLabel3.setToolTipText("");

        btnCarregarImgB.setText("Carregar Imagem B");
        btnCarregarImgB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarImgBActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Imagem Resultante");
        jLabel4.setToolTipText("");

        btnBinario1.setText("Adição");
        btnBinario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinario1ActionPerformed(evt);
            }
        });

        btnBinario2.setText("Subtração");
        btnBinario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinario2ActionPerformed(evt);
            }
        });

        btnBinario3.setText("Multiplicação");
        btnBinario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinario3ActionPerformed(evt);
            }
        });

        btnBinario4.setText("Divisão");
        btnBinario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinario4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBinario1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBinario2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelImgA, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCarregarImgA, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEscalaCinza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelImgB, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCarregarImgB, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBinario3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBinario4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImgA, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelImgB, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarregarImgB)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCarregarImgA)
                        .addComponent(btnEscalaCinza)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBinario)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBinario1)
                    .addComponent(btnBinario2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBinario3)
                    .addComponent(btnBinario4))
                .addContainerGap(319, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregarImgAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarImgAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarregarImgAActionPerformed

    private void btnEscalaCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalaCinzaActionPerformed
        labelResultado.setIcon(new ImageIcon(imgA.getGrayImage()));
    }//GEN-LAST:event_btnEscalaCinzaActionPerformed

    private void btnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinarioActionPerformed
        labelResultado.setIcon(new ImageIcon(imgA.getBinaryImage()));
    }//GEN-LAST:event_btnBinarioActionPerformed

    private void btnCarregarImgBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarImgBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarregarImgBActionPerformed

    private void btnBinario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinario1ActionPerformed
        labelResultado.setIcon(new ImageIcon(Tecnicas.sumImages(imgA, imgB).getMatrixImage()));
    }//GEN-LAST:event_btnBinario1ActionPerformed

    private void btnBinario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinario2ActionPerformed
        labelResultado.setIcon(new ImageIcon(Tecnicas.subtractImages(imgA, imgB).getMatrixImage()));
    }//GEN-LAST:event_btnBinario2ActionPerformed

    private void btnBinario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinario3ActionPerformed
        labelResultado.setIcon(new ImageIcon(Tecnicas.multiplyImages(imgA, imgB).getMatrixImage()));
    }//GEN-LAST:event_btnBinario3ActionPerformed

    private void btnBinario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinario4ActionPerformed
        labelResultado.setIcon(new ImageIcon(Tecnicas.divideImages(imgA, imgB).getMatrixImage()));
    }//GEN-LAST:event_btnBinario4ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinario;
    private javax.swing.JButton btnBinario1;
    private javax.swing.JButton btnBinario2;
    private javax.swing.JButton btnBinario3;
    private javax.swing.JButton btnBinario4;
    private javax.swing.JButton btnCarregarImgA;
    private javax.swing.JButton btnCarregarImgB;
    private javax.swing.JButton btnEscalaCinza;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelImgA;
    private javax.swing.JLabel labelImgB;
    private javax.swing.JLabel labelResultado;
    // End of variables declaration//GEN-END:variables
}
