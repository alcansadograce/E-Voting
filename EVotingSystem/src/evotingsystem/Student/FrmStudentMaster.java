package evotingsystem.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public final class FrmStudentMaster extends javax.swing.JFrame {
DatabaseConnection cnn = new DatabaseConnection();
    public FrmStudentMaster() {
       initComponents();
       displayTable();
     
        this.setLocationRelativeTo(null);
    }
    
    public ArrayList<User> getUsersList() 
    {
        ArrayList<User> usersList = new ArrayList<User>();
        //Connection connection = cnn.conn;
        String query = "SELECT * FROM t_studentsinformation t;";
        Statement stmt;
        ResultSet rs;
        
        try {
        
            cnn.rs = cnn.stmt.executeQuery(query);
            User user;
            while(cnn.rs.next())
            {
             //user = new User(cnn.rs.getString("LastName"),cnn.rs.getString("FirstName"),cnn.rs.getString("MiddleName"));
               user = new User(cnn.rs.getInt("StudentID"),cnn.rs.getString("LastName"),cnn.rs.getString("FirstName"),cnn.rs.getString("MiddleName"),cnn.rs.getInt("UserID"),cnn.rs.getString("Gender"),cnn.rs.getString("Course"),cnn.rs.getString("Year"));
               usersList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usersList;
    }
    //Display Data in JTable
    
    
    
     public void displayTable(){
       // nametxt.setFocusable(false);
        try {
        String sql = "SELECT * FROM t_studentsinformation t;";
        cnn.ps = cnn.conn.prepareStatement(sql);
        cnn.rs = cnn.ps.executeQuery();
        tblUsers.setModel(DbUtils.resultSetToTableModel(cnn.rs));  
        }
        catch(Exception e){
        }   
    
    }
          
    public void ShowUsersTable()
    {
        ArrayList<User> list = getUsersList();
        DefaultTableModel model = (DefaultTableModel)tblUsers.getModel();
        Object[] row = new Object[8];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getStudentID();
            row[1] = list.get(i).getLastName();
            row[2] = list.get(i).getFirstName();
            row[3] = list.get(i).getMiddleName();
            row[4] = list.get(i).getUserID();
            row[5] = list.get(i).getGender();
            row[6] = list.get(i).getCourse();
            row[7] = list.get(i).getYear();
            
            model.addRow(row);
        }
    } 

    /**
     *
     * @throws SQLException
     */
    
//    public void executeSQLQuery() throws SQLException
//    {
//        Connection con = getConnection();
//        Statement stmt;
//        try{
//            stmt = con.createStatement();
//            String query = null;
//            if((stmt.executeUpdate(query)) == 1)
//            {
//                //Refresh JTable Data
//                DefaultTableModel model = (DefaultTableModel)jTableDisplayUsers.getModel();
//                model.setRowCount(0);
//                ShowUsersTable();
//                
//                String message = null;
//                JOptionPane.showMessageDialog(null, "Data "+message+" Successfully");
//            }else{
//                String message = null;
//                JOptionPane.showMessageDialog(null, "Data Not "+message);
//            }
//        }catch(Exception ex){
//            ex.printStackTrace();
//            
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelStudID = new javax.swing.JLabel();
        jLabelLName = new javax.swing.JLabel();
        jLabelFName = new javax.swing.JLabel();
        jLabelUserID = new javax.swing.JLabel();
        jLabelMName = new javax.swing.JLabel();
        jLabelCourse = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelYear = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldStudentID = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldMiddleName = new javax.swing.JTextField();
        jTextFieldUserID = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jTextFieldCourse = new javax.swing.JTextField();
        jTextFieldYear = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabelStudID.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelStudID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelStudID.setText("Student ID:");

        jLabelLName.setBackground(new java.awt.Color(102, 255, 255));
        jLabelLName.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelLName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLName.setText("Last Name:");

        jLabelFName.setBackground(new java.awt.Color(102, 255, 255));
        jLabelFName.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelFName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFName.setText("First Name:");

        jLabelUserID.setBackground(new java.awt.Color(102, 255, 255));
        jLabelUserID.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelUserID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUserID.setText("User ID:");

        jLabelMName.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMName.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelMName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMName.setText("Middle Name:");

        jLabelCourse.setBackground(new java.awt.Color(102, 255, 255));
        jLabelCourse.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelCourse.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCourse.setText("Course:");

        jLabelGender.setBackground(new java.awt.Color(102, 255, 255));
        jLabelGender.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGender.setText("Gender:");

        jLabelYear.setBackground(new java.awt.Color(102, 255, 255));
        jLabelYear.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabelYear.setForeground(new java.awt.Color(255, 255, 255));
        jLabelYear.setText("Year:");

        tblUsers.setBackground(new java.awt.Color(240, 240, 240));
        tblUsers.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblUsers.setForeground(new java.awt.Color(0, 153, 255));
        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "StudentID", "LastName", "FirstName", "MiddleName", "UserID", "Gender", "Course", "Year"
            }
        ));
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        jButtonInsert.setBackground(new java.awt.Color(153, 153, 153));
        jButtonInsert.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonInsert.setText("Insert");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(153, 153, 153));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jTextFieldMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMiddleNameActionPerformed(evt);
            }
        });

        jTextFieldUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserIDActionPerformed(evt);
            }
        });

        jTextFieldGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGenderActionPerformed(evt);
            }
        });

        jTextFieldCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCourseActionPerformed(evt);
            }
        });

        jTextFieldYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelLName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelMName)
                                .addComponent(jLabelFName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addComponent(jTextFieldMiddleName))
                            .addGap(47, 47, 47)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelGender)
                                    .addComponent(jLabelCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelStudID)
                                .addGap(31, 31, 31)
                                .addComponent(jTextFieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabelStudID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonInsert)
                            .addComponent(jButtonUpdate)
                            .addComponent(jButtonDelete))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMiddleNameActionPerformed

    private void jTextFieldUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserIDActionPerformed

    private void jTextFieldGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGenderActionPerformed

    private void jTextFieldCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCourseActionPerformed

    private void jTextFieldYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldYearActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        //Display selected row in JTextFields
        int i = tblUsers.getSelectedRow();
        TableModel model= tblUsers.getModel();
        jTextFieldStudentID.setText(model.getValueAt(i,0).toString());
        jTextFieldLastName.setText(model.getValueAt(i,1).toString());
        jTextFieldFirstName.setText(model.getValueAt(i,2).toString());
        jTextFieldMiddleName.setText(model.getValueAt(i,3).toString());
        jTextFieldUserID.setText(model.getValueAt(i,4).toString());
        jTextFieldGender.setText(model.getValueAt(i,5).toString());
        jTextFieldCourse.setText(model.getValueAt(i,6).toString());
        jTextFieldYear.setText(model.getValueAt(i,7).toString());
  
    }//GEN-LAST:event_tblUsersMouseClicked

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
         String query = "INSERT INTO 't_evotingsystem'('LastName','FirstName','MiddleName','UserID','Gender','Course','Year')VALUES('"+jTextFieldLastName.getText()+"','"+jTextFieldFirstName.getText()+"','"+jTextFieldMiddleName.getText()+"','"+jTextFieldUserID.getText()+"','"+jTextFieldGender.getText()+"','"+jTextFieldCourse.getText()+"','"+jTextFieldYear.getText()+")";
         executeSQLQuery(query, "Inserted");
         
//         
//         try {
//            String fname = fnametxt.getText();
//            String lname = lnametxt.getText();
//            String  user = usernametxt.getText();
//            String pass = passwordfield.getText();
//            String account = accounttype.getSelectedItem().toString();
//            String num = contacttxt.getText();
//            String status = "Logoff";
//            String sql = "Select * from users";
//            connection.rs = connection.stmt.executeQuery(sql);
//            while (connection.rs.next()){
//                connection.stmt.executeUpdate("INSERT INTO users (Username,Password,AccountType,Firstname,Lastname,ContactNumber,Status) VALUES ('"+user+"','"+pass+"','"+account+"','"+fname+"','"+lname+"','"+num+"','"+status+"')");
//                JOptionPane.showMessageDialog(null,"You're Successfully Regitered!","REGISTERED",JOptionPane.INFORMATION_MESSAGE);
//                clear();
//            }
//        }
//        catch(Exception e){}
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        String query = "UPDATE 't_evotingsystem' SET 'LastName'='"+jTextFieldLastName.getText()+"','FirstName'="+jTextFieldFirstName.getText()+"','MiddleName'='"+jTextFieldMiddleName.getText()+"','UserID'='"+jTextFieldUserID.getText()+"','Gender'='"+jTextFieldGender.getText()+"','Course'='"+jTextFieldCourse.getText()+"','Year'='"+jTextFieldYear.getText()+" WHERE 'StudentID'="+jTextFieldStudentID.getText();
        executeSQLQuery(query, "Updated");
        
//         try{
//            String seatNumber = reservedFlightTable.getModel().getValueAt(row, 5).toString(); 
//            String tablename = flightCode + "seatdetails";
//            String sql3 = "Select * from "+tablename+" ";
//            String status = "Available";
//            connection.ps = connection.conn.prepareStatement(sql3);
//            connection.rs = connection.ps.executeQuery();
//            if(connection.rs.next()){
//                connection.stmt.executeUpdate("update "+tablename+" set Status = '"+status+"' where Number='"+seatNumber+"' ");
//            }
//        }
//        catch(Exception e){}
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        String query = "DELETE FROM 't_studentsinformation' WHERE StudentID = "+jTextFieldStudentID.getText(); 
        executeSQLQuery(query, "Deleted");
        
//        
//         String sql = "Select * from tickettable";
//        try{
//            connection.rs = connection.stmt.executeQuery(sql);
//            while(connection.rs.next()){
//                connection.stmt.executeUpdate("delete from tickettable where TicketCode  = '"+ticketCode+"'");
//                displayTable();
//            }
//        }
//        catch(Exception e){}
//        // update number of seats
//        
//     }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmStudentMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStudentMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStudentMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStudentMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStudentMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelCourse;
    private javax.swing.JLabel jLabelFName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelLName;
    private javax.swing.JLabel jLabelMName;
    private javax.swing.JLabel jLabelStudID;
    private javax.swing.JLabel jLabelUserID;
    private javax.swing.JLabel jLabelYear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCourse;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldMiddleName;
    private javax.swing.JTextField jTextFieldStudentID;
    private javax.swing.JTextField jTextFieldUserID;
    private javax.swing.JTextField jTextFieldYear;
    private javax.swing.JTable tblUsers;
    // End of variables declaration//GEN-END:variables

    private void executeSQLQuery(String query, String inserted) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
