package RealEstateManagementSystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Add Client Backend
public class AddClient extends javax.swing.JFrame {

    
    DatabaseConnection conn=new DatabaseConnection();
    public AddClient() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javaxSwingJPanel1.setBackground(new java.awt.Color(255, 255, 255));
        javaxSwingJLabel1.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel2.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel3.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel4.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel5.setForeground(new java.awt.Color(255, 0, 0));
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

        javaxSwingJLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        javaxSwingJLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel5.setText("Add Clients Details");

        javaxSwingJButton1.setText("Add New Client");
        javaxSwingJButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton1MouseClicked(evt);
            }
        });

        javaxSwingJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "first name", "last name", "phone"
            }
        ));
        javaxSwingJTable1.setEnabled(false);
        javaxSwingJScrollPane1.setViewportView(javaxSwingJTable1);

        javax.swing.GroupLayout javaxSwingJPanel1Layout = new javax.swing.GroupLayout(javaxSwingJPanel1);
        javaxSwingJPanel1.setLayout(javaxSwingJPanel1Layout);
        javaxSwingJPanel1Layout.setHorizontalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(javaxSwingJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addComponent(javaxSwingJScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(javaxSwingJLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        javaxSwingJPanel1Layout.setVerticalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(javaxSwingJLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(javaxSwingJScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
    
    private void javaxSwingJButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton1MouseClicked
        try{
            String em=javaxSwingJTextField4.getText();
            String p=javaxSwingJTextField3.getText();
            String f=javaxSwingJTextField2.getText();
            String l=javaxSwingJTextField1.getText();
            
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
            PreparedStatement in=conn.c.prepareStatement("insert into client(first_name,last_name,phone,email) values(?,?,?,?)");
            in.setString(1, f);
            in.setString(2, l);
            in.setString(3, p);
            in.setString(4, em);
            if(in.executeUpdate()>0){
                info_message("list updated","success",1);
                DefaultTableModel tbl=(DefaultTableModel)javaxSwingJTable1.getModel();
                tbl.setRowCount(0);
                showTable();
            }
            else
                info_message("not updated error","alert",2);
           
            
        }
        catch(SQLException ex){
             System.out.println(ex);
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
            ResultSet rs=st.executeQuery("select * from client");
            while(rs.next()){
                String id=rs.getString("client_id");
                String f=rs.getString("first_name");
                String l=rs.getString("last_name");
                String p=rs.getString("phone");
                String em=rs.getString("email");
                String tbldata[]={id,f,l,p,em};
                
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
        
                new AddClient().setVisible(true);
            }
      

    // Variables declaration//GEN-BEGIN:variables
    private javax.swing.JTable javaxSwingJTable1;
    private javax.swing.JTextField javaxSwingJTextField4;
    private javax.swing.JTextField javaxSwingJTextField2;
    private javax.swing.JButton javaxSwingJButton1;
    private javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JLabel javaxSwingJLabel1;
    private javax.swing.JLabel javaxSwingJLabel3;
    private javax.swing.JLabel javaxSwingJLabel4;
    private javax.swing.JLabel javaxSwingJLabel5;
    private javax.swing.JPanel javaxSwingJPanel1;
    private javax.swing.JScrollPane javaxSwingJScrollPane1;
    private javax.swing.JTextField javaxSwingJTextField1;
    private javax.swing.JTextField javaxSwingJTextField3;
    // End of variables declaration//GEN-END:variables
}
