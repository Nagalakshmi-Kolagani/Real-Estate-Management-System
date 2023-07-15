package RealEstateManagementSystem;

//Welcome Page Backend
public class Welcome extends javax.swing.JFrame {

    
    public Welcome() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

    	javaxSwingJPanel1 = new javax.swing.JPanel();
        javaxSwingJLabel1 = new javax.swing.JLabel();       
        javaxSwingJLabel2 = new javax.swing.JLabel();
        javaxSwingJLabel3 = new javax.swing.JLabel();
        javaxSwingJButton1 = new javax.swing.JButton();
        javaxSwingJButton2 = new javax.swing.JButton();
        javaxSwingJButton3 = new javax.swing.JButton();
        
        javaxSwingJLabel3.setForeground(new java.awt.Color(255, 0, 0));
        javaxSwingJLabel1.setText("javaxSwingJLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        javaxSwingJPanel1.setBackground(new java.awt.Color(255, 255, 255));
        

        javaxSwingJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RealEStateManagementSystem/buildings.png"))); // NOI18N

        javaxSwingJLabel3.setBackground(new java.awt.Color(128, 128, 128));
        javaxSwingJLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        javaxSwingJLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaxSwingJLabel3.setText("Real Estate Manamgement System");
        
        javaxSwingJButton1.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton1.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        javaxSwingJButton1.setText("Admin Signin");
        javaxSwingJButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton1MouseClicked(evt);
            }
        });
        javaxSwingJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaxSwingJButton1ActionPerformed(evt);
            }
        });
        javaxSwingJButton2.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton2.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        javaxSwingJButton2.setText("Owner Signin");
        javaxSwingJButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaxSwingJButton2MouseClicked(evt);
            }
        });
        javaxSwingJButton3.setBackground(new java.awt.Color(0, 0, 128));
        javaxSwingJButton3.setForeground(new java.awt.Color(255, 255, 255));
        javaxSwingJButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        javaxSwingJButton3.setText("Agent Signin");
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
                .addGap(96, 96, 96)
                .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(javaxSwingJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJLabel2)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                        .addComponent(javaxSwingJLabel3)
                        .addGap(176, 176, 176))))
        );
        javaxSwingJPanel1Layout.setVerticalGroup(
            javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, javaxSwingJPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(javaxSwingJLabel3)
                .addGap(37, 37, 37)
                .addGroup(javaxSwingJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javaxSwingJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaxSwingJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(javaxSwingJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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
    }// </editor-fold>//GEN-END:initComponents

    private void javaxSwingJButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton1MouseClicked
        new AdminSignin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_javaxSwingJButton1MouseClicked

    private void javaxSwingJButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton2MouseClicked
        new OwnerSignin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_javaxSwingJButton2MouseClicked

    private void javaxSwingJButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaxSwingJButton3MouseClicked
        new AgentSignin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_javaxSwingJButton3MouseClicked

    private void javaxSwingJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaxSwingJButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_javaxSwingJButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
                new Welcome().setVisible(true);
            }
     

    // Variables declaration //GEN-BEGIN:variables
    private javax.swing.JPanel javaxSwingJPanel1;
    private javax.swing.JLabel javaxSwingJLabel1;
    private javax.swing.JLabel javaxSwingJLabel2;
    private javax.swing.JLabel javaxSwingJLabel3;
    private javax.swing.JButton javaxSwingJButton1;
    private javax.swing.JButton javaxSwingJButton2;
    private javax.swing.JButton javaxSwingJButton3;    
    // End of variables declaration//GEN-END:variables
}
