/*
 * JPanelConsultarEstadoSector.java
 *
 * Created on 18 de noviembre de 2007, 18:40
 */

package layout.panels;

import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import layout.utils.DateUtil;

import scr.dao.SectoresDao;
import scr.entidades.Rol;
import scr.entidades.Sector;



/**
 *
 * @author  Administrador
 */
public class JPanelConsultarEstadoSector extends javax.swing.JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idUsuario;
    private SectoresDao daoSectores;
    
    /** Creates new form JPanelConsultarEstadoSector */
    public JPanelConsultarEstadoSector() {
    	daoSectores = new SectoresDao();
        initComponents();
        extraInitComponents();
    }
    
     public JPanelConsultarEstadoSector(Integer idUsuario) {
        this.idUsuario = idUsuario;
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxSector = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonConsultar = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo1.setDateFormat(DateUtil.formatDate);
        dateChooserCombo1.setVisible(false);
        jLabelErrorSector = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Consultas de Estado Sector");

        jLabel2.setText("Sector");

        //jComboBoxSector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Fecha");
        jLabel3.setVisible(false);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jLabelErrorSector.setForeground(new java.awt.Color(255, 0, 51));
        jLabelErrorSector.setText("jLabel4");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(25, 25, 25)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel3)
                                    .add(jLabel2))
                                .add(76, 76, 76)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(dateChooserCombo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(jComboBoxSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(44, 44, 44)
                                        .add(jLabelErrorSector)))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(layout.createSequentialGroup()
                        .add(69, 69, 69)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 284, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(170, 170, 170)
                        .add(jButtonConsultar)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBoxSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2)
                    .add(jLabelErrorSector))
                .add(15, 15, 15)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel3)
                    .add(dateChooserCombo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(14, 14, 14)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, Short.MAX_VALUE)
                .add(jButtonConsultar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        boolean validateOk = validateEstadoSector();
        if(validateOk) {
        	Sector sector = (Sector) jComboBoxSector.getSelectedItem();
        	Short corto = daoSectores.getEstadoRiego(sector.getIdsector());
        	if (corto.shortValue() == 0){
        		JOptionPane.showMessageDialog(new JFrame(), "ESTA REGANDO PROFESORA!!!", "Dialog",
    	    	        JOptionPane.INFORMATION_MESSAGE);
        	}else
        	{
        		JOptionPane.showMessageDialog(new JFrame(), "NO ESTA REGANDO LAMENTO DECIRLE PROFESORA!!!", "Dialog",
    	    	        JOptionPane.INFORMATION_MESSAGE);
        	}
        } 
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void extraInitComponents() {
        loadCombos();
        initLabelsError();
    }

    private void initLabelsError() {
        jLabelErrorSector.setVisible(false);
        jLabelErrorSector.setVisible(false);
    }
    
    private void loadCombos() {
       loadComboSector();
    }

    private void loadComboSector() {
        //TODO llamar a un SP SP_GET_ROL_USER(INTEGER idUser);
        Integer idRol = new Integer(1);
        
        Vector <Sector> sectores = null;
        if(Rol.PRODUCTOR.getIdRol() == idRol.intValue()) {
        	sectores = daoSectores.getSectoresByProductor(idUsuario);//TODO ver si el idUsuario es el idProductor
        } else if(Rol.ADMINISTRADOR.getIdRol() == idRol.intValue()) {
        	sectores = daoSectores.getSectores();
        }
        
        loadCombo(sectores);
        
    }
    
     private void loadCombo(Vector<Sector> sectores) {
		 for (Sector s : sectores) {
            jComboBoxSector.addItem(s);
        }
	}

	private boolean validateEstadoSector() {
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
        return indexSelected >= 0;
    }

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JComboBox jComboBoxSector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelErrorSector;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
    
}

