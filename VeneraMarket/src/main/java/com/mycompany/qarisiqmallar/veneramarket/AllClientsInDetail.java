/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qarisiqmallar.veneramarket;

import static com.mycompany.qarisiqmallar.veneramarket.TreeView1.jTableMehsullar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tacir Aliyev
 */
public class AllClientsInDetail extends javax.swing.JFrame {

    PreparedStatement pres;
    Statement stmt;
    Connection con;
    DefaultTableModel df;
    ResultSet rs;

    public AllClientsInDetail() {
        initComponents();
        bringAllClientsList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        chanheNameOfClient = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClients = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        chanheNameOfClient.setText("jMenuItem1");
        chanheNameOfClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chanheNameOfClientActionPerformed(evt);
            }
        });
        jPopupMenu1.add(chanheNameOfClient);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Ad ve Soyad", "Müqavile nömresi", "Elaqe nömresi", "Ünvan", "Debet kart nömresi", "Müqavile qiymetleri (%)"
            }
        ));
        tblClients.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tblClientsMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tblClientsMouseMoved(evt);
            }
        });
        tblClients.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                tblClientsMouseWheelMoved(evt);
            }
        });
        tblClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblClientsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblClientsMouseReleased(evt);
            }
        });
        tblClients.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClientsKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblClientsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblClientsKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tblClients);
        if (tblClients.getColumnModel().getColumnCount() > 0) {
            tblClients.getColumnModel().getColumn(0).setMinWidth(25);
            tblClients.getColumnModel().getColumn(0).setPreferredWidth(35);
            tblClients.getColumnModel().getColumn(0).setMaxWidth(50);
            tblClients.getColumnModel().getColumn(1).setMinWidth(200);
            tblClients.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblClients.getColumnModel().getColumn(1).setMaxWidth(500);
        }

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Yeni müşteri elave et");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Deyişiklik et");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Mövcud müşteri adları siyahısı...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1170, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(34, 34, 34))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        CreateNewClient newClient = new CreateNewClient(this, true);
        newClient.setVisible(true);
        bringAllClientsList();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        delete();

    }//GEN-LAST:event_jButton2ActionPerformed

    public void delete() {

        int id;
        df = (DefaultTableModel) tblClients.getModel();
        int selected = tblClients.getSelectedRow();
        id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        String name = (df.getValueAt(selected, 1).toString());

        try {
            con = connect();
            pres = con.prepareStatement("delete from clients where id = " + id);
            pres.executeUpdate();
            bringAllClientsList();
            JOptionPane.showMessageDialog(this, "" + name + " - adlı müşteri uğurla elave olundu!", "Diqqet!", HEIGHT);

        } catch (Exception ex) {

            ex.printStackTrace();
        }

    }

    private void tblClientsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientsKeyReleased

        int s = evt.getKeyCode();

        if (s == 10) {

            df = (DefaultTableModel) tblClients.getModel();

            int selected = tblClients.getSelectedRow();

            int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
            String name = (df.getValueAt(selected, 1).toString());
            String numberOfContract = (df.getValueAt(selected, 2).toString());
            String phoneNumber = (df.getValueAt(selected, 3).toString());
            String emailAddres = (df.getValueAt(selected, 4).toString());
            String numberOfDebetCard = (df.getValueAt(selected, 5).toString());
            double percentage = Double.parseDouble(df.getValueAt(selected, 6).toString());

            try {

                con = connect();

                pres = con.prepareStatement("update clients set NameAndSurename=?, NumberOfContract=?, PhoneNumber=?, EmailAddress=?, NumberOfDebetCard=?, PersentageOfSalePrice=? where id =?");
                pres.setString(1, name);
                pres.setString(2, numberOfContract);
                pres.setString(3, phoneNumber);
                pres.setString(4, emailAddres);
                pres.setString(5, numberOfDebetCard);
                pres.setDouble(6, percentage);
                pres.setInt(7, id);

                pres.executeUpdate();

                pres = con.prepareStatement("update borclar_siyahisi set Borc_alanin_adi=? where Borc_alanin_adi = " + "'" + name + "'");
                pres.setString(1, name);
                pres.executeUpdate();

                bringAllClientsList();

            } catch (Exception ex) {

                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error");

            }

        }


    }//GEN-LAST:event_tblClientsKeyReleased

    private void tblClientsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientsKeyPressed
        int s = evt.getKeyCode();

        if (s == 127) {

            delete();

        }
    }//GEN-LAST:event_tblClientsKeyPressed

    private void tblClientsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientsMousePressed

    }//GEN-LAST:event_tblClientsMousePressed

    private void tblClientsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientsMouseDragged


    }//GEN-LAST:event_tblClientsMouseDragged

    private void tblClientsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientsMouseMoved


    }//GEN-LAST:event_tblClientsMouseMoved

    private void tblClientsMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tblClientsMouseWheelMoved


    }//GEN-LAST:event_tblClientsMouseWheelMoved

    private void tblClientsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientsKeyTyped

    }//GEN-LAST:event_tblClientsKeyTyped

    private void tblClientsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientsMouseReleased

        if (SwingUtilities.isRightMouseButton(evt)) {

            int clickSayi = evt.getClickCount();

            jPopupMenu1.show(tblClients, evt.getX(), evt.getY());

        }
    }//GEN-LAST:event_tblClientsMouseReleased

    private void chanheNameOfClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chanheNameOfClientActionPerformed

        ChangeNameOfClient changeName = new ChangeNameOfClient(this, true);

        df = (DefaultTableModel) tblClients.getModel();

        int selected = tblClients.getSelectedRow();

        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        String name = (df.getValueAt(selected, 1).toString());
        
        ChangeNameOfClient.txtOldName.setText(name);
        
        changeName.setVisible(true);
        
        
        
        

    }//GEN-LAST:event_chanheNameOfClientActionPerformed

    public Connection connect() {
        try {

            //Class.forName("com.mysql.jdbc.Driver");
            String url = ("jdbc:mysql://localhost:3306/mehsullar");
            String usercategoryOfProduct = ("root");
            String password = ("dxdiag92");
            con = DriverManager.getConnection(url, usercategoryOfProduct, password);

        } catch (Exception ex) {

        }

        return con;

    }

    public void bringAllClientsList() {
        int a;
        try {

            Connection c = connect();

            pres = c.prepareCall("select * from clients");

            ResultSet rs = pres.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblClients.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {

                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("NameAndSurename"));
                    v2.add(rs.getString("NumberOfContract"));
                    v2.add(rs.getString("PhoneNumber"));
                    v2.add(rs.getString("EmailAddress"));
                    v2.add(rs.getString("NumberOfDebetCard"));
                    v2.add(rs.getDouble("PersentageOfSalePrice"));
                }
                df.addRow(v2);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

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
            java.util.logging.Logger.getLogger(AllClientsInDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllClientsInDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllClientsInDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllClientsInDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllClientsInDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem chanheNameOfClient;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClients;
    // End of variables declaration//GEN-END:variables
}
