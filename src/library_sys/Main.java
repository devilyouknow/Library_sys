/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library_sys;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Salitha Kaweendra
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        showDate();
        showTime();
        
         
        if(DB.adminship=="0"){
       jButton9.setBorderPainted( false );
       jButton9.setFocusPainted( false );
      
        }else
        jButton9.setBorderPainted( true );
        jButton9.setFocusPainted( true );
        
    
    
        
      
       
        mainp pn0 = new mainp();
        jDesktopPane1.removeAll();
        pn0.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        pn0.setVisible(true);
        jDesktopPane1.add(pn0);
        
        
        
    }
     void showDate(){
        Date d =new Date();
        System.out.println(d);
        SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd");
        String date = adf.format(d);
        jLabel3.setText(date);
        
        
    }
    
    void showTime(){
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            
              Date d = new Date();
              SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
              String time = sdf.format(d);
              jLabel4.setText(time);
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }).start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new roundPanel.roundedPanel();
        roundedPanel3 = new roundPanel.roundedPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Main_Panel = new roundPanel.roundedPanel();
        roundedPanel2 = new roundPanel.roundedPanel();
        roundedPanel4 = new roundPanel.roundedPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        roundedPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        roundedPanel1.setArc(0);
        roundedPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/image 344.jpg"))); // NOI18N
        roundedPanel1.setLayout(null);

        roundedPanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/library.jpg"))); // NOI18N
        roundedPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedPanel3MouseEntered(evt);
            }
        });
        roundedPanel3.setLayout(null);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        roundedPanel3.add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 1120, 620);

        roundedPanel1.add(roundedPanel3);
        roundedPanel3.setBounds(240, 50, 1120, 620);

        Main_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 6));
        Main_Panel.setArc(0);
        Main_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel2.setArc(30);
        roundedPanel2.setOpaque(false);
        roundedPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel4.setArc(40);
        roundedPanel4.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("User Name :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel4Layout = new javax.swing.GroupLayout(roundedPanel4);
        roundedPanel4.setLayout(roundedPanel4Layout);
        roundedPanel4Layout.setHorizontalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        roundedPanel4Layout.setVerticalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
        );

        roundedPanel2.add(roundedPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 460, 310));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("General Hospital.");
        roundedPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        Main_Panel.add(roundedPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1040, 500));

        roundedPanel1.add(Main_Panel);
        Main_Panel.setBounds(243, 725, 1080, 10);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/large_logo.png"))); // NOI18N
        roundedPanel1.add(jLabel8);
        jLabel8.setBounds(40, 30, 150, 130);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Add/Delete Books");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        roundedPanel1.add(jButton1);
        jButton1.setBounds(30, 220, 190, 23);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Search Book");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        roundedPanel1.add(jButton3);
        jButton3.setBounds(30, 270, 190, 23);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Issue Books");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        roundedPanel1.add(jButton4);
        jButton4.setBounds(30, 360, 190, 23);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Register/Manage Members");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        roundedPanel1.add(jButton5);
        jButton5.setBounds(30, 320, 190, 23);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Return Books");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        roundedPanel1.add(jButton6);
        jButton6.setBounds(30, 400, 190, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Maintenance");
        roundedPanel1.add(jLabel1);
        jLabel1.setBounds(70, 510, 80, 15);

        jButton8.setFont(new java.awt.Font("Yu Mincho", 1, 11)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ico/Button-Close-icon.png"))); // NOI18N
        jButton8.setText("Close All Windows");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        roundedPanel1.add(jButton8);
        jButton8.setBounds(1180, 10, 180, 30);

        jButton9.setText("Add/Remove Users");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        roundedPanel1.add(jButton9);
        jButton9.setBounds(30, 540, 180, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        roundedPanel1.add(jLabel3);
        jLabel3.setBounds(920, 20, 110, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        roundedPanel1.add(jLabel4);
        jLabel4.setBounds(1060, 20, 80, 14);

        jButton10.setText("Log Out");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        roundedPanel1.add(jButton10);
        jButton10.setBounds(90, 630, 71, 23);

        jButton7.setText("Backup");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        roundedPanel1.add(jButton7);
        jButton7.setBounds(80, 590, 90, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         jDesktopPane1.removeAll();
       jDesktopPane1.revalidate();
       jDesktopPane1.repaint();
       
        Add_Remove_books pn1 = new Add_Remove_books();
        
        pn1.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        pn1.setVisible(true);
        jDesktopPane1.add(pn1);
       

  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void roundedPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel3MouseEntered

    }//GEN-LAST:event_roundedPanel3MouseEntered

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
       jDesktopPane1.removeAll();
       jDesktopPane1.revalidate();
       jDesktopPane1.repaint();
       
       mainp pn0 = new mainp();
        
        pn0.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        pn0.setVisible(true);
        jDesktopPane1.add(pn0);
        
       // pn0.setVisible(true);
        //jDesktopPane1.add(pn1);
       
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      jDesktopPane1.removeAll();
       jDesktopPane1.revalidate();
       jDesktopPane1.repaint();
       
        search_books pn2 = new search_books();
      
        pn2.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        pn2.setVisible(true);
        jDesktopPane1.add(pn2);
         
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      
        jDesktopPane1.removeAll();
       jDesktopPane1.revalidate();
       jDesktopPane1.repaint();
       
        add_remove_user pn6 = new add_remove_user();
        
        pn6.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        pn6.setVisible(true);
        jDesktopPane1.add(pn6);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
         jDesktopPane1.removeAll();
       jDesktopPane1.revalidate();
       jDesktopPane1.repaint();
       
        Members pn2 = new Members();
        
        pn2.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        pn2.setVisible(true);
        jDesktopPane1.add(pn2);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        jDesktopPane1.removeAll();
       jDesktopPane1.revalidate();
       jDesktopPane1.repaint();
       
        Issue_Books pn5 = new Issue_Books();
        
        pn5.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        pn5.setVisible(true);
        jDesktopPane1.add(pn5);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jDesktopPane1.removeAll();
       jDesktopPane1.revalidate();
       jDesktopPane1.repaint();
       
        return_Books1 pn7 = new return_Books1();
       
        pn7.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        pn7.setVisible(true);
        jDesktopPane1.add(pn7);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new login().setVisible(true);
            
                this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      
    
        try {

        /*NOTE: Getting path to the Jar file being executed*/
        /*NOTE: YourImplementingClass-> replace with the class executing the code*/
        CodeSource codeSource = DB.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();


        /*NOTE: Creating Database Constraints*/
        String dbName = "lybrarysy";
        String dbUser = "pma";
        String dbPass = "123";

        /*NOTE: Creating Path Constraints for folder saving*/
        /*NOTE: Here the backup folder is created for saving inside it*/
        String folderPath = jarDir + "\\backup";

        /*NOTE: Creating Folder if it does not exist*/
        File f1 = new File(folderPath);
        f1.mkdir();

        /*NOTE: Creating Path Constraints for backup saving*/
        /*NOTE: Here the backup is saved in a folder called backup with the name backup.sql*/
         String savePath = "\"" + jarDir + "\\backup\\" + "backup.sql\"";

        /*NOTE: Used to create a cmd command*/
        String executeCmd = "mysqldump -u" + dbUser + " -p" + dbPass + " --database " + dbName + " -r " + savePath;

        /*NOTE: Executing the command here*/
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        int processComplete = runtimeProcess.waitFor();

        /*NOTE: processComplete=0 if correctly executed, will contain other values if not*/
        if (processComplete == 0) {
            System.out.println("Backup Complete");
        } else {
            System.out.println("Backup Failure");
        }

    } catch (URISyntaxException | IOException | InterruptedException ex) {
        JOptionPane.showMessageDialog(null, "Error at Backuprestore" + ex.getMessage());
    } 
          
        
    }//GEN-LAST:event_jButton7ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static roundPanel.roundedPanel Main_Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private roundPanel.roundedPanel roundedPanel1;
    private roundPanel.roundedPanel roundedPanel2;
    public static roundPanel.roundedPanel roundedPanel3;
    private roundPanel.roundedPanel roundedPanel4;
    // End of variables declaration//GEN-END:variables
}