package com.br.processamentoimagem;

import java.awt.Image;
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        btnAdicao = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        tfMultiplicacao = new javax.swing.JTextField();
        tfSubtracao = new javax.swing.JTextField();
        tfDivisao = new javax.swing.JTextField();
        btnAnd = new javax.swing.JButton();
        btnXor = new javax.swing.JButton();
        btnOr = new javax.swing.JButton();
        btnNot = new javax.swing.JButton();
        tfAdicao = new javax.swing.JTextField();

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

        btnAdicao.setText("Adição");
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });

        btnSubtracao.setText("Subtração");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnMultiplicacao.setText("Multiplicação");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnDivisao.setText("Divisão");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        tfMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMultiplicacaoActionPerformed(evt);
            }
        });

        tfSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSubtracaoActionPerformed(evt);
            }
        });

        tfDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDivisaoActionPerformed(evt);
            }
        });

        btnAnd.setText("AND");
        btnAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndActionPerformed(evt);
            }
        });

        btnXor.setText("XOR");
        btnXor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXorActionPerformed(evt);
            }
        });

        btnOr.setText("OR");
        btnOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrActionPerformed(evt);
            }
        });

        btnNot.setText("NOT");
        btnNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelImgA, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnCarregarImgA, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEscalaCinza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfAdicao)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDivisao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubtracao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAnd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnOr, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNot, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(btnAdicao)
                    .addComponent(btnSubtracao)
                    .addComponent(tfSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnd)
                    .addComponent(btnXor)
                    .addComponent(tfAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplicacao)
                    .addComponent(btnDivisao)
                    .addComponent(tfMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOr)
                    .addComponent(btnNot))
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

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        String txt = tfAdicao.getText();
        if (txt == null || txt.isEmpty()) {
            labelResultado.setIcon(new ImageIcon(Tecnicas.sumImages(imgA, imgB).getMatrixImage()));
        } else {
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(Tecnicas.sumValue(imgA, value).getMatrixImage()));
        }
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        String txt = tfSubtracao.getText();
        if (txt == null || txt.isEmpty()) {
            labelResultado.setIcon(new ImageIcon(Tecnicas.subtractImages(imgA, imgB).getMatrixImage()));
        } else {
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(Tecnicas.subtractValue(imgA, value).getMatrixImage()));
        }
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        String txt = tfMultiplicacao.getText();
        if (txt == null || txt.isEmpty()) {
            labelResultado.setIcon(new ImageIcon(Tecnicas.multiplyImages(imgA, imgB).getMatrixImage()));
        } else {
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(Tecnicas.multiplyValue(imgA, value).getMatrixImage()));
        }
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        String txt = tfDivisao.getText();
        if (txt == null || txt.isEmpty()) {
            labelResultado.setIcon(new ImageIcon(Tecnicas.divideImages(imgA, imgB).getMatrixImage()));
        } else {
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(Tecnicas.divideValue(imgA, value).getMatrixImage()));
        }
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void tfMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMultiplicacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMultiplicacaoActionPerformed

    private void tfSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSubtracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSubtracaoActionPerformed

    private void tfDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDivisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDivisaoActionPerformed

    private void btnAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndActionPerformed
        Imagem imgABinario = new Imagem(imgA.getBinaryImage());
        Imagem imgBBinario = new Imagem(imgB.getBinaryImage());

        Imagem imgResultado = Tecnicas.operationANDImages(imgABinario, imgBBinario);
        labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnAndActionPerformed

    private void btnXorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXorActionPerformed
        Imagem imgABinario = new Imagem(imgA.getBinaryImage());
        Imagem imgBBinario = new Imagem(imgB.getBinaryImage());

        Imagem imgResultado = Tecnicas.operationXORImages(imgABinario, imgBBinario);
        labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnXorActionPerformed

    private void btnOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrActionPerformed
        Imagem imgABinario = new Imagem(imgA.getBinaryImage());
        Imagem imgBBinario = new Imagem(imgB.getBinaryImage());

        Imagem imgResultado = Tecnicas.operationORImages(imgABinario, imgBBinario);
        labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnOrActionPerformed

    private void btnNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotActionPerformed
        Imagem imgABinario = new Imagem(imgA.getBinaryImage());

        Imagem imgResultado = Tecnicas.operationNOTImage(imgABinario);
        labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnNotActionPerformed

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
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnAnd;
    private javax.swing.JButton btnBinario;
    private javax.swing.JButton btnCarregarImgA;
    private javax.swing.JButton btnCarregarImgB;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnEscalaCinza;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnNot;
    private javax.swing.JButton btnOr;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnXor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelImgA;
    private javax.swing.JLabel labelImgB;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JTextField tfAdicao;
    private javax.swing.JTextField tfDivisao;
    private javax.swing.JTextField tfMultiplicacao;
    private javax.swing.JTextField tfSubtracao;
    // End of variables declaration//GEN-END:variables
}
