package RealEstateManagementSystem;

import javax.swing.JOptionPane;

import RealEstateManagementSystem.AdminSignin;

import java.sql.*;

//Agent Signup Backend
public class AgentSignup extends javax.swing.JFrame {

    DatabaseConnection conn=new DatabaseConnection();
    public AgentSignup() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        javaxSwingJPanel1 = new javax.swing.JPanel();
        javaxSwingJLabel1 = new javax.swing.JLabel();
        javaxSwingJLabel2 = new javax.swing.JLabel();
        javaxSwingJLabel3 = new javax.swing.JLabel();
        javaxSwingJLabel4 = new javax.swing.JLabel();
        javaxSwingJLabel5 = new javax.swing.JLabel();
        javaxSwingJLabel6 = new javax.swing.JLabel();
        javaxSwingJTextField1 = new javax.swing.JTextField();
        javaxSwingJTextField2 = new javax.swing.JTextField();
        javaxSwingJTextField3 = new javax.swing.JTextField();
        javaxSwingJTextField4 = new javax.swing.JTextField();
        javaxSwingJTextField5 = new javax.swing.JTextField();
        javaxSwingJButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javaxSwingJLabel1.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel2.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel3.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel4.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel5.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel6.setForeground(new java.awt.Color(255, 0, 0));
       // javaxSwingJLabel7.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJPanel1.setBackground(new java.awt.Color(255, 255, 255));
        //javaxSwingJButton2.setBackground(new java.awt.Color(0, 0, 128));
        //javaxSwingJButton2.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton1.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton1.setForeground(new java.awt.Color(255, 255, 255));


        javaxSwingJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        javaxSwingJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel1.setText("Agent Signup");

        javaxSwingJLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        javaxSwingJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel2.setText("Last Name");

        javaxSwingJLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        javaxSwingJLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel3.setText("First Name");

        javaxSwingJLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        javaxSwingJLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel4.setText("Location");

        javaxSwingJLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14));
        javaxSwingJLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel5.setText("Password");

        javaxSwingJLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        javaxSwingJLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel6.setText("User Name");

        javaxSwingJButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        javaxSwingJButton1.setText("Signup");
        javaxSwingJButton1.setMaximumSize(new java.awt.Dimension(82, 27));
        javaxSwingJButton1.setMinimumSize(new java.awt.Dimension(82, 27));
        javaxSwingJButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout javaxSwingJPanel1Layout = new javax.swing.GroupLayout(javaxSwingJPanel1);
        javaxSwingJPanel1.setLayout(javaxSwingJPanel1Layout);
        javaxSwingJPanel1Layout.setHorizontalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(javaxSwingJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(javaxSwingJTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        javaxSwingJPanel1Layout.setVerticalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void javaxSwingJButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton1MouseClicked
        
        try{           
            String f=javaxSwingJTextField1.getText();
            String l=javaxSwingJTextField2.getText();
            String u=javaxSwingJTextField3.getText();
            String p=javaxSwingJTextField4.getText();
            String lc=javaxSwingJTextField5.getText();
            if(u.isEmpty()){
                info_message("Provide username please!","Alert!",2);
                return;
            }
            if(p.isEmpty()){
                info_message("Provide password please!","Alert!",2);
                return;
            }
            if(f.isEmpty()){
                info_message("Provide first name please!","Alert!",2);
                return;
            }
            if(l.isEmpty()){
                info_message("Provide last name please!","Alert!",2);
                return;
            }
            if(lc.isEmpty()){
                info_message("Provide location please!","Alert!",2);
                return;
            }
            String stmt="insert into agent(first_name,last_name,agent_user_name,location) values(?,?,?,?)";
            PreparedStatement in=conn.c.prepareStatement(stmt);
            in.setString(1,f);
            in.setString(2,l);
            in.setString(3,u);
            in.setString(4,lc);
            in.execute();
            //info_message("inserted in agent table","Alert!",1); 
            String stmt2="insert into agent_login_data(agent_user_name,password) values(?,?)";
            PreparedStatement in2=conn.c.prepareStatement(stmt2);
            in2.setString(1, u);
            in2.setString(2, p);
            in2.execute();
            //info_message("inserted in login_data table","Alert!",1);
            info_message("Signed up Successfully","Success",1);
            setVisible(false);
            new AgentSignin().setVisible(true);
        }
        catch(SQLException ex){
             if(ex instanceof SQLIntegrityConstraintViolationException)
                JOptionPane.showMessageDialog(null,"username is used","alert",JOptionPane.WARNING_MESSAGE);
        }
        
        
    }
    public void info_message(String message, String title,int c){
        if(c==1)
            JOptionPane.showMessageDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE);
        else if(c==2)
            JOptionPane.showMessageDialog(null,message,title,JOptionPane.WARNING_MESSAGE);

    }
    
    public static void main(String args[]) {
        
                new AgentSignup().setVisible(true);
            }
       

    // Variables declaration//GEN-BEGIN:variables
    private javax.swing.JTextField javaxSwingJTextField1;
    private javax.swing.JLabel javaxSwingJLabel3;
    private javax.swing.JPanel javaxSwingJPanel1;
    private javax.swing.JTextField javaxSwingJTextField2;
    private javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JTextField javaxSwingJTextField5;
    private javax.swing.JLabel javaxSwingJLabel4;
    private javax.swing.JTextField javaxSwingJTextField4;
    private javax.swing.JLabel javaxSwingJLabel5;
    private javax.swing.JButton javaxSwingJButton1;
    private javax.swing.JLabel javaxSwingJLabel1;
    private javax.swing.JLabel javaxSwingJLabel6;
    private javax.swing.JTextField javaxSwingJTextField3;
    // End of variables declaration//GEN-END:variables
}
