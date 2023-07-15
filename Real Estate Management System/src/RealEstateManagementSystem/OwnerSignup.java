package RealEstateManagementSystem;

import javax.swing.JOptionPane;

import RealEstateManagementSystem.AdminSignin;

import java.sql.*;

//Owner Signup Backend
public class OwnerSignup extends javax.swing.JFrame {

    DatabaseConnection conn=new DatabaseConnection();
    public OwnerSignup() {
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
        javaxSwingJButton2 = new javax.swing.JButton();
        javaxSwingJLabel7 = new javax.swing.JLabel();
        javaxSwingJTextField6 = new javax.swing.JTextField();
        javaxSwingJButton2 = new javax.swing.JButton();
        
        javaxSwingJLabel1.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel2.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel3.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel4.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel5.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel6.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel7.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJPanel1.setBackground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton2.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton2.setForeground(new java.awt.Color(255, 255, 255));
        //javaxSwingJButton1.setBackground(new java.awt.Color(0, 0, 128));
        //javaxSwingJButton1.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        

        javaxSwingJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        javaxSwingJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel1.setText("Owner Signup");

        javaxSwingJLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        javaxSwingJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel2.setText("Last Name");

        javaxSwingJLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        javaxSwingJLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel3.setText("First Name");

        javaxSwingJLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14));
        javaxSwingJLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel4.setText("Phone Number:");

        javaxSwingJLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        javaxSwingJLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel5.setText("Password");

        javaxSwingJLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        javaxSwingJLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel6.setText("User Name");

        javaxSwingJButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        javaxSwingJButton2.setText("Signup");
        javaxSwingJButton2.setMaximumSize(new java.awt.Dimension(82, 27));
        javaxSwingJButton2.setMinimumSize(new java.awt.Dimension(82, 27));
        javaxSwingJButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton2MouseClicked(evt);
            }
        });

        javaxSwingJLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14));
        javaxSwingJLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel7.setText("Email:");

        javax.swing.GroupLayout javaxSwingJPanel1Layout = new javax.swing.GroupLayout(javaxSwingJPanel1);
        javaxSwingJPanel1.setLayout(javaxSwingJPanel1Layout);
        javaxSwingJPanel1Layout.setHorizontalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(javaxSwingJTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
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
                                .addGap(40, 40, 40)
                                .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
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

    private void javaxSwingJButton2MouseClicked(java.awt.event.MouseEvent evt) {
        
        try{
            String p=javaxSwingJTextField4.getText();
            String u=javaxSwingJTextField3.getText();
            String f=javaxSwingJTextField1.getText();
            String l=javaxSwingJTextField2.getText();
            String ph=javaxSwingJTextField5.getText();
            String em=javaxSwingJTextField6.getText();
            
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
            if(ph.isEmpty()){
                info_message("Provide phone no. please!","Alert!",2);
                return;
            }
            if(em.isEmpty()){
                info_message("Provide email please!","Alert!",2);
                return;
            }
            String stmt="insert into owner(first_name,last_name,owner_user_name,phone,email) values(?,?,?,?,?)";
            PreparedStatement in=conn.c.prepareStatement(stmt);
            in.setString(1, f);
            in.setString(2, l);
            in.setString(3, u);
            in.setString(4, ph);
            in.setString(5, em);
            in.execute();
            //info_message("inserted in owner table","Alert!",1);
            PreparedStatement in2=conn.c.prepareStatement("insert into owner_login_data values(?,?)");
            in2.setString(1, u);
            in2.setString(2, p);
            in2.execute();
            //info_message("inserted in login_data table","Alert!",1);
            info_message("Signed up Successfully","Success",1);
            setVisible(false);
            new OwnerSignin().setVisible(true);
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
        
                new OwnerSignup().setVisible(true);
            }
       

    // Variables declaration/GEN-BEGIN:variables
    private javax.swing.JTextField javaxSwingJTextField5;
    private javax.swing.JTextField javaxSwingJTextField6;
    private javax.swing.JLabel javaxSwingJLabel7;
    private javax.swing.JTextField javaxSwingJTextField1;
    private javax.swing.JLabel javaxSwingJLabel3;
    private javax.swing.JPanel javaxSwingJPanel1;
    private javax.swing.JTextField javaxSwingJTextField2;
    private javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JLabel javaxSwingJLabel4;
    private javax.swing.JTextField javaxSwingJTextField4;
    private javax.swing.JLabel javaxSwingJLabel5;
    private javax.swing.JButton javaxSwingJButton2;
    private javax.swing.JLabel javaxSwingJLabel1;
    private javax.swing.JLabel javaxSwingJLabel6;
    private javax.swing.JTextField javaxSwingJTextField3;
    // End of variables declaration//GEN-END:variables
}
