
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class main extends javax.swing.JFrame {

 int donerspiner,pizzaspiner,burgerspiner,ayranspiner,meyvespiner,kolaspiner;
 double donerfiyat,pizzafiyat,burgerfiyat,ayranfiyat,meyvefiyat,kolafiyat;
 final double donerf=6,pizzaf=10,burgerf=8,ayranf=3,meyvef=5,kolaf=6;
 double toplam,masa,toplama;
 int faturano;
 PrintWriter output;
    
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncikis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ttt = new javax.swing.JLabel();
        spiner4 = new javax.swing.JSpinner();
        spiner5 = new javax.swing.JSpinner();
        spiner6 = new javax.swing.JSpinner();
        lblayran = new javax.swing.JLabel();
        lblmeyve = new javax.swing.JLabel();
        lblkola = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnodeme = new javax.swing.JButton();
        btnyeni = new javax.swing.JButton();
        btnkaydet = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        spiner1 = new javax.swing.JSpinner();
        spiner2 = new javax.swing.JSpinner();
        spiner3 = new javax.swing.JSpinner();
        box1 = new javax.swing.JCheckBox();
        box2 = new javax.swing.JCheckBox();
        box3 = new javax.swing.JCheckBox();
        lbldoner = new javax.swing.JLabel();
        lblpizza = new javax.swing.JLabel();
        lblburger = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbltoplam = new javax.swing.JLabel();
        lblmasa = new javax.swing.JLabel();
        lbltoplama = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblrakam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btncikis.setText("Çıkış");
        btncikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncikisActionPerformed(evt);
            }
        });

        jLabel1.setText("Restorant Yönetim Sistemi");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İÇECEKLER", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 204))); // NOI18N

        jLabel2.setText("Ayran :");

        jLabel3.setText("Meyve suyu :");

        ttt.setText("Kola :");

        spiner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiner4StateChanged(evt);
            }
        });

        spiner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiner5StateChanged(evt);
            }
        });

        spiner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiner6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiner6StateChanged(evt);
            }
        });

        lblayran.setText("0.0 TL");

        lblmeyve.setText("0.0 TL");

        lblkola.setText("0.0 TL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttt)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spiner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spiner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spiner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblayran)
                    .addComponent(lblmeyve)
                    .addComponent(lblkola))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spiner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblayran))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spiner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmeyve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttt)
                    .addComponent(spiner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblkola))
                .addGap(32, 32, 32))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FATURA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 204))); // NOI18N

        btnodeme.setText("Hesapla");
        btnodeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnodemeActionPerformed(evt);
            }
        });

        btnyeni.setText("Yeni Fatura");
        btnyeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyeniActionPerformed(evt);
            }
        });

        btnkaydet.setText("Fatura Kaydet");
        btnkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnodeme)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnyeni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnkaydet)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnodeme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnyeni)
                    .addComponent(btnkaydet))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "YEMEKLER", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 204))); // NOI18N

        jLabel14.setText("Döner :");

        jLabel15.setText("Pizza :");

        jLabel16.setText("Burgre :");

        spiner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiner1StateChanged(evt);
            }
        });

        spiner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiner2StateChanged(evt);
            }
        });

        spiner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiner3StateChanged(evt);
            }
        });

        box1.setText("ekstra peynir");
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        box2.setText("ekstra peynir");
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });

        box3.setText("ekstra peynir");
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });

        lbldoner.setText("0.0 TL");

        lblpizza.setText("0.0 TL");

        lblburger.setText("0.0 TL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spiner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spiner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(58, 58, 58)
                        .addComponent(spiner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box1)
                    .addComponent(box2)
                    .addComponent(box3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldoner)
                    .addComponent(lblpizza)
                    .addComponent(lblburger))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(spiner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box1)
                    .addComponent(lbldoner))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(spiner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box2)
                    .addComponent(lblpizza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(spiner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box3)
                    .addComponent(lblburger))
                .addGap(30, 30, 30))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FATURA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 204))); // NOI18N

        jLabel20.setText("Toplam :");

        jLabel21.setText("Masa :");

        jLabel22.setText("Toplama :");

        lbltoplam.setText("0.0 TL");

        lblmasa.setText("0.0 TL");

        lbltoplama.setText("0.0 TL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltoplam)
                    .addComponent(lblmasa)
                    .addComponent(lbltoplama))
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lbltoplam))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lblmasa))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(lbltoplama)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel22)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel26.setText("Fatura numarası :");

        lblrakam.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btncikis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel26)
                .addGap(48, 48, 48)
                .addComponent(lblrakam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(533, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btncikis))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(lblrakam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spiner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiner1StateChanged
       donerspiner=(Integer) spiner1.getValue();
       donerfiyat=donerf*donerspiner;
       lbldoner.setText(donerfiyat+" TL");
    }//GEN-LAST:event_spiner1StateChanged

    private void spiner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiner2StateChanged
       pizzaspiner=(Integer) spiner2.getValue();
       pizzafiyat=pizzaf*pizzaspiner;
       lblpizza.setText(pizzafiyat+" TL");
    }//GEN-LAST:event_spiner2StateChanged

    private void spiner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiner3StateChanged
       burgerspiner=(Integer) spiner3.getValue();
       burgerfiyat=burgerf*burgerspiner;
       lblburger.setText(burgerfiyat+" TL");
    }//GEN-LAST:event_spiner3StateChanged

    private void spiner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiner4StateChanged
      ayranspiner=(Integer) spiner4.getValue();
       ayranfiyat=ayranf*ayranspiner;
       lblayran.setText(ayranfiyat+" TL");
    }//GEN-LAST:event_spiner4StateChanged

    private void spiner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiner5StateChanged
       meyvespiner=(Integer) spiner5.getValue();
       meyvefiyat=meyvef*meyvespiner;
       lblmeyve.setText(meyvefiyat+" TL");
    }//GEN-LAST:event_spiner5StateChanged

    private void spiner6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiner6StateChanged
       kolaspiner=(Integer) spiner6.getValue();
       kolafiyat=kolaf*kolaspiner;
       lblkola.setText(kolafiyat+" TL");
    }//GEN-LAST:event_spiner6StateChanged

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
      if(box1.isSelected()){
        donerfiyat+=  donerspiner;
      }else{
          donerfiyat-=  donerspiner;
      }
      lbldoner.setText(donerfiyat+" TL");
    }//GEN-LAST:event_box1ActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
          if(box2.isSelected()){
        pizzafiyat+=   pizzaspiner;
      }else{
           pizzafiyat-=   pizzaspiner;
      }
      lblpizza.setText( pizzafiyat+" TL");
    }//GEN-LAST:event_box2ActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed
               if(box3.isSelected()){
        burgerfiyat+=   burgerspiner;
      }else{
           burgerfiyat-=   burgerspiner;
      }
      lblburger.setText( burgerfiyat+" TL");
    
    }//GEN-LAST:event_box3ActionPerformed

    private void btnodemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnodemeActionPerformed
        toplam=donerfiyat + pizzafiyat + burgerfiyat + ayranfiyat + meyvefiyat + kolafiyat;
        lbltoplam.setText(toplam+" TL");
        
        masa=5;
        lblmasa.setText(masa+" TL");
        
        toplama=toplam+masa;
        lbltoplama.setText(toplama+" TL");
    }//GEN-LAST:event_btnodemeActionPerformed

    private void btnkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydetActionPerformed
     try {
         if(toplama !=0){
         output= new PrintWriter("faturaNo. " +faturano+" .txt");
         
         output.println("fatoraNo: "+faturano);
         output.println("----------------------");
           if(donerspiner !=0){
                output.print("doner: "+donerspiner);
                if(box1.isSelected()){
                    output.print(" ekstra peynir fiyat: ");
                }
                 output.println("  "+donerfiyat+" TL");
           }
             if(pizzaspiner !=0){
                output.print("pizza: "+pizzaspiner);
                if(box2.isSelected()){
                    output.print(" ekstra peynir fiyat: ");
                }
                output.println("  "+pizzafiyat+" TL");
           }
              if(burgerspiner !=0){
                output.print("burger: "+burgerspiner);
                if(box3.isSelected()){
                    output.print(" ekstra peynir fiyat: ");
                }
                 output.println("  "+burgerfiyat+" TL");
                
           }
              if(ayranspiner !=0){
                output.print("ayran: "+ayranspiner);
                output.println("  "+ayranfiyat+" TL");
         }
                    if(meyvespiner !=0){
                output.print("meyve Suyu: "+meyvespiner);
                output.println("  "+meyvefiyat+" TL");
         }
                          if(kolaspiner !=0){
                output.print("kola: "+kolaspiner);
                output.println("  "+kolafiyat+" TL");
         }
                output.println("----------");          
                output.println("toplam: "+toplam+" TL");            
                output.println("masa: "+masa+" TL");          
                output.println("toplama: "+toplama+" TL");        
                output.println();  
                output.println("++++ sipariş aldığnız için teşkür ederiz ++++");  
                      
                          output.close();
         }
         
     } catch (FileNotFoundException ex) {
         Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_btnkaydetActionPerformed

    private void btnyeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyeniActionPerformed
       if(toplama !=0){
           spiner1.setValue(0);
           spiner2.setValue(0);
           spiner3.setValue(0);
           spiner4.setValue(0);
           spiner5.setValue(0);
           spiner6.setValue(0);
           
           box1.setSelected(false);
           box2.setSelected(false);
           box3.setSelected(false);
           
           
           lbltoplam.setText("0.0 TL");
           lblmasa.setText("0.0 TL");
           lbltoplama.setText("0.0 TL");
           
           toplam=0;
           masa=0;
           toplama=0;
           
           faturano++;
           lblrakam.setText(""+faturano);
       }
    }//GEN-LAST:event_btnyeniActionPerformed

    private void btncikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncikisActionPerformed
       int a=JOptionPane.showConfirmDialog(null,"Çıkmak istiyor Musunuz?","Seç",JOptionPane.YES_NO_OPTION);
        if(a==0)
        System.exit(0);
    }//GEN-LAST:event_btncikisActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box1;
    private javax.swing.JCheckBox box2;
    private javax.swing.JCheckBox box3;
    private javax.swing.JButton btncikis;
    private javax.swing.JButton btnkaydet;
    private javax.swing.JButton btnodeme;
    private javax.swing.JButton btnyeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblayran;
    private javax.swing.JLabel lblburger;
    private javax.swing.JLabel lbldoner;
    private javax.swing.JLabel lblkola;
    private javax.swing.JLabel lblmasa;
    private javax.swing.JLabel lblmeyve;
    private javax.swing.JLabel lblpizza;
    private javax.swing.JLabel lblrakam;
    private javax.swing.JLabel lbltoplam;
    private javax.swing.JLabel lbltoplama;
    private javax.swing.JSpinner spiner1;
    private javax.swing.JSpinner spiner2;
    private javax.swing.JSpinner spiner3;
    private javax.swing.JSpinner spiner4;
    private javax.swing.JSpinner spiner5;
    private javax.swing.JSpinner spiner6;
    private javax.swing.JLabel ttt;
    // End of variables declaration//GEN-END:variables
}
