/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.test;

import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.Impl.CuaHangService.NhanVienService;
import service.testIMPL.NhanVienInterface;
import viewModel.test.NhanVienViewModel;

/**
 *
 * @author Admin
 */
public class NhanVienView extends javax.swing.JFrame {

    private NhanVienInterface s = new NhanVienService();
    DefaultTableModel model = new DefaultTableModel();

    public NhanVienView() {
        initComponents();
        loadTable();
    }

    public void loadTable() {
        List<NhanVienViewModel> list = s.list();
        model = (DefaultTableModel) tbNhanVien.getModel();

        model.setRowCount(0);

        for (NhanVienViewModel s : list) {
            model.addRow(new Object[]{
                s.getMa(), s.getHo() + " " + s.getTenDem() + " " + s.getTen(), s.getGioiTinh().equals("Nu") ? "Nữ" : "Nam", s.getSdt()
            });
        }

    }

    public void loadTableTimKiem(String ma) {
        List<NhanVienViewModel> list = s.timKiem(ma);
        model = (DefaultTableModel) tbNhanVien.getModel();

        model.setRowCount(0);

        for (NhanVienViewModel s : list) {
            model.addRow(new Object[]{
                s.getMa(), s.getHo() + " " + s.getTenDem() + " " + s.getTen(), s.getGioiTinh().equals("Nu") ? "Nữ" : "Nam", s.getSdt()
            });
        }

    }

    public void tkgt(String ma) {
        List<NhanVienViewModel> list = s.timGioiTinh(ma);
        model = (DefaultTableModel) tbNhanVien.getModel();

        model.setRowCount(0);

        for (NhanVienViewModel s : list) {
            model.addRow(new Object[]{
                s.getMa(), s.getHo() + " " + s.getTenDem() + " " + s.getTen(), s.getGioiTinh(), s.getSdt()
            });
        }

    }

    public boolean checkMaStrung() {
        try {
            List<NhanVienViewModel> list = s.list();
            for (NhanVienViewModel s : list) {
                if (s.getMa().equals(txtMa.getText())) {
                    return false;
                }
            }
        } catch (Exception e) {
        }
        return true;
    }

    public boolean validateFrom() {
        try {
            // check rong
            if (txtMa.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mã trống");
                return false;
            }
            if (txtTen.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Tên trống");
                return false;
            }
            if (txtTenDem.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Tên đêm trống");
                return false;
            }
            if (txtHo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Họ trống");
                return false;
            }
            if (txtSdt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "sdt trống");
                return false;
            }
            // check mã trùng
            if (checkMaStrung() == false) {
                JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
                return false;
            }

            // check so luong ki tu
            try {
                if (txtMa.getText().length() > 50) {
                    JOptionPane.showMessageDialog(this, "Mã < 50");
                    return false;
                }
            } catch (HeadlessException headlessException) {
                return false;
            }

            try {
                if (txtHo.getText().length() > 50) {
                    JOptionPane.showMessageDialog(this, "Họ < 50");
                    return false;
                }
            } catch (HeadlessException headlessException) {
                return false;
            }

            try {
                if (txtTenDem.getText().length() > 50) {
                    JOptionPane.showMessageDialog(this, "TenDem < 50");
                    return false;
                }
            } catch (HeadlessException headlessException) {
                return false;
            }
            try {
                if (txtHo.getText().length() > 50) {
                    JOptionPane.showMessageDialog(this, "ho < 50");
                    return false;
                }
            } catch (HeadlessException headlessException) {
                return false;
            }
            try {
                if (txtSdt.getText().length() > 10) {
                    JOptionPane.showMessageDialog(this, "sdt < 10");
                    return false;
                }
            } catch (HeadlessException headlessException) {
                return false;
            }
            // check dung chinh ta
            if (!txtMa.getText().matches("^[a-zA-Z0-9]+")) {
                JOptionPane.showMessageDialog(this, "Mã chỉ chữ và só nguyên ");
                return false;
            }
            if (!txtTen.getText().matches("^[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(this, "Tên chỉ chữ ");
                return false;
            }
            if (!txtTenDem.getText().matches("^[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(this, "Tên đệm chỉ chữ ");
                return false;
            }
            if (!txtHo.getText().matches("^[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(this, "Tên đệm chỉ chữ ");
                return false;
            }
            if (!txtSdt.getText().matches("0[2-9]{1}[0-9 ]{8}")) {
                JOptionPane.showMessageDialog(this, "số điện thoại số nguyên vàđúng form 0(1-9)xxxxxxxx");
                return false;
            }

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        txtTimMa = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtTenDem = new javax.swing.JTextField();
        txtHo = new javax.swing.JTextField();
        rdo2 = new javax.swing.JRadioButton();
        rdo1 = new javax.swing.JRadioButton();
        txtSdt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rdotim = new javax.swing.JComboBox<>();
        rdo3 = new javax.swing.JRadioButton();
        rdo4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        rdo5 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ma", "Họ Và Tên", "Giới Tính", "Sdt"
            }
        ));
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        txtTimMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimMaKeyReleased(evt);
            }
        });

        buttonGroup2.add(rdo2);
        rdo2.setText("Nam");
        rdo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo1);
        rdo1.setText("Nữ");
        rdo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã");

        jLabel2.setText("Tên");

        jLabel3.setText("Tên Đệm");

        jLabel4.setText("Họ");

        jLabel5.setText("Giới Tính");

        jLabel6.setText("SDT");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rdotim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Nam", "Nữ" }));
        rdotim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdotimActionPerformed(evt);
            }
        });
        rdotim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rdotimKeyReleased(evt);
            }
        });

        buttonGroup1.add(rdo3);
        rdo3.setText("Nam");
        rdo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo4);
        rdo4.setText("Nữ");
        rdo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Giới Tính");

        buttonGroup2.add(rdo5);
        rdo5.setText("Nữ");
        rdo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(txtTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(rdo3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdo4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdo1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(rdotim, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(txtTenDem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(rdo2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdo5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdo3)
                                    .addComponent(rdo4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(rdotim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTenDem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdo2)
                            .addComponent(rdo5))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdo1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo2ActionPerformed

    }//GEN-LAST:event_rdo2ActionPerformed

    private void rdo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo1ActionPerformed

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        int index = tbNhanVien.getSelectedRow();

        String ma = tbNhanVien.getValueAt(index, 0).toString();
        String ten = tbNhanVien.getValueAt(index, 1).toString();
        String gioitinh = tbNhanVien.getValueAt(index, 2).toString();
        String sdt = tbNhanVien.getValueAt(index, 3).toString();

        txtMa.setText(ma);
        txtSdt.setText(sdt);
        if (gioitinh.equals("Nam")) {
            rdo2.setSelected(true);
            rdo1.setSelected(false);
        } else {
            rdo2.setSelected(false);
            rdo1.setSelected(true);
        }

        String[] hoten = ten.split(" ");
        boolean name = hoten.length == 4;

        if (name == true) {
            txtHo.setText(hoten[0]);
            txtTenDem.setText(hoten[1] + " " + hoten[2]);
            txtTen.setText(hoten[3]);
        } else {
            txtHo.setText(hoten[0]);
            txtTenDem.setText(hoten[1]);
            txtTen.setText(hoten[2]);
        }


    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NhanVienViewModel v = new NhanVienViewModel();
//        if (validateFrom() == false) {
//            return;
//        }
        v.setMa(txtMa.getText());
        v.setTen(txtTen.getText());
        v.setTenDem(txtTenDem.getText());
        v.setHo(txtHo.getText());
        v.setSdt(txtSdt.getText());
        if (rdo1.isSelected()) {
            v.setGioiTinh("Nu");
        } else {
            v.setGioiTinh("Nam");
        }
        String b = s.add(v);
        if (b.equals("ADD thành công")) {
            JOptionPane.showMessageDialog(this, "Add Thành Công");
            loadTable();
        } else {
            JOptionPane.showMessageDialog(this, b);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTimMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimMaKeyReleased
        loadTableTimKiem(txtTimMa.getText());
    }//GEN-LAST:event_txtTimMaKeyReleased

    private void rdotimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdotimKeyReleased

    }//GEN-LAST:event_rdotimKeyReleased

    private void rdotimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdotimActionPerformed
        String gt = rdotim.getSelectedItem().toString();
        if (gt.equals("Nữ")) {
            tkgt("Nu");
        } else {
            tkgt(gt);
        }
        if (rdotim.getSelectedItem().toString().equals("No")) {
            loadTable();
        }

    }//GEN-LAST:event_rdotimActionPerformed

    private void rdo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo3ActionPerformed
        if (rdo3.isSelected()) {
            tkgt("Nam");
        }

    }//GEN-LAST:event_rdo3ActionPerformed

    private void rdo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo4ActionPerformed
        // TODO add your handling code here:
        if (rdo4.isSelected()) {
            tkgt("Nu");
        }
    }//GEN-LAST:event_rdo4ActionPerformed

    private void rdo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo5ActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdo2;
    private javax.swing.JRadioButton rdo3;
    private javax.swing.JRadioButton rdo4;
    private javax.swing.JRadioButton rdo5;
    private javax.swing.JComboBox<String> rdotim;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTenDem;
    private javax.swing.JTextField txtTimMa;
    // End of variables declaration//GEN-END:variables
}
