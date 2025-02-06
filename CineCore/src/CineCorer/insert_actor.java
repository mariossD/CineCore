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


public class insert_actor extends javax.swing.JFrame {

    JFrame insert_actor=new JFrame();
    String asex;
    public insert_actor() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ia_roll_back = new javax.swing.JButton();
        confrim_iactor = new javax.swing.JButton();
        ac_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ac_age = new javax.swing.JTextField();
        ac_gender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><center><strong> Παρακαλώ εισάγεται τα στοιχεία του/της ηθοποιοίου</html></center></strong>");

        ia_roll_back.setText("Πίσω");
        ia_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ia_roll_backActionPerformed(evt);
            }
        });

        confrim_iactor.setText("Επιβεβαίωση");
        confrim_iactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_iactorActionPerformed(evt);
            }
        });

        ac_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac_nameActionPerformed(evt);
            }
        });

        jLabel2.setText("Ονοματεπώνυμο :");

        age.setText("Ηλικία :");

        jLabel3.setText("Φύλλο :");

        ac_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac_ageActionPerformed(evt);
            }
        });

        ac_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Άντρας", "Γυναίκα", "Άλλο" }));
        ac_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac_genderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ac_name, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ac_age, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))
                                    .addComponent(ac_gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ia_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confrim_iactor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ac_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ac_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ac_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ia_roll_back)
                    .addComponent(confrim_iactor))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ia_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ia_roll_backActionPerformed
       new insert_selection().setVisible(true);
       dispose();
    }//GEN-LAST:event_ia_roll_backActionPerformed

    private void ac_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac_nameActionPerformed
     
    }//GEN-LAST:event_ac_nameActionPerformed

    private void confrim_iactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_iactorActionPerformed
      try {  
            String aname = ac_name.getText();
            asex = (String) ac_gender.getSelectedItem();
            int aage = Integer.parseInt(ac_age.getText());
            if (aage>=0 && aage<=100) {
                if (aname.length()<=0) {
                     JOptionPane.showMessageDialog(
                        insert_actor,
                        "Error: Both name and age must be provided.",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                } else {
                        insert_ac(aname,aage,asex);
                        JOptionPane.showMessageDialog(
                        insert_actor,  // Γονικό παράθυρο
                        "The data has been successfully inserted into the ACTOR table.",  // Μήνυμα
                        "Record Added",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                        );
                        ac_name.setText("");
                        ac_age.setText("");
                }    
            } else {
               JOptionPane.showMessageDialog(
                    insert_actor,
                    "Age must be within the range of 1 to 100.",
                    "Invalid Age",
                JOptionPane.WARNING_MESSAGE
                );
            }   
        } catch(NumberFormatException e){
            System.out.println("\n -- Numeric Exception --- \n");
            JOptionPane.showMessageDialog(
                    null,
                    "Age must be a valid number.",
                    "Invalid Age",
                JOptionPane.WARNING_MESSAGE
                );
        }
    }//GEN-LAST:event_confrim_iactorActionPerformed

    private void ac_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac_ageActionPerformed
   
    }//GEN-LAST:event_ac_ageActionPerformed

    private void ac_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac_genderActionPerformed
           
    }//GEN-LAST:event_ac_genderActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert_actor().setVisible(true);
            }
        });
    }
    
     void insert_ac(String name,int age,String sex){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call insert_actor(?,?,?)");
               stmt.setString(1, name);
               stmt.setInt(2, age);
               stmt.setString(3, sex);
               stmt.execute();
               System.out.println("Stored Procedure  insert  actor executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ac_age;
    private javax.swing.JComboBox<String> ac_gender;
    private javax.swing.JTextField ac_name;
    private javax.swing.JLabel age;
    private javax.swing.JButton confrim_iactor;
    private javax.swing.JButton ia_roll_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
