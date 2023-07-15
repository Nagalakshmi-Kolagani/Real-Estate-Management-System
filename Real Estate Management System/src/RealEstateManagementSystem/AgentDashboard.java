package RealEstateManagementSystem;

// Agent Dashboard Backend
public class AgentDashboard extends javax.swing.JFrame {

    public AgentDashboard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")

    private void initComponents() {

    	javaxSwingJPanel1 = new javax.swing.JPanel();
        javaxSwingJPanel2 = new javax.swing.JPanel();
        javaxSwingJLabel1 = new javax.swing.JLabel();
        javaxSwingJLabel2 = new javax.swing.JLabel();
        javaxSwingJButton2 = new javax.swing.JButton();
        javaxSwingJButton4 = new javax.swing.JButton();
        javaxSwingJButton5 = new javax.swing.JButton();
        javaxSwingJButton6 = new javax.swing.JButton();
        javaxSwingJButton7 = new javax.swing.JButton();
        javaxSwingJButton8 = new javax.swing.JButton();
        javaxSwingJButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javaxSwingJLabel1.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel2.setForeground(new java.awt.Color(255, 0, 0));
        
        javaxSwingJPanel1.setBackground(new java.awt.Color(255, 255, 255));
        javaxSwingJPanel2.setBackground(new java.awt.Color(90, 24, 69));
        javaxSwingJButton2.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton2.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton4.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton4.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton5.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton5.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton6.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton6.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton7.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton7.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton8.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton8.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton9.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton9.setForeground(new java.awt.Color(255, 255, 255));
        
        javaxSwingJLabel1.setBackground(new java.awt.Color(204, 204, 255));
        javaxSwingJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        javaxSwingJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel1.setText("Agent Dashboard");

        javaxSwingJLabel2.setBackground(new java.awt.Color(204, 204, 255));
        javaxSwingJLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        javaxSwingJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RealEstateManagementSystem/buildings.png"))); // NOI18N


        javaxSwingJButton4.setText("Schedule Appointments");
        javaxSwingJButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	javaxSwingJButton4MouseClicked(evt);
            }
        });

        javaxSwingJButton5.setText("Add/Modify Client");
        javaxSwingJButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	javaxSwingJButton5MouseClicked(evt);
            }
        });
       
        javaxSwingJButton6.setText("Register Owner");
        javaxSwingJButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	javaxSwingJButton6MouseClicked(evt);
            }
        });

        javaxSwingJButton7.setText("Add/Modify Property");
        javaxSwingJButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	javaxSwingJButton7MouseClicked(evt);
            }
        });


        javaxSwingJButton8.setText("Register Client");
        javaxSwingJButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	javaxSwingJButton8MouseClicked(evt);
            }
        });

        javaxSwingJButton9.setText("Signout");
        javaxSwingJButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	javaxSwingJButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout( javaxSwingJPanel2);
        javaxSwingJPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaxSwingJButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
            .addComponent(javaxSwingJButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(javaxSwingJButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(javaxSwingJButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(javaxSwingJButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(javaxSwingJButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(javaxSwingJButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(javaxSwingJButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(javaxSwingJButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(javaxSwingJButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(javaxSwingJButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(javaxSwingJButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout( javaxSwingJPanel1);
        javaxSwingJPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent( javaxSwingJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent( javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent( javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent( javaxSwingJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent( javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent( javaxSwingJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent( javaxSwingJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent( javaxSwingJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void javaxSwingJButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton7MouseClicked
        new PropertyRecords().setVisible(true);
        
    }//GEN-LAST:event_javaxSwingJButton7MouseClicked

    private void javaxSwingJButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton6MouseClicked
        new AddOwner().setVisible(true);
    }//GEN-LAST:event_javaxSwingJButton6MouseClicked

    private void javaxSwingJButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton4MouseClicked
        new AssignedPropertiesDashboard().setVisible(true);
    }//GEN-LAST:event_javaxSwingJButton4MouseClicked

    private void javaxSwingJButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton5MouseClicked
        new ClientRecords().setVisible(true);
    }//GEN-LAST:event_javaxSwingJButton5MouseClicked

    private void javaxSwingJButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton8MouseClicked
        new AddClient().setVisible(true);
    }//GEN-LAST:event_javaxSwingJButton8MouseClicked

    private void javaxSwingJButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton9MouseClicked
        // TODO add your handling code here:
        new Welcome().setVisible(true);
        dispose();
    }//GEN-LAST:event_javaxSwingJButton9MouseClicked

    private void javaxSwingJButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    } 
    public static void main(String args[]) {
       
                new AgentDashboard().setVisible(true);
            }
     
    

 // Variables declaration//GEN-BEGIN:variables
    private javax.swing.JPanel javaxSwingJPanel1;
    private javax.swing.JPanel javaxSwingJPanel2;
    private javax.swing.JLabel javaxSwingJLabel1;
    public javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JButton javaxSwingJButton2;
    private javax.swing.JButton javaxSwingJButton4;
    private javax.swing.JButton javaxSwingJButton5;
    private javax.swing.JButton javaxSwingJButton6;
    private javax.swing.JButton javaxSwingJButton7;
    private javax.swing.JButton javaxSwingJButton8;
    private javax.swing.JButton javaxSwingJButton9;
    // End of variables declaration//GEN-END:variables
}
