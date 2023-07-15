package RealEstateManagementSystem;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Property Records Backend
public class PropertyRecords extends javax.swing.JFrame {

    
    public PropertyRecords() {
        
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
        javaxSwingJPanel1.setForeground(new java.awt.Color(153, 255, 255));

        javaxSwingJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Property_type", "Owner_id", "location", "Bathrooms", "Bedrooms", "Balcony", "Garage", "Description"
            }
        ));
        javaxSwingJTable1.setEnabled(false);
        javaxSwingJScrollPane1.setViewportView(javaxSwingJTable1);

        javaxSwingJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        //javaxSwingJLabel1.setForeground(new java.awt.Color(0, 0, 0));
        javaxSwingJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel1.setText("Property Records");

        javaxSwingJLabel2.setForeground(new java.awt.Color(0, 0, 0));
        javaxSwingJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel2.setText("Property Type:");

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
                .addComponent(javaxSwingJScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        new AddProperty().setVisible(true);
    }

    DatabaseConnection conn= new DatabaseConnection();
    
    private void showTable() {
        try{
        Statement st=conn.c.createStatement();
        ResultSet rs=st.executeQuery("select * from property");        
        while(rs.next()){
            String p_id=rs.getString("p_id");
            String type=rs.getString("p_type");
            String owner_id=rs.getString("owner_id");
            String location=rs.getString("address");
            String bathroom=rs.getString("bathrooms");
            String bedroom=rs.getString("bedrooms");
            String balcony=rs.getString("balcony");
            String garage=rs.getString("garage");
            String description=rs.getString("description");
            String tbdata[]={p_id,type,owner_id,location,bathroom,bedroom,balcony,garage,description};
            System.out.println("view Property");
            DefaultTableModel tbmodel=(DefaultTableModel)javaxSwingJTable1.getModel();
            tbmodel.addRow(tbdata);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
       
        
    }
    
    public static void main(String args[]) {
        
                new PropertyRecords().setVisible(true);
            }
       

    // Variables declaration//GEN-BEGIN:variables
    private javax.swing.JButton javaxSwingJButton3;
    private javax.swing.JButton javaxSwingJButton1;
    private javax.swing.JButton javaxSwingJButton2;
    private javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JLabel javaxSwingJLabel1;
    private javax.swing.JPanel javaxSwingJPanel1;
    private javax.swing.JScrollPane javaxSwingJScrollPane1;
    private javax.swing.JTextField javaxSwingJTextField1;
    private javax.swing.JTable javaxSwingJTable1;
    // End of variables declaration//GEN-END:variables
}
