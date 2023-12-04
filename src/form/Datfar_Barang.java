package form;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableRowSorter;

public class Datfar_Barang extends javax.swing.JFrame {

private DefaultTableModel model;

//memebuat konsctruktor yang berfungsi untuk membuat model tabel
public Datfar_Barang() throws ClassNotFoundException {
        initComponents();                                        //Tampilan
        setExtendedState(MAXIMIZED_BOTH);                   //Auto Maximize
        setLocationRelativeTo(null);
        model = new DefaultTableModel();
        tabelsatu.setModel(model);

        //nama coloum harus sesuai dengan database               //Pemanggilan database      
        model.addColumn("No");
        model.addColumn("Kode Barang");
        model.addColumn("Merk");
        model.addColumn("Nama");
        model.addColumn("Jenis");
        model.addColumn("Harga");
        model.addColumn("Stock");
        koneksi();
    }

//menampilkan tabel ketika form ditampilkan
private void formWindowOpened(java.awt.event.WindowEvent evt) throws ClassNotFoundException {                                  
        koneksi();
    }   

    public void koneksi() throws ClassNotFoundException {
        //melakukan penghapusan defaul model dari jtable
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
       
        try{
            //membuat koneksi kedatabase
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir","root","");
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM daftar_barang";
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                Object[] o = new Object[7];
                o[0]=rs.getInt("No");
                o[1]=rs.getString("Kode_Barang");
                o[2]=rs.getString("Merk");
                o[3]=rs.getString("Nama");
                o[4]=rs.getString("Jenis");
                o[5]=rs.getInt("Harga");
                o[6]=rs.getInt("Stock");
                model.addRow(o);
            }
            
           rs.close();
           statement.close();
        } catch (SQLException ex) {}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelsatu = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tambahno = new javax.swing.JTextField();
        tambahjenis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Tambah = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tambahkode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tambahharga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Perbarui = new javax.swing.JButton();
        tambahmerk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tambahstock = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Hapus = new javax.swing.JButton();
        tambahnama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        Cetak = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));

        tabelsatu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabelsatu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode", "Merk", "Nama", "Jenis", "Harga", "Stok"
            }
        ));
        tabelsatu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelsatuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelsatu);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Bodoni MT Condensed", 1, 24)); // NOI18N
        jLabel3.setText("Daftar Barang");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form/icons8-back-arrow-32.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form/icons8-search-32.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(192, 192, 192));

        jLabel1.setText("No");

        tambahno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahnoActionPerformed(evt);
            }
        });

        tambahjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahjenisActionPerformed(evt);
            }
        });

        jLabel6.setText("Jenis");

        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tambahno, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tambah)
                            .addComponent(tambahjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahno)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tambahjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(Tambah)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(192, 192, 192));

        tambahkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahkodeActionPerformed(evt);
            }
        });

        jLabel2.setText("Kode");

        jLabel7.setText("Harga");

        Perbarui.setText("Perbarui");
        Perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerbaruiActionPerformed(evt);
            }
        });

        jLabel4.setText("Merk");

        jLabel8.setText("Stock");

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        tambahnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahnamaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nama");

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Cetak.setText("Cetak");
        Cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("By Kelompok 6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tambahharga, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahkode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tambahmerk, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tambahstock, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tambahnama, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Cetak))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahkode)
                    .addComponent(jLabel2)
                    .addComponent(tambahmerk)
                    .addComponent(jLabel4)
                    .addComponent(tambahnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tambahstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hapus)
                    .addComponent(Reset)
                    .addComponent(Cetak)
                    .addComponent(Perbarui))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsearch)
                        .addContainerGap())
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new Menu().setVisible(true);                           // Mekanisme pindah ke Menu Utama
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
    
        txtsearch.getDocument().addDocumentListener(new DocumentListener() {     //Mekanisme pencarian
        @Override
        public void insertUpdate(DocumentEvent e) {
            try {    
                koneksi();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Datfar_Barang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        @Override
        public void removeUpdate(DocumentEvent e) {
            try {
                koneksi();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Datfar_Barang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        @Override
        public void changedUpdate(DocumentEvent e) {
            try {
                koneksi();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Datfar_Barang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
        
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        
        String cari = txtsearch.getText();                                      //Mekanisme Pencarian
        TableRowSorter tr = new TableRowSorter(model);
        tabelsatu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(cari));

    }//GEN-LAST:event_txtsearchKeyReleased

    private void tambahnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahnamaActionPerformed

    private void tambahkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahkodeActionPerformed

    private void tambahjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahjenisActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
    
        try {                                                                   //Mekanisme tombol hapus
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir","root","");
        con.createStatement().executeUpdate("delete from daftar_barang where no='"+tambahno.getText()+"'");
        koneksi();
        reset();
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        
    } catch (SQLException ex) {
        Logger.getLogger(Datfar_Barang.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Datfar_Barang.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_HapusActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
    
        try {                                                                   //Mekanisme tombol Tambah
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir","root","");
        con.createStatement().executeUpdate("insert into daftar_barang values" + "('"+tambahno.getText() +
                "','" + tambahkode.getText() + "','" + tambahmerk.getText() + "','" + tambahnama.getText() + "','" +
                tambahjenis.getText() + "','" + tambahharga.getText() + "','" + tambahstock.getText() + "')");
        koneksi();
        reset();
        JOptionPane.showMessageDialog(null, "Data berhasil ditambah");
        
    }   catch (SQLException ex) {
            Logger.getLogger(Datfar_Barang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(Datfar_Barang.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_TambahActionPerformed

    private void PerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerbaruiActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)tabelsatu.getModel();
        try {                                                                   //Mekanisme tombol Perbarui
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir","root","");
            String sql = "UPDATE  daftar_barang SET merk =  '" + tambahmerk.getText() + "', nama='" + tambahnama.getText() +
                    "', jenis='" + tambahjenis.getText() + "', harga='" + tambahharga.getText() + "',  stock='" +
                    tambahstock.getText() + "' WHERE kode_barang ='" + tambahkode.getText() + "'";
            PreparedStatement p = con.prepareStatement(sql);
            p.executeUpdate();
            p.close();
            
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
            
        } finally {
            try {
                koneksi();
                reset();
                tambahmerk.setText("");
                tambahnama.setText("");
                tambahjenis.setText("");
                tambahharga.setText("");
                tambahstock.setText("");
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Datfar_Barang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }//GEN-LAST:event_PerbaruiActionPerformed
    
private void reset(){              //Mekanisme Reset
    tambahno.setText("");
    tambahkode.setText("");
    tambahmerk.setText("");
    tambahnama.setText("");
    tambahjenis.setText("");
    tambahharga.setText("");
    tambahstock.setText("");
}
    
    private void tabelsatuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelsatuMouseClicked

DefaultTableModel model = (DefaultTableModel)tabelsatu.getModel();              //Tabel pada Daftar Barang

String tblno = model.getValueAt(tabelsatu.getSelectedRow(), 0).toString();
String tblkode = model.getValueAt(tabelsatu.getSelectedRow(), 1).toString();
String tblmerk = model.getValueAt(tabelsatu.getSelectedRow(), 2).toString();
String tblnama = model.getValueAt(tabelsatu.getSelectedRow(), 3).toString();
String tbljenis = model.getValueAt(tabelsatu.getSelectedRow(), 4).toString();
String tblharga = model.getValueAt(tabelsatu.getSelectedRow(), 5).toString();
String tblstock = model.getValueAt(tabelsatu.getSelectedRow(), 6).toString();

tambahno.setText(tblno);
tambahkode.setText(tblkode);
tambahmerk.setText(tblmerk);
tambahnama.setText(tblnama);
tambahjenis.setText(tbljenis);
tambahharga.setText(tblharga);
tambahstock.setText(tblstock);

    }//GEN-LAST:event_tabelsatuMouseClicked

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        
        reset();            //Mekanisme tombol Reset
        
    }//GEN-LAST:event_ResetActionPerformed

    private void CetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetakActionPerformed
    
    try{                    //Mekanisme tombol Cetak
        tabelsatu.print();
    }catch(Exception e){}
                
    }//GEN-LAST:event_CetakActionPerformed

    private void tambahnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        //Tampilan
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
            java.util.logging.Logger.getLogger(Datfar_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datfar_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datfar_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datfar_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Datfar_Barang().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Datfar_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cetak;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Perbarui;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Tambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelsatu;
    private javax.swing.JTextField tambahharga;
    private javax.swing.JTextField tambahjenis;
    private javax.swing.JTextField tambahkode;
    private javax.swing.JTextField tambahmerk;
    private javax.swing.JTextField tambahnama;
    private javax.swing.JTextField tambahno;
    private javax.swing.JTextField tambahstock;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}