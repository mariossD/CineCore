
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class update_movie extends javax.swing.JFrame {
     int mvid;
     String mname;
     String mvname;
     String mvgenre;
  
    public update_movie() {
        initComponents();
        mylist();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        dm_combobox = new javax.swing.JComboBox<>();
        mv_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mv_genre = new javax.swing.JComboBox<>();
        im_roll_back = new javax.swing.JButton();
        confrim_imovie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Genre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("<html><center><strong>Παρακαλώ επιλέξτε  ταινία  </html></center></strong>");

        dm_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dm_comboboxActionPerformed(evt);
            }
        });

        jLabel2.setText("Τίτλος Ταινίας:");

        jLabel3.setText("Είδος :");

        mv_genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Δράμα", "Δράσης", "Κωμωδία", "Τρόμου" }));
        mv_genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mv_genreActionPerformed(evt);
            }
        });

        im_roll_back.setText("Πίσω");
        im_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_roll_backActionPerformed(evt);
            }
        });

        confrim_imovie.setText("Ενημέρωση");
        confrim_imovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_imovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(mv_name, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mv_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dm_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(im_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confrim_imovie)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dm_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mv_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mv_genre))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(im_roll_back)
                    .addComponent(confrim_imovie))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void im_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_roll_backActionPerformed
       new update_table().setVisible(true);
           dispose();
    }//GEN-LAST:event_im_roll_backActionPerformed

    private void mv_genreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mv_genreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mv_genreActionPerformed

    private void confrim_imovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_imovieActionPerformed
       try {  
           int response;
           if(mv_name.getText().length()<=0 && mv_genre.getSelectedIndex()== 0)
           {JOptionPane.showMessageDialog(
                    null,
                    "Error: You must fill in at least one field to update the record.",
                    "Update Error",
                JOptionPane.WARNING_MESSAGE
                );
           }
           else{
               if(mv_genre.getSelectedIndex()!= 0){
                  mvgenre= (String) mv_genre.getSelectedItem();
               }
               if(mv_name.getText().length()>0){
                  mvname=mv_name.getText();
               }
              response = JOptionPane.showConfirmDialog(
                        null,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to update Movie table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                         update_mv(mvid,mvname,mvgenre);
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The Movie has been update successfully",  // Μήνυμα
                        "Table Updated Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                        mv_name.setText("");
                        mv_genre.setSelectedIndex(0);
                 } 
           }
        }  catch(NullPointerException e){
            System.out.println("\n -- Null Pointer Exception --- \n");
            JOptionPane.showMessageDialog(
                    null,
                    "All fields must be filled.",
                    "Input Error",
                JOptionPane.WARNING_MESSAGE
                );
        }
    }//GEN-LAST:event_confrim_imovieActionPerformed

    private void dm_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dm_comboboxActionPerformed
       viewmv();
    }//GEN-LAST:event_dm_comboboxActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_movie().setVisible(true);
            }
        });
    }
    
    
    void mylist(){
        int i =0;
        String mynames[]=new String [50];
        try{
             dm_combobox.removeAllItems();
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_movie_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
          dm_combobox.addItem("");
        for(int y=0;y<i;y++){
            dm_combobox.addItem(mynames[y]);
        }
      
      }
    
    
    void viewmv(){
        try{ 
             mvname=(String) dm_combobox.getSelectedItem();
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             model.setRowCount(0);
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * FROM get_a_movie(?)");
             stmt.setString(1, mvname);
             ResultSet rs =stmt.executeQuery();
             while (rs.next()) {
                mvid=rs.getInt("mvid");
                mvname = rs.getString("mvname"); 
                mvgenre = rs.getString("mvgenre");
                model.addRow(new Object[]{mvname , mvgenre});
             }
     } catch (SQLException e) {
         System.out.println("\n -- Numeric Exception on view_mv --- \n");
           
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
    }
    
    
    void update_mv(int id,String name,String genre){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("Call update_movie(?,?,?)");
               stmt.setInt(1, id);
               stmt.setString(2, name);
               stmt.setString(3, genre);
               stmt.executeUpdate();
               mylist();
               System.out.println("Stored Procedure  update movie  executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception on update_mv  --- \n");
            
        }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confrim_imovie;
    private javax.swing.JComboBox<String> dm_combobox;
    private javax.swing.JButton im_roll_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> mv_genre;
    private javax.swing.JTextField mv_name;
    // End of variables declaration//GEN-END:variables
}
