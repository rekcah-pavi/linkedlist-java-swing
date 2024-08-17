/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import Code.Link;
import Code.LinkedList;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author rk
 */
public class AnimeGui extends javax.swing.JFrame {

    /**
     * Creates new form AnimeGui
     */
    LinkedList linklist = new LinkedList();
    public AnimeGui() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        des = new javax.swing.JTextField();
        pic = new javax.swing.JTextField();
        exname = new javax.swing.JTextField();
        browse = new javax.swing.JButton();
        add = new javax.swing.JButton();
        addlast = new javax.swing.JButton();
        addbefore = new javax.swing.JButton();
        imageChooser = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        name2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        des2 = new javax.swing.JTextArea();
        img = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 39, -1, -1));

        jLabel2.setText("Description");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setText("Picture");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel4.setText("Existing name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 310, -1));
        jPanel1.add(des, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 310, 80));
        jPanel1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 310, -1));
        jPanel1.add(exname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 290, -1));

        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        jPanel1.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        add.setText("Add first");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        addlast.setText("Add last");
        addlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlastActionPerformed(evt);
            }
        });
        jPanel1.add(addlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        addbefore.setText("Add before");
        addbefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbeforeActionPerformed(evt);
            }
        });
        jPanel1.add(addbefore, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));
        jPanel1.add(imageChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 20, 20));

        jTabbedPane1.addTab("Add", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 49, -1, -1));

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel2.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name2ActionPerformed(evt);
            }
        });
        jPanel2.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 180, -1));

        des2.setColumns(20);
        des2.setRows(5);
        jScrollPane1.setViewportView(des2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 280, 260));
        jPanel2.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 190, 290));

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, 30));

        jTabbedPane1.addTab("View", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name2ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String namee = name.getText();
        String dess = des.getText();
        String picc = pic.getText();
        
        linklist.insertFirst(namee,dess,picc);
        JOptionPane.showMessageDialog(this, "Character added as first");
        
        
    }//GEN-LAST:event_addActionPerformed

    private void addlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlastActionPerformed
        // TODO add your handling code here:
        String namee = name.getText();
        String dess = des.getText();
        String picc = pic.getText();
        
        linklist.insertLast(namee,dess,picc);
        JOptionPane.showMessageDialog(this, "Character added as last");
    }//GEN-LAST:event_addlastActionPerformed

    private void addbeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbeforeActionPerformed
        // TODO add your handling code here:
        String exnamee = exname.getText();
        String namee = name.getText();
        String dess = des.getText();
        String picc = pic.getText();
        
        linklist.insertBefore(exnamee,namee,dess,picc);
        JOptionPane.showMessageDialog(this, "Character added before "+exnamee);
    }//GEN-LAST:event_addbeforeActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
        imageChooser.setVisible(true);
        try {
            int returnVal =
            imageChooser.showOpenDialog(this);
            if (returnVal == imageChooser.APPROVE_OPTION) {
                File file = imageChooser.getSelectedFile();
                pic.setText(file.getAbsolutePath());
            } 
            else {
                System.out.println("File access cancelled byuser.");
            }
        } 
        catch (Exception ex) {
            System.out.println("Invalid Details");
        }
    }//GEN-LAST:event_browseActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        String name = name2.getText();
        if (linklist.delete(name) == null){
            JOptionPane.showMessageDialog(this, "Faild to delete "+name+", Not found");
            return;
            
        }
       
        
        JOptionPane.showMessageDialog(this, "Removed "+name);
        
    }//GEN-LAST:event_removeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String name = name2.getText();
        
        Link dd = linklist.find(name);
        
        if (dd == null){
            JOptionPane.showMessageDialog(this, name+" Not found");
            return;
        }
        
        des2.setText(dd.get_description());
        
        img.setIcon(new javax.swing.ImageIcon(dd.picture()));
        
        
        
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = name2.getText();
        Link dd = linklist.find_next(name);
        
        if (dd == null){
            JOptionPane.showMessageDialog(this, "nxt img not found");
            return;
        }
        
        name2.setText(dd.characterName);
        des2.setText(dd.get_description());
        img.setIcon(new javax.swing.ImageIcon(dd.picture()));
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AnimeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimeGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton addbefore;
    private javax.swing.JButton addlast;
    private javax.swing.JButton browse;
    private javax.swing.JTextField des;
    private javax.swing.JTextArea des2;
    private javax.swing.JTextField exname;
    private javax.swing.JFileChooser imageChooser;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField pic;
    private javax.swing.JButton remove;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
