
package RealEstateManagementSystem;

import RealEstateManagementSystem.AddOwner;

//Owner Dashboard Backend
public class OwnerDashboard extends javax.swing.JFrame {

    public OwnerDashboard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        javaxSwingJPanel1 = new javax.swing.JPanel();
        javaxSwingJLabel2 = new javax.swing.JLabel();
        javaxSwingJLabel1 = new javax.swing.JLabel();
        javaxSwingJButton2 = new javax.swing.JButton();
        javaxSwingJButton7 = new javax.swing.JButton();
        javaxSwingJButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javaxSwingJLabel1.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel2.setForeground(new java.awt.Color(255, 0, 0));
        
        javaxSwingJPanel1.setBackground(new java.awt.Color(255, 255, 255));
        //javaxSwingJPanel2.setBackground(new java.awt.Color(90, 24, 69));
        javaxSwingJButton2.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton2.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton7.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton7.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton8.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton8.setForeground(new java.awt.Color(255, 255, 255));

        javaxSwingJLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        javaxSwingJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RealEstateManagementSystem/buildings.png"))); // NOI18N

        javaxSwingJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        javaxSwingJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel1.setText("Owner Dashboard");

        javaxSwingJButton2.setText("View Property Records");
        javaxSwingJButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton2MouseClicked(evt);
            }
        });
        javaxSwingJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaxSwingJButton2ActionPerformed(evt);
            }
        });

        javaxSwingJButton7.setText("Add Property");
        javaxSwingJButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton7MouseClicked(evt);
            }
        });

        javaxSwingJButton8.setText("Signout");
        javaxSwingJButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton8MouseClicked(evt);
            }
        });
        javaxSwingJButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaxSwingJButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout javaxSwingJPanel1Layout = new javax.swing.GroupLayout(javaxSwingJPanel1);
        javaxSwingJPanel1.setLayout(javaxSwingJPanel1Layout);
        javaxSwingJPanel1Layout.setHorizontalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))))
        );
        javaxSwingJPanel1Layout.setVerticalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaxSwingJPanel1Layout.createSequentialGroup()
                .addComponent(javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(javaxSwingJButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void javaxSwingJButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton7MouseClicked
        new AddProperty().setVisible(true);
        
    }//GEN-LAST:event_javaxSwingJButton7MouseClicked

    private void javaxSwingJButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton2MouseClicked
        new PropertyRecords().setVisible(true);
    }//GEN-LAST:event_javaxSwingJButton2MouseClicked

    private void javaxSwingJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaxSwingJButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_javaxSwingJButton2ActionPerformed

    private void javaxSwingJButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton8MouseClicked
        // TODO add your handling code here:                                        
        new Welcome().setVisible(true);
        dispose();
    
    }//GEN-LAST:event_javaxSwingJButton8MouseClicked

    private void javaxSwingJButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaxSwingJButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_javaxSwingJButton8ActionPerformed

    
    public static void main(String args[]) {
       
                new OwnerDashboard().setVisible(true);
            }
     
    

    //Variables declaration//GEN-BEGIN:variables
    private javax.swing.JButton javaxSwingJButton2;
    private javax.swing.JButton javaxSwingJButton7;
    private javax.swing.JButton javaxSwingJButton8;
    private javax.swing.JLabel javaxSwingJLabel1;
    private javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JPanel javaxSwingJPanel1;
    // End of variables declaration//GEN-END:variables
}
