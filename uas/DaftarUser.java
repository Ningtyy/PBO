/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import javax.swing.table.TableModel;

public class DaftarUser extends javax.swing.JFrame {

    /**
     * Creates new form DaftarUser
     */
    public DaftarUser() {
        initComponents();
    }
    
    public void tampilData(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Username");
        dtm.addColumn("Password");
        
        try{
            String sql = "SELECT * FROM user";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            java.sql.ResultSet rs = ps.executeQuery(sql);
            
            ResultSetMetaData meta = rs.getMetaData();
            
            while(rs.next()){
                String usn = rs.getString("username");
                String pw = rs.getString("password");
                String[] data = {usn, pw};
                dtm.addRow(data);
            }
            tabelUser.setModel(dtm);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelUser = new javax.swing.JTable();
        hapusUser = new javax.swing.JButton();
        editUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usn = new javax.swing.JTextField();
        pw = new javax.swing.JTextField();
        btnReg = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        btntTampil = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelUser);

        hapusUser.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        hapusUser.setText("Hapus");
        hapusUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusUserActionPerformed(evt);
            }
        });

        editUser.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        editUser.setText("Edit");
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel2.setText("Password");

        usn.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N

        pw.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N

        btnReg.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        btnReg.setText("Daftar");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        btnBack1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        btnBack1.setText("Kembali");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        btntTampil.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        btntTampil.setText("Tampilkan Data");
        btntTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntTampilActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gulim", 1, 14)); // NOI18N
        jLabel3.setText("Daftar User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefresh))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btntTampil)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBack1)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnReg)
                                    .addGap(18, 18, 18)
                                    .addComponent(editUser)
                                    .addGap(18, 18, 18)
                                    .addComponent(hapusUser))))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRefresh)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusUser)
                    .addComponent(editUser)
                    .addComponent(btnReg)
                    .addComponent(btnBack1)
                    .addComponent(btntTampil))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelUserMouseClicked
        int i = tabelUser.getSelectedRow();
        TableModel model = tabelUser.getModel();
        usn.setText((String) model.getValueAt(i, 0));
        pw.setText((String) model.getValueAt(i, 1));
    }//GEN-LAST:event_tabelUserMouseClicked

    
    private void editUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserActionPerformed
        try{
            String sql = "UPDATE user SET password='"+pw.getText()+"' WHERE username='"+usn.getText()+"' ";

            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);

            ps.execute();
            tampilData();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_editUserActionPerformed

    //daftar/membuat user/masukkan data baru ke tabel user
    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        try {
            String sql ="INSERT INTO user VALUES ('"+usn.getText()+"','"+pw.getText()+"')";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.execute();
            tampilData();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRegActionPerformed

    //kembali ke tampilan menu
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnBack1ActionPerformed

    //menampilkan data di tabel
    private void btntTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntTampilActionPerformed
        tampilData();
    }//GEN-LAST:event_btntTampilActionPerformed

    
    //hapus data
    private void hapusUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusUserActionPerformed
        try{
            String sql = "DELETE FROM user WHERE username='"+usn.getText()+"' ";

            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);

            ps.execute();
            tampilData();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_hapusUserActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        usn.setText("");
        pw.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReg;
    private javax.swing.JButton btntTampil;
    private javax.swing.JButton editUser;
    private javax.swing.JButton hapusUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pw;
    private javax.swing.JTable tabelUser;
    private javax.swing.JTextField usn;
    // End of variables declaration//GEN-END:variables
}
