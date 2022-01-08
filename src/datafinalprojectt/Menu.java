/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package datafinalprojectt;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sinem
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_datasetName = new javax.swing.JTextField();
        tf_february = new javax.swing.JTextField();
        tf_march = new javax.swing.JTextField();
        tf_april = new javax.swing.JTextField();
        tf_may = new javax.swing.JTextField();
        tf_june = new javax.swing.JTextField();
        tf_july = new javax.swing.JTextField();
        tf_august = new javax.swing.JTextField();
        tf_september = new javax.swing.JTextField();
        tf_october = new javax.swing.JTextField();
        tf_november = new javax.swing.JTextField();
        tf_december = new javax.swing.JTextField();
        tf_january = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        insertDataset_bttn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        search_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        datasetTable = new javax.swing.JTable();
        message_lbl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        exponential_bttn = new javax.swing.JButton();
        DoubleExp_bttn = new javax.swing.JButton();
        maxDemand_bttn = new javax.swing.JButton();
        reg_bttn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        utilize_bttn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        maxReg_bttn = new javax.swing.JButton();
        expMax_bttn = new javax.swing.JButton();
        dexpMax_bttn = new javax.swing.JButton();
        minReg_bttn = new javax.swing.JButton();
        expMin_bttn = new javax.swing.JButton();
        dexpMin_bttn = new javax.swing.JButton();
        sortReg_bttn = new javax.swing.JButton();
        expSort_bttn = new javax.swing.JButton();
        dexpSort_bttn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        update_bttn = new javax.swing.JButton();
        reverse_bttn = new javax.swing.JButton();
        min_demand = new javax.swing.JButton();
        max_bttn = new javax.swing.JButton();
        delete_bttn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jLabel2.setText("Dataset Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        tf_datasetName.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel1.add(tf_datasetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, 30));
        jPanel1.add(tf_february, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 80, 30));
        jPanel1.add(tf_march, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 80, 30));
        jPanel1.add(tf_april, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 80, 30));
        jPanel1.add(tf_may, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 80, 30));
        jPanel1.add(tf_june, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 80, 30));
        jPanel1.add(tf_july, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 80, 30));
        jPanel1.add(tf_august, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 80, 30));
        jPanel1.add(tf_september, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 80, 30));
        jPanel1.add(tf_october, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 80, 30));
        jPanel1.add(tf_november, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 80, 30));
        jPanel1.add(tf_december, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 80, 30));
        jPanel1.add(tf_january, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 80, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("February:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("March:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("April:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("May:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 90, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("June");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 90, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("July:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("August:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 90, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("September:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 90, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setText("October:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 90, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setText("November:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 90, -1));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setText("December:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 90, -1));

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setText("January:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        insertDataset_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        insertDataset_bttn.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        insertDataset_bttn.setText("Insert dataset");
        insertDataset_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertDataset_bttnActionPerformed(evt);
            }
        });
        jPanel1.add(insertDataset_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 600));

        jPanel2.setBackground(java.awt.SystemColor.window);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(java.awt.SystemColor.inactiveCaption);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Search :");

        search_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_tfKeyReleased(evt);
            }
        });

        datasetTable.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        datasetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1),  new Integer(300),  new Integer(350),  new Integer(330),  new Integer(340),  new Integer(390),  new Integer(430),  new Integer(480),  new Integer(460),  new Integer(490),  new Integer(510),  new Integer(550),  new Integer(560)},
                { new Integer(2),  new Integer(550),  new Integer(590),  new Integer(600),  new Integer(610),  new Integer(630),  new Integer(620),  new Integer(680),  new Integer(690),  new Integer(710),  new Integer(730),  new Integer(740),  new Integer(770)},
                { new Integer(3),  new Integer(200),  new Integer(300),  new Integer(250),  new Integer(600),  new Integer(650),  new Integer(670),  new Integer(400),  new Integer(440),  new Integer(430),  new Integer(900),  new Integer(980),  new Integer(990)},
                { new Integer(4),  new Integer(300),  new Integer(370),  new Integer(380),  new Integer(710),  new Integer(730),  new Integer(790),  new Integer(450),  new Integer(480),  new Integer(490),  new Integer(930),  new Integer(960),  new Integer(980)}
            },
            new String [] {
                "Name", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        datasetTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datasetTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(datasetTable);

        message_lbl.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        message_lbl.setForeground(java.awt.SystemColor.textHighlight);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 694, Short.MAX_VALUE))
                    .addComponent(message_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 960, 230));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(245, 227, 242));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exponential_bttn.setBackground(java.awt.SystemColor.textHighlight);
        exponential_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        exponential_bttn.setForeground(java.awt.SystemColor.activeCaption);
        exponential_bttn.setText("Exponential Smoothing");
        exponential_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponential_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(exponential_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 40));

        DoubleExp_bttn.setBackground(java.awt.SystemColor.textHighlight);
        DoubleExp_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        DoubleExp_bttn.setForeground(java.awt.SystemColor.activeCaption);
        DoubleExp_bttn.setText("Double Exponential Smoothing");
        DoubleExp_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoubleExp_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(DoubleExp_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, 40));

        maxDemand_bttn.setBackground(java.awt.SystemColor.textHighlight);
        maxDemand_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        maxDemand_bttn.setForeground(java.awt.SystemColor.activeCaption);
        maxDemand_bttn.setText("MAX");
        maxDemand_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxDemand_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(maxDemand_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 70, 30));

        reg_bttn.setBackground(java.awt.SystemColor.textHighlight);
        reg_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        reg_bttn.setForeground(java.awt.SystemColor.activeCaption);
        reg_bttn.setText("Regression Analysis");
        reg_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(reg_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 30));

        jButton1.setBackground(java.awt.SystemColor.textHighlight);
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setForeground(java.awt.SystemColor.activeCaption);
        jButton1.setText("Deseanolized Regression Analysis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 40));

        utilize_bttn.setBackground(java.awt.SystemColor.textHighlight);
        utilize_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        utilize_bttn.setForeground(java.awt.SystemColor.activeCaption);
        utilize_bttn.setText("FORECAST UTILIZING");
        utilize_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilize_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(utilize_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, 40));

        jButton3.setBackground(java.awt.SystemColor.textHighlight);
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton3.setForeground(java.awt.SystemColor.activeCaption);
        jButton3.setText("MIN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 80, 30));

        jButton8.setBackground(java.awt.SystemColor.textHighlight);
        jButton8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton8.setForeground(java.awt.SystemColor.activeCaption);
        jButton8.setText("SORT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 110, 30));

        maxReg_bttn.setBackground(java.awt.SystemColor.textHighlight);
        maxReg_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        maxReg_bttn.setForeground(java.awt.SystemColor.activeCaption);
        maxReg_bttn.setText("MAX");
        maxReg_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxReg_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(maxReg_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 70, 30));

        expMax_bttn.setBackground(java.awt.SystemColor.textHighlight);
        expMax_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        expMax_bttn.setForeground(java.awt.SystemColor.activeCaption);
        expMax_bttn.setText("MAX");
        expMax_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expMax_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(expMax_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 70, 30));

        dexpMax_bttn.setBackground(java.awt.SystemColor.textHighlight);
        dexpMax_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        dexpMax_bttn.setForeground(java.awt.SystemColor.activeCaption);
        dexpMax_bttn.setText("MAX");
        dexpMax_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexpMax_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(dexpMax_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 70, 30));

        minReg_bttn.setBackground(java.awt.SystemColor.textHighlight);
        minReg_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        minReg_bttn.setForeground(java.awt.SystemColor.activeCaption);
        minReg_bttn.setText("MIN");
        minReg_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minReg_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(minReg_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 80, 30));

        expMin_bttn.setBackground(java.awt.SystemColor.textHighlight);
        expMin_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        expMin_bttn.setForeground(java.awt.SystemColor.activeCaption);
        expMin_bttn.setText("MIN");
        expMin_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expMin_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(expMin_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 80, 30));

        dexpMin_bttn.setBackground(java.awt.SystemColor.textHighlight);
        dexpMin_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        dexpMin_bttn.setForeground(java.awt.SystemColor.activeCaption);
        dexpMin_bttn.setText("MIN");
        dexpMin_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexpMin_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(dexpMin_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 80, 30));

        sortReg_bttn.setBackground(java.awt.SystemColor.textHighlight);
        sortReg_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        sortReg_bttn.setForeground(java.awt.SystemColor.activeCaption);
        sortReg_bttn.setText("SORT");
        sortReg_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortReg_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(sortReg_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 110, 30));

        expSort_bttn.setBackground(java.awt.SystemColor.textHighlight);
        expSort_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        expSort_bttn.setForeground(java.awt.SystemColor.activeCaption);
        expSort_bttn.setText("SORT");
        expSort_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expSort_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(expSort_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 110, 30));

        dexpSort_bttn.setBackground(java.awt.SystemColor.textHighlight);
        dexpSort_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        dexpSort_bttn.setForeground(java.awt.SystemColor.activeCaption);
        dexpSort_bttn.setText("SORT");
        dexpSort_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexpSort_bttnActionPerformed(evt);
            }
        });
        jPanel6.add(dexpSort_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 110, 30));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        jLabel16.setText("------------------------>");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 80, 20));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        jLabel17.setText("------------------------>");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 80, 20));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        jLabel18.setText("------------------------>");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 80, 20));

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        jLabel19.setText("------------------------>");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 80, 20));

        jButton4.setBackground(java.awt.SystemColor.textHighlight);
        jButton4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton4.setForeground(java.awt.SystemColor.activeCaption);
        jButton4.setText("MSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 70, -1));

        jButton5.setBackground(java.awt.SystemColor.textHighlight);
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton5.setForeground(java.awt.SystemColor.activeCaption);
        jButton5.setText("MSE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 70, -1));

        jButton6.setBackground(java.awt.SystemColor.textHighlight);
        jButton6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton6.setForeground(java.awt.SystemColor.activeCaption);
        jButton6.setText("MSE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 0, 70, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 950, 240));

        jPanel5.setBackground(new java.awt.Color(245, 244, 249));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update_bttn.setBackground(java.awt.SystemColor.textHighlight);
        update_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        update_bttn.setForeground(java.awt.SystemColor.activeCaption);
        update_bttn.setText("Update Dataset");
        update_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bttnActionPerformed(evt);
            }
        });
        jPanel5.add(update_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 30));

        reverse_bttn.setBackground(java.awt.SystemColor.textHighlight);
        reverse_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        reverse_bttn.setForeground(java.awt.SystemColor.activeCaption);
        reverse_bttn.setText("Reverse Order");
        reverse_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reverse_bttnActionPerformed(evt);
            }
        });
        jPanel5.add(reverse_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 210, -1));

        min_demand.setBackground(java.awt.SystemColor.textHighlight);
        min_demand.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        min_demand.setForeground(java.awt.SystemColor.activeCaption);
        min_demand.setText("Min Demand of Dataset");
        min_demand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min_demandActionPerformed(evt);
            }
        });
        jPanel5.add(min_demand, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 210, 30));

        max_bttn.setBackground(java.awt.SystemColor.textHighlight);
        max_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        max_bttn.setForeground(java.awt.SystemColor.activeCaption);
        max_bttn.setText("Max Demand of Dataset");
        max_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                max_bttnActionPerformed(evt);
            }
        });
        jPanel5.add(max_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 210, 30));

        delete_bttn.setBackground(java.awt.SystemColor.textHighlight);
        delete_bttn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        delete_bttn.setForeground(java.awt.SystemColor.activeCaption);
        delete_bttn.setText("Delete Dataset");
        delete_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bttnActionPerformed(evt);
            }
        });
        jPanel5.add(delete_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 750, 210));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 730, 370));

        jPanel7.setBackground(new java.awt.Color(245, 244, 249));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 230, 80));

        jPanel8.setBackground(new java.awt.Color(245, 227, 242));

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 230, 290));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -10, 980, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void min_demandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min_demandActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        int selectedRow = datasetTable.getSelectedRow();

        if (selectedRow == -1) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select dataset which you want to update..");
            }
        } else {
            Arraylist array = new Arraylist();
            array.add(model.getValueAt(selectedRow, 1));
            array.add(model.getValueAt(selectedRow, 2));
            array.add(model.getValueAt(selectedRow, 3));
            array.add(model.getValueAt(selectedRow, 4));
            array.add(model.getValueAt(selectedRow, 5));
            array.add(model.getValueAt(selectedRow, 6));
            array.add(model.getValueAt(selectedRow, 7));
            array.add(model.getValueAt(selectedRow, 8));
            array.add(model.getValueAt(selectedRow, 9));
            array.add(model.getValueAt(selectedRow, 10));
            array.add(model.getValueAt(selectedRow, 10));
            array.add(model.getValueAt(selectedRow, 12));

            Arraylist list = new Arraylist();
            int[] eklenecekler = {};

            for (int i = 1; i < model.getColumnCount(); i++) {

                list.add(Integer.parseInt(model.getValueAt(selectedRow, i).toString()));
            }
            Object[] eklenecekler2 = {list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8), list.get(9), list.get(10), list.get(11)};

            int j, P, Tmp;
            for (P = 1; P < 12; P++) {
                int Tmp2 = (Integer) eklenecekler2[P];
                for (j = P; j > 0 && (Integer) eklenecekler2[j - 1] > Tmp2; j--) {
                    eklenecekler2[j] = eklenecekler2[j - 1]; //Shift A[j-1] to right
                }
                eklenecekler2[j] = Tmp2;
            }

            message_lbl.setText("Min demand is: " + eklenecekler2[0]);
        }
    }//GEN-LAST:event_min_demandActionPerformed


    private void delete_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        int selectedRow = datasetTable.getSelectedRow();

        if (selectedRow == -1) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Please select dataset which you want to delete");
            }

        } else {
            Arraylist array = new Arraylist();
            Arraylist array2 = new Arraylist();
            array.add(0, model.getValueAt(selectedRow, 0));
            array.add(1, model.getValueAt(selectedRow, 1));
            array.add(2, model.getValueAt(selectedRow, 2));
            array.add(3, model.getValueAt(selectedRow, 3));
            array.add(4, model.getValueAt(selectedRow, 4));
            array.add(5, model.getValueAt(selectedRow, 5));
            array.add(6, model.getValueAt(selectedRow, 6));
            array.add(7, model.getValueAt(selectedRow, 7));
            array.add(8, model.getValueAt(selectedRow, 8));
            array.add(9, model.getValueAt(selectedRow, 9));
            array.add(10, model.getValueAt(selectedRow, 10));
            model.removeRow(selectedRow);

            message_lbl.setText("Dataset is deleted successfuly");

        }
    }//GEN-LAST:event_delete_bttnActionPerformed

    private void update_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_bttnActionPerformed
        message_lbl.setText("");

        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        int selectedRow = datasetTable.getSelectedRow();

        if (selectedRow == -1) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select dataset which you want to update..");
            }
        } else {
            model.setValueAt(tf_datasetName.getText(), selectedRow, 0);
            model.setValueAt(tf_january.getText(), selectedRow, 1);
            model.setValueAt(tf_february.getText(), selectedRow, 2);
            model.setValueAt(tf_march.getText(), selectedRow, 3);
            model.setValueAt(tf_april.getText(), selectedRow, 4);
            model.setValueAt(tf_may.getText(), selectedRow, 5);
            model.setValueAt(tf_june.getText(), selectedRow, 6);
            model.setValueAt(tf_july.getText(), selectedRow, 7);
            model.setValueAt(tf_august.getText(), selectedRow, 8);
            model.setValueAt(tf_september.getText(), selectedRow, 9);
            model.setValueAt(tf_october.getText(), selectedRow, 10);
            model.setValueAt(tf_november.getText(), selectedRow, 11);
            model.setValueAt(tf_december.getText(), selectedRow, 12);
            message_lbl.setText("Dataset is updated successfuly");

        }
    }//GEN-LAST:event_update_bttnActionPerformed

    @SuppressWarnings("empty-statement")
    private void max_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_max_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        int selectedRow = datasetTable.getSelectedRow();

        if (selectedRow == -1) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select dataset which you want to update..");
            }
        } else {
            Arraylist array = new Arraylist();
            array.add(model.getValueAt(selectedRow, 1));
            array.add(model.getValueAt(selectedRow, 2));
            array.add(model.getValueAt(selectedRow, 3));
            array.add(model.getValueAt(selectedRow, 4));
            array.add(model.getValueAt(selectedRow, 5));
            array.add(model.getValueAt(selectedRow, 6));
            array.add(model.getValueAt(selectedRow, 7));
            array.add(model.getValueAt(selectedRow, 8));
            array.add(model.getValueAt(selectedRow, 9));
            array.add(model.getValueAt(selectedRow, 10));
            array.add(model.getValueAt(selectedRow, 10));
            array.add(model.getValueAt(selectedRow, 12));

            Arraylist list = new Arraylist();
            int[] eklenecekler = {};

            for (int i = 1; i < model.getColumnCount(); i++) {

                list.add(Integer.parseInt(model.getValueAt(selectedRow, i).toString()));
            }
            Object[] eklenecekler2 = {list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8), list.get(9), list.get(10), list.get(11)};

            int j, P, Tmp;
            for (P = 1; P < 12; P++) {
                int Tmp2 = (Integer) eklenecekler2[P];
                for (j = P; j > 0 && (Integer) eklenecekler2[j - 1] > Tmp2; j--) {
                    eklenecekler2[j] = eklenecekler2[j - 1]; //Shift A[j-1] to right
                }
                eklenecekler2[j] = Tmp2;
            }

            message_lbl.setText("Max demand is: " + eklenecekler2[11]);
        }


    }//GEN-LAST:event_max_bttnActionPerformed

    private void reverse_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reverse_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        int selectedRow = datasetTable.getSelectedRow();

        if (selectedRow == -1) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select dataset which you want to update..");
            }
        } else {
            Arraylist array = new Arraylist();
            array.add(model.getValueAt(selectedRow, 1));
            array.add(model.getValueAt(selectedRow, 2));
            array.add(model.getValueAt(selectedRow, 3));
            array.add(model.getValueAt(selectedRow, 4));
            array.add(model.getValueAt(selectedRow, 5));
            array.add(model.getValueAt(selectedRow, 6));
            array.add(model.getValueAt(selectedRow, 7));
            array.add(model.getValueAt(selectedRow, 8));
            array.add(model.getValueAt(selectedRow, 9));
            array.add(model.getValueAt(selectedRow, 10));
            array.add(model.getValueAt(selectedRow, 10));
            array.add(model.getValueAt(selectedRow, 12));

            Arraylist list = new Arraylist();
            for (int i = 12; i < model.getColumnCount(); i--) {
                if (i == 0) {
                    break;
                }
                list.add(Integer.parseInt(model.getValueAt(selectedRow, i).toString()));
            }

            message_lbl.setText("Reverse order is : " + list);
        }

    }//GEN-LAST:event_reverse_bttnActionPerformed
    public void searchValue(String search) {
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        datasetTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }
    private void insertDataset_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertDataset_bttnActionPerformed

        String message;
        String datasetNameField = tf_datasetName.getText();
        String januaryField = tf_january.getText();
        String februaryField = tf_february.getText();
        String marchField = tf_march.getText();
        String aprilField = tf_april.getText();
        String mayField = tf_may.getText();
        String juneField = tf_june.getText();
        String julyField = tf_july.getText();
        String augustField = tf_august.getText();
        String septemberField = tf_september.getText();
        String octoberField = tf_october.getText();
        String novemberField = tf_november.getText();
        String decemberField = tf_december.getText();

        if (januaryField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";

        } else if (februaryField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";
        } else if (marchField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";
        } else if (mayField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";
        } else if (juneField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";
        } else if (julyField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";
        } else if (augustField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";
        } else if (septemberField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";
        } else if (octoberField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";
        } else if (novemberField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";
        } else if (decemberField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";
        } else if (aprilField.equals("")) {
            message = "PLEASE ENTER ALL MONTHS DEMAND";
        } else {
            Arraylist array = new Arraylist();
            array.add(januaryField);
            array.add(februaryField);
            array.add(marchField);
            array.add(aprilField);
            array.add(mayField);
            array.add(juneField);
            array.add(julyField);
            array.add(augustField);
            array.add(septemberField);
            array.add(octoberField);
            array.add(novemberField);
            array.add(decemberField);

            DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();

            Object[] eklenecekler = {datasetNameField, januaryField, februaryField, marchField, aprilField, mayField, juneField, julyField, augustField, septemberField, octoberField, novemberField, decemberField};
            model.addRow(eklenecekler);

            message = "Dataset added ";
            tf_january.setText("");
            tf_february.setText("");
            tf_march.setText("");
            tf_april.setText("");
            tf_may.setText("");
            tf_june.setText("");
            tf_july.setText("");
            tf_august.setText("");
            tf_september.setText("");
            tf_october.setText("");
            tf_november.setText("");
            tf_december.setText("");

        }
        JOptionPane.showMessageDialog(this, message);

    }//GEN-LAST:event_insertDataset_bttnActionPerformed
    public void exponentialCalculate(Arraylist list) {
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        double a = 0.2;
        //exponential smoothing kullanarak
        tahmin1.add(0, list.get(0));
        for (int i = 1; i < list.size() - 1; i++) {
            tahmin1.add(i, (Double) list.get(i - 1) * a + (Double) tahmin1.get(i - 1) * (1 - a));
        }

        listModel.addElement(tahmin1.get(0).toString());
        listModel.addElement(tahmin1.get(1).toString());
        listModel.addElement(tahmin1.get(2).toString());
        listModel.addElement(tahmin1.get(3).toString());
        listModel.addElement(tahmin1.get(4).toString());
        listModel.addElement(tahmin1.get(5).toString());
        listModel.addElement(tahmin1.get(6).toString());
        listModel.addElement(tahmin1.get(7).toString());
        listModel.addElement(tahmin1.get(8).toString());
        listModel.addElement(tahmin1.get(9).toString());
        listModel.addElement(tahmin1.get(10).toString());
        listModel.addElement((Double) list.get(10) * a + (Double) tahmin1.get(10) * (1 - a));
        jList1.setModel(listModel);
    }

    private void exponential_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponential_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();

        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list = new Arraylist();

            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            Arraylist tahmin1 = new Arraylist();
            tahmin1.add(list.get(0));
            tahmin1.add((Double) list.get(0) * a + (Double) tahmin1.get(0) * (1 - a));
            tahmin1.add((Double) list.get(1) * a + (Double) tahmin1.get(1) * (1 - a));
            tahmin1.add((Double) list.get(2) * a + (Double) tahmin1.get(2) * (1 - a));
            tahmin1.add((Double) list.get(3) * a + (Double) tahmin1.get(3) * (1 - a));
            tahmin1.add((Double) list.get(4) * a + (Double) tahmin1.get(4) * (1 - a));
            tahmin1.add((Double) list.get(5) * a + (Double) tahmin1.get(5) * (1 - a));
            tahmin1.add((Double) list.get(6) * a + (Double) tahmin1.get(6) * (1 - a));
            tahmin1.add((Double) list.get(7) * a + (Double) tahmin1.get(7) * (1 - a));
            tahmin1.add((Double) list.get(8) * a + (Double) tahmin1.get(8) * (1 - a));
            tahmin1.add((Double) list.get(9) * a + (Double) tahmin1.get(9) * (1 - a));
            tahmin1.add((Double) list.get(10) * a + (Double) tahmin1.get(10) * (1 - a));
            tahmin1.add(a * (Double) list.get(11) + (Double) tahmin1.get(11) * (1 - a));

            tahmin1.add((Double) list.get(12) * a + (Double) tahmin1.get(12) * (1 - a));
            tahmin1.add((Double) list.get(13) * a + (Double) tahmin1.get(13) * (1 - a));
            tahmin1.add((Double) list.get(14) * a + (Double) tahmin1.get(14) * (1 - a));
            tahmin1.add((Double) list.get(15) * a + (Double) tahmin1.get(15) * (1 - a));
            tahmin1.add((Double) list.get(16) * a + (Double) tahmin1.get(16) * (1 - a));
            tahmin1.add((Double) list.get(17) * a + (Double) tahmin1.get(17) * (1 - a));
            tahmin1.add((Double) list.get(18) * a + (Double) tahmin1.get(18) * (1 - a));
            tahmin1.add((Double) list.get(19) * a + (Double) tahmin1.get(19) * (1 - a));
            tahmin1.add((Double) list.get(20) * a + (Double) tahmin1.get(20) * (1 - a));
            tahmin1.add((Double) list.get(21) * a + (Double) tahmin1.get(21) * (1 - a));
            tahmin1.add((Double) list.get(22) * a + (Double) tahmin1.get(22) * (1 - a));
            tahmin1.add((Double) list.get(23) * a + (Double) tahmin1.get(23) * (1 - a));

            Object[] max2 = {(Double) tahmin1.get(0), (Double) tahmin1.get(1), (Double) tahmin1.get(2), (Double) tahmin1.get(3), (Double) tahmin1.get(4), (Double) tahmin1.get(5), (Double) tahmin1.get(6), tahmin1.get(7), (Double) tahmin1.get(8), (Double) tahmin1.get(9), (Double) tahmin1.get(10), (Double) tahmin1.get(11), (Double) tahmin1.get(12), (Double) tahmin1.get(13), (Double) tahmin1.get(14), (Double) tahmin1.get(15), (Double) tahmin1.get(16), (Double) tahmin1.get(17), (Double) tahmin1.get(18), (Double) tahmin1.get(19), (Double) tahmin1.get(20), (Double) tahmin1.get(21), (Double) tahmin1.get(22), (Double) tahmin1.get(23)};
            listModel.addElement(tahmin1.get(0));
            listModel.addElement(tahmin1.get(1));
            listModel.addElement(tahmin1.get(2));
            listModel.addElement(tahmin1.get(3));
            listModel.addElement(tahmin1.get(4));
            listModel.addElement(tahmin1.get(5));
            listModel.addElement(tahmin1.get(6));
            listModel.addElement(tahmin1.get(7));
            listModel.addElement(tahmin1.get(8));
            listModel.addElement(tahmin1.get(9));
            listModel.addElement(tahmin1.get(10));
            listModel.addElement(tahmin1.get(11));
            listModel.addElement(tahmin1.get(12));
            listModel.addElement(tahmin1.get(13));
            listModel.addElement(tahmin1.get(14));
            listModel.addElement(tahmin1.get(15));
            listModel.addElement(tahmin1.get(16));
            listModel.addElement(tahmin1.get(17));
            listModel.addElement(tahmin1.get(18));
            listModel.addElement(tahmin1.get(19));
            listModel.addElement(tahmin1.get(20));
            listModel.addElement(tahmin1.get(21));
            listModel.addElement(tahmin1.get(22));
            listModel.addElement(tahmin1.get(23));

            jList1.setModel(listModel);
    }//GEN-LAST:event_exponential_bttnActionPerformed

    }
    private void DoubleExp_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoubleExp_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else{
             Arraylist list2 = new Arraylist();
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            Arraylist tahmin2 = new Arraylist();
            Arraylist s = new Arraylist();
            Arraylist g = new Arraylist();
            Arraylist doubleExponentialSmoothingForecast = new Arraylist();
            double x = 200.0;
            double y = 50.0;
         


            s.add((Double) list2.get(0) * a + (1 - a) * (x + y));
            g.add(a * ((Double) s.get(0) - x) + 0.8 * y);
            s.add(a * (Double) list2.get(1) + (1 - a) * ((Double) s.get(0) + (Double) g.get(0)));
            g.add(a * ((Double) s.get(1) - (Double) s.get(0)) + (1 - a) * (Double) g.get(0));
            s.add(a * (Double) list2.get(2) + (1 - a) * ((Double) s.get(1) + (Double) g.get(1)));
            g.add(a * ((Double) s.get(2) - (Double) s.get(1)) + (1 - a) * (Double) g.get(1));
            s.add(a * (Double) list2.get(3) + (1 - a) * ((Double) s.get(2) + (Double) g.get(2)));
            g.add(a * ((Double) s.get(3) - (Double) s.get(2)) + (1 - a) * (Double) g.get(2));
            s.add(a * (Double) list2.get(4) + (1 - a) * ((Double) s.get(3) + (Double) g.get(3)));
            g.add(a * ((Double) s.get(4) - (Double) s.get(3)) + (1 - a) * (Double) g.get(3));
            s.add(a * (Double) list2.get(5) + (1 - a) * ((Double) s.get(4) + (Double) g.get(4)));
            g.add(a * ((Double) s.get(5) - (Double) s.get(4)) + (1 - a) * (Double) g.get(4));
            s.add(a * (Double) list2.get(6) + (1 - a) * ((Double) s.get(5) + (Double) g.get(5)));
            g.add(a * ((Double) s.get(6) - (Double) s.get(5)) + (1 - a) * (Double) g.get(5));
            s.add(a * (Double) list2.get(7) + (1 - a) * ((Double) s.get(6) + (Double) g.get(6)));
            g.add(a * ((Double) s.get(7) - (Double) s.get(6)) + (1 - a) * (Double) g.get(6));
            s.add(a * (Double) list2.get(8) + (1 - a) * ((Double) s.get(7) + (Double) g.get(7)));
            g.add(a * ((Double) s.get(8) - (Double) s.get(7)) + (1 - a) * (Double) g.get(7));
            s.add(a * (Double) list2.get(9) + (1 - a) * ((Double) s.get(8) + (Double) g.get(8)));
            g.add(a * ((Double) s.get(9) - (Double) s.get(8)) + (1 - a) * (Double) g.get(8));
            s.add(a * (Double) list2.get(10) + (1 - a) * ((Double) s.get(9) + (Double) g.get(9)));
            g.add(a * ((Double) s.get(10) - (Double) s.get(9)) + (1 - a) * (Double) g.get(9));
            s.add(a * (Double) list2.get(11) + (1 - a) * ((Double) s.get(10) + (Double) g.get(10)));
            g.add(a * ((Double) s.get(11) - (Double) s.get(10)) + (1 - a) * (Double) g.get(10));

            s.add(a * (Double) list2.get(12) + (1 - a) * ((Double) s.get(11) + (Double) g.get(11)));
            g.add(a * ((Double) s.get(12) - (Double) s.get(11)) + (1 - a) * (Double) g.get(11));
            s.add(a * (Double) list2.get(13) + (1 - a) * ((Double) s.get(12) + (Double) g.get(12)));
            g.add(a * ((Double) s.get(13) - (Double) s.get(12)) + (1 - a) * (Double) g.get(12));
            s.add(a * (Double) list2.get(14) + (1 - a) * ((Double) s.get(13) + (Double) g.get(13)));
            g.add(a * ((Double) s.get(14) - (Double) s.get(13)) + (1 - a) * (Double) g.get(13));
            s.add(a * (Double) list2.get(15) + (1 - a) * ((Double) s.get(14) + (Double) g.get(14)));
            g.add(a * ((Double) s.get(15) - (Double) s.get(14)) + (1 - a) * (Double) g.get(14));
            s.add(a * (Double) list2.get(16) + (1 - a) * ((Double) s.get(15) + (Double) g.get(15)));
            g.add(a * ((Double) s.get(16) - (Double) s.get(15)) + (1 - a) * (Double) g.get(15));
            s.add(a * (Double) list2.get(17) + (1 - a) * ((Double) s.get(16) + (Double) g.get(16)));
            g.add(a * ((Double) s.get(17) - (Double) s.get(16)) + (1 - a) * (Double) g.get(16));
            s.add(a * (Double) list2.get(18) + (1 - a) * ((Double) s.get(17) + (Double) g.get(17)));
            g.add(a * ((Double) s.get(18) - (Double) s.get(17)) + (1 - a) * (Double) g.get(17));
            s.add(a * (Double) list2.get(19) + (1 - a) * ((Double) s.get(18) + (Double) g.get(18)));
            g.add(a * ((Double) s.get(19) - (Double) s.get(18)) + (1 - a) * (Double) g.get(18));
            s.add(a * (Double) list2.get(20) + (1 - a) * ((Double) s.get(19) + (Double) g.get(19)));
            g.add(a * ((Double) s.get(20) - (Double) s.get(19)) + (1 - a) * (Double) g.get(19));
            s.add(a * (Double) list2.get(21) + (1 - a) * ((Double) s.get(20) + (Double) g.get(20)));
            g.add(a * ((Double) s.get(21) - (Double) s.get(20)) + (1 - a) * (Double) g.get(20));
            s.add(a * (Double) list2.get(22) + (1 - a) * ((Double) s.get(21) + (Double) g.get(21)));
            g.add(a * ((Double) s.get(22) - (Double) s.get(21)) + (1 - a) * (Double) g.get(21));
            s.add(a * (Double) list2.get(23) + (1 - a) * ((Double) s.get(22) + (Double) g.get(22)));
            g.add(a * ((Double) s.get(23) - (Double) s.get(22)) + (1 - a) * (Double) g.get(22));
           
            tahmin1.add(x+y);
            tahmin1.add((Double) s.get(0) + (Double) g.get(0));
            tahmin1.add((Double) s.get(1) + (Double) g.get(1));
            tahmin1.add((Double) s.get(2) + (Double) g.get(2));
            tahmin1.add((Double) s.get(3) + (Double) g.get(3));
            tahmin1.add((Double) s.get(4) + (Double) g.get(4));
            tahmin1.add((Double) s.get(5) + (Double) g.get(5));
            tahmin1.add((Double) s.get(6) + (Double) g.get(6));
            tahmin1.add((Double) s.get(7) + (Double) g.get(7));
            tahmin1.add((Double) s.get(8) + (Double) g.get(8));
            tahmin1.add((Double) s.get(9) + (Double) g.get(9));
            tahmin1.add((Double) s.get(10) + (Double) g.get(10));
           
            tahmin1.add((Double) s.get(11) + (Double) g.get(11));
            tahmin1.add((Double) s.get(12) + (Double) g.get(12));
            tahmin1.add((Double) s.get(13) + (Double) g.get(13));
            tahmin1.add((Double) s.get(14) + (Double) g.get(14));
            tahmin1.add((Double) s.get(15) + (Double) g.get(15));
            tahmin1.add((Double) s.get(16) + (Double) g.get(16));
            tahmin1.add((Double) s.get(17) + (Double) g.get(17));
            tahmin1.add((Double) s.get(18) + (Double) g.get(18));
            tahmin1.add((Double) s.get(19) + (Double) g.get(19));
            tahmin1.add((Double) s.get(20) + (Double) g.get(20));
            tahmin1.add((Double) s.get(21) + (Double) g.get(21));
            tahmin1.add((Double) s.get(22) + (Double) g.get(22));
            tahmin1.add((Double) s.get(23) + (Double) g.get(23));

            Arraylist errorDouble = new Arraylist();
            errorDouble.add((Double)tahmin1.get(0)-(Double)list2.get(0));
            errorDouble.add((Double) tahmin1.get(1) - (Double) list2.get(0));
            errorDouble.add((Double) tahmin1.get(2) - (Double) list2.get(1));
            errorDouble.add((Double) tahmin1.get(3) - (Double) list2.get(2));
            errorDouble.add((Double) tahmin1.get(4) - (Double) list2.get(3));
            errorDouble.add((Double) tahmin1.get(5) - (Double) list2.get(4));
            errorDouble.add((Double) tahmin1.get(6) - (Double) list2.get(5));
            errorDouble.add((Double) tahmin1.get(7) - (Double) list2.get(6));
            errorDouble.add((Double) tahmin1.get(8) - (Double) list2.get(7));
            errorDouble.add((Double) tahmin1.get(9) - (Double) list2.get(8));
            errorDouble.add((Double) tahmin1.get(10) - (Double) list2.get(9));
            errorDouble.add((Double) tahmin1.get(11) - (Double) list2.get(10));
            errorDouble.add((Double) tahmin1.get(12) - (Double) list2.get(11));
            errorDouble.add((Double) tahmin1.get(13) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin1.get(14) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin1.get(15) - (Double) list2.get(14));
            errorDouble.add((Double) tahmin1.get(16) - (Double) list2.get(15));
            errorDouble.add((Double) tahmin1.get(17) - (Double) list2.get(16));
            errorDouble.add((Double) tahmin1.get(18) - (Double) list2.get(17));
            errorDouble.add((Double) tahmin1.get(19) - (Double) list2.get(18));
            errorDouble.add((Double) tahmin1.get(20) - (Double) list2.get(19));
            errorDouble.add((Double) tahmin1.get(21) - (Double) list2.get(20));
            errorDouble.add((Double) tahmin1.get(22) - (Double) list2.get(21));
            errorDouble.add((Double) tahmin1.get(23) - (Double) list2.get(22));
            errorDouble.add((Double) tahmin1.get(24) - (Double) list2.get(23));
             
            listModel.addElement(tahmin1.get(0));
            listModel.addElement(tahmin1.get(1));
            listModel.addElement(tahmin1.get(2));
            listModel.addElement(tahmin1.get(3));
            listModel.addElement(tahmin1.get(4));
            listModel.addElement(tahmin1.get(5));
            listModel.addElement(tahmin1.get(6));
            listModel.addElement(tahmin1.get(7));
            listModel.addElement(tahmin1.get(8));
            listModel.addElement(tahmin1.get(9));
            listModel.addElement(tahmin1.get(10));
            listModel.addElement(tahmin1.get(11));
            listModel.addElement(tahmin1.get(12));
            listModel.addElement(tahmin1.get(13));
            listModel.addElement(tahmin1.get(14));
            listModel.addElement(tahmin1.get(15));
            listModel.addElement(tahmin1.get(16));
            listModel.addElement(tahmin1.get(17));
            listModel.addElement(tahmin1.get(18));
            listModel.addElement(tahmin1.get(19));
            listModel.addElement(tahmin1.get(20));
            listModel.addElement(tahmin1.get(21));
            listModel.addElement(tahmin1.get(22));
            listModel.addElement(tahmin1.get(23));
            
            
            
           

            jList1.setModel(listModel);
        }


    }//GEN-LAST:event_DoubleExp_bttnActionPerformed

    private void reg_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list3 = new Arraylist();
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            double sumDemand = (Double) list3.get(0) + (Double) list3.get(1) + (Double) list3.get(2) + (Double) list3.get(3) + (Double) list3.get(4) + (Double) list3.get(5) + (Double) list3.get(6) + (Double) list3.get(7) + (Double) list3.get(8) + (Double) list3.get(9) + (Double) list3.get(10) + (Double) list3.get(11) + (Double) list3.get(12) + (Double) list3.get(13) + (Double) list3.get(14) + (Double) list3.get(15) + (Double) list3.get(16) + (Double) list3.get(17) + (Double) list3.get(18) + (Double) list3.get(19) + (Double) list3.get(20) + (Double) list3.get(21) + (Double) list3.get(22) + (Double) list3.get(23);
            //  double sum_x = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12+13+14+15+16+17+18+19+20+21+22+23+24);
            double sum_x = 300;
            //double sum_square=1+Math.sqrt(2)+Math.sqrt(3)+Math.sqrt(4)+Math.sqrt(5)+Math.sqrt(6)+Math.sqrt(7)+Math.sqrt(8)+Math.sqrt(9)+Math.sqrt(10)+Math.sqrt(11)+Math.sqrt(12);

            double sum_square = 4900.0;

            Arraylist multiply = new Arraylist();
            multiply.add(list3.get(0));
            multiply.add(2 * (Double) list3.get(1));
            multiply.add(3 * (Double) list3.get(2));
            multiply.add(4 * (Double) list3.get(3));
            multiply.add(5 * (Double) list3.get(4));
            multiply.add(6 * (Double) list3.get(5));
            multiply.add(7 * (Double) list3.get(6));
            multiply.add(8 * (Double) list3.get(7));
            multiply.add(9 * (Double) list3.get(8));
            multiply.add(10 * (Double) list3.get(9));
            multiply.add(11 * (Double) list3.get(10));
            multiply.add(12 * (Double) list3.get(11));
            multiply.add(13 * (Double) list3.get(12));
            multiply.add(14 * (Double) list3.get(13));
            multiply.add(15 * (Double) list3.get(14));
            multiply.add(16 * (Double) list3.get(15));
            multiply.add(17 * (Double) list3.get(16));
            multiply.add(18 * (Double) list3.get(17));
            multiply.add(19 * (Double) list3.get(18));
            multiply.add(20 * (Double) list3.get(19));
            multiply.add(21 * (Double) list3.get(20));
            multiply.add(22 * (Double) list3.get(21));
            multiply.add(23 * (Double) list3.get(22));
            multiply.add(24 * (Double) list3.get(23));

            double multiplySum = (Double) multiply.get(0) + (Double) multiply.get(1) + (Double) multiply.get(2) + (Double) multiply.get(3) + (Double) multiply.get(4) + (Double) multiply.get(5) + (Double) multiply.get(6) + (Double) multiply.get(7) + (Double) multiply.get(8) + (Double) multiply.get(9) + (Double) multiply.get(10)
                    + (Double) multiply.get(11) + (Double) multiply.get(12) + (Double) multiply.get(13) + (Double) multiply.get(14) + (Double) multiply.get(15) + (Double) multiply.get(16) + (Double) multiply.get(17) + (Double) multiply.get(18) + (Double) multiply.get(19) + (Double) multiply.get(20) + (Double) multiply.get(21) + (Double) multiply.get(22) + (Double) multiply.get(23);
            double b_degeri = (24 * multiplySum - (sum_x * sumDemand)) / (24 * sum_square - (sum_x * sum_x));
            double a_degeri = sumDemand / 24 - b_degeri * sum_x / 24;

            Arraylist tahmin3 = new Arraylist();
            tahmin3.add(a_degeri + b_degeri * 1);
            tahmin3.add(a_degeri + b_degeri * 2);
            tahmin3.add(a_degeri + b_degeri * 3);
            tahmin3.add(a_degeri + b_degeri * 4);
            tahmin3.add(a_degeri + b_degeri * 5);
            tahmin3.add(a_degeri + b_degeri * 6);
            tahmin3.add(a_degeri + b_degeri * 7);
            tahmin3.add(a_degeri + b_degeri * 8);
            tahmin3.add(a_degeri + b_degeri * 9);
            tahmin3.add(a_degeri + b_degeri * 10);
            tahmin3.add(a_degeri + b_degeri * 11);
            tahmin3.add(a_degeri + b_degeri * 12);
            tahmin3.add(a_degeri + b_degeri * 13);
            tahmin3.add(a_degeri + b_degeri * 14);
            tahmin3.add(a_degeri + b_degeri * 15);
            tahmin3.add(a_degeri + b_degeri * 16);
            tahmin3.add(a_degeri + b_degeri * 17);
            tahmin3.add(a_degeri + b_degeri * 18);
            tahmin3.add(a_degeri + b_degeri * 19);
            tahmin3.add(a_degeri + b_degeri * 20);
            tahmin3.add(a_degeri + b_degeri * 21);
            tahmin3.add(a_degeri + b_degeri * 22);
            tahmin3.add(a_degeri + b_degeri * 23);
            tahmin3.add(a_degeri + b_degeri * 24);

            Object[] max3 = {(Double) tahmin3.get(0), (Double) tahmin3.get(1), (Double) tahmin3.get(2), (Double) tahmin3.get(3), (Double) tahmin3.get(4), (Double) tahmin3.get(5), (Double) tahmin3.get(6), tahmin3.get(7), (Double) tahmin3.get(8), (Double) tahmin3.get(9), (Double) tahmin3.get(10), (Double) tahmin3.get(11), (Double) tahmin3.get(12), (Double) tahmin3.get(13), (Double) tahmin3.get(14), (Double) tahmin3.get(15), (Double) tahmin3.get(16), (Double) tahmin3.get(17), (Double) tahmin3.get(18), (Double) tahmin3.get(19), (Double) tahmin3.get(20), (Double) tahmin3.get(21), (Double) tahmin3.get(22), (Double) tahmin3.get(23)};

            listModel.addElement(tahmin3.get(0));
            listModel.addElement(tahmin3.get(1));
            listModel.addElement(tahmin3.get(2));
            listModel.addElement(tahmin3.get(3));
            listModel.addElement(tahmin3.get(4));
            listModel.addElement(tahmin3.get(5));
            listModel.addElement(tahmin3.get(6));
            listModel.addElement(tahmin3.get(7));
            listModel.addElement(tahmin3.get(8));
            listModel.addElement(tahmin3.get(9));
            listModel.addElement(tahmin3.get(10));
            listModel.addElement(tahmin3.get(11));
            listModel.addElement(tahmin3.get(12));
            listModel.addElement(tahmin3.get(13));
            listModel.addElement(tahmin3.get(14));
            listModel.addElement(tahmin3.get(15));
            listModel.addElement(tahmin3.get(16));
            listModel.addElement(tahmin3.get(17));
            listModel.addElement(tahmin3.get(18));
            listModel.addElement(tahmin3.get(19));
            listModel.addElement(tahmin3.get(20));
            listModel.addElement(tahmin3.get(21));
            listModel.addElement(tahmin3.get(22));
            listModel.addElement(tahmin3.get(23));

            jList1.setModel(listModel);
        }
    }//GEN-LAST:event_reg_bttnActionPerformed


    private void datasetTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datasetTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        int selectedRow = datasetTable.getSelectedRow();
        tf_datasetName.setText(model.getValueAt(selectedRow, 0).toString());
        tf_january.setText(model.getValueAt(selectedRow, 1).toString());
        tf_february.setText(model.getValueAt(selectedRow, 2).toString());
        tf_march.setText(model.getValueAt(selectedRow, 3).toString());
        tf_april.setText(model.getValueAt(selectedRow, 4).toString());
        tf_may.setText(model.getValueAt(selectedRow, 5).toString());
        tf_june.setText(model.getValueAt(selectedRow, 6).toString());
        tf_july.setText(model.getValueAt(selectedRow, 7).toString());
        tf_august.setText(model.getValueAt(selectedRow, 8).toString());
        tf_september.setText(model.getValueAt(selectedRow, 9).toString());
        tf_october.setText(model.getValueAt(selectedRow, 10).toString());
        tf_november.setText(model.getValueAt(selectedRow, 11).toString());
        tf_december.setText(model.getValueAt(selectedRow, 12).toString());
    }//GEN-LAST:event_datasetTableMouseClicked

    private void search_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_tfKeyReleased
        String search = search_tf.getText();

        searchValue(search);
    }//GEN-LAST:event_search_tfKeyReleased

    private void utilize_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilize_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list = new Arraylist();

            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));
            
              Arraylist list2 = new Arraylist();
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            tahmin1.add(list.get(0));
            tahmin1.add((Double) list.get(0) * a + (Double) tahmin1.get(0) * (1 - a));
            tahmin1.add((Double) list.get(1) * a + (Double) tahmin1.get(1) * (1 - a));
            tahmin1.add((Double) list.get(2) * a + (Double) tahmin1.get(2) * (1 - a));
            tahmin1.add((Double) list.get(3) * a + (Double) tahmin1.get(3) * (1 - a));
            tahmin1.add((Double) list.get(4) * a + (Double) tahmin1.get(4) * (1 - a));
            tahmin1.add((Double) list.get(5) * a + (Double) tahmin1.get(5) * (1 - a));
            tahmin1.add((Double) list.get(6) * a + (Double) tahmin1.get(6) * (1 - a));
            tahmin1.add((Double) list.get(7) * a + (Double) tahmin1.get(7) * (1 - a));
            tahmin1.add((Double) list.get(8) * a + (Double) tahmin1.get(8) * (1 - a));
            tahmin1.add((Double) list.get(9) * a + (Double) tahmin1.get(9) * (1 - a));
            tahmin1.add((Double) list.get(10) * a + (Double) tahmin1.get(10) * (1 - a));
            tahmin1.add(a * (Double) list.get(11) + (Double) tahmin1.get(11) * (1 - a));

            tahmin1.add((Double) list.get(12) * a + (Double) tahmin1.get(12) * (1 - a));
            tahmin1.add((Double) list.get(13) * a + (Double) tahmin1.get(13) * (1 - a));
            tahmin1.add((Double) list.get(14) * a + (Double) tahmin1.get(14) * (1 - a));
            tahmin1.add((Double) list.get(15) * a + (Double) tahmin1.get(15) * (1 - a));
            tahmin1.add((Double) list.get(16) * a + (Double) tahmin1.get(16) * (1 - a));
            tahmin1.add((Double) list.get(17) * a + (Double) tahmin1.get(17) * (1 - a));
            tahmin1.add((Double) list.get(18) * a + (Double) tahmin1.get(18) * (1 - a));
            tahmin1.add((Double) list.get(19) * a + (Double) tahmin1.get(19) * (1 - a));
            tahmin1.add((Double) list.get(20) * a + (Double) tahmin1.get(20) * (1 - a));
            tahmin1.add((Double) list.get(21) * a + (Double) tahmin1.get(21) * (1 - a));
            tahmin1.add((Double) list.get(22) * a + (Double) tahmin1.get(22) * (1 - a));
            tahmin1.add((Double) list.get(23) * a + (Double) tahmin1.get(23) * (1 - a));

            error1.add(0);
            error1.add(((Double) tahmin1.get(1) - (Double) list.get(1)) * ((Double) tahmin1.get(1) - (Double) list.get(1)));
            error1.add(((Double) tahmin1.get(2) - (Double) list.get(2)) * ((Double) tahmin1.get(2) - (Double) list.get(2)));
            error1.add(((Double) tahmin1.get(3) - (Double) list.get(3)) * ((Double) tahmin1.get(3) - (Double) list.get(3)));
            error1.add(((Double) tahmin1.get(4) - (Double) list.get(4)) * ((Double) tahmin1.get(4) - (Double) list.get(4)));
            error1.add(((Double) tahmin1.get(5) - (Double) list.get(5)) * ((Double) tahmin1.get(5) - (Double) list.get(5)));
            error1.add(((Double) tahmin1.get(6) - (Double) list.get(6)) * ((Double) tahmin1.get(6) - (Double) list.get(6)));
            error1.add(((Double) tahmin1.get(7) - (Double) list.get(7)) * ((Double) tahmin1.get(7) - (Double) list.get(7)));
            error1.add(((Double) tahmin1.get(8) - (Double) list.get(8)) * ((Double) tahmin1.get(8) - (Double) list.get(8)));
            error1.add(((Double) tahmin1.get(9) - (Double) list.get(9)) * ((Double) tahmin1.get(9) - (Double) list.get(9)));
            error1.add(((Double) tahmin1.get(10) - (Double) list.get(10)) * ((Double) tahmin1.get(10) - (Double) list.get(10)));
            error1.add(((Double) tahmin1.get(11) - (Double) list.get(11)) * ((Double) tahmin1.get(11) - (Double) list.get(11)));
            error1.add(((Double) tahmin1.get(12) - (Double) list.get(12)) * ((Double) tahmin1.get(12) - (Double) list.get(12)));
            error1.add(((Double) tahmin1.get(13) - (Double) list.get(13)) * ((Double) tahmin1.get(13) - (Double) list.get(13)));
            error1.add(((Double) tahmin1.get(14) - (Double) list.get(14)) * ((Double) tahmin1.get(14) - (Double) list.get(14)));
            error1.add(((Double) tahmin1.get(15) - (Double) list.get(15)) * ((Double) tahmin1.get(15) - (Double) list.get(15)));
            error1.add(((Double) tahmin1.get(16) - (Double) list.get(16)) * ((Double) tahmin1.get(16) - (Double) list.get(16)));
            error1.add(((Double) tahmin1.get(17) - (Double) list.get(17)) * ((Double) tahmin1.get(17) - (Double) list.get(17)));
            error1.add(((Double) tahmin1.get(18) - (Double) list.get(18)) * ((Double) tahmin1.get(18) - (Double) list.get(18)));
            error1.add(((Double) tahmin1.get(19) - (Double) list.get(19)) * ((Double) tahmin1.get(19) - (Double) list.get(19)));
            error1.add(((Double) tahmin1.get(20) - (Double) list.get(20)) * ((Double) tahmin1.get(20) - (Double) list.get(20)));
            error1.add(((Double) tahmin1.get(21) - (Double) list.get(21)) * ((Double) tahmin1.get(21) - (Double) list.get(21)));
            error1.add(((Double) tahmin1.get(22) - (Double) list.get(22)) * ((Double) tahmin1.get(22) - (Double) list.get(22)));
            error1.add(((Double) tahmin1.get(23) - (Double) list.get(23)) * ((Double) tahmin1.get(23) - (Double) list.get(23)));

            double[] ort1 = {0, ((Double) tahmin1.get(1) - (Double) list.get(1)) * ((Double) tahmin1.get(1) - (Double) list.get(1)), ((Double) tahmin1.get(2) - (Double) list.get(2)) * ((Double) tahmin1.get(2) - (Double) list.get(2)), ((Double) tahmin1.get(3) - (Double) list.get(3)) * ((Double) tahmin1.get(3) - (Double) list.get(3)),
                ((Double) tahmin1.get(4) - (Double) list.get(4)) * ((Double) tahmin1.get(4) - (Double) list.get(4)), ((Double) tahmin1.get(5) - (Double) list.get(5)) * ((Double) tahmin1.get(5) - (Double) list.get(5)), ((Double) tahmin1.get(6) - (Double) list.get(6)) * ((Double) tahmin1.get(6) - (Double) list.get(6)),
                ((Double) tahmin1.get(7) - (Double) list.get(7)) * ((Double) tahmin1.get(7) - (Double) list.get(7)), ((Double) tahmin1.get(8) - (Double) list.get(8)) * ((Double) tahmin1.get(8) - (Double) list.get(8)), ((Double) tahmin1.get(9) - (Double) list.get(9)) * ((Double) tahmin1.get(9) - (Double) list.get(9)), ((Double) tahmin1.get(10) - (Double) list.get(10)) * ((Double) tahmin1.get(10) - (Double) list.get(10)),
                ((Double) tahmin1.get(11) - (Double) list.get(11)) * ((Double) tahmin1.get(11) - (Double) list.get(11)), ((Double) tahmin1.get(12) - (Double) list.get(12)) * ((Double) tahmin1.get(12) - (Double) list.get(12)), ((Double) tahmin1.get(13) - (Double) list.get(13)) * ((Double) tahmin1.get(13) - (Double) list.get(13)), ((Double) tahmin1.get(14) - (Double) list.get(14)) * ((Double) tahmin1.get(14) - (Double) list.get(14)), ((Double) tahmin1.get(15) - (Double) list.get(15)) * ((Double) tahmin1.get(15) - (Double) list.get(15)), ((Double) tahmin1.get(16) - (Double) list.get(16)) * ((Double) tahmin1.get(16) - (Double) list.get(16)), ((Double) tahmin1.get(17) - (Double) list.get(17)) * ((Double) tahmin1.get(17) - (Double) list.get(17)), ((Double) tahmin1.get(18) - (Double) list.get(18)) * ((Double) tahmin1.get(18) - (Double) list.get(18)), ((Double) tahmin1.get(19) - (Double) list.get(19)) * ((Double) tahmin1.get(19) - (Double) list.get(19)), ((Double) tahmin1.get(20) - (Double) list.get(20)) * ((Double) tahmin1.get(20) - (Double) list.get(20)), ((Double) tahmin1.get(21) - (Double) list.get(21)) * ((Double) tahmin1.get(21) - (Double) list.get(21)), ((Double) tahmin1.get(22) - (Double) list.get(22)) * ((Double) tahmin1.get(22) - (Double) list.get(22)), ((Double) tahmin1.get(23) - (Double) list.get(23)) * ((Double) tahmin1.get(23) - (Double) list.get(23))

            };
            double[] mse1 = {((ort1[0] + ort1[1] + ort1[2] + ort1[3] + ort1[4] + ort1[5] + ort1[6] + ort1[7] + ort1[8] + ort1[9] + ort1[10] + ort1[11] + ort1[12] + ort1[13] + ort1[14] + ort1[15] + ort1[16] + ort1[17] + ort1[18] + ort1[19] + ort1[20] + ort1[21] + ort1[22] + ort1[23])) / 24};

            //double exp
                     Arraylist tahmin2 = new Arraylist();
            Arraylist s = new Arraylist();
            Arraylist g = new Arraylist();
            Arraylist doubleExponentialSmoothingForecast = new Arraylist();
            double x = 200.0;
            double y = 50.0;
         


            s.add((Double) list2.get(0) * a + (1 - a) * (x + y));
            g.add(a * ((Double) s.get(0) - x) + 0.8 * y);
            s.add(a * (Double) list2.get(1) + (1 - a) * ((Double) s.get(0) + (Double) g.get(0)));
            g.add(a * ((Double) s.get(1) - (Double) s.get(0)) + (1 - a) * (Double) g.get(0));
            s.add(a * (Double) list2.get(2) + (1 - a) * ((Double) s.get(1) + (Double) g.get(1)));
            g.add(a * ((Double) s.get(2) - (Double) s.get(1)) + (1 - a) * (Double) g.get(1));
            s.add(a * (Double) list2.get(3) + (1 - a) * ((Double) s.get(2) + (Double) g.get(2)));
            g.add(a * ((Double) s.get(3) - (Double) s.get(2)) + (1 - a) * (Double) g.get(2));
            s.add(a * (Double) list2.get(4) + (1 - a) * ((Double) s.get(3) + (Double) g.get(3)));
            g.add(a * ((Double) s.get(4) - (Double) s.get(3)) + (1 - a) * (Double) g.get(3));
            s.add(a * (Double) list2.get(5) + (1 - a) * ((Double) s.get(4) + (Double) g.get(4)));
            g.add(a * ((Double) s.get(5) - (Double) s.get(4)) + (1 - a) * (Double) g.get(4));
            s.add(a * (Double) list2.get(6) + (1 - a) * ((Double) s.get(5) + (Double) g.get(5)));
            g.add(a * ((Double) s.get(6) - (Double) s.get(5)) + (1 - a) * (Double) g.get(5));
            s.add(a * (Double) list2.get(7) + (1 - a) * ((Double) s.get(6) + (Double) g.get(6)));
            g.add(a * ((Double) s.get(7) - (Double) s.get(6)) + (1 - a) * (Double) g.get(6));
            s.add(a * (Double) list2.get(8) + (1 - a) * ((Double) s.get(7) + (Double) g.get(7)));
            g.add(a * ((Double) s.get(8) - (Double) s.get(7)) + (1 - a) * (Double) g.get(7));
            s.add(a * (Double) list2.get(9) + (1 - a) * ((Double) s.get(8) + (Double) g.get(8)));
            g.add(a * ((Double) s.get(9) - (Double) s.get(8)) + (1 - a) * (Double) g.get(8));
            s.add(a * (Double) list2.get(10) + (1 - a) * ((Double) s.get(9) + (Double) g.get(9)));
            g.add(a * ((Double) s.get(10) - (Double) s.get(9)) + (1 - a) * (Double) g.get(9));
            s.add(a * (Double) list2.get(11) + (1 - a) * ((Double) s.get(10) + (Double) g.get(10)));
            g.add(a * ((Double) s.get(11) - (Double) s.get(10)) + (1 - a) * (Double) g.get(10));

            s.add(a * (Double) list2.get(12) + (1 - a) * ((Double) s.get(11) + (Double) g.get(11)));
            g.add(a * ((Double) s.get(12) - (Double) s.get(11)) + (1 - a) * (Double) g.get(11));
            s.add(a * (Double) list2.get(13) + (1 - a) * ((Double) s.get(12) + (Double) g.get(12)));
            g.add(a * ((Double) s.get(13) - (Double) s.get(12)) + (1 - a) * (Double) g.get(12));
            s.add(a * (Double) list2.get(14) + (1 - a) * ((Double) s.get(13) + (Double) g.get(13)));
            g.add(a * ((Double) s.get(14) - (Double) s.get(13)) + (1 - a) * (Double) g.get(13));
            s.add(a * (Double) list2.get(15) + (1 - a) * ((Double) s.get(14) + (Double) g.get(14)));
            g.add(a * ((Double) s.get(15) - (Double) s.get(14)) + (1 - a) * (Double) g.get(14));
            s.add(a * (Double) list2.get(16) + (1 - a) * ((Double) s.get(15) + (Double) g.get(15)));
            g.add(a * ((Double) s.get(16) - (Double) s.get(15)) + (1 - a) * (Double) g.get(15));
            s.add(a * (Double) list2.get(17) + (1 - a) * ((Double) s.get(16) + (Double) g.get(16)));
            g.add(a * ((Double) s.get(17) - (Double) s.get(16)) + (1 - a) * (Double) g.get(16));
            s.add(a * (Double) list2.get(18) + (1 - a) * ((Double) s.get(17) + (Double) g.get(17)));
            g.add(a * ((Double) s.get(18) - (Double) s.get(17)) + (1 - a) * (Double) g.get(17));
            s.add(a * (Double) list2.get(19) + (1 - a) * ((Double) s.get(18) + (Double) g.get(18)));
            g.add(a * ((Double) s.get(19) - (Double) s.get(18)) + (1 - a) * (Double) g.get(18));
            s.add(a * (Double) list2.get(20) + (1 - a) * ((Double) s.get(19) + (Double) g.get(19)));
            g.add(a * ((Double) s.get(20) - (Double) s.get(19)) + (1 - a) * (Double) g.get(19));
            s.add(a * (Double) list2.get(21) + (1 - a) * ((Double) s.get(20) + (Double) g.get(20)));
            g.add(a * ((Double) s.get(21) - (Double) s.get(20)) + (1 - a) * (Double) g.get(20));
            s.add(a * (Double) list2.get(22) + (1 - a) * ((Double) s.get(21) + (Double) g.get(21)));
            g.add(a * ((Double) s.get(22) - (Double) s.get(21)) + (1 - a) * (Double) g.get(21));
            s.add(a * (Double) list2.get(23) + (1 - a) * ((Double) s.get(22) + (Double) g.get(22)));
            g.add(a * ((Double) s.get(23) - (Double) s.get(22)) + (1 - a) * (Double) g.get(22));
           
            tahmin1.add(x+y);
            tahmin1.add((Double) s.get(0) + (Double) g.get(0));
            tahmin1.add((Double) s.get(1) + (Double) g.get(1));
            tahmin1.add((Double) s.get(2) + (Double) g.get(2));
            tahmin1.add((Double) s.get(3) + (Double) g.get(3));
            tahmin1.add((Double) s.get(4) + (Double) g.get(4));
            tahmin1.add((Double) s.get(5) + (Double) g.get(5));
            tahmin1.add((Double) s.get(6) + (Double) g.get(6));
            tahmin1.add((Double) s.get(7) + (Double) g.get(7));
            tahmin1.add((Double) s.get(8) + (Double) g.get(8));
            tahmin1.add((Double) s.get(9) + (Double) g.get(9));
            tahmin1.add((Double) s.get(10) + (Double) g.get(10));
           
            tahmin1.add((Double) s.get(11) + (Double) g.get(11));
            tahmin1.add((Double) s.get(12) + (Double) g.get(12));
            tahmin1.add((Double) s.get(13) + (Double) g.get(13));
            tahmin1.add((Double) s.get(14) + (Double) g.get(14));
            tahmin1.add((Double) s.get(15) + (Double) g.get(15));
            tahmin1.add((Double) s.get(16) + (Double) g.get(16));
            tahmin1.add((Double) s.get(17) + (Double) g.get(17));
            tahmin1.add((Double) s.get(18) + (Double) g.get(18));
            tahmin1.add((Double) s.get(19) + (Double) g.get(19));
            tahmin1.add((Double) s.get(20) + (Double) g.get(20));
            tahmin1.add((Double) s.get(21) + (Double) g.get(21));
            tahmin1.add((Double) s.get(22) + (Double) g.get(22));
            tahmin1.add((Double) s.get(23) + (Double) g.get(23));

            Arraylist errorDouble = new Arraylist();
            errorDouble.add((Double)tahmin1.get(0)-(Double)list2.get(0));
            errorDouble.add((Double) tahmin1.get(1) - (Double) list2.get(0));
            errorDouble.add((Double) tahmin1.get(2) - (Double) list2.get(1));
            errorDouble.add((Double) tahmin1.get(3) - (Double) list2.get(2));
            errorDouble.add((Double) tahmin1.get(4) - (Double) list2.get(3));
            errorDouble.add((Double) tahmin1.get(5) - (Double) list2.get(4));
            errorDouble.add((Double) tahmin1.get(6) - (Double) list2.get(5));
            errorDouble.add((Double) tahmin1.get(7) - (Double) list2.get(6));
            errorDouble.add((Double) tahmin1.get(8) - (Double) list2.get(7));
            errorDouble.add((Double) tahmin1.get(9) - (Double) list2.get(8));
            errorDouble.add((Double) tahmin1.get(10) - (Double) list2.get(9));
            errorDouble.add((Double) tahmin1.get(11) - (Double) list2.get(10));
            errorDouble.add((Double) tahmin1.get(12) - (Double) list2.get(11));
            errorDouble.add((Double) tahmin1.get(13) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin1.get(14) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin1.get(15) - (Double) list2.get(14));
            errorDouble.add((Double) tahmin1.get(16) - (Double) list2.get(15));
            errorDouble.add((Double) tahmin1.get(17) - (Double) list2.get(16));
            errorDouble.add((Double) tahmin1.get(18) - (Double) list2.get(17));
            errorDouble.add((Double) tahmin1.get(19) - (Double) list2.get(18));
            errorDouble.add((Double) tahmin1.get(20) - (Double) list2.get(19));
            errorDouble.add((Double) tahmin1.get(21) - (Double) list2.get(20));
            errorDouble.add((Double) tahmin1.get(22) - (Double) list2.get(21));
            errorDouble.add((Double) tahmin1.get(23) - (Double) list2.get(22));
            errorDouble.add((Double) tahmin1.get(24) - (Double) list2.get(23));
             double[] ort2 = {((Double)tahmin1.get(0)-(Double)list2.get(0))*((Double)tahmin1.get(0)-(Double)list2.get(0)),((Double) tahmin1.get(1) - (Double) list2.get(1)) * ((Double) tahmin1.get(1) - (Double) list2.get(1)), ((Double) tahmin1.get(2) - (Double) list2.get(2)) * ((Double) tahmin1.get(2) - (Double) list2.get(2)), ((Double) tahmin1.get(3) - (Double) list2.get(3)) * ((Double) tahmin1.get(3) - (Double) list2.get(3)),
                ((Double) tahmin1.get(4) - (Double) list2.get(4)) * ((Double) tahmin1.get(4) - (Double) list2.get(4)), ((Double) tahmin1.get(5) - (Double) list2.get(5)) * ((Double) tahmin1.get(5) - (Double) list2.get(5)), ((Double) tahmin1.get(6) - (Double) list2.get(6)) * ((Double) tahmin1.get(6) - (Double) list2.get(6)),
                ((Double) tahmin1.get(7) - (Double) list2.get(7)) * ((Double) tahmin1.get(7) - (Double) list2.get(7)), ((Double) tahmin1.get(8) - (Double) list2.get(8)) * ((Double) tahmin1.get(8) - (Double) list2.get(8)), ((Double) tahmin1.get(9) - (Double) list2.get(9)) * ((Double) tahmin1.get(9) - (Double) list2.get(9)), ((Double) tahmin1.get(10) - (Double) list2.get(10)) * ((Double) tahmin1.get(10) - (Double) list2.get(10)),
                ((Double) tahmin1.get(11) - (Double) list2.get(11)) * ((Double) tahmin1.get(11) - (Double) list2.get(11)), ((Double) tahmin1.get(12) - (Double) list2.get(12)) * ((Double) tahmin1.get(12) - (Double) list2.get(12)), ((Double) tahmin1.get(13) - (Double) list2.get(13)) * ((Double) tahmin1.get(13) - (Double) list2.get(13)), ((Double) tahmin1.get(14) - (Double) list2.get(14)) * ((Double) tahmin1.get(14) - (Double) list2.get(14)), ((Double) tahmin1.get(15) - (Double) list2.get(15)) * ((Double) tahmin1.get(15) - (Double) list2.get(15)), ((Double) tahmin1.get(16) - (Double) list2.get(16)) * ((Double) tahmin1.get(16) - (Double) list2.get(16)), ((Double) tahmin1.get(17) - (Double) list2.get(17)) * ((Double) tahmin1.get(17) - (Double) list2.get(17)), ((Double) tahmin1.get(18) - (Double) list2.get(18)) * ((Double) tahmin1.get(18) - (Double) list2.get(18)), ((Double) tahmin1.get(19) - (Double) list2.get(19)) * ((Double) tahmin1.get(19) - (Double) list2.get(19)), ((Double) tahmin1.get(20) - (Double) list2.get(20)) * ((Double) tahmin1.get(20) - (Double) list2.get(20)), ((Double) tahmin1.get(21) - (Double) list2.get(21)) * ((Double) tahmin1.get(21) - (Double) list2.get(21)), ((Double) tahmin1.get(22) - (Double) list2.get(22)) * ((Double) tahmin1.get(22) - (Double) list2.get(22)), ((Double) tahmin1.get(23) - (Double) list2.get(23)) * ((Double) tahmin1.get(23) - (Double) list2.get(23))

            };
            double[] mse2 = {((ort2[0] + ort2[1] + ort2[2] + ort2[3] + ort2[4] + ort2[5] + ort2[6] + ort2[7] + ort2[8] + ort2[9] + ort2[10] + ort2[11] + ort2[12] + ort2[13] + ort2[14] + ort2[15] + ort2[16] + ort2[17] + ort2[18] + ort2[19] + ort2[20] + ort2[21] + ort2[22] + ort2[23])) / 24};
            message_lbl.setText("For exponential smoothing , MSE:" + mse2[0]);
            //regression
            Arraylist list3 = new Arraylist();
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            double sumDemand = (Double) list3.get(0) + (Double) list3.get(1) + (Double) list3.get(2) + (Double) list3.get(3) + (Double) list3.get(4) + (Double) list3.get(5) + (Double) list3.get(6) + (Double) list3.get(7) + (Double) list3.get(8) + (Double) list3.get(9) + (Double) list3.get(10) + (Double) list3.get(11) + (Double) list3.get(12) + (Double) list3.get(13) + (Double) list3.get(14) + (Double) list3.get(15) + (Double) list3.get(16) + (Double) list3.get(17) + (Double) list3.get(18) + (Double) list3.get(19) + (Double) list3.get(20) + (Double) list3.get(21) + (Double) list3.get(22) + (Double) list3.get(23);
            //  double sum_x = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12+13+14+15+16+17+18+19+20+21+22+23+24);
            double sum_x = 300;
            //double sum_square=1+Math.sqrt(2)+Math.sqrt(3)+Math.sqrt(4)+Math.sqrt(5)+Math.sqrt(6)+Math.sqrt(7)+Math.sqrt(8)+Math.sqrt(9)+Math.sqrt(10)+Math.sqrt(11)+Math.sqrt(12);

            double sum_square = 4900.0;

            Arraylist multiply = new Arraylist();
            multiply.add(list3.get(0));
            multiply.add(2 * (Double) list3.get(1));
            multiply.add(3 * (Double) list3.get(2));
            multiply.add(4 * (Double) list3.get(3));
            multiply.add(5 * (Double) list3.get(4));
            multiply.add(6 * (Double) list3.get(5));
            multiply.add(7 * (Double) list3.get(6));
            multiply.add(8 * (Double) list3.get(7));
            multiply.add(9 * (Double) list3.get(8));
            multiply.add(10 * (Double) list3.get(9));
            multiply.add(11 * (Double) list3.get(10));
            multiply.add(12 * (Double) list3.get(11));
            multiply.add(13 * (Double) list3.get(12));
            multiply.add(14 * (Double) list3.get(13));
            multiply.add(15 * (Double) list3.get(14));
            multiply.add(16 * (Double) list3.get(15));
            multiply.add(17 * (Double) list3.get(16));
            multiply.add(18 * (Double) list3.get(17));
            multiply.add(19 * (Double) list3.get(18));
            multiply.add(20 * (Double) list3.get(19));
            multiply.add(21 * (Double) list3.get(20));
            multiply.add(22 * (Double) list3.get(21));
            multiply.add(23 * (Double) list3.get(22));
            multiply.add(24 * (Double) list3.get(23));

            double multiplySum = (Double) multiply.get(0) + (Double) multiply.get(1) + (Double) multiply.get(2) + (Double) multiply.get(3) + (Double) multiply.get(4) + (Double) multiply.get(5) + (Double) multiply.get(6) + (Double) multiply.get(7) + (Double) multiply.get(8) + (Double) multiply.get(9) + (Double) multiply.get(10)
                    + (Double) multiply.get(11) + (Double) multiply.get(12) + (Double) multiply.get(13) + (Double) multiply.get(14) + (Double) multiply.get(15) + (Double) multiply.get(16) + (Double) multiply.get(17) + (Double) multiply.get(18) + (Double) multiply.get(19) + (Double) multiply.get(20) + (Double) multiply.get(21) + (Double) multiply.get(22) + (Double) multiply.get(23);
            double b_degeri = (24 * multiplySum - (sum_x * sumDemand)) / (24 * sum_square - (sum_x * sum_x));
            double a_degeri = sumDemand / 24 - b_degeri * sum_x / 24;

            Arraylist tahmin3 = new Arraylist();
            tahmin3.add(a_degeri + b_degeri * 1);
            tahmin3.add(a_degeri + b_degeri * 2);
            tahmin3.add(a_degeri + b_degeri * 3);
            tahmin3.add(a_degeri + b_degeri * 4);
            tahmin3.add(a_degeri + b_degeri * 5);
            tahmin3.add(a_degeri + b_degeri * 6);
            tahmin3.add(a_degeri + b_degeri * 7);
            tahmin3.add(a_degeri + b_degeri * 8);
            tahmin3.add(a_degeri + b_degeri * 9);
            tahmin3.add(a_degeri + b_degeri * 10);
            tahmin3.add(a_degeri + b_degeri * 11);
            tahmin3.add(a_degeri + b_degeri * 12);
            tahmin3.add(a_degeri + b_degeri * 13);
            tahmin3.add(a_degeri + b_degeri * 14);
            tahmin3.add(a_degeri + b_degeri * 15);
            tahmin3.add(a_degeri + b_degeri * 16);
            tahmin3.add(a_degeri + b_degeri * 17);
            tahmin3.add(a_degeri + b_degeri * 18);
            tahmin3.add(a_degeri + b_degeri * 19);
            tahmin3.add(a_degeri + b_degeri * 20);
            tahmin3.add(a_degeri + b_degeri * 21);
            tahmin3.add(a_degeri + b_degeri * 22);
            tahmin3.add(a_degeri + b_degeri * 23);
            tahmin3.add(a_degeri + b_degeri * 24);

            Arraylist error3 = new Arraylist();
            error3.add((Double) tahmin3.get(0) - (Double) list3.get(0));
            error3.add((Double) tahmin3.get(1) - (Double) list3.get(1));
            error3.add((Double) tahmin3.get(2) - (Double) list3.get(2));
            error3.add((Double) tahmin3.get(3) - (Double) list3.get(3));
            error3.add((Double) tahmin3.get(4) - (Double) list3.get(4));
            error3.add((Double) tahmin3.get(5) - (Double) list3.get(5));
            error3.add((Double) tahmin3.get(6) - (Double) list3.get(6));
            error3.add((Double) tahmin3.get(7) - (Double) list3.get(7));
            error3.add((Double) tahmin3.get(8) - (Double) list3.get(8));
            error3.add((Double) tahmin3.get(9) - (Double) list3.get(9));
            error3.add((Double) tahmin3.get(10) - (Double) list3.get(10));
            error3.add((Double) tahmin3.get(11) - (Double) list3.get(11));
            error3.add((Double) tahmin3.get(12) - (Double) list3.get(12));

            error3.add((Double) tahmin3.get(13) - (Double) list3.get(13));
            error3.add((Double) tahmin3.get(14) - (Double) list3.get(14));
            error3.add((Double) tahmin3.get(15) - (Double) list3.get(15));
            error3.add((Double) tahmin3.get(16) - (Double) list3.get(16));
            error3.add((Double) tahmin3.get(17) - (Double) list3.get(17));
            error3.add((Double) tahmin3.get(18) - (Double) list3.get(18));
            error3.add((Double) tahmin3.get(19) - (Double) list3.get(19));
            error3.add((Double) tahmin3.get(20) - (Double) list3.get(20));
            error3.add((Double) tahmin3.get(21) - (Double) list3.get(21));
            error3.add((Double) tahmin3.get(22) - (Double) list3.get(22));
            error3.add((Double) tahmin3.get(23) - (Double) list3.get(23));

            double[] ort3 = {((Double) tahmin3.get(0) - (Double) list3.get(0)) * ((Double) tahmin3.get(0) - (Double) list3.get(0)), ((Double) tahmin3.get(1) - (Double) list3.get(1)) * ((Double) tahmin3.get(1) - (Double) list3.get(1)), ((Double) tahmin3.get(2) - (Double) list3.get(2)) * ((Double) tahmin3.get(2) - (Double) list3.get(2)),
                ((Double) tahmin3.get(3) - (Double) list3.get(3)) * ((Double) tahmin3.get(3) - (Double) list3.get(3)), ((Double) tahmin3.get(4) - (Double) list3.get(4)) * ((Double) tahmin3.get(4) - (Double) list3.get(4)), ((Double) tahmin3.get(5) - (Double) list3.get(5)) * ((Double) tahmin3.get(5) - (Double) list3.get(5)),
                ((Double) tahmin3.get(6) - (Double) list3.get(6)) * ((Double) tahmin3.get(6) - (Double) list3.get(6)), ((Double) tahmin3.get(7) - (Double) list3.get(7)) * ((Double) tahmin3.get(7) - (Double) list3.get(7)), ((Double) tahmin3.get(8) - (Double) list3.get(8)) * ((Double) tahmin3.get(8) - (Double) list3.get(8)), ((Double) tahmin3.get(9) - (Double) list3.get(9)) * ((Double) tahmin3.get(9) - (Double) list3.get(9)),
                ((Double) tahmin3.get(10) - (Double) list3.get(10)) * ((Double) tahmin3.get(10) - (Double) list3.get(10)),
                ((Double) tahmin3.get(11) - (Double) list3.get(11)) * ((Double) tahmin3.get(11) - (Double) list3.get(11)),
                ((Double) tahmin3.get(12) - (Double) list3.get(12)) * ((Double) tahmin3.get(12) - (Double) list3.get(12)),
                ((Double) tahmin3.get(13) - (Double) list3.get(13)) * ((Double) tahmin3.get(13) - (Double) list3.get(13)), ((Double) tahmin3.get(14) - (Double) list3.get(14)) * ((Double) tahmin3.get(14) - (Double) list3.get(14)), ((Double) tahmin3.get(15) - (Double) list3.get(15)) * ((Double) tahmin3.get(15) - (Double) list3.get(15)), ((Double) tahmin3.get(16) - (Double) list3.get(16)) * ((Double) tahmin3.get(16) - (Double) list3.get(16)),
                ((Double) tahmin3.get(17) - (Double) list3.get(17)) * ((Double) tahmin3.get(17) - (Double) list3.get(17)), ((Double) tahmin3.get(18) - (Double) list3.get(18)) * ((Double) tahmin3.get(18) - (Double) list3.get(18)), ((Double) tahmin3.get(19) - (Double) list3.get(19)) * ((Double) tahmin3.get(19) - (Double) list3.get(19)), ((Double) tahmin3.get(20) - (Double) list3.get(20)) * ((Double) tahmin3.get(20) - (Double) list3.get(20)),
                ((Double) tahmin3.get(21) - (Double) list3.get(21)) * ((Double) tahmin3.get(21) - (Double) list3.get(21)), ((Double) tahmin3.get(22) - (Double) list3.get(22)) * ((Double) tahmin3.get(22) - (Double) list3.get(22)), ((Double) tahmin3.get(23) - (Double) list3.get(23)) * ((Double) tahmin3.get(23) - (Double) list3.get(23))

            };
            double[] mse3 = {(ort3[0] + ort3[1] + ort3[2] + ort3[3] + ort3[4] + ort3[5] + ort3[6] + ort3[7] + ort3[8] + ort3[9] + ort3[10] + ort3[11] + ort3[12] + ort3[13] + ort3[14] + ort3[15] + ort3[16] + ort3[17] + ort3[18] + ort3[19] + ort3[20] + ort3[21] + ort3[22] + ort3[23]) / 24};

            Arraylist list4 = new Arraylist();
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            double sumDemand4 = (Double) list4.get(0) + (Double) list4.get(1) + (Double) list4.get(2) + (Double) list4.get(3) + (Double) list4.get(4) + (Double) list4.get(5) + (Double) list4.get(6) + (Double) list4.get(7) + (Double) list4.get(8) + (Double) list4.get(9) + (Double) list4.get(10) + (Double) list4.get(11) + (Double) list4.get(12) + (Double) list4.get(13) + (Double) list4.get(14) + (Double) list4.get(15) + (Double) list4.get(16) + (Double) list4.get(17) + (Double) list4.get(18) + (Double) list4.get(19) + (Double) list4.get(20) + (Double) list4.get(21) + (Double) list4.get(22) + (Double) list4.get(23);
            double averageDemand4 = sumDemand4 / 24;
            double[] ortalama = {
                ((Double) list4.get(0) + (Double) list4.get(12)) / 2,
                ((Double) list4.get(1) + (Double) list4.get(13)) / 2,
                ((Double) list4.get(2) + (Double) list4.get(14)) / 2,
                ((Double) list4.get(3) + (Double) list4.get(15)) / 2,
                ((Double) list4.get(4) + (Double) list4.get(16)) / 2,
                ((Double) list4.get(5) + (Double) list4.get(17)) / 2,
                ((Double) list4.get(6) + (Double) list4.get(18)) / 2,
                ((Double) list4.get(7) + (Double) list4.get(19)) / 2,
                ((Double) list4.get(8) + (Double) list4.get(20)) / 2,
                ((Double) list4.get(9) + (Double) list4.get(21)) / 2,
                ((Double) list4.get(10) + (Double) list4.get(22)) / 2,
                ((Double) list4.get(11) + (Double) list4.get(23)) / 2

            };
            double[] seasonalDemandFactor = {
                (Double) ortalama[0] / (Double) averageDemand4,
                (Double) ortalama[1] / (Double) averageDemand4,
                (Double) ortalama[2] / (Double) averageDemand4,
                (Double) ortalama[3] / (Double) averageDemand4,
                (Double) ortalama[4] / (Double) averageDemand4,
                (Double) ortalama[5] / (Double) averageDemand4,
                (Double) ortalama[6] / (Double) averageDemand4,
                (Double) ortalama[7] / (Double) averageDemand4,
                (Double) ortalama[8] / (Double) averageDemand4,
                (Double) ortalama[9] / (Double) averageDemand4,
                (Double) ortalama[10] / (Double) averageDemand4,
                (Double) ortalama[11] / (Double) averageDemand4,};

            double[] deseasonDemand = {
                (Double) list4.get(0) / seasonalDemandFactor[0],
                (Double) list4.get(1) / seasonalDemandFactor[1],
                (Double) list4.get(2) / seasonalDemandFactor[2],
                (Double) list4.get(3) / seasonalDemandFactor[3],
                (Double) list4.get(4) / seasonalDemandFactor[4],
                (Double) list4.get(5) / seasonalDemandFactor[5],
                (Double) list4.get(6) / seasonalDemandFactor[6],
                (Double) list4.get(7) / seasonalDemandFactor[7],
                (Double) list4.get(8) / seasonalDemandFactor[8],
                (Double) list4.get(9) / seasonalDemandFactor[9],
                (Double) list4.get(10) / seasonalDemandFactor[10],
                (Double) list4.get(11) / seasonalDemandFactor[11],
                (Double) list4.get(12) / seasonalDemandFactor[0],
                (Double) list4.get(13) / seasonalDemandFactor[1],
                (Double) list4.get(14) / seasonalDemandFactor[2],
                (Double) list4.get(15) / seasonalDemandFactor[3],
                (Double) list4.get(16) / seasonalDemandFactor[4],
                (Double) list4.get(17) / seasonalDemandFactor[5],
                (Double) list4.get(18) / seasonalDemandFactor[6],
                (Double) list4.get(19) / seasonalDemandFactor[7],
                (Double) list4.get(20) / seasonalDemandFactor[8],
                (Double) list4.get(21) / seasonalDemandFactor[9],
                (Double) list4.get(22) / seasonalDemandFactor[10],
                (Double) list4.get(23) / seasonalDemandFactor[11]

            };

            double[] deseasonSum = {
                (Double) list4.get(0) / seasonalDemandFactor[0]
                + (Double) list4.get(1) / seasonalDemandFactor[1]
                + (Double) list4.get(2) / seasonalDemandFactor[2]
                + (Double) list4.get(3) / seasonalDemandFactor[3]
                + (Double) list4.get(4) / seasonalDemandFactor[4]
                + (Double) list4.get(5) / seasonalDemandFactor[5]
                + (Double) list4.get(6) / seasonalDemandFactor[6]
                + (Double) list4.get(7) / seasonalDemandFactor[7]
                + (Double) list4.get(8) / seasonalDemandFactor[8]
                + (Double) list4.get(9) / seasonalDemandFactor[9]
                + (Double) list4.get(10) / seasonalDemandFactor[10]
                + (Double) list4.get(11) / seasonalDemandFactor[11]
                + (Double) list4.get(12) / seasonalDemandFactor[0]
                + (Double) list4.get(13) / seasonalDemandFactor[1]
                + (Double) list4.get(14) / seasonalDemandFactor[2]
                + (Double) list4.get(15) / seasonalDemandFactor[3]
                + (Double) list4.get(16) / seasonalDemandFactor[4]
                + (Double) list4.get(17) / seasonalDemandFactor[5]
                + (Double) list4.get(18) / seasonalDemandFactor[6]
                + (Double) list4.get(19) / seasonalDemandFactor[7]
                + (Double) list4.get(20) / seasonalDemandFactor[8]
                + (Double) list4.get(21) / seasonalDemandFactor[9]
                + (Double) list4.get(22) / seasonalDemandFactor[10]
                + (Double) list4.get(23) / seasonalDemandFactor[11]
            };
            double sum_x4 = 300;
            double sum_square4 = 4900;

            Arraylist multiply4 = new Arraylist();
            multiply4.add((Double) deseasonDemand[0]);
            multiply4.add(2 * (Double) deseasonDemand[1]);
            multiply4.add(3 * (Double) deseasonDemand[2]);
            multiply4.add(4 * (Double) deseasonDemand[3]);
            multiply4.add(5 * (Double) deseasonDemand[4]);
            multiply4.add(6 * (Double) deseasonDemand[5]);
            multiply4.add(7 * (Double) deseasonDemand[6]);
            multiply4.add(8 * (Double) deseasonDemand[7]);
            multiply4.add(9 * (Double) deseasonDemand[8]);
            multiply4.add(10 * (Double) deseasonDemand[9]);
            multiply4.add(11 * (Double) deseasonDemand[10]);
            multiply4.add(12 * (Double) deseasonDemand[11]);
            multiply4.add(13 * (Double) deseasonDemand[12]);
            multiply4.add(14 * (Double) deseasonDemand[13]);
            multiply4.add(15 * (Double) deseasonDemand[14]);
            multiply4.add(16 * (Double) deseasonDemand[15]);
            multiply4.add(17 * (Double) deseasonDemand[16]);
            multiply4.add(18 * (Double) deseasonDemand[17]);
            multiply4.add(19 * (Double) deseasonDemand[18]);
            multiply4.add(20 * (Double) deseasonDemand[19]);
            multiply4.add(21 * (Double) deseasonDemand[20]);
            multiply4.add(22 * (Double) deseasonDemand[21]);
            multiply4.add(23 * (Double) deseasonDemand[22]);
            multiply4.add(24 * (Double) deseasonDemand[23]);

            double multiplySum4 = (Double) multiply4.get(0) + (Double) multiply4.get(1) + (Double) multiply4.get(2) + (Double) multiply4.get(3) + (Double) multiply4.get(4) + (Double) multiply4.get(5) + (Double) multiply4.get(6) + (Double) multiply4.get(7) + (Double) multiply4.get(8) + (Double) multiply4.get(9) + (Double) multiply4.get(10)
                    + (Double) multiply4.get(11) + (Double) multiply4.get(12) + (Double) multiply4.get(13) + (Double) multiply4.get(14) + (Double) multiply4.get(15) + (Double) multiply4.get(16) + (Double) multiply4.get(17) + (Double) multiply4.get(18) + (Double) multiply4.get(19) + (Double) multiply4.get(20) + (Double) multiply4.get(21) + (Double) multiply4.get(22) + (Double) multiply4.get(23);
            double b_degeri4 = ((24 * multiplySum4) - (deseasonSum[0] * 300)) / ((24 * sum_square4) - (300 * 300));
            double a_degeri4 = (averageDemand4 - (b_degeri4 * (300 / 24)));

            Arraylist tahmin4 = new Arraylist();
            tahmin4.add(a_degeri4 + (b_degeri4 * 25));
            tahmin4.add(a_degeri4 + (b_degeri4 * 26));
            tahmin4.add(a_degeri4 + (b_degeri4 * 27));
            tahmin4.add(a_degeri4 + (b_degeri4 * 28));
            tahmin4.add(a_degeri4 + (b_degeri4 * 29));
            tahmin4.add(a_degeri4 + (b_degeri4 * 30));
            tahmin4.add(a_degeri4 + (b_degeri4 * 31));
            tahmin4.add(a_degeri4 + (b_degeri4 * 32));
            tahmin4.add(a_degeri4 + (b_degeri4 * 33));
            tahmin4.add(a_degeri4 + (b_degeri4 * 34));
            tahmin4.add(a_degeri4 + (b_degeri4 * 35));
            tahmin4.add(a_degeri4 + (b_degeri4 * 36));

            Object[] seasonForecast = {seasonalDemandFactor[0] * (Double) tahmin4.get(0),
                seasonalDemandFactor[1] * (Double) tahmin4.get(1),
                seasonalDemandFactor[2] * (Double) tahmin4.get(2),
                seasonalDemandFactor[3] * (Double) tahmin4.get(3),
                seasonalDemandFactor[4] * (Double) tahmin4.get(4),
                seasonalDemandFactor[5] * (Double) tahmin4.get(5),
                seasonalDemandFactor[6] * (Double) tahmin4.get(6),
                seasonalDemandFactor[7] * (Double) tahmin4.get(7),
                seasonalDemandFactor[8] * (Double) tahmin4.get(8),
                seasonalDemandFactor[9] * (Double) tahmin4.get(9),
                seasonalDemandFactor[10] * (Double) tahmin4.get(10),
                seasonalDemandFactor[11] * (Double) tahmin4.get(11)
            };

            //  listModel.addElement(seasonForecast[0]);
            jList1.setModel(listModel);

            //genel analysis
            if (mse1[0] < mse2[0]) {
                if (mse1[0] < mse3[0]) {
                    message_lbl.setText("Exponential smoothing using");
                } else {
                    message_lbl.setText("Regression analysis using");
                }
            } else {
                if (mse2[0] < mse3[0]) {
                    message_lbl.setText("Double exponential smoothing using");
                } else {
                    message_lbl.setText("Regression analysis using");
                }
            }

        }
    }//GEN-LAST:event_utilize_bttnActionPerformed

    private void maxReg_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxReg_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list3 = new Arraylist();
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            double sumDemand = (Double) list3.get(0) + (Double) list3.get(1) + (Double) list3.get(2) + (Double) list3.get(3) + (Double) list3.get(4) + (Double) list3.get(5) + (Double) list3.get(6) + (Double) list3.get(7) + (Double) list3.get(8) + (Double) list3.get(9) + (Double) list3.get(10) + (Double) list3.get(11) + (Double) list3.get(12) + (Double) list3.get(13) + (Double) list3.get(14) + (Double) list3.get(15) + (Double) list3.get(16) + (Double) list3.get(17) + (Double) list3.get(18) + (Double) list3.get(19) + (Double) list3.get(20) + (Double) list3.get(21) + (Double) list3.get(22) + (Double) list3.get(23);
            //  double sum_x = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12+13+14+15+16+17+18+19+20+21+22+23+24);
            double sum_x = 300;
            //double sum_square=1+Math.sqrt(2)+Math.sqrt(3)+Math.sqrt(4)+Math.sqrt(5)+Math.sqrt(6)+Math.sqrt(7)+Math.sqrt(8)+Math.sqrt(9)+Math.sqrt(10)+Math.sqrt(11)+Math.sqrt(12);

            double sum_square = 4900.0;

            Arraylist multiply = new Arraylist();
            multiply.add(list3.get(0));
            multiply.add(2 * (Double) list3.get(1));
            multiply.add(3 * (Double) list3.get(2));
            multiply.add(4 * (Double) list3.get(3));
            multiply.add(5 * (Double) list3.get(4));
            multiply.add(6 * (Double) list3.get(5));
            multiply.add(7 * (Double) list3.get(6));
            multiply.add(8 * (Double) list3.get(7));
            multiply.add(9 * (Double) list3.get(8));
            multiply.add(10 * (Double) list3.get(9));
            multiply.add(11 * (Double) list3.get(10));
            multiply.add(12 * (Double) list3.get(11));
            multiply.add(13 * (Double) list3.get(12));
            multiply.add(14 * (Double) list3.get(13));
            multiply.add(15 * (Double) list3.get(14));
            multiply.add(16 * (Double) list3.get(15));
            multiply.add(17 * (Double) list3.get(16));
            multiply.add(18 * (Double) list3.get(17));
            multiply.add(19 * (Double) list3.get(18));
            multiply.add(20 * (Double) list3.get(19));
            multiply.add(21 * (Double) list3.get(20));
            multiply.add(22 * (Double) list3.get(21));
            multiply.add(23 * (Double) list3.get(22));
            multiply.add(24 * (Double) list3.get(23));

            double multiplySum = (Double) multiply.get(0) + (Double) multiply.get(1) + (Double) multiply.get(2) + (Double) multiply.get(3) + (Double) multiply.get(4) + (Double) multiply.get(5) + (Double) multiply.get(6) + (Double) multiply.get(7) + (Double) multiply.get(8) + (Double) multiply.get(9) + (Double) multiply.get(10)
                    + (Double) multiply.get(11) + (Double) multiply.get(12) + (Double) multiply.get(13) + (Double) multiply.get(14) + (Double) multiply.get(15) + (Double) multiply.get(16) + (Double) multiply.get(17) + (Double) multiply.get(18) + (Double) multiply.get(19) + (Double) multiply.get(20) + (Double) multiply.get(21) + (Double) multiply.get(22) + (Double) multiply.get(23);
            double b_degeri = (24 * multiplySum - (sum_x * sumDemand)) / (24 * sum_square - (sum_x * sum_x));
            double a_degeri = sumDemand / 24 - b_degeri * sum_x / 24;

            Arraylist tahmin3 = new Arraylist();
            tahmin3.add(a_degeri + b_degeri * 1);
            tahmin3.add(a_degeri + b_degeri * 2);
            tahmin3.add(a_degeri + b_degeri * 3);
            tahmin3.add(a_degeri + b_degeri * 4);
            tahmin3.add(a_degeri + b_degeri * 5);
            tahmin3.add(a_degeri + b_degeri * 6);
            tahmin3.add(a_degeri + b_degeri * 7);
            tahmin3.add(a_degeri + b_degeri * 8);
            tahmin3.add(a_degeri + b_degeri * 9);
            tahmin3.add(a_degeri + b_degeri * 10);
            tahmin3.add(a_degeri + b_degeri * 11);
            tahmin3.add(a_degeri + b_degeri * 12);
            tahmin3.add(a_degeri + b_degeri * 13);
            tahmin3.add(a_degeri + b_degeri * 14);
            tahmin3.add(a_degeri + b_degeri * 15);
            tahmin3.add(a_degeri + b_degeri * 16);
            tahmin3.add(a_degeri + b_degeri * 17);
            tahmin3.add(a_degeri + b_degeri * 18);
            tahmin3.add(a_degeri + b_degeri * 19);
            tahmin3.add(a_degeri + b_degeri * 20);
            tahmin3.add(a_degeri + b_degeri * 21);
            tahmin3.add(a_degeri + b_degeri * 22);
            tahmin3.add(a_degeri + b_degeri * 23);
            tahmin3.add(a_degeri + b_degeri * 24);

            Object[] max3 = {(Double) tahmin3.get(0), (Double) tahmin3.get(1), (Double) tahmin3.get(2), (Double) tahmin3.get(3), (Double) tahmin3.get(4), (Double) tahmin3.get(5), (Double) tahmin3.get(6), tahmin3.get(7), (Double) tahmin3.get(8), (Double) tahmin3.get(9), (Double) tahmin3.get(10), (Double) tahmin3.get(11), (Double) tahmin3.get(12), (Double) tahmin3.get(13), (Double) tahmin3.get(14), (Double) tahmin3.get(15), (Double) tahmin3.get(16), (Double) tahmin3.get(17), (Double) tahmin3.get(18), (Double) tahmin3.get(19), (Double) tahmin3.get(20), (Double) tahmin3.get(21), (Double) tahmin3.get(22), (Double) tahmin3.get(23)};

            int j, P, Tmp;
            for (P = 1; P < 12; P++) {
                double Tmp2 = (Double) max3[P];
                for (j = P; j > 0 && (Double) max3[j - 1] > Tmp2; j--) {
                    max3[j] = max3[j - 1]; //Shift A[j-1] to right
                }
                max3[j] = Tmp2;
            }

            message_lbl.setText("Max forecasted demand is: " + max3[23]);

        }
    }//GEN-LAST:event_maxReg_bttnActionPerformed

    private void minReg_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minReg_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list3 = new Arraylist();
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            double sumDemand = (Double) list3.get(0) + (Double) list3.get(1) + (Double) list3.get(2) + (Double) list3.get(3) + (Double) list3.get(4) + (Double) list3.get(5) + (Double) list3.get(6) + (Double) list3.get(7) + (Double) list3.get(8) + (Double) list3.get(9) + (Double) list3.get(10) + (Double) list3.get(11) + (Double) list3.get(12) + (Double) list3.get(13) + (Double) list3.get(14) + (Double) list3.get(15) + (Double) list3.get(16) + (Double) list3.get(17) + (Double) list3.get(18) + (Double) list3.get(19) + (Double) list3.get(20) + (Double) list3.get(21) + (Double) list3.get(22) + (Double) list3.get(23);
            //  double sum_x = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12+13+14+15+16+17+18+19+20+21+22+23+24);
            double sum_x = 300;
            //double sum_square=1+Math.sqrt(2)+Math.sqrt(3)+Math.sqrt(4)+Math.sqrt(5)+Math.sqrt(6)+Math.sqrt(7)+Math.sqrt(8)+Math.sqrt(9)+Math.sqrt(10)+Math.sqrt(11)+Math.sqrt(12);

            double sum_square = 4900.0;

            Arraylist multiply = new Arraylist();
            multiply.add(list3.get(0));
            multiply.add(2 * (Double) list3.get(1));
            multiply.add(3 * (Double) list3.get(2));
            multiply.add(4 * (Double) list3.get(3));
            multiply.add(5 * (Double) list3.get(4));
            multiply.add(6 * (Double) list3.get(5));
            multiply.add(7 * (Double) list3.get(6));
            multiply.add(8 * (Double) list3.get(7));
            multiply.add(9 * (Double) list3.get(8));
            multiply.add(10 * (Double) list3.get(9));
            multiply.add(11 * (Double) list3.get(10));
            multiply.add(12 * (Double) list3.get(11));
            multiply.add(13 * (Double) list3.get(12));
            multiply.add(14 * (Double) list3.get(13));
            multiply.add(15 * (Double) list3.get(14));
            multiply.add(16 * (Double) list3.get(15));
            multiply.add(17 * (Double) list3.get(16));
            multiply.add(18 * (Double) list3.get(17));
            multiply.add(19 * (Double) list3.get(18));
            multiply.add(20 * (Double) list3.get(19));
            multiply.add(21 * (Double) list3.get(20));
            multiply.add(22 * (Double) list3.get(21));
            multiply.add(23 * (Double) list3.get(22));
            multiply.add(24 * (Double) list3.get(23));

            double multiplySum = (Double) multiply.get(0) + (Double) multiply.get(1) + (Double) multiply.get(2) + (Double) multiply.get(3) + (Double) multiply.get(4) + (Double) multiply.get(5) + (Double) multiply.get(6) + (Double) multiply.get(7) + (Double) multiply.get(8) + (Double) multiply.get(9) + (Double) multiply.get(10)
                    + (Double) multiply.get(11) + (Double) multiply.get(12) + (Double) multiply.get(13) + (Double) multiply.get(14) + (Double) multiply.get(15) + (Double) multiply.get(16) + (Double) multiply.get(17) + (Double) multiply.get(18) + (Double) multiply.get(19) + (Double) multiply.get(20) + (Double) multiply.get(21) + (Double) multiply.get(22) + (Double) multiply.get(23);
            double b_degeri = (24 * multiplySum - (sum_x * sumDemand)) / (24 * sum_square - (sum_x * sum_x));
            double a_degeri = sumDemand / 24 - b_degeri * sum_x / 24;

            Arraylist tahmin3 = new Arraylist();
            tahmin3.add(a_degeri + b_degeri * 1);
            tahmin3.add(a_degeri + b_degeri * 2);
            tahmin3.add(a_degeri + b_degeri * 3);
            tahmin3.add(a_degeri + b_degeri * 4);
            tahmin3.add(a_degeri + b_degeri * 5);
            tahmin3.add(a_degeri + b_degeri * 6);
            tahmin3.add(a_degeri + b_degeri * 7);
            tahmin3.add(a_degeri + b_degeri * 8);
            tahmin3.add(a_degeri + b_degeri * 9);
            tahmin3.add(a_degeri + b_degeri * 10);
            tahmin3.add(a_degeri + b_degeri * 11);
            tahmin3.add(a_degeri + b_degeri * 12);
            tahmin3.add(a_degeri + b_degeri * 13);
            tahmin3.add(a_degeri + b_degeri * 14);
            tahmin3.add(a_degeri + b_degeri * 15);
            tahmin3.add(a_degeri + b_degeri * 16);
            tahmin3.add(a_degeri + b_degeri * 17);
            tahmin3.add(a_degeri + b_degeri * 18);
            tahmin3.add(a_degeri + b_degeri * 19);
            tahmin3.add(a_degeri + b_degeri * 20);
            tahmin3.add(a_degeri + b_degeri * 21);
            tahmin3.add(a_degeri + b_degeri * 22);
            tahmin3.add(a_degeri + b_degeri * 23);
            tahmin3.add(a_degeri + b_degeri * 24);

            Object[] max3 = {(Double) tahmin3.get(0), (Double) tahmin3.get(1), (Double) tahmin3.get(2), (Double) tahmin3.get(3), (Double) tahmin3.get(4), (Double) tahmin3.get(5), (Double) tahmin3.get(6), tahmin3.get(7), (Double) tahmin3.get(8), (Double) tahmin3.get(9), (Double) tahmin3.get(10), (Double) tahmin3.get(11), (Double) tahmin3.get(12), (Double) tahmin3.get(13), (Double) tahmin3.get(14), (Double) tahmin3.get(15), (Double) tahmin3.get(16), (Double) tahmin3.get(17), (Double) tahmin3.get(18), (Double) tahmin3.get(19), (Double) tahmin3.get(20), (Double) tahmin3.get(21), (Double) tahmin3.get(22), (Double) tahmin3.get(23)};

            int j, P, Tmp;
            for (P = 1; P < 12; P++) {
                double Tmp2 = (Double) max3[P];
                for (j = P; j > 0 && (Double) max3[j - 1] > Tmp2; j--) {
                    max3[j] = max3[j - 1]; //Shift A[j-1] to right
                }
                max3[j] = Tmp2;
            }

            message_lbl.setText("Min forecasted demand is: " + max3[0]);
        }
    }//GEN-LAST:event_minReg_bttnActionPerformed

    private void sortReg_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortReg_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list3 = new Arraylist();
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            double sumDemand = (Double) list3.get(0) + (Double) list3.get(1) + (Double) list3.get(2) + (Double) list3.get(3) + (Double) list3.get(4) + (Double) list3.get(5) + (Double) list3.get(6) + (Double) list3.get(7) + (Double) list3.get(8) + (Double) list3.get(9) + (Double) list3.get(10) + (Double) list3.get(11) + (Double) list3.get(12) + (Double) list3.get(13) + (Double) list3.get(14) + (Double) list3.get(15) + (Double) list3.get(16) + (Double) list3.get(17) + (Double) list3.get(18) + (Double) list3.get(19) + (Double) list3.get(20) + (Double) list3.get(21) + (Double) list3.get(22) + (Double) list3.get(23);
            //  double sum_x = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12+13+14+15+16+17+18+19+20+21+22+23+24);
            double sum_x = 300;
            //double sum_square=1+Math.sqrt(2)+Math.sqrt(3)+Math.sqrt(4)+Math.sqrt(5)+Math.sqrt(6)+Math.sqrt(7)+Math.sqrt(8)+Math.sqrt(9)+Math.sqrt(10)+Math.sqrt(11)+Math.sqrt(12);

            double sum_square = 4900.0;

            Arraylist multiply = new Arraylist();
            multiply.add(list3.get(0));
            multiply.add(2 * (Double) list3.get(1));
            multiply.add(3 * (Double) list3.get(2));
            multiply.add(4 * (Double) list3.get(3));
            multiply.add(5 * (Double) list3.get(4));
            multiply.add(6 * (Double) list3.get(5));
            multiply.add(7 * (Double) list3.get(6));
            multiply.add(8 * (Double) list3.get(7));
            multiply.add(9 * (Double) list3.get(8));
            multiply.add(10 * (Double) list3.get(9));
            multiply.add(11 * (Double) list3.get(10));
            multiply.add(12 * (Double) list3.get(11));
            multiply.add(13 * (Double) list3.get(12));
            multiply.add(14 * (Double) list3.get(13));
            multiply.add(15 * (Double) list3.get(14));
            multiply.add(16 * (Double) list3.get(15));
            multiply.add(17 * (Double) list3.get(16));
            multiply.add(18 * (Double) list3.get(17));
            multiply.add(19 * (Double) list3.get(18));
            multiply.add(20 * (Double) list3.get(19));
            multiply.add(21 * (Double) list3.get(20));
            multiply.add(22 * (Double) list3.get(21));
            multiply.add(23 * (Double) list3.get(22));
            multiply.add(24 * (Double) list3.get(23));

            double multiplySum = (Double) multiply.get(0) + (Double) multiply.get(1) + (Double) multiply.get(2) + (Double) multiply.get(3) + (Double) multiply.get(4) + (Double) multiply.get(5) + (Double) multiply.get(6) + (Double) multiply.get(7) + (Double) multiply.get(8) + (Double) multiply.get(9) + (Double) multiply.get(10)
                    + (Double) multiply.get(11) + (Double) multiply.get(12) + (Double) multiply.get(13) + (Double) multiply.get(14) + (Double) multiply.get(15) + (Double) multiply.get(16) + (Double) multiply.get(17) + (Double) multiply.get(18) + (Double) multiply.get(19) + (Double) multiply.get(20) + (Double) multiply.get(21) + (Double) multiply.get(22) + (Double) multiply.get(23);
            double b_degeri = (24 * multiplySum - (sum_x * sumDemand)) / (24 * sum_square - (sum_x * sum_x));
            double a_degeri = sumDemand / 24 - b_degeri * sum_x / 24;

            Arraylist tahmin3 = new Arraylist();
            tahmin3.add(a_degeri + b_degeri * 1);
            tahmin3.add(a_degeri + b_degeri * 2);
            tahmin3.add(a_degeri + b_degeri * 3);
            tahmin3.add(a_degeri + b_degeri * 4);
            tahmin3.add(a_degeri + b_degeri * 5);
            tahmin3.add(a_degeri + b_degeri * 6);
            tahmin3.add(a_degeri + b_degeri * 7);
            tahmin3.add(a_degeri + b_degeri * 8);
            tahmin3.add(a_degeri + b_degeri * 9);
            tahmin3.add(a_degeri + b_degeri * 10);
            tahmin3.add(a_degeri + b_degeri * 11);
            tahmin3.add(a_degeri + b_degeri * 12);
            tahmin3.add(a_degeri + b_degeri * 13);
            tahmin3.add(a_degeri + b_degeri * 14);
            tahmin3.add(a_degeri + b_degeri * 15);
            tahmin3.add(a_degeri + b_degeri * 16);
            tahmin3.add(a_degeri + b_degeri * 17);
            tahmin3.add(a_degeri + b_degeri * 18);
            tahmin3.add(a_degeri + b_degeri * 19);
            tahmin3.add(a_degeri + b_degeri * 20);
            tahmin3.add(a_degeri + b_degeri * 21);
            tahmin3.add(a_degeri + b_degeri * 22);
            tahmin3.add(a_degeri + b_degeri * 23);
            tahmin3.add(a_degeri + b_degeri * 24);

            Object[] max3 = {(Double) tahmin3.get(0), (Double) tahmin3.get(1), (Double) tahmin3.get(2), (Double) tahmin3.get(3), (Double) tahmin3.get(4), (Double) tahmin3.get(5), (Double) tahmin3.get(6), tahmin3.get(7), (Double) tahmin3.get(8), (Double) tahmin3.get(9), (Double) tahmin3.get(10), (Double) tahmin3.get(11), (Double) tahmin3.get(12), (Double) tahmin3.get(13), (Double) tahmin3.get(14), (Double) tahmin3.get(15), (Double) tahmin3.get(16), (Double) tahmin3.get(17), (Double) tahmin3.get(18), (Double) tahmin3.get(19), (Double) tahmin3.get(20), (Double) tahmin3.get(21), (Double) tahmin3.get(22), (Double) tahmin3.get(23)};

            int j, P, Tmp;
            for (P = 1; P < 12; P++) {
                double Tmp2 = (Double) max3[P];
                for (j = P; j > 0 && (Double) max3[j - 1] > Tmp2; j--) {
                    max3[j] = max3[j - 1]; //Shift A[j-1] to right
                }
                max3[j] = Tmp2;
            }

            int uzunluk = max3.length;
            Object[] tersdizi = new Object[uzunluk];
            for (int i = 0; i < uzunluk; i++) {
                tersdizi[uzunluk - i - 1] = max3[i];
            }
            for (int i = 0; i < uzunluk; i++) {
                listModel.addElement(tersdizi[i]);
            }

            jList1.setModel(listModel);

        }
    }//GEN-LAST:event_sortReg_bttnActionPerformed

    private void expMax_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expMax_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list = new Arraylist();

            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            tahmin1.add(list.get(0));
            tahmin1.add((Double) list.get(0) * a + (Double) tahmin1.get(0) * (1 - a));
            tahmin1.add((Double) list.get(1) * a + (Double) tahmin1.get(1) * (1 - a));
            tahmin1.add((Double) list.get(2) * a + (Double) tahmin1.get(2) * (1 - a));
            tahmin1.add((Double) list.get(3) * a + (Double) tahmin1.get(3) * (1 - a));
            tahmin1.add((Double) list.get(4) * a + (Double) tahmin1.get(4) * (1 - a));
            tahmin1.add((Double) list.get(5) * a + (Double) tahmin1.get(5) * (1 - a));
            tahmin1.add((Double) list.get(6) * a + (Double) tahmin1.get(6) * (1 - a));
            tahmin1.add((Double) list.get(7) * a + (Double) tahmin1.get(7) * (1 - a));
            tahmin1.add((Double) list.get(8) * a + (Double) tahmin1.get(8) * (1 - a));
            tahmin1.add((Double) list.get(9) * a + (Double) tahmin1.get(9) * (1 - a));
            tahmin1.add((Double) list.get(10) * a + (Double) tahmin1.get(10) * (1 - a));
            tahmin1.add(a * (Double) list.get(11) + (Double) tahmin1.get(11) * (1 - a));

            tahmin1.add((Double) list.get(12) * a + (Double) tahmin1.get(12) * (1 - a));
            tahmin1.add((Double) list.get(13) * a + (Double) tahmin1.get(13) * (1 - a));
            tahmin1.add((Double) list.get(14) * a + (Double) tahmin1.get(14) * (1 - a));
            tahmin1.add((Double) list.get(15) * a + (Double) tahmin1.get(15) * (1 - a));
            tahmin1.add((Double) list.get(16) * a + (Double) tahmin1.get(16) * (1 - a));
            tahmin1.add((Double) list.get(17) * a + (Double) tahmin1.get(17) * (1 - a));
            tahmin1.add((Double) list.get(18) * a + (Double) tahmin1.get(18) * (1 - a));
            tahmin1.add((Double) list.get(19) * a + (Double) tahmin1.get(19) * (1 - a));
            tahmin1.add((Double) list.get(20) * a + (Double) tahmin1.get(20) * (1 - a));
            tahmin1.add((Double) list.get(21) * a + (Double) tahmin1.get(21) * (1 - a));
            tahmin1.add((Double) list.get(22) * a + (Double) tahmin1.get(22) * (1 - a));
            tahmin1.add((Double) list.get(23) * a + (Double) tahmin1.get(23) * (1 - a));

            Object[] max2 = {(Double) tahmin1.get(0), (Double) tahmin1.get(1), (Double) tahmin1.get(2), (Double) tahmin1.get(3), (Double) tahmin1.get(4), (Double) tahmin1.get(5), (Double) tahmin1.get(6), tahmin1.get(7), (Double) tahmin1.get(8), (Double) tahmin1.get(9), (Double) tahmin1.get(10), (Double) tahmin1.get(11), (Double) tahmin1.get(12), (Double) tahmin1.get(13), (Double) tahmin1.get(14), (Double) tahmin1.get(15), (Double) tahmin1.get(16), (Double) tahmin1.get(17), (Double) tahmin1.get(18), (Double) tahmin1.get(19), (Double) tahmin1.get(20), (Double) tahmin1.get(21), (Double) tahmin1.get(22), (Double) tahmin1.get(23)};

            int j, P, Tmp;
            for (P = 1; P < 12; P++) {
                double Tmp2 = (Double) max2[P];
                for (j = P; j > 0 && (Double) max2[j - 1] > Tmp2; j--) {
                    max2[j] = max2[j - 1]; //Shift A[j-1] to right
                }
                max2[j] = Tmp2;
            }
            message_lbl.setText("For exponential smoothing max forecasted demand is: " + max2[23]);
        }
    }//GEN-LAST:event_expMax_bttnActionPerformed

    private void expMin_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expMin_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list = new Arraylist();

            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            tahmin1.add(list.get(0));
            tahmin1.add((Double) list.get(0) * a + (Double) tahmin1.get(0) * (1 - a));
            tahmin1.add((Double) list.get(1) * a + (Double) tahmin1.get(1) * (1 - a));
            tahmin1.add((Double) list.get(2) * a + (Double) tahmin1.get(2) * (1 - a));
            tahmin1.add((Double) list.get(3) * a + (Double) tahmin1.get(3) * (1 - a));
            tahmin1.add((Double) list.get(4) * a + (Double) tahmin1.get(4) * (1 - a));
            tahmin1.add((Double) list.get(5) * a + (Double) tahmin1.get(5) * (1 - a));
            tahmin1.add((Double) list.get(6) * a + (Double) tahmin1.get(6) * (1 - a));
            tahmin1.add((Double) list.get(7) * a + (Double) tahmin1.get(7) * (1 - a));
            tahmin1.add((Double) list.get(8) * a + (Double) tahmin1.get(8) * (1 - a));
            tahmin1.add((Double) list.get(9) * a + (Double) tahmin1.get(9) * (1 - a));
            tahmin1.add((Double) list.get(10) * a + (Double) tahmin1.get(10) * (1 - a));
            tahmin1.add(a * (Double) list.get(11) + (Double) tahmin1.get(11) * (1 - a));

            tahmin1.add((Double) list.get(12) * a + (Double) tahmin1.get(12) * (1 - a));
            tahmin1.add((Double) list.get(13) * a + (Double) tahmin1.get(13) * (1 - a));
            tahmin1.add((Double) list.get(14) * a + (Double) tahmin1.get(14) * (1 - a));
            tahmin1.add((Double) list.get(15) * a + (Double) tahmin1.get(15) * (1 - a));
            tahmin1.add((Double) list.get(16) * a + (Double) tahmin1.get(16) * (1 - a));
            tahmin1.add((Double) list.get(17) * a + (Double) tahmin1.get(17) * (1 - a));
            tahmin1.add((Double) list.get(18) * a + (Double) tahmin1.get(18) * (1 - a));
            tahmin1.add((Double) list.get(19) * a + (Double) tahmin1.get(19) * (1 - a));
            tahmin1.add((Double) list.get(20) * a + (Double) tahmin1.get(20) * (1 - a));
            tahmin1.add((Double) list.get(21) * a + (Double) tahmin1.get(21) * (1 - a));
            tahmin1.add((Double) list.get(22) * a + (Double) tahmin1.get(22) * (1 - a));
            tahmin1.add((Double) list.get(23) * a + (Double) tahmin1.get(23) * (1 - a));

            Object[] max2 = {(Double) tahmin1.get(0), (Double) tahmin1.get(1), (Double) tahmin1.get(2), (Double) tahmin1.get(3), (Double) tahmin1.get(4), (Double) tahmin1.get(5), (Double) tahmin1.get(6), tahmin1.get(7), (Double) tahmin1.get(8), (Double) tahmin1.get(9), (Double) tahmin1.get(10), (Double) tahmin1.get(11), (Double) tahmin1.get(12), (Double) tahmin1.get(13), (Double) tahmin1.get(14), (Double) tahmin1.get(15), (Double) tahmin1.get(16), (Double) tahmin1.get(17), (Double) tahmin1.get(18), (Double) tahmin1.get(19), (Double) tahmin1.get(20), (Double) tahmin1.get(21), (Double) tahmin1.get(22), (Double) tahmin1.get(23)};

            int j, P, Tmp;
            for (P = 1; P < 12; P++) {
                double Tmp2 = (Double) max2[P];
                for (j = P; j > 0 && (Double) max2[j - 1] > Tmp2; j--) {
                    max2[j] = max2[j - 1]; //Shift A[j-1] to right
                }
                max2[j] = Tmp2;
            }
            message_lbl.setText("For exponential smoothing min forecasted demand is: " + max2[0]);
        }
    }//GEN-LAST:event_expMin_bttnActionPerformed

    private void expSort_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expSort_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list = new Arraylist();

            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            tahmin1.add(list.get(0));
            tahmin1.add((Double) list.get(0) * a + (Double) tahmin1.get(0) * (1 - a));
            tahmin1.add((Double) list.get(1) * a + (Double) tahmin1.get(1) * (1 - a));
            tahmin1.add((Double) list.get(2) * a + (Double) tahmin1.get(2) * (1 - a));
            tahmin1.add((Double) list.get(3) * a + (Double) tahmin1.get(3) * (1 - a));
            tahmin1.add((Double) list.get(4) * a + (Double) tahmin1.get(4) * (1 - a));
            tahmin1.add((Double) list.get(5) * a + (Double) tahmin1.get(5) * (1 - a));
            tahmin1.add((Double) list.get(6) * a + (Double) tahmin1.get(6) * (1 - a));
            tahmin1.add((Double) list.get(7) * a + (Double) tahmin1.get(7) * (1 - a));
            tahmin1.add((Double) list.get(8) * a + (Double) tahmin1.get(8) * (1 - a));
            tahmin1.add((Double) list.get(9) * a + (Double) tahmin1.get(9) * (1 - a));
            tahmin1.add((Double) list.get(10) * a + (Double) tahmin1.get(10) * (1 - a));
            tahmin1.add(a * (Double) list.get(11) + (Double) tahmin1.get(11) * (1 - a));

            tahmin1.add((Double) list.get(12) * a + (Double) tahmin1.get(12) * (1 - a));
            tahmin1.add((Double) list.get(13) * a + (Double) tahmin1.get(13) * (1 - a));
            tahmin1.add((Double) list.get(14) * a + (Double) tahmin1.get(14) * (1 - a));
            tahmin1.add((Double) list.get(15) * a + (Double) tahmin1.get(15) * (1 - a));
            tahmin1.add((Double) list.get(16) * a + (Double) tahmin1.get(16) * (1 - a));
            tahmin1.add((Double) list.get(17) * a + (Double) tahmin1.get(17) * (1 - a));
            tahmin1.add((Double) list.get(18) * a + (Double) tahmin1.get(18) * (1 - a));
            tahmin1.add((Double) list.get(19) * a + (Double) tahmin1.get(19) * (1 - a));
            tahmin1.add((Double) list.get(20) * a + (Double) tahmin1.get(20) * (1 - a));
            tahmin1.add((Double) list.get(21) * a + (Double) tahmin1.get(21) * (1 - a));
            tahmin1.add((Double) list.get(22) * a + (Double) tahmin1.get(22) * (1 - a));
            tahmin1.add((Double) list.get(23) * a + (Double) tahmin1.get(23) * (1 - a));

            Object[] max2 = {(Double) tahmin1.get(0), (Double) tahmin1.get(1), (Double) tahmin1.get(2), (Double) tahmin1.get(3), (Double) tahmin1.get(4), (Double) tahmin1.get(5), (Double) tahmin1.get(6), tahmin1.get(7), (Double) tahmin1.get(8), (Double) tahmin1.get(9), (Double) tahmin1.get(10), (Double) tahmin1.get(11), (Double) tahmin1.get(12), (Double) tahmin1.get(13), (Double) tahmin1.get(14), (Double) tahmin1.get(15), (Double) tahmin1.get(16), (Double) tahmin1.get(17), (Double) tahmin1.get(18), (Double) tahmin1.get(19), (Double) tahmin1.get(20), (Double) tahmin1.get(21), (Double) tahmin1.get(22), (Double) tahmin1.get(23)};

            int j, P, Tmp;
            for (P = 1; P < 12; P++) {
                double Tmp2 = (Double) max2[P];
                for (j = P; j > 0 && (Double) max2[j - 1] > Tmp2; j--) {
                    max2[j] = max2[j - 1]; //Shift A[j-1] to right
                }
                max2[j] = Tmp2;
            }
            int uzunluk = max2.length;
            Object[] tersdizi = new Object[uzunluk];
            for (int i = 0; i < uzunluk; i++) {
                tersdizi[uzunluk - i - 1] = max2[i];
            }
            for (int i = 0; i < uzunluk; i++) {
                listModel.addElement(tersdizi[i]);
            }

            jList1.setModel(listModel);
        }
    }//GEN-LAST:event_expSort_bttnActionPerformed

    private void dexpMax_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexpMax_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {

            Arraylist list2 = new Arraylist();
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            Arraylist tahmin2 = new Arraylist();
            Arraylist s = new Arraylist();
            Arraylist g = new Arraylist();
            Arraylist doubleExponentialSmoothingForecast = new Arraylist();
            double x = 200.0;
            double y = 50.0;

            s.add((Double) list2.get(0) * a + (1 - a) * (x + y));
            g.add(a * ((Double) s.get(0) - x) + 0.8 * y);
            s.add(a * (Double) list2.get(1) + (1 - a) * ((Double) s.get(0) + (Double) g.get(0)));
            g.add(a * ((Double) s.get(1) - (Double) s.get(0)) + (1 - a) * (Double) g.get(0));
            s.add(a * (Double) list2.get(2) + (1 - a) * ((Double) s.get(1) + (Double) g.get(1)));
            g.add(a * ((Double) s.get(2) - (Double) s.get(1)) + (1 - a) * (Double) g.get(1));
            s.add(a * (Double) list2.get(3) + (1 - a) * ((Double) s.get(2) + (Double) g.get(2)));
            g.add(a * ((Double) s.get(3) - (Double) s.get(2)) + (1 - a) * (Double) g.get(2));
            s.add(a * (Double) list2.get(4) + (1 - a) * ((Double) s.get(3) + (Double) g.get(3)));
            g.add(a * ((Double) s.get(4) - (Double) s.get(3)) + (1 - a) * (Double) g.get(3));
            s.add(a * (Double) list2.get(5) + (1 - a) * ((Double) s.get(4) + (Double) g.get(4)));
            g.add(a * ((Double) s.get(5) - (Double) s.get(4)) + (1 - a) * (Double) g.get(4));
            s.add(a * (Double) list2.get(6) + (1 - a) * ((Double) s.get(5) + (Double) g.get(5)));
            g.add(a * ((Double) s.get(6) - (Double) s.get(5)) + (1 - a) * (Double) g.get(5));
            s.add(a * (Double) list2.get(7) + (1 - a) * ((Double) s.get(6) + (Double) g.get(6)));
            g.add(a * ((Double) s.get(7) - (Double) s.get(6)) + (1 - a) * (Double) g.get(6));
            s.add(a * (Double) list2.get(8) + (1 - a) * ((Double) s.get(7) + (Double) g.get(7)));
            g.add(a * ((Double) s.get(8) - (Double) s.get(7)) + (1 - a) * (Double) g.get(7));
            s.add(a * (Double) list2.get(9) + (1 - a) * ((Double) s.get(8) + (Double) g.get(8)));
            g.add(a * ((Double) s.get(9) - (Double) s.get(8)) + (1 - a) * (Double) g.get(8));
            s.add(a * (Double) list2.get(10) + (1 - a) * ((Double) s.get(9) + (Double) g.get(9)));
            g.add(a * ((Double) s.get(10) - (Double) s.get(9)) + (1 - a) * (Double) g.get(9));
            s.add(a * (Double) list2.get(11) + (1 - a) * ((Double) s.get(10) + (Double) g.get(10)));
            g.add(a * ((Double) s.get(11) - (Double) s.get(10)) + (1 - a) * (Double) g.get(10));

            s.add(a * (Double) list2.get(12) + (1 - a) * ((Double) s.get(11) + (Double) g.get(11)));
            g.add(a * ((Double) s.get(12) - (Double) s.get(11)) + (1 - a) * (Double) g.get(11));
            s.add(a * (Double) list2.get(13) + (1 - a) * ((Double) s.get(12) + (Double) g.get(12)));
            g.add(a * ((Double) s.get(13) - (Double) s.get(12)) + (1 - a) * (Double) g.get(12));
            s.add(a * (Double) list2.get(14) + (1 - a) * ((Double) s.get(13) + (Double) g.get(13)));
            g.add(a * ((Double) s.get(14) - (Double) s.get(13)) + (1 - a) * (Double) g.get(13));
            s.add(a * (Double) list2.get(15) + (1 - a) * ((Double) s.get(14) + (Double) g.get(14)));
            g.add(a * ((Double) s.get(15) - (Double) s.get(14)) + (1 - a) * (Double) g.get(14));
            s.add(a * (Double) list2.get(16) + (1 - a) * ((Double) s.get(15) + (Double) g.get(15)));
            g.add(a * ((Double) s.get(16) - (Double) s.get(15)) + (1 - a) * (Double) g.get(15));
            s.add(a * (Double) list2.get(17) + (1 - a) * ((Double) s.get(16) + (Double) g.get(16)));
            g.add(a * ((Double) s.get(17) - (Double) s.get(16)) + (1 - a) * (Double) g.get(16));
            s.add(a * (Double) list2.get(18) + (1 - a) * ((Double) s.get(17) + (Double) g.get(17)));
            g.add(a * ((Double) s.get(18) - (Double) s.get(17)) + (1 - a) * (Double) g.get(17));
            s.add(a * (Double) list2.get(19) + (1 - a) * ((Double) s.get(18) + (Double) g.get(18)));
            g.add(a * ((Double) s.get(19) - (Double) s.get(18)) + (1 - a) * (Double) g.get(18));
            s.add(a * (Double) list2.get(20) + (1 - a) * ((Double) s.get(19) + (Double) g.get(19)));
            g.add(a * ((Double) s.get(20) - (Double) s.get(19)) + (1 - a) * (Double) g.get(19));
            s.add(a * (Double) list2.get(21) + (1 - a) * ((Double) s.get(20) + (Double) g.get(20)));
            g.add(a * ((Double) s.get(21) - (Double) s.get(20)) + (1 - a) * (Double) g.get(20));
            s.add(a * (Double) list2.get(22) + (1 - a) * ((Double) s.get(21) + (Double) g.get(21)));
            g.add(a * ((Double) s.get(22) - (Double) s.get(21)) + (1 - a) * (Double) g.get(21));
            s.add(a * (Double) list2.get(23) + (1 - a) * ((Double) s.get(22) + (Double) g.get(22)));
            g.add(a * ((Double) s.get(23) - (Double) s.get(22)) + (1 - a) * (Double) g.get(22));
           
            tahmin2.add(x+y);
            tahmin2.add((Double) s.get(0) + (Double) g.get(0));
            tahmin2.add((Double) s.get(1) + (Double) g.get(1));
            tahmin2.add((Double) s.get(2) + (Double) g.get(2));
            tahmin2.add((Double) s.get(3) + (Double) g.get(3));
            tahmin2.add((Double) s.get(4) + (Double) g.get(4));
            tahmin2.add((Double) s.get(5) + (Double) g.get(5));
            tahmin2.add((Double) s.get(6) + (Double) g.get(6));
            tahmin2.add((Double) s.get(7) + (Double) g.get(7));
            tahmin2.add((Double) s.get(8) + (Double) g.get(8));
            tahmin2.add((Double) s.get(9) + (Double) g.get(9));
            tahmin2.add((Double) s.get(10) + (Double) g.get(10));
           
            tahmin2.add((Double) s.get(11) + (Double) g.get(11));
            tahmin2.add((Double) s.get(12) + (Double) g.get(12));
            tahmin2.add((Double) s.get(13) + (Double) g.get(13));
            tahmin2.add((Double) s.get(14) + (Double) g.get(14));
            tahmin2.add((Double) s.get(15) + (Double) g.get(15));
            tahmin2.add((Double) s.get(16) + (Double) g.get(16));
            tahmin2.add((Double) s.get(17) + (Double) g.get(17));
            tahmin2.add((Double) s.get(18) + (Double) g.get(18));
            tahmin2.add((Double) s.get(19) + (Double) g.get(19));
            tahmin2.add((Double) s.get(20) + (Double) g.get(20));
            tahmin2.add((Double) s.get(21) + (Double) g.get(21));
            tahmin2.add((Double) s.get(22) + (Double) g.get(22));
            tahmin2.add((Double) s.get(23) + (Double) g.get(23));

            Arraylist errorDouble = new Arraylist();
            errorDouble.add((Double)tahmin2.get(0)-(Double)list2.get(0));
            errorDouble.add((Double) tahmin2.get(1) - (Double) list2.get(0));
            errorDouble.add((Double) tahmin2.get(2) - (Double) list2.get(1));
            errorDouble.add((Double) tahmin2.get(3) - (Double) list2.get(2));
            errorDouble.add((Double) tahmin2.get(4) - (Double) list2.get(3));
            errorDouble.add((Double) tahmin2.get(5) - (Double) list2.get(4));
            errorDouble.add((Double) tahmin2.get(6) - (Double) list2.get(5));
            errorDouble.add((Double) tahmin2.get(7) - (Double) list2.get(6));
            errorDouble.add((Double) tahmin2.get(8) - (Double) list2.get(7));
            errorDouble.add((Double) tahmin2.get(9) - (Double) list2.get(8));
            errorDouble.add((Double) tahmin2.get(10) - (Double) list2.get(9));
            errorDouble.add((Double) tahmin2.get(11) - (Double) list2.get(10));
            errorDouble.add((Double) tahmin2.get(12) - (Double) list2.get(11));
            errorDouble.add((Double) tahmin2.get(13) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin2.get(14) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin2.get(15) - (Double) list2.get(14));
            errorDouble.add((Double) tahmin2.get(16) - (Double) list2.get(15));
            errorDouble.add((Double) tahmin2.get(17) - (Double) list2.get(16));
            errorDouble.add((Double) tahmin2.get(18) - (Double) list2.get(17));
            errorDouble.add((Double) tahmin2.get(19) - (Double) list2.get(18));
            errorDouble.add((Double) tahmin2.get(20) - (Double) list2.get(19));
            errorDouble.add((Double) tahmin2.get(21) - (Double) list2.get(20));
            errorDouble.add((Double) tahmin2.get(22) - (Double) list2.get(21));
            errorDouble.add((Double) tahmin2.get(23) - (Double) list2.get(22));
            errorDouble.add((Double) tahmin2.get(24) - (Double) list2.get(23));
             
         

            Object[] max2 = {(Double) tahmin2.get(0), (Double) tahmin2.get(1), (Double) tahmin2.get(2), (Double) tahmin2.get(3), (Double) tahmin2.get(4), (Double) tahmin2.get(5), (Double) tahmin2.get(6), tahmin2.get(7), (Double) tahmin2.get(8), (Double) tahmin2.get(9), (Double) tahmin2.get(10), (Double) tahmin2.get(11), (Double) tahmin2.get(12), (Double) tahmin2.get(13), (Double) tahmin2.get(14), (Double) tahmin2.get(15), (Double) tahmin2.get(16), (Double) tahmin2.get(17), (Double) tahmin2.get(18), (Double) tahmin2.get(19), (Double) tahmin2.get(20), (Double) tahmin2.get(21), (Double) tahmin2.get(22), (Double) tahmin2.get(23)};

            int j, P, Tmp;
            for (P = 1; P < 24; P++) {
                double Tmp2 = (Double) max2[P];
                for (j = P; j > 0 && (Double) max2[j - 1] > Tmp2; j--) {
                    max2[j] = max2[j - 1]; //Shift A[j-1] to right
                }
                max2[j] = Tmp2;
            }
            message_lbl.setText("For double exponential smoothing max forecasted demand is: " + max2[23]);
        }
    }//GEN-LAST:event_dexpMax_bttnActionPerformed

    private void dexpMin_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexpMin_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {

            Arraylist list2 = new Arraylist();
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            Arraylist tahmin2 = new Arraylist();
            Arraylist s = new Arraylist();
            Arraylist g = new Arraylist();
            Arraylist doubleExponentialSmoothingForecast = new Arraylist();
            double x = 200.0;
            double y = 50.0;

            s.add((Double) list2.get(0) * a + (1 - a) * (x + y));
            g.add(a * ((Double) s.get(0) - x) + 0.8 * y);
            s.add(a * (Double) list2.get(1) + (1 - a) * ((Double) s.get(0) + (Double) g.get(0)));
            g.add(a * ((Double) s.get(1) - (Double) s.get(0)) + (1 - a) * (Double) g.get(0));
            s.add(a * (Double) list2.get(2) + (1 - a) * ((Double) s.get(1) + (Double) g.get(1)));
            g.add(a * ((Double) s.get(2) - (Double) s.get(1)) + (1 - a) * (Double) g.get(1));
            s.add(a * (Double) list2.get(3) + (1 - a) * ((Double) s.get(2) + (Double) g.get(2)));
            g.add(a * ((Double) s.get(3) - (Double) s.get(2)) + (1 - a) * (Double) g.get(2));
            s.add(a * (Double) list2.get(4) + (1 - a) * ((Double) s.get(3) + (Double) g.get(3)));
            g.add(a * ((Double) s.get(4) - (Double) s.get(3)) + (1 - a) * (Double) g.get(3));
            s.add(a * (Double) list2.get(5) + (1 - a) * ((Double) s.get(4) + (Double) g.get(4)));
            g.add(a * ((Double) s.get(5) - (Double) s.get(4)) + (1 - a) * (Double) g.get(4));
            s.add(a * (Double) list2.get(6) + (1 - a) * ((Double) s.get(5) + (Double) g.get(5)));
            g.add(a * ((Double) s.get(6) - (Double) s.get(5)) + (1 - a) * (Double) g.get(5));
            s.add(a * (Double) list2.get(7) + (1 - a) * ((Double) s.get(6) + (Double) g.get(6)));
            g.add(a * ((Double) s.get(7) - (Double) s.get(6)) + (1 - a) * (Double) g.get(6));
            s.add(a * (Double) list2.get(8) + (1 - a) * ((Double) s.get(7) + (Double) g.get(7)));
            g.add(a * ((Double) s.get(8) - (Double) s.get(7)) + (1 - a) * (Double) g.get(7));
            s.add(a * (Double) list2.get(9) + (1 - a) * ((Double) s.get(8) + (Double) g.get(8)));
            g.add(a * ((Double) s.get(9) - (Double) s.get(8)) + (1 - a) * (Double) g.get(8));
            s.add(a * (Double) list2.get(10) + (1 - a) * ((Double) s.get(9) + (Double) g.get(9)));
            g.add(a * ((Double) s.get(10) - (Double) s.get(9)) + (1 - a) * (Double) g.get(9));
            s.add(a * (Double) list2.get(11) + (1 - a) * ((Double) s.get(10) + (Double) g.get(10)));
            g.add(a * ((Double) s.get(11) - (Double) s.get(10)) + (1 - a) * (Double) g.get(10));

            s.add(a * (Double) list2.get(12) + (1 - a) * ((Double) s.get(11) + (Double) g.get(11)));
            g.add(a * ((Double) s.get(12) - (Double) s.get(11)) + (1 - a) * (Double) g.get(11));
            s.add(a * (Double) list2.get(13) + (1 - a) * ((Double) s.get(12) + (Double) g.get(12)));
            g.add(a * ((Double) s.get(13) - (Double) s.get(12)) + (1 - a) * (Double) g.get(12));
            s.add(a * (Double) list2.get(14) + (1 - a) * ((Double) s.get(13) + (Double) g.get(13)));
            g.add(a * ((Double) s.get(14) - (Double) s.get(13)) + (1 - a) * (Double) g.get(13));
            s.add(a * (Double) list2.get(15) + (1 - a) * ((Double) s.get(14) + (Double) g.get(14)));
            g.add(a * ((Double) s.get(15) - (Double) s.get(14)) + (1 - a) * (Double) g.get(14));
            s.add(a * (Double) list2.get(16) + (1 - a) * ((Double) s.get(15) + (Double) g.get(15)));
            g.add(a * ((Double) s.get(16) - (Double) s.get(15)) + (1 - a) * (Double) g.get(15));
            s.add(a * (Double) list2.get(17) + (1 - a) * ((Double) s.get(16) + (Double) g.get(16)));
            g.add(a * ((Double) s.get(17) - (Double) s.get(16)) + (1 - a) * (Double) g.get(16));
            s.add(a * (Double) list2.get(18) + (1 - a) * ((Double) s.get(17) + (Double) g.get(17)));
            g.add(a * ((Double) s.get(18) - (Double) s.get(17)) + (1 - a) * (Double) g.get(17));
            s.add(a * (Double) list2.get(19) + (1 - a) * ((Double) s.get(18) + (Double) g.get(18)));
            g.add(a * ((Double) s.get(19) - (Double) s.get(18)) + (1 - a) * (Double) g.get(18));
            s.add(a * (Double) list2.get(20) + (1 - a) * ((Double) s.get(19) + (Double) g.get(19)));
            g.add(a * ((Double) s.get(20) - (Double) s.get(19)) + (1 - a) * (Double) g.get(19));
            s.add(a * (Double) list2.get(21) + (1 - a) * ((Double) s.get(20) + (Double) g.get(20)));
            g.add(a * ((Double) s.get(21) - (Double) s.get(20)) + (1 - a) * (Double) g.get(20));
            s.add(a * (Double) list2.get(22) + (1 - a) * ((Double) s.get(21) + (Double) g.get(21)));
            g.add(a * ((Double) s.get(22) - (Double) s.get(21)) + (1 - a) * (Double) g.get(21));
            s.add(a * (Double) list2.get(23) + (1 - a) * ((Double) s.get(22) + (Double) g.get(22)));
            g.add(a * ((Double) s.get(23) - (Double) s.get(22)) + (1 - a) * (Double) g.get(22));
           
            tahmin2.add(x+y);
            tahmin2.add((Double) s.get(0) + (Double) g.get(0));
            tahmin2.add((Double) s.get(1) + (Double) g.get(1));
            tahmin2.add((Double) s.get(2) + (Double) g.get(2));
            tahmin2.add((Double) s.get(3) + (Double) g.get(3));
            tahmin2.add((Double) s.get(4) + (Double) g.get(4));
            tahmin2.add((Double) s.get(5) + (Double) g.get(5));
            tahmin2.add((Double) s.get(6) + (Double) g.get(6));
            tahmin2.add((Double) s.get(7) + (Double) g.get(7));
            tahmin2.add((Double) s.get(8) + (Double) g.get(8));
            tahmin2.add((Double) s.get(9) + (Double) g.get(9));
            tahmin2.add((Double) s.get(10) + (Double) g.get(10));
           
            tahmin2.add((Double) s.get(11) + (Double) g.get(11));
            tahmin2.add((Double) s.get(12) + (Double) g.get(12));
            tahmin2.add((Double) s.get(13) + (Double) g.get(13));
            tahmin2.add((Double) s.get(14) + (Double) g.get(14));
            tahmin2.add((Double) s.get(15) + (Double) g.get(15));
            tahmin2.add((Double) s.get(16) + (Double) g.get(16));
            tahmin2.add((Double) s.get(17) + (Double) g.get(17));
            tahmin2.add((Double) s.get(18) + (Double) g.get(18));
            tahmin2.add((Double) s.get(19) + (Double) g.get(19));
            tahmin2.add((Double) s.get(20) + (Double) g.get(20));
            tahmin2.add((Double) s.get(21) + (Double) g.get(21));
            tahmin2.add((Double) s.get(22) + (Double) g.get(22));
            tahmin2.add((Double) s.get(23) + (Double) g.get(23));

            Arraylist errorDouble = new Arraylist();
            errorDouble.add((Double)tahmin2.get(0)-(Double)list2.get(0));
            errorDouble.add((Double) tahmin2.get(1) - (Double) list2.get(0));
            errorDouble.add((Double) tahmin2.get(2) - (Double) list2.get(1));
            errorDouble.add((Double) tahmin2.get(3) - (Double) list2.get(2));
            errorDouble.add((Double) tahmin2.get(4) - (Double) list2.get(3));
            errorDouble.add((Double) tahmin2.get(5) - (Double) list2.get(4));
            errorDouble.add((Double) tahmin2.get(6) - (Double) list2.get(5));
            errorDouble.add((Double) tahmin2.get(7) - (Double) list2.get(6));
            errorDouble.add((Double) tahmin2.get(8) - (Double) list2.get(7));
            errorDouble.add((Double) tahmin2.get(9) - (Double) list2.get(8));
            errorDouble.add((Double) tahmin2.get(10) - (Double) list2.get(9));
            errorDouble.add((Double) tahmin2.get(11) - (Double) list2.get(10));
            errorDouble.add((Double) tahmin2.get(12) - (Double) list2.get(11));
            errorDouble.add((Double) tahmin2.get(13) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin2.get(14) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin2.get(15) - (Double) list2.get(14));
            errorDouble.add((Double) tahmin2.get(16) - (Double) list2.get(15));
            errorDouble.add((Double) tahmin2.get(17) - (Double) list2.get(16));
            errorDouble.add((Double) tahmin2.get(18) - (Double) list2.get(17));
            errorDouble.add((Double) tahmin2.get(19) - (Double) list2.get(18));
            errorDouble.add((Double) tahmin2.get(20) - (Double) list2.get(19));
            errorDouble.add((Double) tahmin2.get(21) - (Double) list2.get(20));
            errorDouble.add((Double) tahmin2.get(22) - (Double) list2.get(21));
            errorDouble.add((Double) tahmin2.get(23) - (Double) list2.get(22));
            errorDouble.add((Double) tahmin2.get(24) - (Double) list2.get(23));

            Object[] max2 = {(Double) tahmin2.get(0), (Double) tahmin2.get(1), (Double) tahmin2.get(2), (Double) tahmin2.get(3), (Double) tahmin2.get(4), (Double) tahmin2.get(5), (Double) tahmin2.get(6), tahmin2.get(7), (Double) tahmin2.get(8), (Double) tahmin2.get(9), (Double) tahmin2.get(10), (Double) tahmin2.get(11), (Double) tahmin2.get(12), (Double) tahmin2.get(13), (Double) tahmin2.get(14), (Double) tahmin2.get(15), (Double) tahmin2.get(16), (Double) tahmin2.get(17), (Double) tahmin2.get(18), (Double) tahmin2.get(19), (Double) tahmin2.get(20), (Double) tahmin2.get(21), (Double) tahmin2.get(22), (Double) tahmin2.get(23)};

            int j, P, Tmp;
            for (P = 1; P < 24; P++) {
                double Tmp2 = (Double) max2[P];
                for (j = P; j > 0 && (Double) max2[j - 1] > Tmp2; j--) {
                    max2[j] = max2[j - 1]; //Shift A[j-1] to right
                }
                max2[j] = Tmp2;
            }
            message_lbl.setText("For double exponential smoothing min forecasted demand is: " + max2[0]);

        }

    }//GEN-LAST:event_dexpMin_bttnActionPerformed

    private void dexpSort_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexpSort_bttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {

            Arraylist list2 = new Arraylist();
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            Arraylist tahmin2 = new Arraylist();
            Arraylist s = new Arraylist();
            Arraylist g = new Arraylist();
            Arraylist doubleExponentialSmoothingForecast = new Arraylist();
            double x = 200.0;
            double y = 50.0;

            s.add((Double) list2.get(0) * a + (1 - a) * (x + y));
            g.add(a * ((Double) s.get(0) - x) + 0.8 * y);
            s.add(a * (Double) list2.get(1) + (1 - a) * ((Double) s.get(0) + (Double) g.get(0)));
            g.add(a * ((Double) s.get(1) - (Double) s.get(0)) + (1 - a) * (Double) g.get(0));
            s.add(a * (Double) list2.get(2) + (1 - a) * ((Double) s.get(1) + (Double) g.get(1)));
            g.add(a * ((Double) s.get(2) - (Double) s.get(1)) + (1 - a) * (Double) g.get(1));
            s.add(a * (Double) list2.get(3) + (1 - a) * ((Double) s.get(2) + (Double) g.get(2)));
            g.add(a * ((Double) s.get(3) - (Double) s.get(2)) + (1 - a) * (Double) g.get(2));
            s.add(a * (Double) list2.get(4) + (1 - a) * ((Double) s.get(3) + (Double) g.get(3)));
            g.add(a * ((Double) s.get(4) - (Double) s.get(3)) + (1 - a) * (Double) g.get(3));
            s.add(a * (Double) list2.get(5) + (1 - a) * ((Double) s.get(4) + (Double) g.get(4)));
            g.add(a * ((Double) s.get(5) - (Double) s.get(4)) + (1 - a) * (Double) g.get(4));
            s.add(a * (Double) list2.get(6) + (1 - a) * ((Double) s.get(5) + (Double) g.get(5)));
            g.add(a * ((Double) s.get(6) - (Double) s.get(5)) + (1 - a) * (Double) g.get(5));
            s.add(a * (Double) list2.get(7) + (1 - a) * ((Double) s.get(6) + (Double) g.get(6)));
            g.add(a * ((Double) s.get(7) - (Double) s.get(6)) + (1 - a) * (Double) g.get(6));
            s.add(a * (Double) list2.get(8) + (1 - a) * ((Double) s.get(7) + (Double) g.get(7)));
            g.add(a * ((Double) s.get(8) - (Double) s.get(7)) + (1 - a) * (Double) g.get(7));
            s.add(a * (Double) list2.get(9) + (1 - a) * ((Double) s.get(8) + (Double) g.get(8)));
            g.add(a * ((Double) s.get(9) - (Double) s.get(8)) + (1 - a) * (Double) g.get(8));
            s.add(a * (Double) list2.get(10) + (1 - a) * ((Double) s.get(9) + (Double) g.get(9)));
            g.add(a * ((Double) s.get(10) - (Double) s.get(9)) + (1 - a) * (Double) g.get(9));
            s.add(a * (Double) list2.get(11) + (1 - a) * ((Double) s.get(10) + (Double) g.get(10)));
            g.add(a * ((Double) s.get(11) - (Double) s.get(10)) + (1 - a) * (Double) g.get(10));

            s.add(a * (Double) list2.get(12) + (1 - a) * ((Double) s.get(11) + (Double) g.get(11)));
            g.add(a * ((Double) s.get(12) - (Double) s.get(11)) + (1 - a) * (Double) g.get(11));
            s.add(a * (Double) list2.get(13) + (1 - a) * ((Double) s.get(12) + (Double) g.get(12)));
            g.add(a * ((Double) s.get(13) - (Double) s.get(12)) + (1 - a) * (Double) g.get(12));
            s.add(a * (Double) list2.get(14) + (1 - a) * ((Double) s.get(13) + (Double) g.get(13)));
            g.add(a * ((Double) s.get(14) - (Double) s.get(13)) + (1 - a) * (Double) g.get(13));
            s.add(a * (Double) list2.get(15) + (1 - a) * ((Double) s.get(14) + (Double) g.get(14)));
            g.add(a * ((Double) s.get(15) - (Double) s.get(14)) + (1 - a) * (Double) g.get(14));
            s.add(a * (Double) list2.get(16) + (1 - a) * ((Double) s.get(15) + (Double) g.get(15)));
            g.add(a * ((Double) s.get(16) - (Double) s.get(15)) + (1 - a) * (Double) g.get(15));
            s.add(a * (Double) list2.get(17) + (1 - a) * ((Double) s.get(16) + (Double) g.get(16)));
            g.add(a * ((Double) s.get(17) - (Double) s.get(16)) + (1 - a) * (Double) g.get(16));
            s.add(a * (Double) list2.get(18) + (1 - a) * ((Double) s.get(17) + (Double) g.get(17)));
            g.add(a * ((Double) s.get(18) - (Double) s.get(17)) + (1 - a) * (Double) g.get(17));
            s.add(a * (Double) list2.get(19) + (1 - a) * ((Double) s.get(18) + (Double) g.get(18)));
            g.add(a * ((Double) s.get(19) - (Double) s.get(18)) + (1 - a) * (Double) g.get(18));
            s.add(a * (Double) list2.get(20) + (1 - a) * ((Double) s.get(19) + (Double) g.get(19)));
            g.add(a * ((Double) s.get(20) - (Double) s.get(19)) + (1 - a) * (Double) g.get(19));
            s.add(a * (Double) list2.get(21) + (1 - a) * ((Double) s.get(20) + (Double) g.get(20)));
            g.add(a * ((Double) s.get(21) - (Double) s.get(20)) + (1 - a) * (Double) g.get(20));
            s.add(a * (Double) list2.get(22) + (1 - a) * ((Double) s.get(21) + (Double) g.get(21)));
            g.add(a * ((Double) s.get(22) - (Double) s.get(21)) + (1 - a) * (Double) g.get(21));
            s.add(a * (Double) list2.get(23) + (1 - a) * ((Double) s.get(22) + (Double) g.get(22)));
            g.add(a * ((Double) s.get(23) - (Double) s.get(22)) + (1 - a) * (Double) g.get(22));
           
            tahmin2.add(x+y);
            tahmin2.add((Double) s.get(0) + (Double) g.get(0));
            tahmin2.add((Double) s.get(1) + (Double) g.get(1));
            tahmin2.add((Double) s.get(2) + (Double) g.get(2));
            tahmin2.add((Double) s.get(3) + (Double) g.get(3));
            tahmin2.add((Double) s.get(4) + (Double) g.get(4));
            tahmin2.add((Double) s.get(5) + (Double) g.get(5));
            tahmin2.add((Double) s.get(6) + (Double) g.get(6));
            tahmin2.add((Double) s.get(7) + (Double) g.get(7));
            tahmin2.add((Double) s.get(8) + (Double) g.get(8));
            tahmin2.add((Double) s.get(9) + (Double) g.get(9));
            tahmin2.add((Double) s.get(10) + (Double) g.get(10));
           
            tahmin2.add((Double) s.get(11) + (Double) g.get(11));
            tahmin2.add((Double) s.get(12) + (Double) g.get(12));
            tahmin2.add((Double) s.get(13) + (Double) g.get(13));
            tahmin2.add((Double) s.get(14) + (Double) g.get(14));
            tahmin2.add((Double) s.get(15) + (Double) g.get(15));
            tahmin2.add((Double) s.get(16) + (Double) g.get(16));
            tahmin2.add((Double) s.get(17) + (Double) g.get(17));
            tahmin2.add((Double) s.get(18) + (Double) g.get(18));
            tahmin2.add((Double) s.get(19) + (Double) g.get(19));
            tahmin2.add((Double) s.get(20) + (Double) g.get(20));
            tahmin2.add((Double) s.get(21) + (Double) g.get(21));
            tahmin2.add((Double) s.get(22) + (Double) g.get(22));
            tahmin2.add((Double) s.get(23) + (Double) g.get(23));

            Arraylist errorDouble = new Arraylist();
            errorDouble.add((Double)tahmin2.get(0)-(Double)list2.get(0));
            errorDouble.add((Double) tahmin2.get(1) - (Double) list2.get(0));
            errorDouble.add((Double) tahmin2.get(2) - (Double) list2.get(1));
            errorDouble.add((Double) tahmin2.get(3) - (Double) list2.get(2));
            errorDouble.add((Double) tahmin2.get(4) - (Double) list2.get(3));
            errorDouble.add((Double) tahmin2.get(5) - (Double) list2.get(4));
            errorDouble.add((Double) tahmin2.get(6) - (Double) list2.get(5));
            errorDouble.add((Double) tahmin2.get(7) - (Double) list2.get(6));
            errorDouble.add((Double) tahmin2.get(8) - (Double) list2.get(7));
            errorDouble.add((Double) tahmin2.get(9) - (Double) list2.get(8));
            errorDouble.add((Double) tahmin2.get(10) - (Double) list2.get(9));
            errorDouble.add((Double) tahmin2.get(11) - (Double) list2.get(10));
            errorDouble.add((Double) tahmin2.get(12) - (Double) list2.get(11));
            errorDouble.add((Double) tahmin2.get(13) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin2.get(14) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin2.get(15) - (Double) list2.get(14));
            errorDouble.add((Double) tahmin2.get(16) - (Double) list2.get(15));
            errorDouble.add((Double) tahmin2.get(17) - (Double) list2.get(16));
            errorDouble.add((Double) tahmin2.get(18) - (Double) list2.get(17));
            errorDouble.add((Double) tahmin2.get(19) - (Double) list2.get(18));
            errorDouble.add((Double) tahmin2.get(20) - (Double) list2.get(19));
            errorDouble.add((Double) tahmin2.get(21) - (Double) list2.get(20));
            errorDouble.add((Double) tahmin2.get(22) - (Double) list2.get(21));
            errorDouble.add((Double) tahmin2.get(23) - (Double) list2.get(22));
            errorDouble.add((Double) tahmin2.get(24) - (Double) list2.get(23));

            Object[] max2 = {(Double) tahmin2.get(0), (Double) tahmin2.get(1), (Double) tahmin2.get(2), (Double) tahmin2.get(3), (Double) tahmin2.get(4), (Double) tahmin2.get(5), (Double) tahmin2.get(6), tahmin2.get(7), (Double) tahmin2.get(8), (Double) tahmin2.get(9), (Double) tahmin2.get(10), (Double) tahmin2.get(11), (Double) tahmin2.get(12), (Double) tahmin2.get(13), (Double) tahmin2.get(14), (Double) tahmin2.get(15), (Double) tahmin2.get(16), (Double) tahmin2.get(17), (Double) tahmin2.get(18), (Double) tahmin2.get(19), (Double) tahmin2.get(20), (Double) tahmin2.get(21), (Double) tahmin2.get(22), (Double) tahmin2.get(23)};

            int j, P, Tmp;
            for (P = 1; P < 24; P++) {
                double Tmp2 = (Double) max2[P];
                for (j = P; j > 0 && (Double) max2[j - 1] > Tmp2; j--) {
                    max2[j] = max2[j - 1]; //Shift A[j-1] to right
                }
                max2[j] = Tmp2;

            }
            int uzunluk = max2.length;
            Object[] tersdizi = new Object[uzunluk];
            for (int i = 0; i < uzunluk; i++) {
                tersdizi[uzunluk - i - 1] = max2[i];
            }
            for (int i = 0; i < uzunluk; i++) {
                listModel.addElement(tersdizi[i]);
            }

            jList1.setModel(listModel);
        }
    }//GEN-LAST:event_dexpSort_bttnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void maxDemand_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxDemand_bttnActionPerformed

        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list4 = new Arraylist();
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            double sumDemand4 = (Double) list4.get(0) + (Double) list4.get(1) + (Double) list4.get(2) + (Double) list4.get(3) + (Double) list4.get(4) + (Double) list4.get(5) + (Double) list4.get(6) + (Double) list4.get(7) + (Double) list4.get(8) + (Double) list4.get(9) + (Double) list4.get(10) + (Double) list4.get(11) + (Double) list4.get(12) + (Double) list4.get(13) + (Double) list4.get(14) + (Double) list4.get(15) + (Double) list4.get(16) + (Double) list4.get(17) + (Double) list4.get(18) + (Double) list4.get(19) + (Double) list4.get(20) + (Double) list4.get(21) + (Double) list4.get(22) + (Double) list4.get(23);
            double averageDemand4 = sumDemand4 / 24;
            double[] ortalama = {
                ((Double) list4.get(0) + (Double) list4.get(12)) / 2,
                ((Double) list4.get(1) + (Double) list4.get(13)) / 2,
                ((Double) list4.get(2) + (Double) list4.get(14)) / 2,
                ((Double) list4.get(3) + (Double) list4.get(15)) / 2,
                ((Double) list4.get(4) + (Double) list4.get(16)) / 2,
                ((Double) list4.get(5) + (Double) list4.get(17)) / 2,
                ((Double) list4.get(6) + (Double) list4.get(18)) / 2,
                ((Double) list4.get(7) + (Double) list4.get(19)) / 2,
                ((Double) list4.get(8) + (Double) list4.get(20)) / 2,
                ((Double) list4.get(9) + (Double) list4.get(21)) / 2,
                ((Double) list4.get(10) + (Double) list4.get(22)) / 2,
                ((Double) list4.get(11) + (Double) list4.get(23)) / 2

            };
            double[] seasonalDemandFactor = {
                (Double) ortalama[0] / (Double) averageDemand4,
                (Double) ortalama[1] / (Double) averageDemand4,
                (Double) ortalama[2] / (Double) averageDemand4,
                (Double) ortalama[3] / (Double) averageDemand4,
                (Double) ortalama[4] / (Double) averageDemand4,
                (Double) ortalama[5] / (Double) averageDemand4,
                (Double) ortalama[6] / (Double) averageDemand4,
                (Double) ortalama[7] / (Double) averageDemand4,
                (Double) ortalama[8] / (Double) averageDemand4,
                (Double) ortalama[9] / (Double) averageDemand4,
                (Double) ortalama[10] / (Double) averageDemand4,
                (Double) ortalama[11] / (Double) averageDemand4,};

            double[] deseasonDemand = {
                (Double) list4.get(0) / seasonalDemandFactor[0],
                (Double) list4.get(1) / seasonalDemandFactor[1],
                (Double) list4.get(2) / seasonalDemandFactor[2],
                (Double) list4.get(3) / seasonalDemandFactor[3],
                (Double) list4.get(4) / seasonalDemandFactor[4],
                (Double) list4.get(5) / seasonalDemandFactor[5],
                (Double) list4.get(6) / seasonalDemandFactor[6],
                (Double) list4.get(7) / seasonalDemandFactor[7],
                (Double) list4.get(8) / seasonalDemandFactor[8],
                (Double) list4.get(9) / seasonalDemandFactor[9],
                (Double) list4.get(10) / seasonalDemandFactor[10],
                (Double) list4.get(11) / seasonalDemandFactor[11],
                (Double) list4.get(12) / seasonalDemandFactor[0],
                (Double) list4.get(13) / seasonalDemandFactor[1],
                (Double) list4.get(14) / seasonalDemandFactor[2],
                (Double) list4.get(15) / seasonalDemandFactor[3],
                (Double) list4.get(16) / seasonalDemandFactor[4],
                (Double) list4.get(17) / seasonalDemandFactor[5],
                (Double) list4.get(18) / seasonalDemandFactor[6],
                (Double) list4.get(19) / seasonalDemandFactor[7],
                (Double) list4.get(20) / seasonalDemandFactor[8],
                (Double) list4.get(21) / seasonalDemandFactor[9],
                (Double) list4.get(22) / seasonalDemandFactor[10],
                (Double) list4.get(23) / seasonalDemandFactor[11]

            };

            double[] deseasonSum = {
                (Double) list4.get(0) / seasonalDemandFactor[0]
                + (Double) list4.get(1) / seasonalDemandFactor[1]
                + (Double) list4.get(2) / seasonalDemandFactor[2]
                + (Double) list4.get(3) / seasonalDemandFactor[3]
                + (Double) list4.get(4) / seasonalDemandFactor[4]
                + (Double) list4.get(5) / seasonalDemandFactor[5]
                + (Double) list4.get(6) / seasonalDemandFactor[6]
                + (Double) list4.get(7) / seasonalDemandFactor[7]
                + (Double) list4.get(8) / seasonalDemandFactor[8]
                + (Double) list4.get(9) / seasonalDemandFactor[9]
                + (Double) list4.get(10) / seasonalDemandFactor[10]
                + (Double) list4.get(11) / seasonalDemandFactor[11]
                + (Double) list4.get(12) / seasonalDemandFactor[0]
                + (Double) list4.get(13) / seasonalDemandFactor[1]
                + (Double) list4.get(14) / seasonalDemandFactor[2]
                + (Double) list4.get(15) / seasonalDemandFactor[3]
                + (Double) list4.get(16) / seasonalDemandFactor[4]
                + (Double) list4.get(17) / seasonalDemandFactor[5]
                + (Double) list4.get(18) / seasonalDemandFactor[6]
                + (Double) list4.get(19) / seasonalDemandFactor[7]
                + (Double) list4.get(20) / seasonalDemandFactor[8]
                + (Double) list4.get(21) / seasonalDemandFactor[9]
                + (Double) list4.get(22) / seasonalDemandFactor[10]
                + (Double) list4.get(23) / seasonalDemandFactor[11]
            };
            double sum_x4 = 300;
            double sum_square4 = 4900;

            Arraylist multiply4 = new Arraylist();
            multiply4.add((Double) deseasonDemand[0]);
            multiply4.add(2 * (Double) deseasonDemand[1]);
            multiply4.add(3 * (Double) deseasonDemand[2]);
            multiply4.add(4 * (Double) deseasonDemand[3]);
            multiply4.add(5 * (Double) deseasonDemand[4]);
            multiply4.add(6 * (Double) deseasonDemand[5]);
            multiply4.add(7 * (Double) deseasonDemand[6]);
            multiply4.add(8 * (Double) deseasonDemand[7]);
            multiply4.add(9 * (Double) deseasonDemand[8]);
            multiply4.add(10 * (Double) deseasonDemand[9]);
            multiply4.add(11 * (Double) deseasonDemand[10]);
            multiply4.add(12 * (Double) deseasonDemand[11]);
            multiply4.add(13 * (Double) deseasonDemand[12]);
            multiply4.add(14 * (Double) deseasonDemand[13]);
            multiply4.add(15 * (Double) deseasonDemand[14]);
            multiply4.add(16 * (Double) deseasonDemand[15]);
            multiply4.add(17 * (Double) deseasonDemand[16]);
            multiply4.add(18 * (Double) deseasonDemand[17]);
            multiply4.add(19 * (Double) deseasonDemand[18]);
            multiply4.add(20 * (Double) deseasonDemand[19]);
            multiply4.add(21 * (Double) deseasonDemand[20]);
            multiply4.add(22 * (Double) deseasonDemand[21]);
            multiply4.add(23 * (Double) deseasonDemand[22]);
            multiply4.add(24 * (Double) deseasonDemand[23]);

            double multiplySum4 = (Double) multiply4.get(0) + (Double) multiply4.get(1) + (Double) multiply4.get(2) + (Double) multiply4.get(3) + (Double) multiply4.get(4) + (Double) multiply4.get(5) + (Double) multiply4.get(6) + (Double) multiply4.get(7) + (Double) multiply4.get(8) + (Double) multiply4.get(9) + (Double) multiply4.get(10)
                    + (Double) multiply4.get(11) + (Double) multiply4.get(12) + (Double) multiply4.get(13) + (Double) multiply4.get(14) + (Double) multiply4.get(15) + (Double) multiply4.get(16) + (Double) multiply4.get(17) + (Double) multiply4.get(18) + (Double) multiply4.get(19) + (Double) multiply4.get(20) + (Double) multiply4.get(21) + (Double) multiply4.get(22) + (Double) multiply4.get(23);
            double b_degeri4 = ((24 * multiplySum4) - (deseasonSum[0] * 300)) / ((24 * sum_square4) - (300 * 300));
            double a_degeri4 = (averageDemand4 - (b_degeri4 * (300 / 24)));

            Arraylist tahmin4 = new Arraylist();
            tahmin4.add(a_degeri4 + (b_degeri4 * 25));
            tahmin4.add(a_degeri4 + (b_degeri4 * 26));
            tahmin4.add(a_degeri4 + (b_degeri4 * 27));
            tahmin4.add(a_degeri4 + (b_degeri4 * 28));
            tahmin4.add(a_degeri4 + (b_degeri4 * 29));
            tahmin4.add(a_degeri4 + (b_degeri4 * 30));
            tahmin4.add(a_degeri4 + (b_degeri4 * 31));
            tahmin4.add(a_degeri4 + (b_degeri4 * 32));
            tahmin4.add(a_degeri4 + (b_degeri4 * 33));
            tahmin4.add(a_degeri4 + (b_degeri4 * 34));
            tahmin4.add(a_degeri4 + (b_degeri4 * 35));
            tahmin4.add(a_degeri4 + (b_degeri4 * 36));

            Object[] seasonForecast = {seasonalDemandFactor[0] * (Double) tahmin4.get(0),
                seasonalDemandFactor[1] * (Double) tahmin4.get(1),
                seasonalDemandFactor[2] * (Double) tahmin4.get(2),
                seasonalDemandFactor[3] * (Double) tahmin4.get(3),
                seasonalDemandFactor[4] * (Double) tahmin4.get(4),
                seasonalDemandFactor[5] * (Double) tahmin4.get(5),
                seasonalDemandFactor[6] * (Double) tahmin4.get(6),
                seasonalDemandFactor[7] * (Double) tahmin4.get(7),
                seasonalDemandFactor[8] * (Double) tahmin4.get(8),
                seasonalDemandFactor[9] * (Double) tahmin4.get(9),
                seasonalDemandFactor[10] * (Double) tahmin4.get(10),
                seasonalDemandFactor[11] * (Double) tahmin4.get(11)
            };
            Object[] max4 = {(Double) seasonForecast[0], (Double) seasonForecast[1], (Double) seasonForecast[2], (Double) seasonForecast[3], (Double) seasonForecast[4], (Double) seasonForecast[5], (Double) seasonForecast[6], (Double) seasonForecast[7], (Double) seasonForecast[8], (Double) seasonForecast[9], (Double) seasonForecast[10], (Double) seasonForecast[11]};

            int j, P, Tmp;
            for (P = 1; P < 12; P++) {
                double Tmp2 = (Double) max4[P];
                for (j = P; j > 0 && (Double) max4[j - 1] > Tmp2; j--) {
                    max4[j] = max4[j - 1]; //Shift A[j-1] to right
                }
                max4[j] = Tmp2;

                
            }
          
            message_lbl.setText("For deseasonalized regression analysis max forecast demand :" + max4[11]);
        }

    }//GEN-LAST:event_maxDemand_bttnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list4 = new Arraylist();
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            double sumDemand4 = (Double) list4.get(0) + (Double) list4.get(1) + (Double) list4.get(2) + (Double) list4.get(3) + (Double) list4.get(4) + (Double) list4.get(5) + (Double) list4.get(6) + (Double) list4.get(7) + (Double) list4.get(8) + (Double) list4.get(9) + (Double) list4.get(10) + (Double) list4.get(11) + (Double) list4.get(12) + (Double) list4.get(13) + (Double) list4.get(14) + (Double) list4.get(15) + (Double) list4.get(16) + (Double) list4.get(17) + (Double) list4.get(18) + (Double) list4.get(19) + (Double) list4.get(20) + (Double) list4.get(21) + (Double) list4.get(22) + (Double) list4.get(23);
            double averageDemand4 = sumDemand4 / 24;
            double[] ortalama = {
                ((Double) list4.get(0) + (Double) list4.get(12)) / 2,
                ((Double) list4.get(1) + (Double) list4.get(13)) / 2,
                ((Double) list4.get(2) + (Double) list4.get(14)) / 2,
                ((Double) list4.get(3) + (Double) list4.get(15)) / 2,
                ((Double) list4.get(4) + (Double) list4.get(16)) / 2,
                ((Double) list4.get(5) + (Double) list4.get(17)) / 2,
                ((Double) list4.get(6) + (Double) list4.get(18)) / 2,
                ((Double) list4.get(7) + (Double) list4.get(19)) / 2,
                ((Double) list4.get(8) + (Double) list4.get(20)) / 2,
                ((Double) list4.get(9) + (Double) list4.get(21)) / 2,
                ((Double) list4.get(10) + (Double) list4.get(22)) / 2,
                ((Double) list4.get(11) + (Double) list4.get(23)) / 2

            };
            double[] seasonalDemandFactor = {
                (Double) ortalama[0] / (Double) averageDemand4,
                (Double) ortalama[1] / (Double) averageDemand4,
                (Double) ortalama[2] / (Double) averageDemand4,
                (Double) ortalama[3] / (Double) averageDemand4,
                (Double) ortalama[4] / (Double) averageDemand4,
                (Double) ortalama[5] / (Double) averageDemand4,
                (Double) ortalama[6] / (Double) averageDemand4,
                (Double) ortalama[7] / (Double) averageDemand4,
                (Double) ortalama[8] / (Double) averageDemand4,
                (Double) ortalama[9] / (Double) averageDemand4,
                (Double) ortalama[10] / (Double) averageDemand4,
                (Double) ortalama[11] / (Double) averageDemand4,};

            double[] deseasonDemand = {
                (Double) list4.get(0) / seasonalDemandFactor[0],
                (Double) list4.get(1) / seasonalDemandFactor[1],
                (Double) list4.get(2) / seasonalDemandFactor[2],
                (Double) list4.get(3) / seasonalDemandFactor[3],
                (Double) list4.get(4) / seasonalDemandFactor[4],
                (Double) list4.get(5) / seasonalDemandFactor[5],
                (Double) list4.get(6) / seasonalDemandFactor[6],
                (Double) list4.get(7) / seasonalDemandFactor[7],
                (Double) list4.get(8) / seasonalDemandFactor[8],
                (Double) list4.get(9) / seasonalDemandFactor[9],
                (Double) list4.get(10) / seasonalDemandFactor[10],
                (Double) list4.get(11) / seasonalDemandFactor[11],
                (Double) list4.get(12) / seasonalDemandFactor[0],
                (Double) list4.get(13) / seasonalDemandFactor[1],
                (Double) list4.get(14) / seasonalDemandFactor[2],
                (Double) list4.get(15) / seasonalDemandFactor[3],
                (Double) list4.get(16) / seasonalDemandFactor[4],
                (Double) list4.get(17) / seasonalDemandFactor[5],
                (Double) list4.get(18) / seasonalDemandFactor[6],
                (Double) list4.get(19) / seasonalDemandFactor[7],
                (Double) list4.get(20) / seasonalDemandFactor[8],
                (Double) list4.get(21) / seasonalDemandFactor[9],
                (Double) list4.get(22) / seasonalDemandFactor[10],
                (Double) list4.get(23) / seasonalDemandFactor[11]

            };

            double[] deseasonSum = {
                (Double) list4.get(0) / seasonalDemandFactor[0]
                + (Double) list4.get(1) / seasonalDemandFactor[1]
                + (Double) list4.get(2) / seasonalDemandFactor[2]
                + (Double) list4.get(3) / seasonalDemandFactor[3]
                + (Double) list4.get(4) / seasonalDemandFactor[4]
                + (Double) list4.get(5) / seasonalDemandFactor[5]
                + (Double) list4.get(6) / seasonalDemandFactor[6]
                + (Double) list4.get(7) / seasonalDemandFactor[7]
                + (Double) list4.get(8) / seasonalDemandFactor[8]
                + (Double) list4.get(9) / seasonalDemandFactor[9]
                + (Double) list4.get(10) / seasonalDemandFactor[10]
                + (Double) list4.get(11) / seasonalDemandFactor[11]
                + (Double) list4.get(12) / seasonalDemandFactor[0]
                + (Double) list4.get(13) / seasonalDemandFactor[1]
                + (Double) list4.get(14) / seasonalDemandFactor[2]
                + (Double) list4.get(15) / seasonalDemandFactor[3]
                + (Double) list4.get(16) / seasonalDemandFactor[4]
                + (Double) list4.get(17) / seasonalDemandFactor[5]
                + (Double) list4.get(18) / seasonalDemandFactor[6]
                + (Double) list4.get(19) / seasonalDemandFactor[7]
                + (Double) list4.get(20) / seasonalDemandFactor[8]
                + (Double) list4.get(21) / seasonalDemandFactor[9]
                + (Double) list4.get(22) / seasonalDemandFactor[10]
                + (Double) list4.get(23) / seasonalDemandFactor[11]
            };
            double sum_x4 = 300;
            double sum_square4 = 4900;

            Arraylist multiply4 = new Arraylist();
            multiply4.add((Double) deseasonDemand[0]);
            multiply4.add(2 * (Double) deseasonDemand[1]);
            multiply4.add(3 * (Double) deseasonDemand[2]);
            multiply4.add(4 * (Double) deseasonDemand[3]);
            multiply4.add(5 * (Double) deseasonDemand[4]);
            multiply4.add(6 * (Double) deseasonDemand[5]);
            multiply4.add(7 * (Double) deseasonDemand[6]);
            multiply4.add(8 * (Double) deseasonDemand[7]);
            multiply4.add(9 * (Double) deseasonDemand[8]);
            multiply4.add(10 * (Double) deseasonDemand[9]);
            multiply4.add(11 * (Double) deseasonDemand[10]);
            multiply4.add(12 * (Double) deseasonDemand[11]);
            multiply4.add(13 * (Double) deseasonDemand[12]);
            multiply4.add(14 * (Double) deseasonDemand[13]);
            multiply4.add(15 * (Double) deseasonDemand[14]);
            multiply4.add(16 * (Double) deseasonDemand[15]);
            multiply4.add(17 * (Double) deseasonDemand[16]);
            multiply4.add(18 * (Double) deseasonDemand[17]);
            multiply4.add(19 * (Double) deseasonDemand[18]);
            multiply4.add(20 * (Double) deseasonDemand[19]);
            multiply4.add(21 * (Double) deseasonDemand[20]);
            multiply4.add(22 * (Double) deseasonDemand[21]);
            multiply4.add(23 * (Double) deseasonDemand[22]);
            multiply4.add(24 * (Double) deseasonDemand[23]);

            double multiplySum4 = (Double) multiply4.get(0) + (Double) multiply4.get(1) + (Double) multiply4.get(2) + (Double) multiply4.get(3) + (Double) multiply4.get(4) + (Double) multiply4.get(5) + (Double) multiply4.get(6) + (Double) multiply4.get(7) + (Double) multiply4.get(8) + (Double) multiply4.get(9) + (Double) multiply4.get(10)
                    + (Double) multiply4.get(11) + (Double) multiply4.get(12) + (Double) multiply4.get(13) + (Double) multiply4.get(14) + (Double) multiply4.get(15) + (Double) multiply4.get(16) + (Double) multiply4.get(17) + (Double) multiply4.get(18) + (Double) multiply4.get(19) + (Double) multiply4.get(20) + (Double) multiply4.get(21) + (Double) multiply4.get(22) + (Double) multiply4.get(23);
            double b_degeri4 = ((24 * multiplySum4) - (deseasonSum[0] * 300)) / ((24 * sum_square4) - (300 * 300));
            double a_degeri4 = (averageDemand4 - (b_degeri4 * (300 / 24)));

            Arraylist tahmin4 = new Arraylist();
            tahmin4.add(a_degeri4 + (b_degeri4 * 25));
            tahmin4.add(a_degeri4 + (b_degeri4 * 26));
            tahmin4.add(a_degeri4 + (b_degeri4 * 27));
            tahmin4.add(a_degeri4 + (b_degeri4 * 28));
            tahmin4.add(a_degeri4 + (b_degeri4 * 29));
            tahmin4.add(a_degeri4 + (b_degeri4 * 30));
            tahmin4.add(a_degeri4 + (b_degeri4 * 31));
            tahmin4.add(a_degeri4 + (b_degeri4 * 32));
            tahmin4.add(a_degeri4 + (b_degeri4 * 33));
            tahmin4.add(a_degeri4 + (b_degeri4 * 34));
            tahmin4.add(a_degeri4 + (b_degeri4 * 35));
            tahmin4.add(a_degeri4 + (b_degeri4 * 36));

            Object[] seasonForecast = {seasonalDemandFactor[0] * (Double) tahmin4.get(0),
                seasonalDemandFactor[1] * (Double) tahmin4.get(1),
                seasonalDemandFactor[2] * (Double) tahmin4.get(2),
                seasonalDemandFactor[3] * (Double) tahmin4.get(3),
                seasonalDemandFactor[4] * (Double) tahmin4.get(4),
                seasonalDemandFactor[5] * (Double) tahmin4.get(5),
                seasonalDemandFactor[6] * (Double) tahmin4.get(6),
                seasonalDemandFactor[7] * (Double) tahmin4.get(7),
                seasonalDemandFactor[8] * (Double) tahmin4.get(8),
                seasonalDemandFactor[9] * (Double) tahmin4.get(9),
                seasonalDemandFactor[10] * (Double) tahmin4.get(10),
                seasonalDemandFactor[11] * (Double) tahmin4.get(11)
            };
            Object[] max4 = {(Double) seasonForecast[0], (Double) seasonForecast[1], (Double) seasonForecast[2], (Double) seasonForecast[3], (Double) seasonForecast[4], (Double) seasonForecast[5], (Double) seasonForecast[6], (Double) seasonForecast[7], (Double) seasonForecast[8], (Double) seasonForecast[9], (Double) seasonForecast[10], (Double) seasonForecast[11]};

            int j, P, Tmp;
            for (P = 1; P < 12; P++) {
                double Tmp2 = (Double) max4[P];
                for (j = P; j > 0 && (Double) max4[j - 1] > Tmp2; j--) {
                    max4[j] = max4[j - 1]; //Shift A[j-1] to right
                }
                
            }
           
            message_lbl.setText("For deseasonalized regression analysis min dorecast demand :" + max4[0]);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list4 = new Arraylist();
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list4.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            double sumDemand4 = (Double) list4.get(0) + (Double) list4.get(1) + (Double) list4.get(2) + (Double) list4.get(3) + (Double) list4.get(4) + (Double) list4.get(5) + (Double) list4.get(6) + (Double) list4.get(7) + (Double) list4.get(8) + (Double) list4.get(9) + (Double) list4.get(10) + (Double) list4.get(11) + (Double) list4.get(12) + (Double) list4.get(13) + (Double) list4.get(14) + (Double) list4.get(15) + (Double) list4.get(16) + (Double) list4.get(17) + (Double) list4.get(18) + (Double) list4.get(19) + (Double) list4.get(20) + (Double) list4.get(21) + (Double) list4.get(22) + (Double) list4.get(23);
            double averageDemand4 = sumDemand4 / 24;
            double[] ortalama = {
                ((Double) list4.get(0) + (Double) list4.get(12)) / 2,
                ((Double) list4.get(1) + (Double) list4.get(13)) / 2,
                ((Double) list4.get(2) + (Double) list4.get(14)) / 2,
                ((Double) list4.get(3) + (Double) list4.get(15)) / 2,
                ((Double) list4.get(4) + (Double) list4.get(16)) / 2,
                ((Double) list4.get(5) + (Double) list4.get(17)) / 2,
                ((Double) list4.get(6) + (Double) list4.get(18)) / 2,
                ((Double) list4.get(7) + (Double) list4.get(19)) / 2,
                ((Double) list4.get(8) + (Double) list4.get(20)) / 2,
                ((Double) list4.get(9) + (Double) list4.get(21)) / 2,
                ((Double) list4.get(10) + (Double) list4.get(22)) / 2,
                ((Double) list4.get(11) + (Double) list4.get(23)) / 2

            };
            double[] seasonalDemandFactor = {
                (Double) ortalama[0] / (Double) averageDemand4,
                (Double) ortalama[1] / (Double) averageDemand4,
                (Double) ortalama[2] / (Double) averageDemand4,
                (Double) ortalama[3] / (Double) averageDemand4,
                (Double) ortalama[4] / (Double) averageDemand4,
                (Double) ortalama[5] / (Double) averageDemand4,
                (Double) ortalama[6] / (Double) averageDemand4,
                (Double) ortalama[7] / (Double) averageDemand4,
                (Double) ortalama[8] / (Double) averageDemand4,
                (Double) ortalama[9] / (Double) averageDemand4,
                (Double) ortalama[10] / (Double) averageDemand4,
                (Double) ortalama[11] / (Double) averageDemand4,};

            double[] deseasonDemand = {
                (Double) list4.get(0) / seasonalDemandFactor[0],
                (Double) list4.get(1) / seasonalDemandFactor[1],
                (Double) list4.get(2) / seasonalDemandFactor[2],
                (Double) list4.get(3) / seasonalDemandFactor[3],
                (Double) list4.get(4) / seasonalDemandFactor[4],
                (Double) list4.get(5) / seasonalDemandFactor[5],
                (Double) list4.get(6) / seasonalDemandFactor[6],
                (Double) list4.get(7) / seasonalDemandFactor[7],
                (Double) list4.get(8) / seasonalDemandFactor[8],
                (Double) list4.get(9) / seasonalDemandFactor[9],
                (Double) list4.get(10) / seasonalDemandFactor[10],
                (Double) list4.get(11) / seasonalDemandFactor[11],
                (Double) list4.get(12) / seasonalDemandFactor[0],
                (Double) list4.get(13) / seasonalDemandFactor[1],
                (Double) list4.get(14) / seasonalDemandFactor[2],
                (Double) list4.get(15) / seasonalDemandFactor[3],
                (Double) list4.get(16) / seasonalDemandFactor[4],
                (Double) list4.get(17) / seasonalDemandFactor[5],
                (Double) list4.get(18) / seasonalDemandFactor[6],
                (Double) list4.get(19) / seasonalDemandFactor[7],
                (Double) list4.get(20) / seasonalDemandFactor[8],
                (Double) list4.get(21) / seasonalDemandFactor[9],
                (Double) list4.get(22) / seasonalDemandFactor[10],
                (Double) list4.get(23) / seasonalDemandFactor[11]

            };

            double[] deseasonSum = {
                (Double) list4.get(0) / seasonalDemandFactor[0]
                + (Double) list4.get(1) / seasonalDemandFactor[1]
                + (Double) list4.get(2) / seasonalDemandFactor[2]
                + (Double) list4.get(3) / seasonalDemandFactor[3]
                + (Double) list4.get(4) / seasonalDemandFactor[4]
                + (Double) list4.get(5) / seasonalDemandFactor[5]
                + (Double) list4.get(6) / seasonalDemandFactor[6]
                + (Double) list4.get(7) / seasonalDemandFactor[7]
                + (Double) list4.get(8) / seasonalDemandFactor[8]
                + (Double) list4.get(9) / seasonalDemandFactor[9]
                + (Double) list4.get(10) / seasonalDemandFactor[10]
                + (Double) list4.get(11) / seasonalDemandFactor[11]
                + (Double) list4.get(12) / seasonalDemandFactor[0]
                + (Double) list4.get(13) / seasonalDemandFactor[1]
                + (Double) list4.get(14) / seasonalDemandFactor[2]
                + (Double) list4.get(15) / seasonalDemandFactor[3]
                + (Double) list4.get(16) / seasonalDemandFactor[4]
                + (Double) list4.get(17) / seasonalDemandFactor[5]
                + (Double) list4.get(18) / seasonalDemandFactor[6]
                + (Double) list4.get(19) / seasonalDemandFactor[7]
                + (Double) list4.get(20) / seasonalDemandFactor[8]
                + (Double) list4.get(21) / seasonalDemandFactor[9]
                + (Double) list4.get(22) / seasonalDemandFactor[10]
                + (Double) list4.get(23) / seasonalDemandFactor[11]
            };
            double sum_x4 = 300;
            double sum_square4 = 4900;

            Arraylist multiply4 = new Arraylist();
            multiply4.add((Double) deseasonDemand[0]);
            multiply4.add(2 * (Double) deseasonDemand[1]);
            multiply4.add(3 * (Double) deseasonDemand[2]);
            multiply4.add(4 * (Double) deseasonDemand[3]);
            multiply4.add(5 * (Double) deseasonDemand[4]);
            multiply4.add(6 * (Double) deseasonDemand[5]);
            multiply4.add(7 * (Double) deseasonDemand[6]);
            multiply4.add(8 * (Double) deseasonDemand[7]);
            multiply4.add(9 * (Double) deseasonDemand[8]);
            multiply4.add(10 * (Double) deseasonDemand[9]);
            multiply4.add(11 * (Double) deseasonDemand[10]);
            multiply4.add(12 * (Double) deseasonDemand[11]);
            multiply4.add(13 * (Double) deseasonDemand[12]);
            multiply4.add(14 * (Double) deseasonDemand[13]);
            multiply4.add(15 * (Double) deseasonDemand[14]);
            multiply4.add(16 * (Double) deseasonDemand[15]);
            multiply4.add(17 * (Double) deseasonDemand[16]);
            multiply4.add(18 * (Double) deseasonDemand[17]);
            multiply4.add(19 * (Double) deseasonDemand[18]);
            multiply4.add(20 * (Double) deseasonDemand[19]);
            multiply4.add(21 * (Double) deseasonDemand[20]);
            multiply4.add(22 * (Double) deseasonDemand[21]);
            multiply4.add(23 * (Double) deseasonDemand[22]);
            multiply4.add(24 * (Double) deseasonDemand[23]);

            double multiplySum4 = (Double) multiply4.get(0) + (Double) multiply4.get(1) + (Double) multiply4.get(2) + (Double) multiply4.get(3) + (Double) multiply4.get(4) + (Double) multiply4.get(5) + (Double) multiply4.get(6) + (Double) multiply4.get(7) + (Double) multiply4.get(8) + (Double) multiply4.get(9) + (Double) multiply4.get(10)
                    + (Double) multiply4.get(11) + (Double) multiply4.get(12) + (Double) multiply4.get(13) + (Double) multiply4.get(14) + (Double) multiply4.get(15) + (Double) multiply4.get(16) + (Double) multiply4.get(17) + (Double) multiply4.get(18) + (Double) multiply4.get(19) + (Double) multiply4.get(20) + (Double) multiply4.get(21) + (Double) multiply4.get(22) + (Double) multiply4.get(23);
            double b_degeri4 = ((24 * multiplySum4) - (deseasonSum[0] * 300)) / ((24 * sum_square4) - (300 * 300));
            double a_degeri4 = (averageDemand4 - (b_degeri4 * (300 / 24)));

            Arraylist tahmin4 = new Arraylist();
            tahmin4.add(a_degeri4 + (b_degeri4 * 25));
            tahmin4.add(a_degeri4 + (b_degeri4 * 26));
            tahmin4.add(a_degeri4 + (b_degeri4 * 27));
            tahmin4.add(a_degeri4 + (b_degeri4 * 28));
            tahmin4.add(a_degeri4 + (b_degeri4 * 29));
            tahmin4.add(a_degeri4 + (b_degeri4 * 30));
            tahmin4.add(a_degeri4 + (b_degeri4 * 31));
            tahmin4.add(a_degeri4 + (b_degeri4 * 32));
            tahmin4.add(a_degeri4 + (b_degeri4 * 33));
            tahmin4.add(a_degeri4 + (b_degeri4 * 34));
            tahmin4.add(a_degeri4 + (b_degeri4 * 35));
            tahmin4.add(a_degeri4 + (b_degeri4 * 36));

            Object[] seasonForecast = {seasonalDemandFactor[0] * (Double) tahmin4.get(0),
                seasonalDemandFactor[1] * (Double) tahmin4.get(1),
                seasonalDemandFactor[2] * (Double) tahmin4.get(2),
                seasonalDemandFactor[3] * (Double) tahmin4.get(3),
                seasonalDemandFactor[4] * (Double) tahmin4.get(4),
                seasonalDemandFactor[5] * (Double) tahmin4.get(5),
                seasonalDemandFactor[6] * (Double) tahmin4.get(6),
                seasonalDemandFactor[7] * (Double) tahmin4.get(7),
                seasonalDemandFactor[8] * (Double) tahmin4.get(8),
                seasonalDemandFactor[9] * (Double) tahmin4.get(9),
                seasonalDemandFactor[10] * (Double) tahmin4.get(10),
                seasonalDemandFactor[11] * (Double) tahmin4.get(11)
            };
            Object[] max4 = {(Double) seasonForecast[0], (Double) seasonForecast[1], (Double) seasonForecast[2], (Double) seasonForecast[3], (Double) seasonForecast[4], (Double) seasonForecast[5], (Double) seasonForecast[6], (Double) seasonForecast[7], (Double) seasonForecast[8], (Double) seasonForecast[9], (Double) seasonForecast[10], (Double) seasonForecast[11]};

            int j, P, Tmp;
            for (P = 1; P < 12; P++) {
                double Tmp2 = (Double) max4[P];
                for (j = P; j > 0 && (Double) max4[j - 1] > Tmp2; j--) {
                    max4[j] = max4[j - 1]; //Shift A[j-1] to right
                }
                max4[j] = Tmp2;
            }
            int uzunluk = max4.length;
            Object[] tersdizi = new Object[uzunluk];
            for (int i = 0; i < uzunluk; i++) {
                tersdizi[uzunluk - i - 1] = max4[i];
            }
            for (int i = 0; i < uzunluk; i++) {
                listModel.addElement(tersdizi[i]);
            }

            jList1.setModel(listModel);

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else{
             Arraylist list2 = new Arraylist();
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list2.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            Arraylist tahmin2 = new Arraylist();
            Arraylist s = new Arraylist();
            Arraylist g = new Arraylist();
            Arraylist doubleExponentialSmoothingForecast = new Arraylist();
            double x = 200.0;
            double y = 50.0;
         


            s.add((Double) list2.get(0) * a + (1 - a) * (x + y));
            g.add(a * ((Double) s.get(0) - x) + 0.8 * y);
            s.add(a * (Double) list2.get(1) + (1 - a) * ((Double) s.get(0) + (Double) g.get(0)));
            g.add(a * ((Double) s.get(1) - (Double) s.get(0)) + (1 - a) * (Double) g.get(0));
            s.add(a * (Double) list2.get(2) + (1 - a) * ((Double) s.get(1) + (Double) g.get(1)));
            g.add(a * ((Double) s.get(2) - (Double) s.get(1)) + (1 - a) * (Double) g.get(1));
            s.add(a * (Double) list2.get(3) + (1 - a) * ((Double) s.get(2) + (Double) g.get(2)));
            g.add(a * ((Double) s.get(3) - (Double) s.get(2)) + (1 - a) * (Double) g.get(2));
            s.add(a * (Double) list2.get(4) + (1 - a) * ((Double) s.get(3) + (Double) g.get(3)));
            g.add(a * ((Double) s.get(4) - (Double) s.get(3)) + (1 - a) * (Double) g.get(3));
            s.add(a * (Double) list2.get(5) + (1 - a) * ((Double) s.get(4) + (Double) g.get(4)));
            g.add(a * ((Double) s.get(5) - (Double) s.get(4)) + (1 - a) * (Double) g.get(4));
            s.add(a * (Double) list2.get(6) + (1 - a) * ((Double) s.get(5) + (Double) g.get(5)));
            g.add(a * ((Double) s.get(6) - (Double) s.get(5)) + (1 - a) * (Double) g.get(5));
            s.add(a * (Double) list2.get(7) + (1 - a) * ((Double) s.get(6) + (Double) g.get(6)));
            g.add(a * ((Double) s.get(7) - (Double) s.get(6)) + (1 - a) * (Double) g.get(6));
            s.add(a * (Double) list2.get(8) + (1 - a) * ((Double) s.get(7) + (Double) g.get(7)));
            g.add(a * ((Double) s.get(8) - (Double) s.get(7)) + (1 - a) * (Double) g.get(7));
            s.add(a * (Double) list2.get(9) + (1 - a) * ((Double) s.get(8) + (Double) g.get(8)));
            g.add(a * ((Double) s.get(9) - (Double) s.get(8)) + (1 - a) * (Double) g.get(8));
            s.add(a * (Double) list2.get(10) + (1 - a) * ((Double) s.get(9) + (Double) g.get(9)));
            g.add(a * ((Double) s.get(10) - (Double) s.get(9)) + (1 - a) * (Double) g.get(9));
            s.add(a * (Double) list2.get(11) + (1 - a) * ((Double) s.get(10) + (Double) g.get(10)));
            g.add(a * ((Double) s.get(11) - (Double) s.get(10)) + (1 - a) * (Double) g.get(10));

            s.add(a * (Double) list2.get(12) + (1 - a) * ((Double) s.get(11) + (Double) g.get(11)));
            g.add(a * ((Double) s.get(12) - (Double) s.get(11)) + (1 - a) * (Double) g.get(11));
            s.add(a * (Double) list2.get(13) + (1 - a) * ((Double) s.get(12) + (Double) g.get(12)));
            g.add(a * ((Double) s.get(13) - (Double) s.get(12)) + (1 - a) * (Double) g.get(12));
            s.add(a * (Double) list2.get(14) + (1 - a) * ((Double) s.get(13) + (Double) g.get(13)));
            g.add(a * ((Double) s.get(14) - (Double) s.get(13)) + (1 - a) * (Double) g.get(13));
            s.add(a * (Double) list2.get(15) + (1 - a) * ((Double) s.get(14) + (Double) g.get(14)));
            g.add(a * ((Double) s.get(15) - (Double) s.get(14)) + (1 - a) * (Double) g.get(14));
            s.add(a * (Double) list2.get(16) + (1 - a) * ((Double) s.get(15) + (Double) g.get(15)));
            g.add(a * ((Double) s.get(16) - (Double) s.get(15)) + (1 - a) * (Double) g.get(15));
            s.add(a * (Double) list2.get(17) + (1 - a) * ((Double) s.get(16) + (Double) g.get(16)));
            g.add(a * ((Double) s.get(17) - (Double) s.get(16)) + (1 - a) * (Double) g.get(16));
            s.add(a * (Double) list2.get(18) + (1 - a) * ((Double) s.get(17) + (Double) g.get(17)));
            g.add(a * ((Double) s.get(18) - (Double) s.get(17)) + (1 - a) * (Double) g.get(17));
            s.add(a * (Double) list2.get(19) + (1 - a) * ((Double) s.get(18) + (Double) g.get(18)));
            g.add(a * ((Double) s.get(19) - (Double) s.get(18)) + (1 - a) * (Double) g.get(18));
            s.add(a * (Double) list2.get(20) + (1 - a) * ((Double) s.get(19) + (Double) g.get(19)));
            g.add(a * ((Double) s.get(20) - (Double) s.get(19)) + (1 - a) * (Double) g.get(19));
            s.add(a * (Double) list2.get(21) + (1 - a) * ((Double) s.get(20) + (Double) g.get(20)));
            g.add(a * ((Double) s.get(21) - (Double) s.get(20)) + (1 - a) * (Double) g.get(20));
            s.add(a * (Double) list2.get(22) + (1 - a) * ((Double) s.get(21) + (Double) g.get(21)));
            g.add(a * ((Double) s.get(22) - (Double) s.get(21)) + (1 - a) * (Double) g.get(21));
            s.add(a * (Double) list2.get(23) + (1 - a) * ((Double) s.get(22) + (Double) g.get(22)));
            g.add(a * ((Double) s.get(23) - (Double) s.get(22)) + (1 - a) * (Double) g.get(22));
           
            tahmin1.add(x+y);
            tahmin1.add((Double) s.get(0) + (Double) g.get(0));
            tahmin1.add((Double) s.get(1) + (Double) g.get(1));
            tahmin1.add((Double) s.get(2) + (Double) g.get(2));
            tahmin1.add((Double) s.get(3) + (Double) g.get(3));
            tahmin1.add((Double) s.get(4) + (Double) g.get(4));
            tahmin1.add((Double) s.get(5) + (Double) g.get(5));
            tahmin1.add((Double) s.get(6) + (Double) g.get(6));
            tahmin1.add((Double) s.get(7) + (Double) g.get(7));
            tahmin1.add((Double) s.get(8) + (Double) g.get(8));
            tahmin1.add((Double) s.get(9) + (Double) g.get(9));
            tahmin1.add((Double) s.get(10) + (Double) g.get(10));
           
            tahmin1.add((Double) s.get(11) + (Double) g.get(11));
            tahmin1.add((Double) s.get(12) + (Double) g.get(12));
            tahmin1.add((Double) s.get(13) + (Double) g.get(13));
            tahmin1.add((Double) s.get(14) + (Double) g.get(14));
            tahmin1.add((Double) s.get(15) + (Double) g.get(15));
            tahmin1.add((Double) s.get(16) + (Double) g.get(16));
            tahmin1.add((Double) s.get(17) + (Double) g.get(17));
            tahmin1.add((Double) s.get(18) + (Double) g.get(18));
            tahmin1.add((Double) s.get(19) + (Double) g.get(19));
            tahmin1.add((Double) s.get(20) + (Double) g.get(20));
            tahmin1.add((Double) s.get(21) + (Double) g.get(21));
            tahmin1.add((Double) s.get(22) + (Double) g.get(22));
            tahmin1.add((Double) s.get(23) + (Double) g.get(23));

            Arraylist errorDouble = new Arraylist();
            errorDouble.add((Double)tahmin1.get(0)-(Double)list2.get(0));
            errorDouble.add((Double) tahmin1.get(1) - (Double) list2.get(0));
            errorDouble.add((Double) tahmin1.get(2) - (Double) list2.get(1));
            errorDouble.add((Double) tahmin1.get(3) - (Double) list2.get(2));
            errorDouble.add((Double) tahmin1.get(4) - (Double) list2.get(3));
            errorDouble.add((Double) tahmin1.get(5) - (Double) list2.get(4));
            errorDouble.add((Double) tahmin1.get(6) - (Double) list2.get(5));
            errorDouble.add((Double) tahmin1.get(7) - (Double) list2.get(6));
            errorDouble.add((Double) tahmin1.get(8) - (Double) list2.get(7));
            errorDouble.add((Double) tahmin1.get(9) - (Double) list2.get(8));
            errorDouble.add((Double) tahmin1.get(10) - (Double) list2.get(9));
            errorDouble.add((Double) tahmin1.get(11) - (Double) list2.get(10));
            errorDouble.add((Double) tahmin1.get(12) - (Double) list2.get(11));
            errorDouble.add((Double) tahmin1.get(13) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin1.get(14) - (Double) list2.get(12));
            errorDouble.add((Double) tahmin1.get(15) - (Double) list2.get(14));
            errorDouble.add((Double) tahmin1.get(16) - (Double) list2.get(15));
            errorDouble.add((Double) tahmin1.get(17) - (Double) list2.get(16));
            errorDouble.add((Double) tahmin1.get(18) - (Double) list2.get(17));
            errorDouble.add((Double) tahmin1.get(19) - (Double) list2.get(18));
            errorDouble.add((Double) tahmin1.get(20) - (Double) list2.get(19));
            errorDouble.add((Double) tahmin1.get(21) - (Double) list2.get(20));
            errorDouble.add((Double) tahmin1.get(22) - (Double) list2.get(21));
            errorDouble.add((Double) tahmin1.get(23) - (Double) list2.get(22));
            errorDouble.add((Double) tahmin1.get(24) - (Double) list2.get(23));
             double[] ort2 = {((Double)tahmin1.get(0)-(Double)list2.get(0))*((Double)tahmin1.get(0)-(Double)list2.get(0)),((Double) tahmin1.get(1) - (Double) list2.get(1)) * ((Double) tahmin1.get(1) - (Double) list2.get(1)), ((Double) tahmin1.get(2) - (Double) list2.get(2)) * ((Double) tahmin1.get(2) - (Double) list2.get(2)), ((Double) tahmin1.get(3) - (Double) list2.get(3)) * ((Double) tahmin1.get(3) - (Double) list2.get(3)),
                ((Double) tahmin1.get(4) - (Double) list2.get(4)) * ((Double) tahmin1.get(4) - (Double) list2.get(4)), ((Double) tahmin1.get(5) - (Double) list2.get(5)) * ((Double) tahmin1.get(5) - (Double) list2.get(5)), ((Double) tahmin1.get(6) - (Double) list2.get(6)) * ((Double) tahmin1.get(6) - (Double) list2.get(6)),
                ((Double) tahmin1.get(7) - (Double) list2.get(7)) * ((Double) tahmin1.get(7) - (Double) list2.get(7)), ((Double) tahmin1.get(8) - (Double) list2.get(8)) * ((Double) tahmin1.get(8) - (Double) list2.get(8)), ((Double) tahmin1.get(9) - (Double) list2.get(9)) * ((Double) tahmin1.get(9) - (Double) list2.get(9)), ((Double) tahmin1.get(10) - (Double) list2.get(10)) * ((Double) tahmin1.get(10) - (Double) list2.get(10)),
                ((Double) tahmin1.get(11) - (Double) list2.get(11)) * ((Double) tahmin1.get(11) - (Double) list2.get(11)), ((Double) tahmin1.get(12) - (Double) list2.get(12)) * ((Double) tahmin1.get(12) - (Double) list2.get(12)), ((Double) tahmin1.get(13) - (Double) list2.get(13)) * ((Double) tahmin1.get(13) - (Double) list2.get(13)), ((Double) tahmin1.get(14) - (Double) list2.get(14)) * ((Double) tahmin1.get(14) - (Double) list2.get(14)), ((Double) tahmin1.get(15) - (Double) list2.get(15)) * ((Double) tahmin1.get(15) - (Double) list2.get(15)), ((Double) tahmin1.get(16) - (Double) list2.get(16)) * ((Double) tahmin1.get(16) - (Double) list2.get(16)), ((Double) tahmin1.get(17) - (Double) list2.get(17)) * ((Double) tahmin1.get(17) - (Double) list2.get(17)), ((Double) tahmin1.get(18) - (Double) list2.get(18)) * ((Double) tahmin1.get(18) - (Double) list2.get(18)), ((Double) tahmin1.get(19) - (Double) list2.get(19)) * ((Double) tahmin1.get(19) - (Double) list2.get(19)), ((Double) tahmin1.get(20) - (Double) list2.get(20)) * ((Double) tahmin1.get(20) - (Double) list2.get(20)), ((Double) tahmin1.get(21) - (Double) list2.get(21)) * ((Double) tahmin1.get(21) - (Double) list2.get(21)), ((Double) tahmin1.get(22) - (Double) list2.get(22)) * ((Double) tahmin1.get(22) - (Double) list2.get(22)), ((Double) tahmin1.get(23) - (Double) list2.get(23)) * ((Double) tahmin1.get(23) - (Double) list2.get(23))

            };
            double[] mse2 = {((ort2[0] + ort2[1] + ort2[2] + ort2[3] + ort2[4] + ort2[5] + ort2[6] + ort2[7] + ort2[8] + ort2[9] + ort2[10] + ort2[11] + ort2[12] + ort2[13] + ort2[14] + ort2[15] + ort2[16] + ort2[17] + ort2[18] + ort2[19] + ort2[20] + ort2[21] + ort2[22] + ort2[23])) / 24};
            message_lbl.setText("For double exponential smoothing , MSE:" + mse2[0]);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list = new Arraylist();

            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            tahmin1.add(list.get(0));
            tahmin1.add((Double) list.get(0) * a + (Double) tahmin1.get(0) * (1 - a));
            tahmin1.add((Double) list.get(1) * a + (Double) tahmin1.get(1) * (1 - a));
            tahmin1.add((Double) list.get(2) * a + (Double) tahmin1.get(2) * (1 - a));
            tahmin1.add((Double) list.get(3) * a + (Double) tahmin1.get(3) * (1 - a));
            tahmin1.add((Double) list.get(4) * a + (Double) tahmin1.get(4) * (1 - a));
            tahmin1.add((Double) list.get(5) * a + (Double) tahmin1.get(5) * (1 - a));
            tahmin1.add((Double) list.get(6) * a + (Double) tahmin1.get(6) * (1 - a));
            tahmin1.add((Double) list.get(7) * a + (Double) tahmin1.get(7) * (1 - a));
            tahmin1.add((Double) list.get(8) * a + (Double) tahmin1.get(8) * (1 - a));
            tahmin1.add((Double) list.get(9) * a + (Double) tahmin1.get(9) * (1 - a));
            tahmin1.add((Double) list.get(10) * a + (Double) tahmin1.get(10) * (1 - a));
            tahmin1.add(a * (Double) list.get(11) + (Double) tahmin1.get(11) * (1 - a));

            tahmin1.add((Double) list.get(12) * a + (Double) tahmin1.get(12) * (1 - a));
            tahmin1.add((Double) list.get(13) * a + (Double) tahmin1.get(13) * (1 - a));
            tahmin1.add((Double) list.get(14) * a + (Double) tahmin1.get(14) * (1 - a));
            tahmin1.add((Double) list.get(15) * a + (Double) tahmin1.get(15) * (1 - a));
            tahmin1.add((Double) list.get(16) * a + (Double) tahmin1.get(16) * (1 - a));
            tahmin1.add((Double) list.get(17) * a + (Double) tahmin1.get(17) * (1 - a));
            tahmin1.add((Double) list.get(18) * a + (Double) tahmin1.get(18) * (1 - a));
            tahmin1.add((Double) list.get(19) * a + (Double) tahmin1.get(19) * (1 - a));
            tahmin1.add((Double) list.get(20) * a + (Double) tahmin1.get(20) * (1 - a));
            tahmin1.add((Double) list.get(21) * a + (Double) tahmin1.get(21) * (1 - a));
            tahmin1.add((Double) list.get(22) * a + (Double) tahmin1.get(22) * (1 - a));
            tahmin1.add((Double) list.get(23) * a + (Double) tahmin1.get(23) * (1 - a));

            error1.add(0);
            error1.add(((Double) tahmin1.get(1) - (Double) list.get(1)) * ((Double) tahmin1.get(1) - (Double) list.get(1)));
            error1.add(((Double) tahmin1.get(2) - (Double) list.get(2)) * ((Double) tahmin1.get(2) - (Double) list.get(2)));
            error1.add(((Double) tahmin1.get(3) - (Double) list.get(3)) * ((Double) tahmin1.get(3) - (Double) list.get(3)));
            error1.add(((Double) tahmin1.get(4) - (Double) list.get(4)) * ((Double) tahmin1.get(4) - (Double) list.get(4)));
            error1.add(((Double) tahmin1.get(5) - (Double) list.get(5)) * ((Double) tahmin1.get(5) - (Double) list.get(5)));
            error1.add(((Double) tahmin1.get(6) - (Double) list.get(6)) * ((Double) tahmin1.get(6) - (Double) list.get(6)));
            error1.add(((Double) tahmin1.get(7) - (Double) list.get(7)) * ((Double) tahmin1.get(7) - (Double) list.get(7)));
            error1.add(((Double) tahmin1.get(8) - (Double) list.get(8)) * ((Double) tahmin1.get(8) - (Double) list.get(8)));
            error1.add(((Double) tahmin1.get(9) - (Double) list.get(9)) * ((Double) tahmin1.get(9) - (Double) list.get(9)));
            error1.add(((Double) tahmin1.get(10) - (Double) list.get(10)) * ((Double) tahmin1.get(10) - (Double) list.get(10)));
            error1.add(((Double) tahmin1.get(11) - (Double) list.get(11)) * ((Double) tahmin1.get(11) - (Double) list.get(11)));
            error1.add(((Double) tahmin1.get(12) - (Double) list.get(12)) * ((Double) tahmin1.get(12) - (Double) list.get(12)));
            error1.add(((Double) tahmin1.get(13) - (Double) list.get(13)) * ((Double) tahmin1.get(13) - (Double) list.get(13)));
            error1.add(((Double) tahmin1.get(14) - (Double) list.get(14)) * ((Double) tahmin1.get(14) - (Double) list.get(14)));
            error1.add(((Double) tahmin1.get(15) - (Double) list.get(15)) * ((Double) tahmin1.get(15) - (Double) list.get(15)));
            error1.add(((Double) tahmin1.get(16) - (Double) list.get(16)) * ((Double) tahmin1.get(16) - (Double) list.get(16)));
            error1.add(((Double) tahmin1.get(17) - (Double) list.get(17)) * ((Double) tahmin1.get(17) - (Double) list.get(17)));
            error1.add(((Double) tahmin1.get(18) - (Double) list.get(18)) * ((Double) tahmin1.get(18) - (Double) list.get(18)));
            error1.add(((Double) tahmin1.get(19) - (Double) list.get(19)) * ((Double) tahmin1.get(19) - (Double) list.get(19)));
            error1.add(((Double) tahmin1.get(20) - (Double) list.get(20)) * ((Double) tahmin1.get(20) - (Double) list.get(20)));
            error1.add(((Double) tahmin1.get(21) - (Double) list.get(21)) * ((Double) tahmin1.get(21) - (Double) list.get(21)));
            error1.add(((Double) tahmin1.get(22) - (Double) list.get(22)) * ((Double) tahmin1.get(22) - (Double) list.get(22)));
            error1.add(((Double) tahmin1.get(23) - (Double) list.get(23)) * ((Double) tahmin1.get(23) - (Double) list.get(23)));

            double[] ort1 = {0, ((Double) tahmin1.get(1) - (Double) list.get(1)) * ((Double) tahmin1.get(1) - (Double) list.get(1)), ((Double) tahmin1.get(2) - (Double) list.get(2)) * ((Double) tahmin1.get(2) - (Double) list.get(2)), ((Double) tahmin1.get(3) - (Double) list.get(3)) * ((Double) tahmin1.get(3) - (Double) list.get(3)),
                ((Double) tahmin1.get(4) - (Double) list.get(4)) * ((Double) tahmin1.get(4) - (Double) list.get(4)), ((Double) tahmin1.get(5) - (Double) list.get(5)) * ((Double) tahmin1.get(5) - (Double) list.get(5)), ((Double) tahmin1.get(6) - (Double) list.get(6)) * ((Double) tahmin1.get(6) - (Double) list.get(6)),
                ((Double) tahmin1.get(7) - (Double) list.get(7)) * ((Double) tahmin1.get(7) - (Double) list.get(7)), ((Double) tahmin1.get(8) - (Double) list.get(8)) * ((Double) tahmin1.get(8) - (Double) list.get(8)), ((Double) tahmin1.get(9) - (Double) list.get(9)) * ((Double) tahmin1.get(9) - (Double) list.get(9)), ((Double) tahmin1.get(10) - (Double) list.get(10)) * ((Double) tahmin1.get(10) - (Double) list.get(10)),
                ((Double) tahmin1.get(11) - (Double) list.get(11)) * ((Double) tahmin1.get(11) - (Double) list.get(11)), ((Double) tahmin1.get(12) - (Double) list.get(12)) * ((Double) tahmin1.get(12) - (Double) list.get(12)), ((Double) tahmin1.get(13) - (Double) list.get(13)) * ((Double) tahmin1.get(13) - (Double) list.get(13)), ((Double) tahmin1.get(14) - (Double) list.get(14)) * ((Double) tahmin1.get(14) - (Double) list.get(14)), ((Double) tahmin1.get(15) - (Double) list.get(15)) * ((Double) tahmin1.get(15) - (Double) list.get(15)), ((Double) tahmin1.get(16) - (Double) list.get(16)) * ((Double) tahmin1.get(16) - (Double) list.get(16)), ((Double) tahmin1.get(17) - (Double) list.get(17)) * ((Double) tahmin1.get(17) - (Double) list.get(17)), ((Double) tahmin1.get(18) - (Double) list.get(18)) * ((Double) tahmin1.get(18) - (Double) list.get(18)), ((Double) tahmin1.get(19) - (Double) list.get(19)) * ((Double) tahmin1.get(19) - (Double) list.get(19)), ((Double) tahmin1.get(20) - (Double) list.get(20)) * ((Double) tahmin1.get(20) - (Double) list.get(20)), ((Double) tahmin1.get(21) - (Double) list.get(21)) * ((Double) tahmin1.get(21) - (Double) list.get(21)), ((Double) tahmin1.get(22) - (Double) list.get(22)) * ((Double) tahmin1.get(22) - (Double) list.get(22)), ((Double) tahmin1.get(23) - (Double) list.get(23)) * ((Double) tahmin1.get(23) - (Double) list.get(23))

            };
            double[] mse1 = {((ort1[0] + ort1[1] + ort1[2] + ort1[3] + ort1[4] + ort1[5] + ort1[6] + ort1[7] + ort1[8] + ort1[9] + ort1[10] + ort1[11] + ort1[12] + ort1[13] + ort1[14] + ort1[15] + ort1[16] + ort1[17] + ort1[18] + ort1[19] + ort1[20] + ort1[21] + ort1[22] + ort1[23])) / 24};
            message_lbl.setText("For exponential smoothing , MSE:" + mse1[0]);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel model = (DefaultTableModel) datasetTable.getModel();
        DefaultListModel listModel = new DefaultListModel();
        Arraylist tahmin1 = new Arraylist();
        Arraylist error1 = new Arraylist();

        double a = 0.2;
        int[] selectedRow = datasetTable.getSelectedRows();

        if (selectedRow.length == 0) {
            if (datasetTable.getRowCount() == 0) {
                message_lbl.setText("Dataset table is empty now! ");
            } else {
                message_lbl.setText("Select 2 dataset..");
            }
        } else {
            Arraylist list3 = new Arraylist();
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[0], 12).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 1).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 2).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 3).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 4).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 5).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 6).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 7).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 8).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 9).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 10).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 11).toString()));
            list3.add(Double.parseDouble(model.getValueAt(selectedRow[1], 12).toString()));

            double sumDemand = (Double) list3.get(0) + (Double) list3.get(1) + (Double) list3.get(2) + (Double) list3.get(3) + (Double) list3.get(4) + (Double) list3.get(5) + (Double) list3.get(6) + (Double) list3.get(7) + (Double) list3.get(8) + (Double) list3.get(9) + (Double) list3.get(10) + (Double) list3.get(11) + (Double) list3.get(12) + (Double) list3.get(13) + (Double) list3.get(14) + (Double) list3.get(15) + (Double) list3.get(16) + (Double) list3.get(17) + (Double) list3.get(18) + (Double) list3.get(19) + (Double) list3.get(20) + (Double) list3.get(21) + (Double) list3.get(22) + (Double) list3.get(23);
            //  double sum_x = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12+13+14+15+16+17+18+19+20+21+22+23+24);
            double sum_x = 300;
            //double sum_square=1+Math.sqrt(2)+Math.sqrt(3)+Math.sqrt(4)+Math.sqrt(5)+Math.sqrt(6)+Math.sqrt(7)+Math.sqrt(8)+Math.sqrt(9)+Math.sqrt(10)+Math.sqrt(11)+Math.sqrt(12);

            double sum_square = 4900.0;

            Arraylist multiply = new Arraylist();
            multiply.add(list3.get(0));
            multiply.add(2 * (Double) list3.get(1));
            multiply.add(3 * (Double) list3.get(2));
            multiply.add(4 * (Double) list3.get(3));
            multiply.add(5 * (Double) list3.get(4));
            multiply.add(6 * (Double) list3.get(5));
            multiply.add(7 * (Double) list3.get(6));
            multiply.add(8 * (Double) list3.get(7));
            multiply.add(9 * (Double) list3.get(8));
            multiply.add(10 * (Double) list3.get(9));
            multiply.add(11 * (Double) list3.get(10));
            multiply.add(12 * (Double) list3.get(11));
            multiply.add(13 * (Double) list3.get(12));
            multiply.add(14 * (Double) list3.get(13));
            multiply.add(15 * (Double) list3.get(14));
            multiply.add(16 * (Double) list3.get(15));
            multiply.add(17 * (Double) list3.get(16));
            multiply.add(18 * (Double) list3.get(17));
            multiply.add(19 * (Double) list3.get(18));
            multiply.add(20 * (Double) list3.get(19));
            multiply.add(21 * (Double) list3.get(20));
            multiply.add(22 * (Double) list3.get(21));
            multiply.add(23 * (Double) list3.get(22));
            multiply.add(24 * (Double) list3.get(23));

            double multiplySum = (Double) multiply.get(0) + (Double) multiply.get(1) + (Double) multiply.get(2) + (Double) multiply.get(3) + (Double) multiply.get(4) + (Double) multiply.get(5) + (Double) multiply.get(6) + (Double) multiply.get(7) + (Double) multiply.get(8) + (Double) multiply.get(9) + (Double) multiply.get(10)
                    + (Double) multiply.get(11) + (Double) multiply.get(12) + (Double) multiply.get(13) + (Double) multiply.get(14) + (Double) multiply.get(15) + (Double) multiply.get(16) + (Double) multiply.get(17) + (Double) multiply.get(18) + (Double) multiply.get(19) + (Double) multiply.get(20) + (Double) multiply.get(21) + (Double) multiply.get(22) + (Double) multiply.get(23);
            double b_degeri = (24 * multiplySum - (sum_x * sumDemand)) / (24 * sum_square - (sum_x * sum_x));
            double a_degeri = sumDemand / 24 - b_degeri * sum_x / 24;

            Arraylist tahmin3 = new Arraylist();
            tahmin3.add(a_degeri + b_degeri * 1);
            tahmin3.add(a_degeri + b_degeri * 2);
            tahmin3.add(a_degeri + b_degeri * 3);
            tahmin3.add(a_degeri + b_degeri * 4);
            tahmin3.add(a_degeri + b_degeri * 5);
            tahmin3.add(a_degeri + b_degeri * 6);
            tahmin3.add(a_degeri + b_degeri * 7);
            tahmin3.add(a_degeri + b_degeri * 8);
            tahmin3.add(a_degeri + b_degeri * 9);
            tahmin3.add(a_degeri + b_degeri * 10);
            tahmin3.add(a_degeri + b_degeri * 11);
            tahmin3.add(a_degeri + b_degeri * 12);
            tahmin3.add(a_degeri + b_degeri * 13);
            tahmin3.add(a_degeri + b_degeri * 14);
            tahmin3.add(a_degeri + b_degeri * 15);
            tahmin3.add(a_degeri + b_degeri * 16);
            tahmin3.add(a_degeri + b_degeri * 17);
            tahmin3.add(a_degeri + b_degeri * 18);
            tahmin3.add(a_degeri + b_degeri * 19);
            tahmin3.add(a_degeri + b_degeri * 20);
            tahmin3.add(a_degeri + b_degeri * 21);
            tahmin3.add(a_degeri + b_degeri * 22);
            tahmin3.add(a_degeri + b_degeri * 23);
            tahmin3.add(a_degeri + b_degeri * 24);

            Arraylist error3 = new Arraylist();
            error3.add((Double) tahmin3.get(0) - (Double) list3.get(0));
            error3.add((Double) tahmin3.get(1) - (Double) list3.get(1));
            error3.add((Double) tahmin3.get(2) - (Double) list3.get(2));
            error3.add((Double) tahmin3.get(3) - (Double) list3.get(3));
            error3.add((Double) tahmin3.get(4) - (Double) list3.get(4));
            error3.add((Double) tahmin3.get(5) - (Double) list3.get(5));
            error3.add((Double) tahmin3.get(6) - (Double) list3.get(6));
            error3.add((Double) tahmin3.get(7) - (Double) list3.get(7));
            error3.add((Double) tahmin3.get(8) - (Double) list3.get(8));
            error3.add((Double) tahmin3.get(9) - (Double) list3.get(9));
            error3.add((Double) tahmin3.get(10) - (Double) list3.get(10));
            error3.add((Double) tahmin3.get(11) - (Double) list3.get(11));
            error3.add((Double) tahmin3.get(12) - (Double) list3.get(12));

            error3.add((Double) tahmin3.get(13) - (Double) list3.get(13));
            error3.add((Double) tahmin3.get(14) - (Double) list3.get(14));
            error3.add((Double) tahmin3.get(15) - (Double) list3.get(15));
            error3.add((Double) tahmin3.get(16) - (Double) list3.get(16));
            error3.add((Double) tahmin3.get(17) - (Double) list3.get(17));
            error3.add((Double) tahmin3.get(18) - (Double) list3.get(18));
            error3.add((Double) tahmin3.get(19) - (Double) list3.get(19));
            error3.add((Double) tahmin3.get(20) - (Double) list3.get(20));
            error3.add((Double) tahmin3.get(21) - (Double) list3.get(21));
            error3.add((Double) tahmin3.get(22) - (Double) list3.get(22));
            error3.add((Double) tahmin3.get(23) - (Double) list3.get(23));

            double[] ort3 = {((Double) tahmin3.get(0) - (Double) list3.get(0)) * ((Double) tahmin3.get(0) - (Double) list3.get(0)), ((Double) tahmin3.get(1) - (Double) list3.get(1)) * ((Double) tahmin3.get(1) - (Double) list3.get(1)), ((Double) tahmin3.get(2) - (Double) list3.get(2)) * ((Double) tahmin3.get(2) - (Double) list3.get(2)),
                ((Double) tahmin3.get(3) - (Double) list3.get(3)) * ((Double) tahmin3.get(3) - (Double) list3.get(3)), ((Double) tahmin3.get(4) - (Double) list3.get(4)) * ((Double) tahmin3.get(4) - (Double) list3.get(4)), ((Double) tahmin3.get(5) - (Double) list3.get(5)) * ((Double) tahmin3.get(5) - (Double) list3.get(5)),
                ((Double) tahmin3.get(6) - (Double) list3.get(6)) * ((Double) tahmin3.get(6) - (Double) list3.get(6)), ((Double) tahmin3.get(7) - (Double) list3.get(7)) * ((Double) tahmin3.get(7) - (Double) list3.get(7)), ((Double) tahmin3.get(8) - (Double) list3.get(8)) * ((Double) tahmin3.get(8) - (Double) list3.get(8)), ((Double) tahmin3.get(9) - (Double) list3.get(9)) * ((Double) tahmin3.get(9) - (Double) list3.get(9)),
                ((Double) tahmin3.get(10) - (Double) list3.get(10)) * ((Double) tahmin3.get(10) - (Double) list3.get(10)),
                ((Double) tahmin3.get(11) - (Double) list3.get(11)) * ((Double) tahmin3.get(11) - (Double) list3.get(11)),
                ((Double) tahmin3.get(12) - (Double) list3.get(12)) * ((Double) tahmin3.get(12) - (Double) list3.get(12)),
                ((Double) tahmin3.get(13) - (Double) list3.get(13)) * ((Double) tahmin3.get(13) - (Double) list3.get(13)), ((Double) tahmin3.get(14) - (Double) list3.get(14)) * ((Double) tahmin3.get(14) - (Double) list3.get(14)), ((Double) tahmin3.get(15) - (Double) list3.get(15)) * ((Double) tahmin3.get(15) - (Double) list3.get(15)), ((Double) tahmin3.get(16) - (Double) list3.get(16)) * ((Double) tahmin3.get(16) - (Double) list3.get(16)),
                ((Double) tahmin3.get(17) - (Double) list3.get(17)) * ((Double) tahmin3.get(17) - (Double) list3.get(17)), ((Double) tahmin3.get(18) - (Double) list3.get(18)) * ((Double) tahmin3.get(18) - (Double) list3.get(18)), ((Double) tahmin3.get(19) - (Double) list3.get(19)) * ((Double) tahmin3.get(19) - (Double) list3.get(19)), ((Double) tahmin3.get(20) - (Double) list3.get(20)) * ((Double) tahmin3.get(20) - (Double) list3.get(20)),
                ((Double) tahmin3.get(21) - (Double) list3.get(21)) * ((Double) tahmin3.get(21) - (Double) list3.get(21)), ((Double) tahmin3.get(22) - (Double) list3.get(22)) * ((Double) tahmin3.get(22) - (Double) list3.get(22)), ((Double) tahmin3.get(23) - (Double) list3.get(23)) * ((Double) tahmin3.get(23) - (Double) list3.get(23))

            };
            double[] mse3 = {(ort3[0] + ort3[1] + ort3[2] + ort3[3] + ort3[4] + ort3[5] + ort3[6] + ort3[7] + ort3[8] + ort3[9] + ort3[10] + ort3[11] + ort3[12] + ort3[13] + ort3[14] + ort3[15] + ort3[16] + ort3[17] + ort3[18] + ort3[19] + ort3[20] + ort3[21] + ort3[22] + ort3[23]) / 24};

            message_lbl.setText("For regression analysis , MSE:" + mse3[0]);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoubleExp_bttn;
    private javax.swing.JTable datasetTable;
    private javax.swing.JButton delete_bttn;
    private javax.swing.JButton dexpMax_bttn;
    private javax.swing.JButton dexpMin_bttn;
    private javax.swing.JButton dexpSort_bttn;
    private javax.swing.JButton expMax_bttn;
    private javax.swing.JButton expMin_bttn;
    private javax.swing.JButton expSort_bttn;
    private javax.swing.JButton exponential_bttn;
    private javax.swing.JButton insertDataset_bttn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton maxDemand_bttn;
    private javax.swing.JButton maxReg_bttn;
    private javax.swing.JButton max_bttn;
    private javax.swing.JLabel message_lbl;
    private javax.swing.JButton minReg_bttn;
    private javax.swing.JButton min_demand;
    private javax.swing.JButton reg_bttn;
    private javax.swing.JButton reverse_bttn;
    private javax.swing.JTextField search_tf;
    private javax.swing.JButton sortReg_bttn;
    private javax.swing.JTextField tf_april;
    private javax.swing.JTextField tf_august;
    private javax.swing.JTextField tf_datasetName;
    private javax.swing.JTextField tf_december;
    private javax.swing.JTextField tf_february;
    private javax.swing.JTextField tf_january;
    private javax.swing.JTextField tf_july;
    private javax.swing.JTextField tf_june;
    private javax.swing.JTextField tf_march;
    private javax.swing.JTextField tf_may;
    private javax.swing.JTextField tf_november;
    private javax.swing.JTextField tf_october;
    private javax.swing.JTextField tf_september;
    private javax.swing.JButton update_bttn;
    private javax.swing.JButton utilize_bttn;
    // End of variables declaration//GEN-END:variables

}
