
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class delete_takes extends javax.swing.JFrame {
     String movie;
    
    public delete_takes() {
        initComponents();
         mylist();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dst_combobox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        dcm_combobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        dst_roll_back = new javax.swing.JButton();
        confrim_dst = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><center><strong>Παρακαλώ επιλέξτε την ταινία και στην συνέχεια το studio που θέλετε να διαγράψετε. </html></center></strong>");

        dst_combobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dst_combobox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Όνομα ταινιας :\n");

        dcm_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcm_comboboxActionPerformed(evt);
            }
        });

        jLabel3.setText("Ονομα Studio  :");

        dst_roll_back.setText("Πίσω");
        dst_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dst_roll_backActionPerformed(evt);
            }
        });

        confrim_dst.setText("Επιβεβαίωση");
        confrim_dst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_dstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcm_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dst_combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(dst_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confrim_dst)
                        .addGap(10, 10, 10)))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dst_combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcm_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confrim_dst)
                    .addComponent(dst_roll_back))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dst_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dst_roll_backActionPerformed
      new delete_data_rows().setVisible(true);
          dispose();
    }//GEN-LAST:event_dst_roll_backActionPerformed

    private void dcm_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcm_comboboxActionPerformed
        if(dcm_combobox.getSelectedIndex()==0){dst_combobox1.removeAllItems();}
       else{viewStudio();}
    }//GEN-LAST:event_dcm_comboboxActionPerformed

    private void dst_combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dst_combobox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dst_combobox1ActionPerformed

    private void confrim_dstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_dstActionPerformed
    try {  int response;
            String mvname = (String) dcm_combobox.getSelectedItem();
            String stname= (String) dst_combobox1.getSelectedItem();
            if (mvname.length()<=0 || stname.length()<=0) {
                     JOptionPane.showMessageDialog(
                        null,
                        "Error:All fields must be filled.",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {response = JOptionPane.showConfirmDialog(
                        null,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to delete this record from creative team table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                          delete_take(mvname,stname);    
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The record has been deleted successfully",  // Μήνυμα
                        "Table Delete Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                         dst_combobox1.removeAllItems();
                        
         }
                              
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
    }//GEN-LAST:event_confrim_dstActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_takes().setVisible(true);
            }
        });
    }
    
     void mylist(){
        int i =0;
        String mynames[]=new String [50];
        try{
             dcm_combobox.removeAllItems();
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_movie_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
          dcm_combobox.addItem("");
        for(int y=0;y<i;y++){
            dcm_combobox.addItem(mynames[y]);
        }
      
      }
     
     
     void viewStudio(){
        int i =0;
        movie = (String) dcm_combobox.getSelectedItem();
        String mynames[]=new String [50];
        try{
             dst_combobox1.removeAllItems();
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * FROM get_find_studio(?)");
             stmt.setString(1, movie);
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("sname");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
          dst_combobox1.addItem("");
        for(int y=0;y<i;y++){
            dst_combobox1.addItem(mynames[y]);
        }
      
      }
     
     void delete_take(String mv_name,String st_name){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call delete_takes(?,?)");
               stmt.setString(1, mv_name);
               stmt.setString(2,st_name );
               stmt.executeUpdate();
               mylist();
               System.out.println("Stored Procedure  delete executed successfully");
        } catch(SQLException ex) {JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "This record doesnt exist in TAKES table.",  // Μήνυμα
                        "Record  Not Added",  // Τίτλος διαλόγου
                        JOptionPane.WARNING_MESSAGE  // Είδος μηνύματος
                        );
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confrim_dst;
    private javax.swing.JComboBox<String> dcm_combobox;
    private javax.swing.JComboBox<String> dst_combobox1;
    private javax.swing.JButton dst_roll_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
