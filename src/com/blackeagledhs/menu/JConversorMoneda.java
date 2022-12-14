/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.blackeagledhs.menu;


/**
 *
 * @author blackeagle
 */
public class JConversorMoneda extends javax.swing.JFrame {

    /**
     * Creates new form JConversorMoneda
     */
    int xMouse, yMouse;
    double importe;
    public JConversorMoneda() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BotonConvertir = new javax.swing.JPanel();
        BotonConvertirTxt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Divisa2 = new javax.swing.JComboBox<>();
        Amount = new javax.swing.JTextField();
        Result = new javax.swing.JLabel();
        Divisa1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blackeagledhs/img/fondo-conversor.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 200, 400));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blackeagledhs/img/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 30, 60));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Conversor de Divisas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 230, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 2, 14)); // NOI18N
        jLabel4.setText("Ingrese las divisas a convertir");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        jLabel5.setText("De");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 160, 30, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        jLabel6.setText("A");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 20, -1));

        jLabel7.setText("Importe");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel8.setText("X");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(569, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        BotonConvertir.setBackground(new java.awt.Color(0, 153, 255));
        BotonConvertir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotonConvertirTxt.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        BotonConvertirTxt.setForeground(new java.awt.Color(255, 255, 255));
        BotonConvertirTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonConvertirTxt.setText("Convertir");
        BotonConvertirTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonConvertirTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BotonConvertirLayout = new javax.swing.GroupLayout(BotonConvertir);
        BotonConvertir.setLayout(BotonConvertirLayout);
        BotonConvertirLayout.setHorizontalGroup(
            BotonConvertirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonConvertirLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BotonConvertirTxt)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        BotonConvertirLayout.setVerticalGroup(
            BotonConvertirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonConvertirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonConvertirTxt)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(BotonConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 90, 30));

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setBackground(new java.awt.Color(0, 153, 255));
        jLabel10.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Volver");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, 30));

        Divisa2.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        Divisa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD (Dolar Estados Unidos)", "ARS (Peso Argentino)", "EUR (Euro)", "BRL (Real Brasile??o)", "GBP (Libra Esterlina)", "JPY (Yen Japon??s)", "KRW (Won Surcoreano)" }));
        jPanel1.add(Divisa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        Amount.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        Amount.setToolTipText("");
        Amount.setMaximumSize(new java.awt.Dimension(64, 21));
        Amount.setPreferredSize(new java.awt.Dimension(64, 21));
        Amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AmountKeyTyped(evt);
            }
        });
        jPanel1.add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        Result.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        Result.setText("El total es: ");
        jPanel1.add(Result, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 150, 30));

        Divisa1.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        Divisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD (Dolar Estados Unidos)", "ARS (Peso Argentino)", "EUR (Euro)", "BRL (Real Brasile??o)", "GBP (Libra Esterlina)", "JPY (Yen Japon??s)", "KRW (Won Surcoreano)" }));
        jPanel1.add(Divisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        JMain abrir = new JMain();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void BotonConvertirTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonConvertirTxtMouseClicked
        importe = Double.parseDouble(Amount.getText());
        int divisa1 = Divisa1.getSelectedIndex();
        int divisa2 = Divisa2.getSelectedIndex();
        
        Divisas ops = new Divisas();
        ops.setImporte(importe);
        ops.setDivisa1(divisa1);
        ops.setDivisa2(divisa2);
        
        ops.Convertir();
        double exchange = ops.Convertir();
        String roundOff = String.format("%.2f", exchange);
        Result.setText("El total es: " + roundOff);
                
    }//GEN-LAST:event_BotonConvertirTxtMouseClicked

    private void AmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountKeyTyped
        int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_AmountKeyTyped

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
            java.util.logging.Logger.getLogger(JConversorMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JConversorMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JConversorMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JConversorMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JConversorMoneda().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JPanel BotonConvertir;
    private javax.swing.JLabel BotonConvertirTxt;
    private javax.swing.JComboBox<String> Divisa1;
    private javax.swing.JComboBox<String> Divisa2;
    private javax.swing.JLabel Result;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
