/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class insert_movie extends javax.swing.JFrame {
     JFrame insert_movie=new JFrame();
     String genre;
     
     
    public insert_movie() {
        initComponents();
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        im_roll_back1 = new javax.swing.JButton();
        confrim_icrew1 = new javax.swing.JButton();
        cr_name1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cr_age = new javax.swing.JTextField();
        cr_role1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        im_roll_back2 = new javax.swing.JButton();
        confrim_icrew2 = new javax.swing.JButton();
        cr_name2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        age1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cr_age1 = new javax.swing.JTextField();
        cr_role2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        im_roll_back = new javax.swing.JButton();
        confrim_imovie = new javax.swing.JButton();
        mv_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mv_genre = new javax.swing.JComboBox<>();

        jLabel4.setText("<html><center><strong> Παρακαλώ εισάγεται τα στοιχεία της ταινίας</html></center></strong>");

        im_roll_back1.setText("Πίσω");

        confrim_icrew1.setText("Επιβεβαίωση");

        jLabel5.setText("'Ονομα Ταινίας:");

        age.setText("Ηλικία :");

        jLabel6.setText("Ρόλος :");

        cr_role1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Διευθυντής Πραγωγής", "Σεναριογράφος", "Σκηνοθέτης", " " }));

        jLabel7.setText("<html><center><strong> Παρακαλώ εισάγεται τα στοιχεία της ταινίας</html></center></strong>");

        im_roll_back2.setText("Πίσω");

        confrim_icrew2.setText("Επιβεβαίωση");

        jLabel8.setText("'Ονομα Ταινίας:");

        age1.setText("Ηλικία :");

        jLabel9.setText("Ρόλος :");

        cr_role2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Διευθυντής Πραγωγής", "Σεναριογράφος", "Σκηνοθέτης", " " }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><center><strong> Παρακαλώ εισάγεται τα στοιχεία της ταινίας</html></center></strong>");

        im_roll_back.setText("Πίσω");
        im_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_roll_backActionPerformed(evt);
            }
        });

        confrim_imovie.setText("Επιβεβαίωση");
        confrim_imovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_imovieActionPerformed(evt);
            }
        });

        mv_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mv_nameActionPerformed(evt);
            }
        });

        jLabel2.setText("Τίτλος Ταινίας:");

        jLabel3.setText("Είδος :");

        mv_genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Δράμα", "Δράση", "Τρόμου", "Κωμωδία" }));
        mv_genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mv_genreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(im_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confrim_imovie))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(mv_name, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mv_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mv_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mv_genre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(im_roll_back)
                    .addComponent(confrim_imovie))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void im_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_roll_backActionPerformed
        new insert_selection().setVisible(true);
            dispose();
    }//GEN-LAST:event_im_roll_backActionPerformed

    private void confrim_imovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_imovieActionPerformed
       try {  
            String mvname = mv_name.getText();
            genre = (String) mv_genre.getSelectedItem();
            if (mvname.length()<=0 ) {
                     JOptionPane.showMessageDialog(
                        null,
                        "Error: name must be provided.",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                        insert_mv(mvname,genre);
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The data has been successfully inserted into the MOVIE table.",  // Μήνυμα
                        "Record Added",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                        );
                        mv_name.setText("");
                        
            }    
            
        } catch(NullPointerException e){
            System.out.println("\n -- Null Pointer Exception --- \n");
            JOptionPane.showMessageDialog(
                    null,
                    "All fields must be filled.",
                    "Input Error",
                JOptionPane.WARNING_MESSAGE
                );
        }
    }//GEN-LAST:event_confrim_imovieActionPerformed

    private void mv_genreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mv_genreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mv_genreActionPerformed

    private void mv_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mv_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mv_nameActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert_movie().setVisible(true);
            }
        });
    }
    
    void insert_mv(String name,String genre){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call insert_movie(?,?)");
               stmt.setString(1, name);
               stmt.setString(2,genre );
               stmt.execute();
               System.out.println("Stored Procedure  insert takes executed successfully");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(
                        insert_movie,
                        "Error: name must be provided.",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel age1;
    private javax.swing.JButton confrim_icrew1;
    private javax.swing.JButton confrim_icrew2;
    private javax.swing.JButton confrim_imovie;
    private javax.swing.JTextField cr_age;
    private javax.swing.JTextField cr_age1;
    private javax.swing.JTextField cr_name1;
    private javax.swing.JTextField cr_name2;
    private javax.swing.JComboBox<String> cr_role1;
    private javax.swing.JComboBox<String> cr_role2;
    private javax.swing.JButton im_roll_back;
    private javax.swing.JButton im_roll_back1;
    private javax.swing.JButton im_roll_back2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> mv_genre;
    private javax.swing.JTextField mv_name;
    // End of variables declaration//GEN-END:variables
}
