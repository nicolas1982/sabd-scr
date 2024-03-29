/*
 * JPanelGenerarFacturacion.java
 *
 * Created on 18 de noviembre de 2007, 18:36
 */

package layout.panels;

import java.sql.Date;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import layout.utils.DateUtil;
import scr.dao.FacturacionDao;
import scr.dao.ProductorDao;
import scr.entidades.Productor;


/**
 *
 * @author  Administrador
 */
public class JPanelGenerarFacturacion extends javax.swing.JPanel {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idProductor;
    private Date fechaFactura;
    
    /** Creates new form JPanelGenerarFacturacion */
    public JPanelGenerarFacturacion() {
        initComponents();
        extraInitComponents();
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
        jButtonGenerarFactura = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxProductor = new javax.swing.JComboBox();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo1.setDateFormat(DateUtil.formatDate);
        jLabelErrorProductor = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("GENERAR FACTURA");

        jLabel2.setText("Fecha");

        jButtonGenerarFactura.setText("Generar Factura");
        jButtonGenerarFactura.setToolTipText("Genera una factura");
        jButtonGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarFacturaActionPerformed(evt);
            }
        });

        jLabel3.setText("Productor");

        jComboBoxProductor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelErrorProductor.setForeground(new java.awt.Color(255, 0, 51));
        jLabelErrorProductor.setText("[errorProductor]");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(31, 31, 31)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel2)
                                    .add(jLabel3))
                                .add(47, 47, 47)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(dateChooserCombo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(jComboBoxProductor, 0, 117, Short.MAX_VALUE)
                                        .add(38, 38, 38))))))
                    .add(layout.createSequentialGroup()
                        .addContainerGap(169, Short.MAX_VALUE)
                        .add(jButtonGenerarFactura)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabelErrorProductor)
                .add(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(45, 45, 45)
                .add(jLabel1)
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel2)
                    .add(dateChooserCombo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(39, 39, 39)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jComboBoxProductor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelErrorProductor))
                .add(53, 53, 53)
                .add(jButtonGenerarFactura)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarFacturaActionPerformed
        boolean validateOk = validarGenerarFactura();
        if(validateOk) {
        	this.jButtonGenerarFactura.setEnabled(false);
        	this.jComboBoxProductor.setEnabled(false);
        	this.dateChooserCombo1.setEnabled(false);
        	String fecha = this.dateChooserCombo1.getText();
        	Productor productor = (Productor)this.jComboBoxProductor.getSelectedItem();
        	FacturacionDao dao = new FacturacionDao();
        	boolean resultado;
        	try {
            	
        		resultado = dao.generarFactura(fecha,productor);
        		if (resultado) {
        			JOptionPane.showMessageDialog(new JFrame(), "Factura cargada correctamente", "Dialog",
        	    	        JOptionPane.INFORMATION_MESSAGE);
        		}else
        			JOptionPane.showMessageDialog(new JFrame(), "No se pudo cargar la factura", "Dialog",
        	    	        JOptionPane.ERROR_MESSAGE);
        	}catch(Exception e){
        		JOptionPane.showMessageDialog(new JFrame(), e, "Dialog",
            	        JOptionPane.ERROR_MESSAGE);
        		
        	}
        } 
    }//GEN-LAST:event_jButtonGenerarFacturaActionPerformed

    private void extraInitComponents() {
        loadCombos();   
        initLabelsError();
    }
    
    private void initLabelsError() {
        jLabelErrorProductor.setVisible(false);
    }

    private void loadCombos() {
        loadComboProductor();
    }

    private void loadComboProductor() {
    	ProductorDao dao = new ProductorDao();
    	jComboBoxProductor.setModel(new javax.swing.DefaultComboBoxModel(dao.getProductores().toArray()));
    }

    private boolean validarGenerarFactura() {
        boolean validate = validateCombo(jComboBoxProductor);
        if(!validate) {
            putError(jLabelErrorProductor, "Debe seleccionar un Productor");
        } else {
            jLabelErrorProductor.setVisible(false);
        }
        return validate;
    }
    
    private void putError(JLabel labelError, String messageError) {
        labelError.setText(messageError);
        labelError.setVisible(true);
    }

    private boolean validateCombo(JComboBox jComboBox) {
        int indexSelected = jComboBox.getSelectedIndex();
        return indexSelected >= 0;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButtonGenerarFactura;
    private javax.swing.JComboBox jComboBoxProductor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelErrorProductor;
    // End of variables declaration//GEN-END:variables
    
}
