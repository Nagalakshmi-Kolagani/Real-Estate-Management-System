package RealEstateManagementSystem;
import javax.swing.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Admin Signin Backend
public class AdminSignin extends javax.swing.JFrame {

    public AdminSignin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")   
    private void initComponents() {

        javaxSwingJPanel4 = new javax.swing.JPanel();
        javaxSwingJLabel1 = new javax.swing.JLabel();
        javaxSwingJLabel2 = new javax.swing.JLabel();
        javaxSwingJButton1 = new javax.swing.JButton();
        javaxSwingJTextField1 = new javax.swing.JTextField();
        javaxSwingJTextField2 = new javax.swing.JTextField();
        javaxSwingJLabel3 = new javax.swing.JLabel();
        javaxSwingJButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javaxSwingJPanel4.setBackground(new java.awt.Color(204, 204, 255));

        javaxSwingJLabel1.setBackground(new java.awt.Color(0, 0, 0));
        javaxSwingJLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        javaxSwingJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel1.setText("Username");

        javaxSwingJLabel2.setBackground(new java.awt.Color(0, 0, 0));
        javaxSwingJLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        javaxSwingJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel2.setText("Password");

        javaxSwingJButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        javaxSwingJButton1.setText("Signin");
        javaxSwingJButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton1MouseClicked(evt);
            }
        });

        javaxSwingJTextField2.setName(""); // NOI18N

        javaxSwingJLabel3.setBackground(new java.awt.Color(0, 0, 0));
        javaxSwingJLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        javaxSwingJLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel3.setText("Admin Signin");

        javaxSwingJButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        javaxSwingJButton2.setText("Back");
        javaxSwingJButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton2MouseClicked(evt);
            }
        });
        javaxSwingJLabel1.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel2.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel3.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJPanel4.setBackground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton2.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton2.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton1.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout javaxSwingJPanel4Layout = new javax.swing.GroupLayout(javaxSwingJPanel4);
        javaxSwingJPanel4.setLayout(javaxSwingJPanel4Layout);
        javaxSwingJPanel4Layout.setHorizontalGroup(
            javaxSwingJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel4Layout.createSequentialGroup()
                .addGroup(javaxSwingJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javaxSwingJPanel4Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(javaxSwingJLabel3))
                    .addGroup(javaxSwingJPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(javaxSwingJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javaxSwingJPanel4Layout.createSequentialGroup()
                                .addGroup(javaxSwingJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(javaxSwingJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(javaxSwingJTextField2)
                                    .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javaxSwingJPanel4Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        javaxSwingJPanel4Layout.setVerticalGroup(
            javaxSwingJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(javaxSwingJLabel3)
                .addGap(29, 29, 29)
                .addGroup(javaxSwingJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel4Layout.createSequentialGroup()
                        .addComponent(javaxSwingJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel4Layout.createSequentialGroup()
                        .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(javaxSwingJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(javaxSwingJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DatabaseConnection conn= new DatabaseConnection();
    private void javaxSwingJButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton1MouseClicked
        try{

            
            String u=javaxSwingJTextField2.getText();
            if(u.isEmpty()){
                info_message("Provide username please!","Alert!",2);
                return;
            }
            
            String p=javaxSwingJTextField1.getText();
            if(p.isEmpty()){
                info_message("Provide password please!","Alert!",2);
                return;
            }
            String check_st="select * from admin_login_data where admin_user_name=? and password=? ";
            PreparedStatement check=conn.c.prepareStatement(check_st);//using connection variable from conn object
            check.setString(1,u);
            check.setString(2,p);
            ResultSet rs= check.executeQuery();
            if(!rs.next()){
                info_message("user not found!","Alert!",2);
            }
            else{
                info_message("Signed in!","Alert!",1);
                new AdminDashboard().setVisible(true);
                setVisible(false);
            }

        }
        catch(SQLException ex){
            System.out.println(ex);
        }

        
    }//GEN-LAST:event_javaxSwingJButton1MouseClicked

    private void javaxSwingJButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton2MouseClicked
        new Welcome().setVisible(true);
        dispose();
    }//GEN-LAST:event_javaxSwingJButton2MouseClicked

    public static void main(String args[]) {
        
        new AdminSignin().setVisible(true);
            
    }
   public void info_message(String message, String title,int c){
        if(c==1)
            JOptionPane.showMessageDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE);
        else if(c==2)
            JOptionPane.showMessageDialog(null,message,title,JOptionPane.WARNING_MESSAGE);

    }
     

    // Variables declaration//GEN-BEGIN:variables
    private javax.swing.JButton javaxSwingJButton2;
    private javax.swing.JLabel javaxSwingJLabel1;
    private javax.swing.JPanel javaxSwingJPanel4;
    private javax.swing.JButton javaxSwingJButton1;
    private javax.swing.JTextField javaxSwingJTextField1;
    private javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JLabel javaxSwingJLabel3;
    private javax.swing.JTextField javaxSwingJTextField2;
    // End of variables declaration//GEN-END:variables
}
