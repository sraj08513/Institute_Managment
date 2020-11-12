package ims;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Member_detail_Service extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;byte t=0;
    String str,url="";
    FileInputStream fin;
    File fi;int ctr;
    public Member_detail_Service() {
        initComponents();
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
         this.setLocationRelativeTo(null);
        con=Conn.conLink();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        search_cmb = new javax.swing.JComboBox<>();
        search_tf = new javax.swing.JTextField();
        search_butt = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        eno_lb = new javax.swing.JLabel();
        deleteeno_tf = new javax.swing.JTextField();
        delete_bt = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        update_eno = new javax.swing.JTextField();
        enmae_cb = new javax.swing.JCheckBox();
        epost_cb = new javax.swing.JCheckBox();
        equali_cb = new javax.swing.JCheckBox();
        eexp_cb = new javax.swing.JCheckBox();
        update_ename = new javax.swing.JTextField();
        update_epost = new javax.swing.JTextField();
        update_quali = new javax.swing.JTextField();
        update_eexp = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        etype_cb = new javax.swing.JCheckBox();
        update_etype = new javax.swing.JTextField();
        update_doj = new javax.swing.JTextField();
        update_speciality = new javax.swing.JTextField();
        update_respo = new javax.swing.JTextField();
        especi_cb = new javax.swing.JCheckBox();
        edob_cb = new javax.swing.JCheckBox();
        contno_cb = new javax.swing.JCheckBox();
        all_cb = new javax.swing.JCheckBox();
        emailid_cb = new javax.swing.JCheckBox();
        edoj_cb = new javax.swing.JCheckBox();
        adress_cb = new javax.swing.JCheckBox();
        esalary_cb = new javax.swing.JCheckBox();
        erespo_cb = new javax.swing.JCheckBox();
        estatus_cb = new javax.swing.JCheckBox();
        update_cno = new javax.swing.JTextField();
        update_emailid = new javax.swing.JTextField();
        update_salary = new javax.swing.JTextField();
        update_estatus = new javax.swing.JTextField();
        update_edob = new javax.swing.JTextField();
        update_adress = new javax.swing.JTextField();
        mphoto_cb = new javax.swing.JCheckBox();
        mphoto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("member_details_service");
        setResizable(false);

        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee No", "Employee Name" }));

        search_butt.setText("SEARCH");
        search_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(search_butt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(search_butt)
                .addGap(39, 39, 39))
        );

        tab.addTab("SEARCH", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        eno_lb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eno_lb.setText("Employee No");

        deleteeno_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        delete_bt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_bt.setText("DELETE");
        delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(delete_bt)
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(eno_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(deleteeno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(22, 22, 22))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel14)
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteeno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eno_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(delete_bt)
                .addGap(80, 80, 80))
        );

        tab.addTab("DELETE", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Employee No");

        enmae_cb.setText("Employee name");
        enmae_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enmae_cbActionPerformed(evt);
            }
        });

        epost_cb.setText("Employee Post");
        epost_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epost_cbActionPerformed(evt);
            }
        });

        equali_cb.setText("Employee Qualification");
        equali_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equali_cbActionPerformed(evt);
            }
        });

        eexp_cb.setText("Employee Experience");
        eexp_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eexp_cbActionPerformed(evt);
            }
        });

        update_ename.setEditable(false);

        update_epost.setEditable(false);

        update_quali.setEditable(false);

        update_eexp.setEditable(false);

        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        etype_cb.setText("Employee Type");
        etype_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etype_cbActionPerformed(evt);
            }
        });

        update_etype.setEditable(false);

        update_doj.setEditable(false);

        update_speciality.setEditable(false);

        update_respo.setEditable(false);

        especi_cb.setText("Employee Speciality");
        especi_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especi_cbActionPerformed(evt);
            }
        });

        edob_cb.setText("Employee DOB");
        edob_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edob_cbActionPerformed(evt);
            }
        });

        contno_cb.setText("Cont_No");
        contno_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contno_cbActionPerformed(evt);
            }
        });

        all_cb.setText("ALL");
        all_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_cbActionPerformed(evt);
            }
        });

        emailid_cb.setText("Email_id");
        emailid_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailid_cbActionPerformed(evt);
            }
        });

        edoj_cb.setText("Employee Date of joining");
        edoj_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edoj_cbActionPerformed(evt);
            }
        });

        adress_cb.setText("Employee Adress");
        adress_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adress_cbActionPerformed(evt);
            }
        });

        esalary_cb.setText("Employee Salary");
        esalary_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esalary_cbActionPerformed(evt);
            }
        });

        erespo_cb.setText("Employee Responsiblity");
        erespo_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erespo_cbActionPerformed(evt);
            }
        });

        estatus_cb.setText("Employee Status");
        estatus_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estatus_cbActionPerformed(evt);
            }
        });

        update_cno.setEditable(false);

        update_emailid.setEditable(false);

        update_salary.setEditable(false);

        update_estatus.setEditable(false);

        update_edob.setEditable(false);

        update_adress.setEditable(false);

        mphoto_cb.setText("mphoto");
        mphoto_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mphoto_cbActionPerformed(evt);
            }
        });

        mphoto.setText("           photo");
        mphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(epost_cb)
                            .addComponent(equali_cb)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(etype_cb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eexp_cb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(edoj_cb)
                            .addComponent(especi_cb))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(update_eexp, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(update_ename, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update_etype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update_doj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update_respo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update_epost, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update_quali, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(all_cb))
                    .addComponent(erespo_cb)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enmae_cb, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(update_eno, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(contno_cb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emailid_cb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(esalary_cb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(estatus_cb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(edob_cb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(adress_cb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(mphoto_cb))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(update_adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_edob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_emailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_cno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(update)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap())))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {update_adress, update_cno, update_doj, update_edob, update_eexp, update_emailid, update_ename, update_eno, update_epost, update_estatus, update_etype, update_quali, update_respo, update_salary, update_speciality});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contno_cb)
                            .addComponent(update_cno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailid_cb)
                            .addComponent(update_emailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(esalary_cb)
                            .addComponent(update_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estatus_cb)
                            .addComponent(update_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edob_cb)
                            .addComponent(update_edob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adress_cb)
                            .addComponent(update_adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(mphoto_cb)
                                .addGap(18, 18, 18)
                                .addComponent(all_cb))
                            .addComponent(mphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(update_eno))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enmae_cb)
                            .addComponent(update_ename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(epost_cb)
                            .addComponent(update_epost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equali_cb)
                            .addComponent(update_quali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eexp_cb)
                            .addComponent(update_eexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etype_cb)
                            .addComponent(update_etype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edoj_cb)
                            .addComponent(update_doj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(especi_cb)
                            .addComponent(update_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(erespo_cb)
                            .addComponent(update_respo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(50, 50, 50))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {update_adress, update_cno, update_doj, update_edob, update_eexp, update_emailid, update_ename, update_epost, update_estatus, update_etype, update_quali, update_respo, update_salary, update_speciality});

        tab.addTab("UPDATE", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttActionPerformed
        byte t=0; 
        str=(String)search_cmb.getSelectedItem();
         if(search_tf.getText().length()==0)
             JOptionPane.showMessageDialog(this,"please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
         else
         {
             url="select * from member_details where ";
             if(str.equals("Employee No")){
                 url=url+"upper(eno)=?";
                 t=1;
             }
             else{ 
                 url=url+"upper(ename)=?";
                 t=2;
             }
             try {
                 stmt=con.prepareStatement(url,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                 stmt.setString(1,search_tf.getText().toUpperCase());
                 rs=stmt.executeQuery();
                 if(rs.next()){
                     rs.first();
                     new MembersRecord(rs,t).setVisible(true);}
                 else
                     JOptionPane.showMessageDialog(this,"Record not found","warning",JOptionPane.ERROR_MESSAGE);
             } catch (SQLException ex) {
                 Logger.getLogger(Member_detail_Service.class.getName()).log(Level.SEVERE, null, ex);
             }    
         }        
    }//GEN-LAST:event_search_buttActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         byte i=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,j=0,k=0,l=0,m=0,n=0,p=0,q=0;url="update member_details set ";
        if(enmae_cb.isSelected())
        {
            if(i==0)
                url=url+" ename=?";
            else
                url=url+",ename=?";
            
            i++;
            a=i;
        } 
        if(epost_cb.isSelected())
        {
            if(i==0)
                url=url+" epost=?";
            else
                url=url+",epost=?";
           
            i++;
            b=i;
        }    
        if(equali_cb.isSelected())
        {
            if(i==0)
                url=url+" equali=?";
            else
                url=url+",equali=?";
            i++;
            c=i;
        }      
        if(eexp_cb.isSelected())
        {
            if(i==0)
                url=url+" eexp=?";
            else
                url=url+",eexp=?";
            i++;
            d=i;
        }      
        if(etype_cb.isSelected())
        {
            if(i==0)
                url=url+" etype=?";
            else
                url=url+",etype=?";
            i++;
            e=i;
        }      
        if(edoj_cb.isSelected())
        {
            if(i==0)
                url=url+" edoj=?";
            else
                url=url+",edoj=?";
            
            i++;
            f=i;
        } 
        if(especi_cb.isSelected())
        {
            if(i==0)
                url=url+" especiality=?";
            else
                url=url+",especiality=?";
           
            i++;
            g=i;
        }    
        if(erespo_cb.isSelected())
        {
            if(i==0)
                url=url+" erespo=?";
            else
                url=url+",erespo=?";
            i++;
            h=i;
        }      
        if(contno_cb.isSelected())
        {
            if(i==0)
                url=url+" econt_no=?";
            else
                url=url+",econt_no=?";
            i++;
            j=i;
        }      
        if(emailid_cb.isSelected())
        {
            if(i==0)
                url=url+" eemail_id=?";
            else
                url=url+",eemail_id=?";
            i++;
            k=i;
        }      
        if(esalary_cb.isSelected())
        {
            if(i==0)
                url=url+" esalary=?";
            else
                url=url+",esalary=?";
            
            i++;
            l=i;
        } 
        if(estatus_cb.isSelected())
        {
            if(i==0)
                url=url+" estatus=?";
            else
                url=url+",estatus=?";
           
            i++;
            m=i;
        }    
        if(edob_cb.isSelected())
        {
            if(i==0)
                url=url+" edob=?";
            else
                url=url+",edob=?";
            i++;
            n=i;
        }      
        if(adress_cb.isSelected())
        {
            if(i==0)
                url=url+" eaddress=?";
            else
                url=url+",eaddress=?";
            i++;
            p=i;
        } 
         if(mphoto_cb.isSelected())
        {
            if(i==0)
              url=url+" mphoto=?";  
            else
                url=url+",mphoto=?";
           
            i++;
            q=i;
        }    
        if(i==0)
            JOptionPane.showMessageDialog(this,"Select any option for update","selection problem",JOptionPane.ERROR_MESSAGE);
        else if(update_eno.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Insert employee no","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url=url+" where upper(eno)=?";
            try {
                stmt=con.prepareStatement(url);
                if(a>0)
                    stmt.setString(a,update_ename.getText());
                if(b>0)
                    stmt.setString(b,update_epost.getText());
                if(c>0)
                    stmt.setString(c,update_quali.getText());
                if(d>0)
                    stmt.setString(d,update_eexp.getText());
                if(e>0)
                    stmt.setString(e,update_etype.getText());
                if(f>0)
                    stmt.setString(f,update_doj.getText());
                if(g>0)
                    stmt.setString(g,update_speciality.getText());
                if(h>0)
                    stmt.setString(h,update_respo.getText());
                if(j>0)
                    stmt.setString(j,update_cno.getText());
                if(k>0)
                    stmt.setString(k,update_emailid.getText());
                if(l>0)
                    stmt.setString(l,update_salary.getText());
                if(m>0)
                    stmt.setString(m,update_estatus.getText());
                if(n>0)
                    stmt.setString(n,update_edob.getText());
                if(p>0)
                    stmt.setString(p,update_adress.getText());
                if(q>0)
                    try{
                    fin=new FileInputStream(fi);
                    stmt.setBinaryStream(q, fin, fin.available());
                } catch (IOException ex) {
                    Logger.getLogger(Member_detail_Service.class.getName()).log(Level.SEVERE, null, ex);
                }
                stmt.setString(i+1,update_eno.getText().toUpperCase());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Successfully updated!","Updation complete",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Work_detal_Service.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_updateActionPerformed

    private void enmae_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enmae_cbActionPerformed
     if(enmae_cb.isSelected()){    
            t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_ename.setEditable(true);
               update_ename.requestFocus();
        }
     else{
         t--;
             all_cb.setSelected(false);
            update_ename.setEditable(false);}        
    }//GEN-LAST:event_enmae_cbActionPerformed

    private void epost_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epost_cbActionPerformed
     if(epost_cb.isSelected())
        {    
            t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_epost.setEditable(true);
               update_epost.requestFocus();
        }
     else{
         t--;
             all_cb.setSelected(false);
            update_epost.setEditable(false); }        
    }//GEN-LAST:event_epost_cbActionPerformed

    private void equali_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equali_cbActionPerformed
       if(equali_cb.isSelected()){    
            t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_quali.setEditable(true);
               update_quali.requestFocus();
        }
       else{
           t--;
             all_cb.setSelected(false);
            update_quali.setEditable(false);}          
    }//GEN-LAST:event_equali_cbActionPerformed

    private void eexp_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eexp_cbActionPerformed
     if(eexp_cb.isSelected())
        {    
            t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_eexp.setEditable(true);
               update_eexp.requestFocus();
        }
     else{
         t--;
             all_cb.setSelected(false);
            update_eexp.setEditable(false);}          
    }//GEN-LAST:event_eexp_cbActionPerformed

    private void etype_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etype_cbActionPerformed
    if(etype_cb.isSelected())
        {    
            t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_etype.setEditable(true);
               update_etype.requestFocus();
        }
        else{
            t--;
             all_cb.setSelected(false);
            update_etype.setEditable(false);}          
    }//GEN-LAST:event_etype_cbActionPerformed

    private void edoj_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edoj_cbActionPerformed
    if(edoj_cb.isSelected()){   
            t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_doj.setEditable(true);
               update_doj.requestFocus();
        }
    else{
          t--;
          all_cb.setSelected(false);
          update_doj.setEditable(false);}           
    }//GEN-LAST:event_edoj_cbActionPerformed

    private void especi_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especi_cbActionPerformed
if(especi_cb.isSelected())
        {    
            t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_speciality.setEditable(true);
               update_speciality.requestFocus();
        }
else{
            t--;
             all_cb.setSelected(false);
            update_speciality.setEditable(false);}         
    }//GEN-LAST:event_especi_cbActionPerformed

    private void erespo_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erespo_cbActionPerformed
if(erespo_cb.isSelected())
        {    
            t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_respo.setEditable(true);
               update_respo.requestFocus();
        }
else{
       t--;
             all_cb.setSelected(false);    
        update_respo.setEditable(false);}           
    }//GEN-LAST:event_erespo_cbActionPerformed

    private void contno_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contno_cbActionPerformed
      if(contno_cb.isSelected()){    
            t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_cno.setEditable(true);
               update_cno.requestFocus();
        }
      else{
          t--;
             all_cb.setSelected(false);
            update_cno.setEditable(false);}           
    }//GEN-LAST:event_contno_cbActionPerformed

    private void emailid_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailid_cbActionPerformed
      if(emailid_cb.isSelected()){
               t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_emailid.setEditable(true);
               update_emailid.requestFocus();
        }
      else{
          t--;
             all_cb.setSelected(false);
            update_emailid.setEditable(false);}        
    }//GEN-LAST:event_emailid_cbActionPerformed

    private void esalary_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esalary_cbActionPerformed
       if(esalary_cb.isSelected()){
           t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_salary.setEditable(true);
               update_salary.requestFocus();}
       else{
           t--;
             all_cb.setSelected(false);
            update_salary.setEditable(false);}         
    }//GEN-LAST:event_esalary_cbActionPerformed

    private void estatus_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estatus_cbActionPerformed
    if(estatus_cb.isSelected()){
        t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_estatus.setEditable(true);
               update_estatus.requestFocus();
        }
    else{
        t--;
             all_cb.setSelected(false);
            update_estatus.setEditable(false);}          
    }//GEN-LAST:event_estatus_cbActionPerformed

    private void edob_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edob_cbActionPerformed
    if(edob_cb.isSelected()){
               t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_edob.setEditable(true);
               update_edob.requestFocus();}
    else{
            t--;
             all_cb.setSelected(false);
            update_edob.setEditable(false);}
    }//GEN-LAST:event_edob_cbActionPerformed

    private void adress_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adress_cbActionPerformed
    if(adress_cb.isSelected()){  
               t++;
               if(t==14)
                   all_cb.setSelected(true);
               update_adress.setEditable(true);
               update_adress.requestFocus();
        }
    else{
            t--;
             all_cb.setSelected(false);
            update_adress.setEditable(false); }          
    }//GEN-LAST:event_adress_cbActionPerformed

    private void delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btActionPerformed
        if(deleteeno_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input employee no!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from member_details where upper(eno)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,deleteeno_tf.getText().toUpperCase());
                int r=stmt.executeUpdate();
                if(r>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Work_detal_Service.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_delete_btActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
         update_eno.requestFocus();
    }//GEN-LAST:event_tabMouseClicked

    private void mphoto_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mphoto_cbActionPerformed
        JFileChooser chooser=new JFileChooser();
               if(mphoto_cb.isSelected()){ 
               chooser.showOpenDialog(null);
                fi = chooser.getSelectedFile();
                ImageIcon img = new ImageIcon(new ImageIcon(""+fi).getImage().getScaledInstance(mphoto.getWidth(),mphoto.getHeight(),Image.SCALE_DEFAULT ));
                mphoto.setIcon(img);}        
    }//GEN-LAST:event_mphoto_cbActionPerformed

    private void all_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_cbActionPerformed
        if(all_cb.isSelected())
        {
            t=14;
            enmae_cb.setSelected(true);
            epost_cb.setSelected(true);
            equali_cb.setSelected(true);
            eexp_cb.setSelected(true);
            etype_cb.setSelected(true);
            edoj_cb.setSelected(true);
            especi_cb.setSelected(true);
            erespo_cb.setSelected(true);
            contno_cb.setSelected(true);
            emailid_cb.setSelected(true);
            esalary_cb.setSelected(true);
            estatus_cb.setSelected(true);
            edob_cb.setSelected(true);
            adress_cb.setSelected(true);
            update_ename.setEditable(true);
            update_epost.setEditable(true);
            update_quali.setEditable(true);
            update_eexp.setEditable(true);
            update_etype.setEditable(true);
            update_doj.setEditable(true);
            update_speciality.setEditable(true);
            update_respo.setEditable(true);
            update_cno.setEditable(true);
            update_emailid.setEditable(true);
            update_salary.setEditable(true);
            update_estatus.setEditable(true);
            update_edob.setEditable(true);
            update_adress.setEditable(true);
        }
        else{
            t=0;
            enmae_cb.setSelected(false);
            epost_cb.setSelected(false);
            equali_cb.setSelected(false);
            eexp_cb.setSelected(false);
            etype_cb.setSelected(false);
            edoj_cb.setSelected(false);
            especi_cb.setSelected(false);
            erespo_cb.setSelected(false);
            contno_cb.setSelected(false);
            emailid_cb.setSelected(false);
            esalary_cb.setSelected(false);
            estatus_cb.setSelected(false);
            edob_cb.setSelected(false);
            adress_cb.setSelected(false);
            update_ename.setEditable(false);
            update_epost.setEditable(false);
            update_quali.setEditable(false);
            update_eexp.setEditable(false);
            update_etype.setEditable(false);
            update_doj.setEditable(false);
            update_speciality.setEditable(false);
            update_respo.setEditable(false);
            update_cno.setEditable(false);
            update_emailid.setEditable(false);
            update_salary.setEditable(false);
            update_estatus.setEditable(false);
            update_edob.setEditable(false);
            update_adress.setEditable(false);
        }
    }//GEN-LAST:event_all_cbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adress_cb;
    private javax.swing.JCheckBox all_cb;
    private javax.swing.JCheckBox contno_cb;
    private javax.swing.JButton delete_bt;
    private javax.swing.JTextField deleteeno_tf;
    private javax.swing.JCheckBox edob_cb;
    private javax.swing.JCheckBox edoj_cb;
    private javax.swing.JCheckBox eexp_cb;
    private javax.swing.JCheckBox emailid_cb;
    private javax.swing.JCheckBox enmae_cb;
    private javax.swing.JLabel eno_lb;
    private javax.swing.JCheckBox epost_cb;
    private javax.swing.JCheckBox equali_cb;
    private javax.swing.JCheckBox erespo_cb;
    private javax.swing.JCheckBox esalary_cb;
    private javax.swing.JCheckBox especi_cb;
    private javax.swing.JCheckBox estatus_cb;
    private javax.swing.JCheckBox etype_cb;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mphoto;
    private javax.swing.JCheckBox mphoto_cb;
    private javax.swing.JButton search_butt;
    private javax.swing.JComboBox<String> search_cmb;
    private javax.swing.JTextField search_tf;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JButton update;
    private javax.swing.JTextField update_adress;
    private javax.swing.JTextField update_cno;
    private javax.swing.JTextField update_doj;
    private javax.swing.JTextField update_edob;
    private javax.swing.JTextField update_eexp;
    private javax.swing.JTextField update_emailid;
    private javax.swing.JTextField update_ename;
    private javax.swing.JTextField update_eno;
    private javax.swing.JTextField update_epost;
    private javax.swing.JTextField update_estatus;
    private javax.swing.JTextField update_etype;
    private javax.swing.JTextField update_quali;
    private javax.swing.JTextField update_respo;
    private javax.swing.JTextField update_salary;
    private javax.swing.JTextField update_speciality;
    // End of variables declaration//GEN-END:variables
}
