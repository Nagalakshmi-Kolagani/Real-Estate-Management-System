package RealEstateManagementSystem;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

//Client Records Backend
public class ClientRecords extends javax.swing.JFrame {

    DatabaseConnection conn= new DatabaseConnection();
    public ClientRecords() {
        
        initComponents();
        setLocationRelativeTo(null);
        showTable();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        javaxSwingJPanel1 = new javax.swing.JPanel();
        javaxSwingJScrollPane1 = new javax.swing.JScrollPane();
        javaxSwingJTable1 = new javax.swing.JTable();
        javaxSwingJLabel1 = new javax.swing.JLabel();
        javaxSwingJTextField1 = new javax.swing.JTextField();
        javaxSwingJLabel2 = new javax.swing.JLabel();
        javaxSwingJButton1 = new javax.swing.JButton();
        javaxSwingJButton2 = new javax.swing.JButton();
        javaxSwingJButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        javaxSwingJLabel1.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel2.setForeground(new java.awt.Color(255, 0, 0));
        
        javaxSwingJPanel1.setBackground(new java.awt.Color(255, 255, 255));
        //javaxSwingJScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
       //javaxSwingJTable2.setBackground(new java.awt.Color(200, 24, 69));
       // javaxSwingJTable2.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJTable1.setForeground(new java.awt.Color(0, 0, 255));
        javaxSwingJButton3.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton3.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton1.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton1.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton2.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton2.setForeground(new java.awt.Color(255, 255, 255));

        //javaxSwingJPanel1.setBackground(new java.awt.Color(153, 153, 153));
        javaxSwingJPanel1.setForeground(new java.awt.Color(153, 255, 255));

        javaxSwingJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "first name", "last name", "phone", "email"
            }
        ));
        javaxSwingJTable1.setEnabled(false);
        javaxSwingJScrollPane1.setViewportView(javaxSwingJTable1);

        javaxSwingJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        //javaxSwingJLabel1.setForeground(new java.awt.Color(0, 0, 0));
        javaxSwingJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel1.setText("Client Records");

        javaxSwingJLabel2.setForeground(new java.awt.Color(0, 0, 0));
        javaxSwingJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel2.setText("Client name:");

        javaxSwingJButton1.setText("Search");

        javaxSwingJButton2.setText("Delete");

        javaxSwingJButton3.setText("Add New");
        javaxSwingJButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout javaxSwingJPanel1Layout = new javax.swing.GroupLayout(javaxSwingJPanel1);
        javaxSwingJPanel1.setLayout(javaxSwingJPanel1Layout);
        javaxSwingJPanel1Layout.setHorizontalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                                .addComponent(javaxSwingJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        javaxSwingJPanel1Layout.setVerticalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(javaxSwingJScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void javaxSwingJButton3MouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
        new AddClient().setVisible(true);
    }

    
    
    private void showTable() {
        try{
        Statement st=conn.c.createStatement();
        ResultSet rs=st.executeQuery("select * from client");
        while(rs.next()){
            String id=rs.getString("client_id");
            String f = rs.getString("first_name");
            String l = rs.getString("last_name");
            String ph = rs.getString("phone");
            String em = rs.getString("email");
            
            String tbl[]={id,f,l,ph,em};
            DefaultTableModel tbmodel=(DefaultTableModel)javaxSwingJTable1.getModel();
            tbmodel.addRow(tbl);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]) {
        
                new ClientRecords().setVisible(true);
            }
       

    // Variables declaration//GEN-BEGIN:variables
    private javax.swing.JButton javaxSwingJButton3;
    private javax.swing.JTable javaxSwingJTable1;
    private javax.swing.JButton javaxSwingJButton1;
    private javax.swing.JButton javaxSwingJButton2;
    private javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JLabel javaxSwingJLabel1;
    private javax.swing.JPanel javaxSwingJPanel1;
    private javax.swing.JScrollPane javaxSwingJScrollPane1;
    private javax.swing.JTextField javaxSwingJTextField1;
    // End of variables declaration//GEN-END:variables
}
