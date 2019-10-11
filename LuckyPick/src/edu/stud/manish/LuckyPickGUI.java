/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stud.manish;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author exam
 */
public class LuckyPickGUI extends javax.swing.JFrame {

    /**
     * Creates new form LuckyPickyForm
     */
    
    public CObject[] objects = null;
    public double note;
    public CObject randomObject;
    public CObject[] soldObjects;
    public String name;
    
    
    
    public LuckyPickGUI(CObject[] objects) {
        
        initComponents();
        setTitle("Lucky Pick | The game of Luck");
        this.objects = objects;
        returnButton.setEnabled(false);
        note = 0;
        balanceLabel.setText("Balance = $" + note + "");
        mainTextArea.setText("Welcome to Lucky Pick. \n Please insert note.");
       
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        balanceLabel = new javax.swing.JLabel();
        mainScreen = new javax.swing.JScrollPane();
        mainTextArea = new javax.swing.JTextArea();
        fiveDollarButton = new javax.swing.JButton();
        twentyDollarButton = new javax.swing.JButton();
        tenDollarButton = new javax.swing.JButton();
        fiftyDollarButton = new javax.swing.JButton();
        pickButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        balanceLabel.setText("Balance :  $0");

        mainTextArea.setColumns(20);
        mainTextArea.setRows(5);
        mainScreen.setViewportView(mainTextArea);

        fiveDollarButton.setText("$5");
        fiveDollarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveDollarButtonActionPerformed(evt);
            }
        });

        twentyDollarButton.setText("$20");
        twentyDollarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentyDollarButtonActionPerformed(evt);
            }
        });

        tenDollarButton.setText("$10");
        tenDollarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenDollarButtonActionPerformed(evt);
            }
        });

        fiftyDollarButton.setText("$50");
        fiftyDollarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiftyDollarButtonActionPerformed(evt);
            }
        });

        pickButton.setText("Pick");
        pickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickButtonActionPerformed(evt);
            }
        });

        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(balanceLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mainScreen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fiveDollarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twentyDollarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tenDollarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(fiftyDollarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(pickButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(balanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiveDollarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenDollarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fiftyDollarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(twentyDollarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pickButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fiveDollarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveDollarButtonActionPerformed
        // TODO add your handling code here:
        note += 5;
        mainTextArea.setText("You insert: 5");
        balanceLabel.setText("Balance = $" + note + "");
        returnButton.setEnabled(true);
    }//GEN-LAST:event_fiveDollarButtonActionPerformed

    private void tenDollarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenDollarButtonActionPerformed
        // TODO add your handling code here:
        note += 10;
        mainTextArea.setText("You insert: 10");
        balanceLabel.setText("Balance = $" + note + "");
        returnButton.setEnabled(true);
    }//GEN-LAST:event_tenDollarButtonActionPerformed

    private void twentyDollarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentyDollarButtonActionPerformed
        // TODO add your handling code here:
        note += 20;
        mainTextArea.setText("You insert: 20");
        balanceLabel.setText("Balance = $" + note + "");
        returnButton.setEnabled(true);
    }//GEN-LAST:event_twentyDollarButtonActionPerformed

    private void fiftyDollarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiftyDollarButtonActionPerformed
        // TODO add your handling code here:
        note += 50;
        mainTextArea.setText("You insert: 50");
        balanceLabel.setText("Balance = $" + note + "");
        returnButton.setEnabled(true);
    }//GEN-LAST:event_fiftyDollarButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        note = 0;
        returnButton.setEnabled(false);
        balanceLabel.setText("Balance = $" + note + "");
        mainTextArea.setText("Welcome to Lucky Pick. \n Please insert note.");
        
    }//GEN-LAST:event_returnButtonActionPerformed

    private void pickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickButtonActionPerformed
        // TODO add your handling code here
        randomObject = getRandomObject();
        name = randomObject.getDesc();
        if (note < 3.5) {
            
            JOptionPane.showMessageDialog(rootPane, "You do not have enough credit.");
            mainTextArea.setText("You do not have enough credit.");
        }
        else if (randomObject.isSold()) {
            mainTextArea.setText("This item is sold, You lose");
        }
        else {
            note -= 3.5;
            balanceLabel.setText("Balance = $" + note + "");
            if (name.equals("GiftCard")) {
                 mainTextArea.setText("WOW \n You got the: " + getRandomObject().getDesc() + " ($" + getRandomObject().getValue()+ ") .");
            }
            else {
                mainTextArea.setText("WOW \n You got the: " + getRandomObject().getDesc() + " (" + getRandomObject().getSize() + ") .");
            }
            randomObject.setSold(true);
        }
       
        
    }//GEN-LAST:event_pickButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LuckyPickGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LuckyPickGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LuckyPickGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LuckyPickGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    
    public CObject getRandomObject() {
        Random random = new Random();
        return objects[random.nextInt(16)];
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton fiftyDollarButton;
    private javax.swing.JButton fiveDollarButton;
    private javax.swing.JScrollPane mainScreen;
    private javax.swing.JTextArea mainTextArea;
    private javax.swing.JButton pickButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton tenDollarButton;
    private javax.swing.JButton twentyDollarButton;
    // End of variables declaration//GEN-END:variables
}
