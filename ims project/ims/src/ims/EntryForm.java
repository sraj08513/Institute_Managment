package ims;
import java.awt.Color;
import javax.swing.ImageIcon;
public class EntryForm extends javax.swing.JFrame {
    public EntryForm() {
        initComponents();
        this.setBackground(Color.white);
        this.setLocationRelativeTo(null);
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        money = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        development = new javax.swing.JButton();
        service = new javax.swing.JButton();
        course = new javax.swing.JButton();
        member_payment = new javax.swing.JButton();
        member_Detail = new javax.swing.JButton();
        branch_details = new javax.swing.JButton();
        admission = new javax.swing.JButton();
        client = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        work_detail = new javax.swing.JButton();
        certificate = new javax.swing.JButton();
        enquiry = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rays Service Form");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        money.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        money.setText("Money Receipt");
        money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        development.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        development.setText("Development");
        development.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                developmentActionPerformed(evt);
            }
        });

        service.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        service.setText("Service");
        service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceActionPerformed(evt);
            }
        });

        course.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        course.setText("Course Details");
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        member_payment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        member_payment.setText("Member Payment");
        member_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_paymentActionPerformed(evt);
            }
        });

        member_Detail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        member_Detail.setText("Member Details");
        member_Detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_DetailActionPerformed(evt);
            }
        });

        branch_details.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        branch_details.setText("Branch Details");
        branch_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branch_detailsActionPerformed(evt);
            }
        });

        admission.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        admission.setText("Admission");
        admission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionActionPerformed(evt);
            }
        });

        client.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        client.setText("Client Payment");
        client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientActionPerformed(evt);
            }
        });

        reg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reg.setText("Registration");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Service Form Main Window");

        work_detail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        work_detail.setText("Work Details");
        work_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                work_detailActionPerformed(evt);
            }
        });

        certificate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        certificate.setText("Certificate");
        certificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificateActionPerformed(evt);
            }
        });

        enquiry.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enquiry.setText("Enquiry");
        enquiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enquiryActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/Rayscover.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel2)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(development, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(client, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(admission, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(certificate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(branch_details, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(member_Detail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(work_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(member_payment)
                            .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(branch_details)
                        .addGap(21, 21, 21)
                        .addComponent(member_Detail)
                        .addGap(21, 21, 21)
                        .addComponent(work_detail)
                        .addGap(21, 21, 21)
                        .addComponent(member_payment)
                        .addGap(21, 21, 21)
                        .addComponent(service))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(course)
                    .addComponent(reg)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(admission)
                        .addComponent(certificate)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(development)
                    .addComponent(client)
                    .addComponent(enquiry)
                    .addComponent(money))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyActionPerformed
        new ServiceFee().setVisible(true);
    }//GEN-LAST:event_moneyActionPerformed

    private void developmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_developmentActionPerformed
        new Development_service().setVisible(true);
    }//GEN-LAST:event_developmentActionPerformed

    private void serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceActionPerformed
        new service_services().setVisible(true);
    }//GEN-LAST:event_serviceActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        new ServiceCourse().setVisible(true);
    }//GEN-LAST:event_courseActionPerformed

    private void member_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_paymentActionPerformed
        new payment_detal_Service().setVisible(true);
    }//GEN-LAST:event_member_paymentActionPerformed

    private void member_DetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_DetailActionPerformed
        new Member_detail_Service().setVisible(true);
    }//GEN-LAST:event_member_DetailActionPerformed

    private void branch_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branch_detailsActionPerformed
        new Branch_detal_Service().setVisible(true);
    }//GEN-LAST:event_branch_detailsActionPerformed

    private void admissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissionActionPerformed
        new ServiceAdmission().setVisible(true);
    }//GEN-LAST:event_admissionActionPerformed

    private void clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientActionPerformed
        new ClientPaymentservice().setVisible(true);
    }//GEN-LAST:event_clientActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        new ServiceStudent().setVisible(true);
    }//GEN-LAST:event_regActionPerformed

    private void work_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_work_detailActionPerformed
        new Work_detal_Service().setVisible(true);
    }//GEN-LAST:event_work_detailActionPerformed

    private void certificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificateActionPerformed
        new Certificate_service().setVisible(true);
    }//GEN-LAST:event_certificateActionPerformed

    private void enquiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enquiryActionPerformed
        new Enquiry_service().setVisible(true);
    }//GEN-LAST:event_enquiryActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admission;
    private javax.swing.JButton branch_details;
    private javax.swing.JButton certificate;
    private javax.swing.JButton client;
    private javax.swing.JButton course;
    private javax.swing.JButton development;
    private javax.swing.JButton enquiry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton member_Detail;
    private javax.swing.JButton member_payment;
    private javax.swing.JButton money;
    private javax.swing.JButton reg;
    private javax.swing.JButton service;
    private javax.swing.JButton work_detail;
    // End of variables declaration//GEN-END:variables
}
