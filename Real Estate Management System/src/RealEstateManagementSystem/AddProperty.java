package RealEstateManagementSystem;

import java.sql.*;
import javax.swing.JOptionPane;

//Add Property Backend
public class AddProperty extends javax.swing.JFrame {

   
    public AddProperty() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        javaxSwingJPane1 = new javax.swing.JPanel();
        javaxSwingJLabel1 = new javax.swing.JLabel();
        javaxSwingJLabel2 = new javax.swing.JLabel();
        javaxSwingJLabel3 = new javax.swing.JLabel();
        javaxSwingJLabel4 = new javax.swing.JLabel();
        javaxSwingJTextField1 = new javax.swing.JTextField();
        javaxSwingJTextField2 = new javax.swing.JTextField();
        javaxSwingJTextField3 = new javax.swing.JTextField();
        javaxSwingJScrollPane1 = new javax.swing.JScrollPane();
        javaxSwingJTextArea1 = new javax.swing.JTextArea();
        javaxSwingJLabel5 = new javax.swing.JLabel();
        javaxSwingJLabel6 = new javax.swing.JLabel();
        javaxSwingJLabel7 = new javax.swing.JLabel();
        javaxSwingJLabel8 = new javax.swing.JLabel();
        javaxSwingJButton1 = new javax.swing.JButton();
        javaxSwingJLabel9 = new javax.swing.JLabel();
        javaxSwingJButton2 = new javax.swing.JButton();
        javaxSwingJTextField4 = new javax.swing.JTextField();
        javaxSwingJTextField5 = new javax.swing.JTextField();
        javaxSwingJTextField6 = new javax.swing.JTextField();
        javaxSwingJTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javaxSwingJPane1.setBackground(new java.awt.Color(255, 255, 255));
        javaxSwingJLabel1.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel2.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel3.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel4.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel5.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel6.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel7.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel8.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel9.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJButton1.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton1.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton2.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton2.setForeground(new java.awt.Color(255, 255, 255));

        javaxSwingJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel1.setText("Balcony");

        javaxSwingJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel2.setText("Location");

        javaxSwingJLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel3.setText("Owner ID:");

        javaxSwingJLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel4.setText("Description:");

        javaxSwingJTextArea1.setColumns(20);
        javaxSwingJTextArea1.setRows(5);
        javaxSwingJScrollPane1.setViewportView(javaxSwingJTextArea1);

        javaxSwingJLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel5.setText("Property Type:");

        javaxSwingJLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel6.setText("Bedrooms");

        javaxSwingJLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel7.setText("Bathrooms");

        javaxSwingJLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel8.setText("Garage");

        javaxSwingJButton1.setText("Add Property");
        javaxSwingJButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton1MouseClicked(evt);
            }
        });

        javaxSwingJLabel9.setBackground(new java.awt.Color(204, 204, 255));
        javaxSwingJLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        javaxSwingJLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        javaxSwingJLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        javaxSwingJLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        javaxSwingJLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        javaxSwingJLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        javaxSwingJLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        javaxSwingJLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        javaxSwingJLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        javaxSwingJLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel9.setText("Register Property");

        javaxSwingJButton2.setText("Property Records");
        javaxSwingJButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout javaxSwingJPane1Layout = new javax.swing.GroupLayout(javaxSwingJPane1);
        javaxSwingJPane1.setLayout(javaxSwingJPane1Layout);
        javaxSwingJPane1Layout.setHorizontalGroup(
            javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                        .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                                .addComponent(javaxSwingJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(javaxSwingJScrollPane1))
                            .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                                .addComponent(javaxSwingJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                                .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(javaxSwingJTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(javaxSwingJLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(javaxSwingJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102)
                        .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                                .addComponent(javaxSwingJLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(javaxSwingJTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                            .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                                .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(javaxSwingJLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(javaxSwingJTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(javaxSwingJTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(javaxSwingJTextField7))))
                        .addContainerGap(144, Short.MAX_VALUE))
                    .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(javaxSwingJLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        javaxSwingJPane1Layout.setVerticalGroup(
            javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(javaxSwingJLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                        .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                        .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaxSwingJTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(javaxSwingJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javaxSwingJPane1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(javaxSwingJScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(34, 34, 34)
                .addGroup(javaxSwingJPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(javaxSwingJPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    DatabaseConnection conn=new DatabaseConnection();
    private void javaxSwingJButton1MouseClicked(java.awt.event.MouseEvent evt) {
       
       
       try{
            String t=javaxSwingJTextField2.getText();
            int id=Integer.parseInt(javaxSwingJTextField1.getText());
            String l=javaxSwingJTextField3.getText();
            int bath=Integer.parseInt(javaxSwingJTextField7.getText());
            int bed=Integer.parseInt(javaxSwingJTextField5.getText());
            int balc=Integer.parseInt(javaxSwingJTextField4.getText());
            int gar= Integer.parseInt(javaxSwingJTextField6.getText());
            String d=javaxSwingJTextArea1.getText();
            
            
            PreparedStatement in=conn.c.prepareStatement("insert into property(p_type,owner_id,address,bathrooms,bedrooms,balcony,garage,description) values(?,?,?,?,?,?,?,?)");
            in.setString(1,t);
            in.setInt(2,id);
            in.setString(3,l);
            in.setInt(4,bath);
            in.setInt(5,bed);
            in.setInt(6,balc);
            in.setInt(7,gar);
            in.setString(8,d);
           
           if(in.executeUpdate()>0)
                info_message("list updated","success",1);
           else
               info_message("not updated error","alert",2);
           
       }
       catch(SQLException ex){
             if(ex instanceof SQLIntegrityConstraintViolationException)
                JOptionPane.showMessageDialog(null,"owner does not exist!","alert",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void javaxSwingJButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton2MouseClicked
        new PropertyRecords().setVisible(true);
        setVisible(false);
    }
    
    public static void main(String args[]) {
        
                new AddProperty().setVisible(true);
            }
    public void info_message(String message, String title,int c){
    if(c==1)
        JOptionPane.showMessageDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE);
    else if(c==2)
        JOptionPane.showMessageDialog(null,message,title,JOptionPane.WARNING_MESSAGE);

}

    // Variables declaration//GEN-BEGIN:variables
    private javax.swing.JTextField javaxSwingJTextField4;
    private javax.swing.JTextField javaxSwingJTextField7;
    private javax.swing.JTextField javaxSwingJTextField5;
    private javax.swing.JTextArea javaxSwingJTextArea1;
    private javax.swing.JTextField javaxSwingJTextField6;
    private javax.swing.JButton javaxSwingJButton1;
    private javax.swing.JButton javaxSwingJButton2;
    private javax.swing.JLabel javaxSwingJLabel1;
    private javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JLabel javaxSwingJLabel3;
    private javax.swing.JLabel javaxSwingJLabel4;
    private javax.swing.JLabel javaxSwingJLabel5;
    private javax.swing.JLabel javaxSwingJLabel6;
    private javax.swing.JLabel javaxSwingJLabel7;
    private javax.swing.JLabel javaxSwingJLabel8;
    private javax.swing.JLabel javaxSwingJLabel9;
    private javax.swing.JPanel javaxSwingJPane1;
    private javax.swing.JScrollPane javaxSwingJScrollPane1;
    private javax.swing.JTextField javaxSwingJTextField3;
    private javax.swing.JTextField javaxSwingJTextField1;
    private javax.swing.JTextField javaxSwingJTextField2;
    // End of variables declaration//GEN-END:variables
}
