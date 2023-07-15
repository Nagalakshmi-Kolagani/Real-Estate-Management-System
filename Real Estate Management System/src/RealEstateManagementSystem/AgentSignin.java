package RealEstateManagementSystem;

import javax.swing.JOptionPane;

import java.sql.*;

//Agent Signin Backend
public class AgentSignin extends javax.swing.JFrame {

    public AgentSignin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        javaxSwingJPanel1 = new javax.swing.JPanel();
        javaxSwingJLabel1 = new javax.swing.JLabel();
        javaxSwingJLabel2 = new javax.swing.JLabel();
        javaxSwingJTextField1 = new javax.swing.JTextField();
        javaxSwingJLabel3 = new javax.swing.JLabel();
        javaxSwingJTextField2 = new javax.swing.JTextField();
        javaxSwingJButton1 = new javax.swing.JButton();
        javaxSwingJButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        
        javaxSwingJPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javaxSwingJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        javaxSwingJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel1.setText("Agent Signin");

        javaxSwingJLabel2.setBackground(new java.awt.Color(0, 0, 0));
        javaxSwingJLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); 
        javaxSwingJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel2.setText("Username");

        javaxSwingJTextField1.setName("");

        javaxSwingJLabel3.setBackground(new java.awt.Color(0, 0, 0));
        javaxSwingJLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); 
        javaxSwingJLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel3.setText("Password");
        
        javaxSwingJLabel1.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel2.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel3.setForeground(new java.awt.Color(255, 0, 0));

        javaxSwingJButton1.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton1.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        javaxSwingJButton1.setText("Signin");
        javaxSwingJButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton1MouseClicked(evt);
            }
        });
        
        javaxSwingJButton2.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton2.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        javaxSwingJButton2.setText("Back");
        javaxSwingJButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout javaxSwingJPanel1Layout = new javax.swing.GroupLayout(javaxSwingJPanel1);
        javaxSwingJPanel1.setLayout(javaxSwingJPanel1Layout);
        javaxSwingJPanel1Layout.setHorizontalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(javaxSwingJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(javaxSwingJTextField1)
                                    .addComponent(javaxSwingJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        javaxSwingJPanel1Layout.setVerticalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    DatabaseConnection conn= new DatabaseConnection();
    private void javaxSwingJButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton1MouseClicked
        try{

            String check_st="select * from agent_login_data where agent_user_name=? and password=? ";
            String u=javaxSwingJTextField1.getText();
            if(u.isEmpty()){
                info_message("Provide username please!","Alert!",2);
                return;
            }

            String p=javaxSwingJTextField2.getText();
            if(p.isEmpty()){
                info_message("Provide password please!","Alert!",2);
                return;
            }
            PreparedStatement check=conn.c.prepareStatement(check_st);//using connection variable from conn object
            check.setString(1,u);
            check.setString(2,p);
            ResultSet rs= check.executeQuery();
            if(!rs.next()){
                info_message("user not found!","Alert!",2);
            }
            else{
                info_message("Signed in!","Alert!",1);
                dispose();
                new AgentDashboard().setVisible(true);
                
            }

        }
        catch(SQLException ex){
            System.out.println(ex);
        }

    }

    private void javaxSwingJButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton2MouseClicked
        dispose();
        new Welcome().setVisible(true);
        
    }
public void info_message(String message, String title,int c){
        if(c==1)
            JOptionPane.showMessageDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE);
        else if(c==2)
            JOptionPane.showMessageDialog(null,message,title,JOptionPane.WARNING_MESSAGE);

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgentSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentSignin().setVisible(true);
            }
        });
    }

    // Variables declaration//GEN-BEGIN:variables
    private javax.swing.JButton javaxSwingJButton2;
    private javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JLabel javaxSwingJLabel1;
    private javax.swing.JPanel javaxSwingJPanel1;
    private javax.swing.JButton javaxSwingJButton1;
    private javax.swing.JTextField javaxSwingJTextField2;
    private javax.swing.JLabel javaxSwingJLabel3;
    private javax.swing.JTextField javaxSwingJTextField1;
    // End of variables declaration//GEN-END:variables
}
