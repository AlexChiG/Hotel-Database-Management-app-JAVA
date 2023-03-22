package Interfata;

import com.mysql.cj.xdevapi.Statement;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Interfata extends javax.swing.JFrame {

    public Interfata() {
        initComponents();
        Connector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        angajat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 500));

        angajat.setText("Operatii in tabela Angajat");
        angajat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angajatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(angajat)
                .addContainerGap(584, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(angajat)
                .addContainerGap(455, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    boolean firstTimeOpening = true;

    public void Connector() {
        JFrame jFrame = new JFrame();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            java.sql.Statement statement = con.createStatement();
            String sql = "select * from departament";

            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {

                System.out.println(
                        "cod departament: " + result.getString("cod_departament"));
                System.out.println(
                        "departament:" + result.getString("nume_departament"));
            }
            if (firstTimeOpening) {
                JOptionPane.showMessageDialog(jFrame, "Conexiune Reusita!");
                firstTimeOpening = false;
            }
        } catch (Exception e) {
            System.out.println(e);
            if (firstTimeOpening) {
                JOptionPane.showMessageDialog(jFrame, "Conexiune esuata!");
                firstTimeOpening = false;
            }
        }

    }


    private void angajatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angajatActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == angajat) {
            angajat an = new angajat();
            an.setVisible(true);
            close();
        }

    }//GEN-LAST:event_angajatActionPerformed

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
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
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton angajat;
    // End of variables declaration//GEN-END:variables
}
