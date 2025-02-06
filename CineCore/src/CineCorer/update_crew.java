
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class update_crew extends javax.swing.JFrame {
     int cid;
     String crname;
     String crewname;
     String crewrole;
     int    crewage;
    public update_crew() {
        initComponents();
        mylist();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cr_age = new javax.swing.JTextField();
        cr_role = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cr_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        dc_combobox = new javax.swing.JComboBox<>();
        dc_roll_back = new javax.swing.JButton();
        confrim_dc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ονοματεπώνυμο", "Ρόλος", "Ηλικία"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Ρόλος :");

        cr_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Διευθυντής Πραγωγής", "Σεναριογράφος", "Σκηνοθέτης" }));
        cr_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cr_roleActionPerformed(evt);
            }
        });

        jLabel1.setText("<html><center><strong> Παρακαλώ επιλέξτε ατόμο από την δημιουργική ομάδα</html></center></strong>");

        jLabel2.setText("Ονοματεπώνυμο :");

        age.setText("Ηλικία :");

        dc_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dc_comboboxActionPerformed(evt);
            }
        });

        dc_roll_back.setText("Πίσω");
        dc_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dc_roll_backActionPerformed(evt);
            }
        });

        confrim_dc.setText("Ενημέρωση");
        confrim_dc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_dcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(dc_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cr_name, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cr_age, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cr_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(dc_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confrim_dc)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dc_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cr_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cr_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cr_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dc_roll_back)
                    .addComponent(confrim_dc))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dc_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dc_roll_backActionPerformed
        new update_table().setVisible(true);
            dispose();
    }//GEN-LAST:event_dc_roll_backActionPerformed

    private void cr_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cr_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cr_roleActionPerformed

    private void confrim_dcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_dcActionPerformed
        try {  
           int response;
           if(cr_name.getText().length()>0){
              crewname=cr_name.getText();
           }
           if(cr_role.getSelectedIndex()!=0){
             crewrole= (String) cr_role.getSelectedItem();
           }
           if(cr_age.getText().length()>0){
            int aage = Integer.parseInt(cr_age.getText());
            if (aage>=18 && aage<=100) {
                      crewage=aage;
                      response = JOptionPane.showConfirmDialog(
                        null,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to update Creative team table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                         update_cr(cid,crewname,crewage,crewrole);
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The Creative team has been update successfully",  // Μήνυμα
                        "Table Updated Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                        cr_name.setText("");
                        cr_age.setText("");
                        cr_role.setSelectedIndex(0);
                 } 
            }else{
                JOptionPane.showMessageDialog(
                    null,
                    "Age must be within the range of 18 to 100.",
                    "Invalid Age",
                JOptionPane.WARNING_MESSAGE
                );
             }
           }else{
                response = JOptionPane.showConfirmDialog(
                        null,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to update Creative team  table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                         update_cr(cid,crewname,crewage,crewrole);
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The Creative team  has been update successfully",  // Μήνυμα
                        "Table Updated Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                        cr_name.setText("");
                        cr_age.setText("");
                        cr_role.setSelectedIndex(0);
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
    }//GEN-LAST:event_confrim_dcActionPerformed

    private void dc_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dc_comboboxActionPerformed
      viewcr();
    }//GEN-LAST:event_dc_comboboxActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_crew().setVisible(true);
            }
        });
    }

    
     void mylist(){
        int i =0;
        String mynames[]=new String [10];
        try{
             dc_combobox.removeAllItems();
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_crew_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
         dc_combobox.addItem("");
        for(int y=0;y<i;y++){
            dc_combobox.addItem(mynames[y]);
        }
      
      }
     
     
     void viewcr(){
        try{ 
             crname=(String) dc_combobox.getSelectedItem();
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             model.setRowCount(0);
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * FROM get_a_crew(?)");
             stmt.setString(1, crname);
             ResultSet rs =stmt.executeQuery();
             while (rs.next()) {
                cid=rs.getInt("crid");
                crewname = rs.getString("crname"); 
                crewrole = rs.getString("crrole");
                crewage=rs.getInt("crage");
                model.addRow(new Object[]{crewname,crewrole , crewage});
             }
     } catch (SQLException e) {
         System.out.println("\n -- Numeric Exception on view_cr --- \n");
           
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
    }
     
     
     void update_cr(int id,String name,int age,String role){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("Call update_crew(?,?,?,?)");
               stmt.setInt(1, id);
               stmt.setString(2, name);
               stmt.setInt(4, age);
               stmt.setString(3, role);
               stmt.executeUpdate();
               mylist();
               System.out.println("Stored Procedure  update crew successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception on update_cr --- \n");
            
        }
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JButton confrim_dc;
    private javax.swing.JTextField cr_age;
    private javax.swing.JTextField cr_name;
    private javax.swing.JComboBox<String> cr_role;
    private javax.swing.JComboBox<String> dc_combobox;
    private javax.swing.JButton dc_roll_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
