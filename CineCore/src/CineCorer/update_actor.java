
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class update_actor extends javax.swing.JFrame {
     int aid;
     String aname;
     String actorname;
     String actorgender;
     int    actorage;
    public update_actor() {
        initComponents();
        mylist();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sac_rollback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        ac_gender = new javax.swing.JComboBox<>();
        ac_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ac_age = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        sac_rollback.setText("Πίσω");
        sac_rollback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sac_rollbackActionPerformed(evt);
            }
        });

        jLabel1.setText("<html><strong><center>Παρακαλώ επιλέξτε ηθοποίο.</html></strong></center>");

        jButton1.setText("Ενημέρωση");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        ac_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Άντρας", "Γυναίκα", "Άλλο" }));
        ac_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac_genderActionPerformed(evt);
            }
        });

        ac_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac_nameActionPerformed(evt);
            }
        });

        jLabel5.setText("Ονοματεπώνυμο :");

        age.setText("Ηλικία :");

        jLabel6.setText("Φύλλο :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sac_rollback, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ac_name, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ac_age, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ac_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ac_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ac_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ac_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sac_rollback)
                    .addComponent(jButton1))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sac_rollbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sac_rollbackActionPerformed
       new update_table().setVisible(true);
           dispose();
    }//GEN-LAST:event_sac_rollbackActionPerformed

    private void ac_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac_genderActionPerformed
      
    }//GEN-LAST:event_ac_genderActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       viewac();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {  
           int response;
           if(ac_name.getText().length()>0){
              aname=ac_name.getText();
           }
           if(ac_gender.getSelectedIndex()!=0){
              actorgender= (String) ac_gender.getSelectedItem();
           }
           if(ac_age.getText().length()>0){
            int aage = Integer.parseInt(ac_age.getText());
            if (aage>=0 && aage<=100) {
                      actorage=aage;
                      response = JOptionPane.showConfirmDialog(
                        null,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to update ACTOR table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                         update_ac(aid,aname,actorage,actorgender);
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The ACTOR has been update successfully",  // Μήνυμα
                        "Table Updated Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                        ac_name.setText("");
                        ac_age.setText("");
                        ac_gender.setSelectedIndex(0);
                 } 
            }else{
                JOptionPane.showMessageDialog(
                    null,
                    "Age must be within the range of 1 to 100.",
                    "Invalid Age",
                JOptionPane.WARNING_MESSAGE
                );
             }
           }else{
                response = JOptionPane.showConfirmDialog(
                        null,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to update ACTOR table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                         update_ac(aid,aname,actorage,actorgender);
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The ACTOR has been update successfully",  // Μήνυμα
                        "Table Updated Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                        ac_name.setText("");
                        ac_age.setText("");
                        ac_gender.setSelectedIndex(0);
                }
            }
           
           
        
        } catch(NumberFormatException e){
            System.out.println("\n -- Numeric Exception _on update_actor --- \n");
            JOptionPane.showMessageDialog(
                    null,
                    "Age must be a valid number.",
                    "Invalid Age",
                JOptionPane.WARNING_MESSAGE
                );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ac_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ac_nameActionPerformed

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_actor().setVisible(true);
            }
        });
    }
    
     void mylist(){
        int i =0;
        String mynames[]=new String [50];
        try{
             jComboBox1.removeAllItems();
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_actors_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
        jComboBox1.addItem("");
        for(int y=0;y<i;y++){
           jComboBox1.addItem(mynames[y]);
        }
      
      }
     
     void viewac(){
        try{ 
             aname=(String) jComboBox1.getSelectedItem();
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             model.setRowCount(0);
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * FROM get_an_actor(?)");
             stmt.setString(1, aname);
             ResultSet rs =stmt.executeQuery();
             while (rs.next()) {
                aid=rs.getInt("acid");
                actorname = rs.getString("actname"); 
                actorgender = rs.getString("agender");
                actorage=rs.getInt("aage");
                model.addRow(new Object[]{actorname,actorgender,actorage});
             }
     } catch (SQLException e) {
         System.out.println("\n -- Numeric Exception on view_ac --- \n");
           
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
    }
     
     
     
     void update_ac(int id,String name,int age,String sex){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("Call update_actor(?,?,?,?)");
               stmt.setInt(1, id);
               stmt.setString(2, name);
               stmt.setInt(4, age);
               stmt.setString(3, sex);
               stmt.executeUpdate();
               mylist();
               System.out.println("Stored Procedure  insert  actor executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception on update_ac --- \n");
            
        }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ac_age;
    private javax.swing.JComboBox<String> ac_gender;
    private javax.swing.JTextField ac_name;
    private javax.swing.JLabel age;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sac_rollback;
    // End of variables declaration//GEN-END:variables
}
