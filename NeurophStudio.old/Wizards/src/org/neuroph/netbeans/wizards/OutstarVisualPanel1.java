/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neuroph.netbeans.wizards;

import javax.swing.JPanel;
import javax.swing.JTextField;

public final class OutstarVisualPanel1 extends JPanel {

    private static OutstarVisualPanel1 instance;

    /** Creates new form OutstarVisualPanel1 */
    private OutstarVisualPanel1() {
        initComponents();
    }

    public static OutstarVisualPanel1 getInstance(){
        if(instance==null){
            instance = new OutstarVisualPanel1();
        }
        return instance;
    }

    @Override
    public String getName() {
        return "Number of output neurons";
    }

    public JTextField getOutputsNumField() {
        return outputsNumField;
    }

    public void clearForm(){
        outputsNumField.setText("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        outputsNumField = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(OutstarVisualPanel1.class, "OutstarVisualPanel1.jLabel1.text")); // NOI18N

        outputsNumField.setText(org.openide.util.NbBundle.getMessage(OutstarVisualPanel1.class, "OutstarVisualPanel1.outputsNumField.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputsNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(outputsNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField outputsNumField;
    // End of variables declaration//GEN-END:variables
}
