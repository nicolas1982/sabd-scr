/*
 * JPanelAltaSensor.java
 *
 * Created on 18 de noviembre de 2007, 18:15
 */

package layout.panels;

import javax.swing.JComboBox;
import javax.swing.JLabel;

import scr.entidades.TipoSensor;

/**
 *
 * @author  Administrador
 */
public class JPanelAltaSensor extends javax.swing.JPanel {
    private Integer idSector;
    private int tipoSensor;
    
    /** Creates new form JPanelAltaSensor */
    public JPanelAltaSensor() {
        initComponents();
        extraInitComponents();
        
        loadValuesCombos();//TODO sacar cuando esten las llamadas a los SP
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipoSensor = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSector = new javax.swing.JComboBox();
        jButtonRegistrarSensor = new javax.swing.JButton();
        jLabelErrorTipoSensor = new javax.swing.JLabel();
        jLabelErrorSector = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("ALTA SENSOR");

        jLabel2.setText("Tipo De Sensor");

        jComboBoxTipoSensor.setToolTipText("Tipo de sensor");
        jComboBoxTipoSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoSensorActionPerformed(evt);
            }
        });

        jLabel3.setText("Sector");

        jComboBoxSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSectorActionPerformed(evt);
            }
        });

        jButtonRegistrarSensor.setText("Registrar");
        jButtonRegistrarSensor.setToolTipText("Registra un Sensor");
        jButtonRegistrarSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarSensorActionPerformed(evt);
            }
        });

        jLabelErrorTipoSensor.setForeground(new java.awt.Color(255, 0, 51));
        jLabelErrorTipoSensor.setText("[errorTipoSensor]");

        jLabelErrorSector.setForeground(new java.awt.Color(255, 0, 51));
        jLabelErrorSector.setText("[errorSector]");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel2)
                                    .add(jLabel3))
                                .add(52, 52, 52)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jComboBoxTipoSensor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jComboBoxSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(49, 49, 49)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabelErrorSector)
                                    .add(jLabelErrorTipoSensor)))))
                    .add(layout.createSequentialGroup()
                        .add(158, 158, 158)
                        .add(jButtonRegistrarSensor)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(jLabel1)
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jComboBoxTipoSensor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelErrorTipoSensor))
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jComboBoxSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelErrorSector))
                .add(59, 59, 59)
                .add(jButtonRegistrarSensor)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSectorActionPerformed
        // TODO
        Integer idSector = (Integer) jComboBoxSector.getModel().getSelectedItem();
        this.idSector = idSector;
    }//GEN-LAST:event_jComboBoxSectorActionPerformed

    private void jComboBoxTipoSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoSensorActionPerformed
        TipoSensor tipoSensor = (TipoSensor) jComboBoxTipoSensor.getModel().getSelectedItem();
        this.tipoSensor = tipoSensor.getIdTipoSensor();
    }//GEN-LAST:event_jComboBoxTipoSensorActionPerformed

    private void jButtonRegistrarSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarSensorActionPerformed
        boolean validateOk = validarAltaSensor();
        System.out.println("sensor: " + this.tipoSensor);
        System.out.println("sector: " + this.idSector);
        if(validateOk) {
            // TODO llamar al SP SP_ALTA_SENSOR(idSector INTEGER, tipoSensor SMALLINT) 
        }         
    }//GEN-LAST:event_jButtonRegistrarSensorActionPerformed

    private void extraInitComponents() {
        loadCombos();
        initLabelsError();
    }

    private void loadCombos() {
        loadComboTipoSensor();
        loadComboSector();
    }

    private void loadComboTipoSensor() {
        for (TipoSensor ts : TipoSensor.values()) {
            jComboBoxTipoSensor.addItem(ts);
        }
        jComboBoxTipoSensor.getModel().setSelectedItem(TipoSensor.SELECCIONE);
    }

    private void loadComboSector() {
        //TODO llamar al SP SP_GET_SECTORES();
    }

    private void loadValuesCombos() {
        jComboBoxSector.addItem(new Integer(1));
        jComboBoxSector.addItem(new Integer(2));

    }

    private boolean validarAltaSensor() {
        boolean validate = validateTipoSensor() && validateSector();
        return validate;
    }

    private boolean validateTipoSensor() {
        boolean validate = validateCombo(jComboBoxTipoSensor);
        if(!validate) {
            putError(jLabelErrorTipoSensor, "Debe seleccionar un Sensor");
        } else {
            jLabelErrorTipoSensor.setVisible(false);
        }
        return validate;
    }
    
    private boolean validateSector() {
        boolean validate = validateCombo(jComboBoxSector);
        if(!validate) {
           putError(jLabelErrorSector, "Debe seleccionar un Sector");
        } else {
            jLabelErrorSector.setVisible(false);
        }
        return validate;
    }

    private void putError(JLabel labelError, String messageError) {
        labelError.setText(messageError);
        labelError.setVisible(true);
    }

    private boolean validateCombo(JComboBox jComboBox) {
        int indexSelected = jComboBox.getSelectedIndex();
        return indexSelected != 0;
    }

    private void initLabelsError() {
        jLabelErrorSector.setVisible(false);
        jLabelErrorTipoSensor.setVisible(false);
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarSensor;
    private javax.swing.JComboBox jComboBoxSector;
    private javax.swing.JComboBox jComboBoxTipoSensor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelErrorSector;
    private javax.swing.JLabel jLabelErrorTipoSensor;
    // End of variables declaration//GEN-END:variables
    
}
