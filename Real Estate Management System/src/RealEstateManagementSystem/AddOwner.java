package RealEstateManagementSystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Add Owner Backend
public class AddOwner extends javax.swing.JFrame {

    
    public AddOwner() {
        initComponents();
        showTable();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        javaxSwingJPanel1 = new javax.swing.JPanel();
        javaxSwingJLabel1 = new javax.swing.JLabel();
        javaxSwingJLabel2 = new javax.swing.JLabel();
        javaxSwingJTextField1 = new javax.swing.JTextField();
        javaxSwingJTextField2 = new javax.swing.JTextField();
        javaxSwingJTextField3 = new javax.swing.JTextField();
        javaxSwingJLabel3 = new javax.swing.JLabel();
        javaxSwingJTextField4 = new javax.swing.JTextField();
        javaxSwingJLabel4 = new javax.swing.JLabel();
        javaxSwingJLabel5 = new javax.swing.JLabel();
        javaxSwingJButton1 = new javax.swing.JButton();
        javaxSwingJScrollPane1 = new javax.swing.JScrollPane();
        javaxSwingJTable1 = new javax.swing.JTable();
        javaxSwingJLabel6 = new javax.swing.JLabel();
        javaxSwingJTextField5 = new javax.swing.JTextField();
        javaxSwingJLabel7 = new javax.swing.JLabel();
        javaxSwingJTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javaxSwingJPanel1.setBackground(new java.awt.Color(255, 255, 255));
        javaxSwingJLabel1.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel2.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel3.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel4.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel5.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel6.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel7.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJButton1.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton1.setForeground(new java.awt.Color(255, 255, 255));

        javaxSwingJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel1.setText("First Name:");

        javaxSwingJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel2.setText("Last Name:");

        javaxSwingJLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel3.setText("Phone:");

        javaxSwingJLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel4.setText("Email:");

        javaxSwingJLabel5.setBackground(new java.awt.Color(204, 204, 255));
        javaxSwingJLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        javaxSwingJLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel5.setText("Owner Signup");

        javaxSwingJButton1.setText("Add New Owner");
        javaxSwingJButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton1MouseClicked(evt);
            }
        });

        javaxSwingJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "first_name", "last_name", "Phone", "email"
            }
        ));
        javaxSwingJTable1.setEnabled(false);
        javaxSwingJScrollPane1.setViewportView(javaxSwingJTable1);

        javaxSwingJLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel6.setText("User name:");

        javaxSwingJLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel7.setText("Password:");

        javax.swing.GroupLayout javaxSwingJPanel1Layout = new javax.swing.GroupLayout(javaxSwingJPanel1);
        javaxSwingJPanel1.setLayout(javaxSwingJPanel1Layout);
        javaxSwingJPanel1Layout.setHorizontalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(javaxSwingJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                                .addComponent(javaxSwingJLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(javaxSwingJTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(javaxSwingJLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(javaxSwingJLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(javaxSwingJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65)
                                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(javaxSwingJTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(javaxSwingJScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(javaxSwingJLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        javaxSwingJPanel1Layout.setVerticalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(javaxSwingJLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    DatabaseConnection conn=new DatabaseConnection();
    private void javaxSwingJButton1MouseClicked(java.awt.event.MouseEvent evt) {
        try{
        	String l=javaxSwingJTextField1.getText();
        	String f=javaxSwingJTextField2.getText();            
            String ph=javaxSwingJTextField3.getText();
            String em=javaxSwingJTextField4.getText();
            String u=javaxSwingJTextField5.getText();
            String p=javaxSwingJTextField6.getText();
            
            
            if(f.isEmpty()){
                info_message("Provide first name please!","Alert!",2);
                return;
            }
            if(l.isEmpty()){
                info_message("Provide last name please!","Alert!",2);
                return;
            }
            if(p.isEmpty()){
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
            if(in.executeUpdate()>0){
                
                PreparedStatement in2=conn.c.prepareStatement("insert into owner_login_data values(?,?)");
                in2.setString(1, u);
                in2.setString(2, p);
                in2.execute();
                info_message("list updated","success",1);
                DefaultTableModel tbl=(DefaultTableModel)javaxSwingJTable1.getModel();
                tbl.setRowCount(0);
                showTable();
                
            }
            else
                info_message("not updated error","alert",2);
            
           
            
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
    private void showTable(){
        try{
            Statement st=conn.c.createStatement();
            ResultSet rs=st.executeQuery("select * from owner");
            while(rs.next()){
                String id=rs.getString("owner_id");
                String f=rs.getString("first_name");
                String l=rs.getString("last_name");
                String u=rs.getString("owner_user_name");
                String p=rs.getString("phone");
                String em=rs.getString("email");
                String tbldata[]={id,f,l,u,p,em};
                
                DefaultTableModel tblmodel=(DefaultTableModel)javaxSwingJTable1.getModel();
                tblmodel.addRow(tbldata);
                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        
                new AddOwner().setVisible(true);
            }
      

    // Variables declaration//GEN-BEGIN:variables
    private javax.swing.JTextField javaxSwingJTextField4;
    private javax.swing.JTextField javaxSwingJTextField2;
    private javax.swing.JButton javaxSwingJButton1;
    private javax.swing.JLabel javaxSwingJLabel7;
    private javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JLabel javaxSwingJLabel1;
    private javax.swing.JLabel javaxSwingJLabel3;
    private javax.swing.JLabel javaxSwingJLabel4;
    private javax.swing.JLabel javaxSwingJLabel6;
    private javax.swing.JLabel javaxSwingJLabel5;
    private javax.swing.JPanel javaxSwingJPanel1;
    private javax.swing.JScrollPane javaxSwingJScrollPane1;
    private javax.swing.JTextField javaxSwingJTextField1;
    private javax.swing.JTable javaxSwingJTable1;
    private javax.swing.JTextField javaxSwingJTextField6;
    private javax.swing.JTextField javaxSwingJTextField3;
    private javax.swing.JTextField javaxSwingJTextField5;
    // End of variables declaration//GEN-END:variables
}
