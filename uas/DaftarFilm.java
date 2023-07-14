/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DaftarFilm extends javax.swing.JFrame {

    /**
     * Creates new form DaftarFilm
     */
    public DaftarFilm() {
        initComponents();
    }
    
    public void tampilData(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Judul_Film");
        
        try{
            String sql = "SELECT * FROM film";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            java.sql.ResultSet rs = ps.executeQuery(sql);
            
            ResultSetMetaData meta = rs.getMetaData();
            
            while(rs.next()){
                String txtId = rs.getString("ID");
                String txtJudul = rs.getString("Judul_Film");
                String[] data = {txtId, txtJudul};
                dtm.addRow(data);
            }
            tabelFilm.setModel(dtm);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelFilm = new javax.swing.JTable();
        hapusUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        editUser = new javax.swing.JButton();
        txtJudul = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lNomor = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btntTampil = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelFilm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelFilm.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Judul_Film"
            }
        ));
        tabelFilm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelFilmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelFilm);

        hapusUser.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        hapusUser.setText("Hapus");
        hapusUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusUserActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel2.setText("Judul Film");

        editUser.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        editUser.setText("Edit");
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });

        txtJudul.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N

        btnTambah.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel3.setText("No");

        txtId.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N

        btnBack.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Gulim", 1, 14)); // NOI18N
        jLabel4.setText("Daftar Film");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btntTampil)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(editUser)
                        .addGap(18, 18, 18)
                        .addComponent(hapusUser))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNomor)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(239, 239, 239)
                                        .addComponent(btnRefresh)))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lNomor)
                        .addGap(9, 9, 9)
                        .addComponent(btnRefresh))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusUser)
                    .addComponent(editUser)
                    .addComponent(btnTambah)
                    .addComponent(btnBack)
                    .addComponent(btntTampil))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelFilmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelFilmMouseClicked
        // TODO add your handling code here:
        int i = tabelFilm.getSelectedRow();
        TableModel model = tabelFilm.getModel();
        txtId.setText(model.getValueAt(i, 0).toString());
        txtJudul.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_tabelFilmMouseClicked

    private void editUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserActionPerformed
        // TODO add your handling code here:
        try{
            
            String sql = "UPDATE film SET judul_film='"+txtJudul.getText()+"' WHERE id='"+txtId.getText()+"'";

            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);

            ps.execute();
            tampilData();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_editUserActionPerformed

    
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        try {
            String sql ="INSERT INTO film VALUES ('"+txtId.getText()+"', '"+txtJudul.getText()+"')";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);

            ps.execute();
            tampilData();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void hapusUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusUserActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM film WHERE id=('"+txtId.getText()+"')";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);

            ps.execute();
            tampilData();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_hapusUserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btntTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntTampilActionPerformed
        // TODO add your handling code here:
        tampilData();
    }//GEN-LAST:event_btntTampilActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        txtJudul.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btntTampil;
    private javax.swing.JButton editUser;
    private javax.swing.JButton hapusUser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lNomor;
    private javax.swing.JTable tabelFilm;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJudul;
    // End of variables declaration//GEN-END:variables
}
