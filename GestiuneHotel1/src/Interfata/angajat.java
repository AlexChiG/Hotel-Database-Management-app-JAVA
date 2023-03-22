package Interfata;

import com.mysql.cj.xdevapi.Statement;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import static java.lang.Integer.parseInt;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class angajat extends javax.swing.JFrame {

    int prevCod;
    BigInteger cnpInt;
    String numeString;
    String prenString;
    String adresaString;
    int telefonInt;
    int salariuInt;
    String dataAngString;
    int codDepInt;

    int savedCodAng = 0;

    Connection con;
    ResultSet rs;

    JFrame jFrame = new JFrame();

    public void refresh() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            java.sql.Statement stmt = con.createStatement();
            String sql = "select * from angajat";

            ResultSet result = stmt.executeQuery(sql);

            DefaultTableModel tblModel = (DefaultTableModel) Tabel.getModel();

            tblModel.setRowCount(0);
            jComboBox1.removeAllItems();
            while (result.next()) {
                String data[] = {result.getString("cod_angajat"), result.getString("cnp"), result.getString("nume"), result.getString("prenume"), result.getString("adresa"), result.getString("telefon"), result.getString("salariu"), result.getString("data_angajare"), result.getString("cod_departament")};
                tblModel.addRow(data);
                jComboBox1.addItem(result.getString("cod_angajat"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearF() {
        savedCodAng = 0;
        cnpF.setText("");
        numeF.setText("");
        prenF.setText("");
        adrF.setText("");
        telF.setText("");
        salF.setText("");
        datF.setText("");
        coddF.setText("");

    }

    public angajat() {
        initComponents();
        refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        CautareF = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        Search = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        coddF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Insert = new javax.swing.JButton();
        datF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        salF = new javax.swing.JTextField();
        telF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cnpF = new javax.swing.JTextField();
        numeF = new javax.swing.JTextField();
        prenF = new javax.swing.JTextField();
        adrF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Modif = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 204));
        setPreferredSize(new java.awt.Dimension(900, 500));

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));
        jPanel4.setForeground(new java.awt.Color(0, 102, 153));
        jPanel4.setPreferredSize(new java.awt.Dimension(900, 498));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cod_angajat", "cnp", "nume", "prenume", "adresa", "telefon", "salariu", "data_angajare", "cod_cepartament" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        Search.setBackground(new java.awt.Color(0, 102, 255));
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Cauta dupa:");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "<>", "<", ">", "<=", ">=" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CautareF)
                    .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CautareF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cod Angajat:");

        Delete.setBackground(new java.awt.Color(0, 102, 255));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Sterge Randul");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        coddF.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cod Departament");

        Insert.setBackground(new java.awt.Color(0, 102, 255));
        Insert.setForeground(new java.awt.Color(255, 255, 255));
        Insert.setText("Inserare");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        datF.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data angajarii");

        salF.setPreferredSize(new java.awt.Dimension(70, 25));
        salF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salFActionPerformed(evt);
            }
        });

        telF.setPreferredSize(new java.awt.Dimension(70, 25));
        telF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telFActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CNP");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nume");

        cnpF.setPreferredSize(new java.awt.Dimension(70, 25));

        numeF.setPreferredSize(new java.awt.Dimension(70, 25));
        numeF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeFActionPerformed(evt);
            }
        });

        prenF.setPreferredSize(new java.awt.Dimension(70, 25));

        adrF.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prenume");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Adresa");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefon");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salariu");

        Modif.setBackground(new java.awt.Color(0, 102, 255));
        Modif.setForeground(new java.awt.Color(255, 255, 255));
        Modif.setLabel("Modificare");
        Modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(0, 102, 255));
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("refresh");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
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
                        .addComponent(Insert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Modif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clear)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cnpF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prenF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adrF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(coddF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert)
                    .addComponent(Modif)
                    .addComponent(Clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adrF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coddF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Angajat", "CNP", "Nume", "Prenume", "Adresa", "Telefon", "Salariu", "Data angajarii", "Cod Departament"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel);

        back.setBackground(new java.awt.Color(0, 0, 204));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(back)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == back) {
            Interfata inter = new Interfata();
            inter.setVisible(true);
            close();
        }
    }//GEN-LAST:event_backActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int yesorno = JOptionPane.showConfirmDialog(jFrame, "Esti sigur ca vrei sa stergi aceasta linie din tabela?", "",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (yesorno == JOptionPane.YES_OPTION) {
            prevCod = parseInt((String) jComboBox1.getSelectedItem());
            java.sql.Statement stmt;
            try {
                stmt = con.createStatement();
                String sql = "delete from angajat where cod_angajat = " + prevCod + ";";
                stmt.execute(sql);

            } catch (SQLException e) {
                Logger.getLogger(angajat.class.getName()).log(Level.SEVERE, null, e);

            }
        }
        clearF();
        refresh();
    }//GEN-LAST:event_DeleteActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        if ("".equals(CautareF.getText())) {
            JOptionPane.showMessageDialog(jFrame, "Introdu o valoare pentru cautare!");
        } else {
            try {
                java.sql.Statement stmt = con.createStatement();
                String sql = "";
                sql = switch (jComboBox2.getSelectedIndex()) {
                    case 2, 3, 4 ->
                        "select * from angajat where " + jComboBox2.getSelectedItem() + "='" + CautareF.getText() + "';";
                    case 1, 5 ->
                        "select * from angajat where " + jComboBox2.getSelectedItem() + "=" + CautareF.getText() + ";";
                    default ->
                        "select * from angajat where " + jComboBox2.getSelectedItem() + jComboBox3.getSelectedItem() + CautareF.getText() + ";";
                };
                ResultSet result = stmt.executeQuery(sql);

                DefaultTableModel tblModel = (DefaultTableModel) Tabel.getModel();
                tblModel.setRowCount(0);

                while (result.next()) {
                    String data[] = {result.getString("cod_angajat"), result.getString("cnp"), result.getString("nume"), result.getString("prenume"), result.getString("adresa"), result.getString("telefon"), result.getString("salariu"), result.getString("data_angajare"), result.getString("cod_departament")};
                    tblModel.addRow(data);
                }
            } catch (SQLException ex) {
                Logger.getLogger(angajat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        clearF();
    }//GEN-LAST:event_SearchActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        if (jComboBox2.getSelectedIndex() == 0 || jComboBox2.getSelectedIndex() == 6 || jComboBox2.getSelectedIndex() == 7 || jComboBox2.getSelectedIndex() == 8) {
            jComboBox3.setVisible(true);
        } else {
            jComboBox3.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
        // TODO add your handling code here:
        System.out.println(Tabel.getSelectedRow());
        savedCodAng = parseInt(Tabel.getModel().getValueAt(Tabel.getSelectedRow(), 0).toString());
        cnpF.setText(Tabel.getModel().getValueAt(Tabel.getSelectedRow(), 1).toString());
        numeF.setText(Tabel.getModel().getValueAt(Tabel.getSelectedRow(), 2).toString());
        prenF.setText(Tabel.getModel().getValueAt(Tabel.getSelectedRow(), 3).toString());
        adrF.setText(Tabel.getModel().getValueAt(Tabel.getSelectedRow(), 4).toString());
        telF.setText(Tabel.getModel().getValueAt(Tabel.getSelectedRow(), 5).toString());
        salF.setText(Tabel.getModel().getValueAt(Tabel.getSelectedRow(), 6).toString());
        datF.setText(Tabel.getModel().getValueAt(Tabel.getSelectedRow(), 7).toString());
        coddF.setText(Tabel.getModel().getValueAt(Tabel.getSelectedRow(), 8).toString());

    }//GEN-LAST:event_TabelMouseClicked

    private void numeFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeFActionPerformed

    private void telFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telFActionPerformed

    private void salFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salFActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
        if ("".equals(cnpF.getText()) || "".equals(numeF.getText()) || "".equals(prenF.getText()) || "".equals(adrF.getText()) || "".equals(telF.getText()) || "".equals(salF.getText()) || "".equals(datF.getText()) || "".equals(coddF.getText())) {

            JOptionPane.showMessageDialog(jFrame, "Introdu valori in toate campurile!");
        } else {

            try {
                java.sql.Statement stmt = con.createStatement();
                String sql = "select cod_angajat from angajat";
                ResultSet result = stmt.executeQuery(sql);
                while (result.next()) {
                    prevCod = parseInt(result.getString("cod_angajat"));
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            prevCod = prevCod + 1;
            cnpInt = new BigInteger(cnpF.getText(),13);
            numeString = numeF.getText();
            prenString = prenF.getText();
            adresaString = adrF.getText();
            telefonInt = parseInt(telF.getText());
            salariuInt = parseInt(salF.getText());
            dataAngString = datF.getText();
            codDepInt = parseInt(coddF.getText());

            System.out.println("insert into angajat "
                    + "values (" + prevCod + "," + cnpInt + "," + numeString + "," + prenString + "," + adresaString + "," + telefonInt + "," + salariuInt + "," + dataAngString + "," + codDepInt + ");");
            try {
                java.sql.Statement stmt = con.createStatement();

                stmt.executeUpdate("insert into angajat "
                        + "values (" + prevCod + "," + cnpInt + ",'" + numeString + "','" + prenString + "','" + adresaString + "'," + telefonInt + "," + salariuInt + ",{d '" + dataAngString + "'}," + codDepInt + ");");
                stmt.close();

            } catch (Exception e) {
                System.out.println(e + " aici");
            }
            clearF();
            refresh();
        }

    }//GEN-LAST:event_InsertActionPerformed

    private void ModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifActionPerformed
        // TODO add your handling code here:
        cnpInt = new BigInteger(cnpF.getText());
        numeString = numeF.getText();
        prenString = prenF.getText();
        adresaString = adrF.getText();
        telefonInt = parseInt(telF.getText());
        salariuInt = parseInt(salF.getText());
        dataAngString = datF.getText();
        codDepInt = parseInt(coddF.getText());

        if (savedCodAng == 0) {

        } else {
            System.out.println("Update angajat "
                    + "set cnp = " + cnpInt + " ,nume = '" + numeString + "' ,prenume = '" + prenString + "' ,adresa = '" + adresaString + "' ,telefon = " + telefonInt + " ,salariu = " + salariuInt + " ,data_angajare = '" + dataAngString + "' ,cod_departament = " + codDepInt + ";");
            try {
                java.sql.Statement stmt = con.createStatement();
                
                stmt.executeUpdate("Update angajat "
                    + "set cnp = " + cnpInt + " ,nume = '" + numeString + "' ,prenume = '" + prenString + "' ,adresa = '" + adresaString + "' ,telefon = " + telefonInt + " ,salariu = " + salariuInt + " ,data_angajare = '" + dataAngString + "' ,cod_departament = " + codDepInt + " where cod_angajat = " + savedCodAng + ";");
                stmt.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        refresh();
        clearF();
    }//GEN-LAST:event_ModifActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        clearF();
        refresh();
    }//GEN-LAST:event_ClearActionPerformed

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CautareF;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Modif;
    private javax.swing.JButton Search;
    private javax.swing.JTable Tabel;
    private javax.swing.JTextField adrF;
    private javax.swing.JButton back;
    private javax.swing.JTextField cnpF;
    private javax.swing.JTextField coddF;
    private javax.swing.JTextField datF;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numeF;
    private javax.swing.JTextField prenF;
    private javax.swing.JTextField salF;
    private javax.swing.JTextField telF;
    // End of variables declaration//GEN-END:variables
}
