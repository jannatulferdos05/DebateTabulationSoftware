
package DebateTabulation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.DropMode.INSERT;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddTeam extends javax.swing.JFrame {

    public AddTeam() throws SQLException {
        initComponents();
        table_update();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        teamInstitution = new javax.swing.JTextField();
        teamName = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        name2 = new javax.swing.JTextField();
        name3 = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 150, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Add Team");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Team's institution");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Team Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Name(Participant 1)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Name(Participant 2)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Name(Participant 3)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Team Leader's Email");

        teamInstitution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamInstitutionActionPerformed(evt);
            }
        });

        teamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamNameActionPerformed(evt);
            }
        });

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Done");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team's Institution", "Team Name", "Name(Participant 1)", "Name(Participant 2)", "Name(Participant 3)", "Team Leader's Email"
            }
        ));
        jScrollPane1.setViewportView(tableData);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton1)
                                .addGap(83, 83, 83)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(97, 97, 97)))
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name2)
                            .addComponent(name3)
                            .addComponent(Email)
                            .addComponent(teamName)
                            .addComponent(name1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teamInstitution, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(65, 65, 65))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(teamInstitution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teamInstitutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamInstitutionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamInstitutionActionPerformed

    private void teamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamNameActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        UserFrame uf= new UserFrame();
        uf.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
      
        Connection con1;
        PreparedStatement insert;
        private void table_update() throws SQLException{
            int c;
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1= DriverManager.getConnection("jdbc:mysql://localhost/add team","root","");
            insert = con1.prepareStatement("select * from information");
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData Res=(ResultSetMetaData) rs.getMetaData();
            c = Res.getColumnCount();
            DefaultTableModel Df=(DefaultTableModel)tableData.getModel();
            Df.setRowCount(0);
            while(rs.next()){
                Vector v2= new Vector();
                for(int i=1;i<=c;i++){ 
                    v2.add(rs.getString("insname"));
                    v2.add(rs.getString("teamname"));
                    v2.add(rs.getString("Name1"));
                    v2.add(rs.getString("Name2"));
                    v2.add(rs.getString("Name3"));
                    v2.add(rs.getString("email"));
                }
                Df.addRow(v2);
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/addteam", "root", ""); Statement st = conn.createStatement()) {
                
                
                String query1="SELECT * FROM teaminfo";
                ResultSet rs= st.executeQuery(query1);
                ResultSetMetaData rsmd= rs.getMetaData();
                DefaultTableModel model= (DefaultTableModel)tableData.getModel();
                int cols=rsmd.getColumnCount();
                String[] colName= new String[cols];
                for(int i=0;i<cols;i++)
                    colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                String name,name1,name2,name3,name4,name5;
                while(rs.next()){
                    name= rs.getString(1); name1=rs.getString(2); name2=rs.getString(3);
                    name3=rs.getString(4);name4=rs.getString(5);name5=rs.getString(6);
                    String[] row={name,name1,name2,name3,name4,name5};
                    model.addRow(row);
                }
            }
      
        } catch (ClassNotFoundException  ex) {
            Logger.getLogger(AddTeam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         String Name= teamInstitution.getText();
          String Name1=teamName.getText();
          String Name3=name1.getText();
          String Name4=name2.getText();
          String Name5=name3.getText();
          String Name6=Email.getText();
        try {   
            Class.forName("com.mysql.cj.jdbc.Driver");
             try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/addteam", "root", "")) {
                 Statement st=conn.createStatement();
                 
String query= "INSERT INTO teaminfo(Teams_Institution, Team_Name,Participant_1, Participant_2, Participant_3, Team_Leaders_Email) VALUES ('"+Name+"','"+Name1+"','"+Name3+"','"+Name4+"','"+Name5+"','"+Name6+"')";
                 st.executeUpdate(query);
                 JOptionPane.showMessageDialog(this, "Successfully Added");   
             }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AddTeam at;
        try {
            at = new AddTeam();
            at.show();
        dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AddTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AddTeam().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AddTeam.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField name3;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField teamInstitution;
    private javax.swing.JTextField teamName;
    // End of variables declaration//GEN-END:variables
}
