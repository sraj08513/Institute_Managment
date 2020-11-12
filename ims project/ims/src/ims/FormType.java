package ims;
import javax.swing.ImageIcon;
public class FormType extends javax.swing.JFrame {
    public FormType() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        service_bt = new javax.swing.JButton();
        entry_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Service");
        setBackground(new java.awt.Color(255, 0, 255));
        setResizable(false);

        service_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        service_bt.setText("SERVICE");
        service_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                service_btActionPerformed(evt);
            }
        });

        entry_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        entry_bt.setText("ENTRY");
        entry_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entry_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(entry_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(service_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(service_bt)
                    .addComponent(entry_bt))
                .addGap(223, 223, 223))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void service_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_service_btActionPerformed
        new EntryForm().setVisible(true);
    }//GEN-LAST:event_service_btActionPerformed

    private void entry_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entry_btActionPerformed
        new EntryForm1().setVisible(true);
    }//GEN-LAST:event_entry_btActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entry_bt;
    private javax.swing.JButton service_bt;
    // End of variables declaration//GEN-END:variables
}
