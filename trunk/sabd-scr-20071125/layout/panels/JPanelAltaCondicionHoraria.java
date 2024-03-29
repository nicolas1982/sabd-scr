/*
 * JPanelAltaCondicionHoraria.java
 *
 * Created on 22 de noviembre de 2007, 20:58
 */

package layout.panels;

import scr.dao.CondicionHorariaDao;
import scr.dao.SectoresDao;
import scr.entidades.CondicionHoraria;
import scr.entidades.Sector;

/**
 *
 * @author  MARZONGA
 */
public class JPanelAltaCondicionHoraria extends javax.swing.JPanel {
    
	private static final long serialVersionUID = 7322530594323144170L;
	
	SectoresDao sectorDao = new SectoresDao();
	CondicionHorariaDao condicionHorariaDao = new CondicionHorariaDao();
	
    /** Creates new form JPanelAltaCondicionHoraria */
    public JPanelAltaCondicionHoraria() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLTitulo = new javax.swing.JLabel();
        jBAceptar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLInicio = new javax.swing.JLabel();
        jLDescripcion = new javax.swing.JLabel();
        jLSector = new javax.swing.JLabel();
        jLComparador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCBSector = new javax.swing.JComboBox();
        jTFDescripcion = new javax.swing.JTextField();
        jCBComparador = new javax.swing.JComboBox();
        jCBInicio = new javax.swing.JComboBox();
        jTFValor = new javax.swing.JTextField();

        jLTitulo.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLTitulo.setText("ALTA CONDICI\u00d3N HORARIA");

        jBAceptar.setText("Aceptar");
        jBAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAceptarKeyPressed(evt);
            }
        });
        jBAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAceptarMouseClicked(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCancelarKeyPressed(evt);
            }
        });
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCancelarMouseClicked(evt);
            }
        });

        jLInicio.setText("Inicio");

        jLDescripcion.setText("Descripci\u00f3n");

        jLSector.setText("Sector");

        jLComparador.setText("Comparador");

        jLabel1.setText("Valor");

        jCBSector.setModel(new javax.swing.DefaultComboBoxModel(sectorDao.getSectores().toArray()));

        jCBComparador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ">", "=", "<", "<=", ">="}));

        jCBInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No"}));
        
        jCBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBInicioActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(81, 81, 81)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLSector)
                    .add(jLabel1)
                    .add(jLInicio)
                    .add(jLComparador)
                    .add(jLDescripcion))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 58, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTFValor)
                    .add(jTFDescripcion)
                    .add(jCBSector, 0, 129, Short.MAX_VALUE)
                    .add(jCBComparador, 0, 129, Short.MAX_VALUE)
                    .add(jCBInicio, 0, 129, Short.MAX_VALUE))
                .add(73, 73, 73))
            .add(layout.createSequentialGroup()
                .add(124, 124, 124)
                .add(jLTitulo)
                .addContainerGap(126, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(104, 104, 104)
                .add(jBAceptar)
                .add(39, 39, 39)
                .add(jBCancelar)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLTitulo)
                .add(48, 48, 48)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLSector)
                    .add(jCBSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLDescripcion)
                    .add(jTFDescripcion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLComparador)
                    .add(jCBComparador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLInicio)
                    .add(jCBInicio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jTFValor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(29, 29, 29)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jBCancelar)
                    .add(jBAceptar))
                .add(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBInicioActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jCBInicioActionPerformed

    private void jBAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAceptarKeyPressed
        this.jBAceptarMouseClicked(null);
    }//GEN-LAST:event_jBAceptarKeyPressed

    private void jBAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAceptarMouseClicked
    	CondicionHoraria condicionHoraria = new CondicionHoraria();
    	condicionHoraria.setComparador(this.jCBComparador.getSelectedIndex());
    	condicionHoraria.setDescripcion(this.jTFDescripcion.toString());
    	condicionHoraria.setDiscriminador(0);
    	Sector sector = (Sector)this.jCBSector.getSelectedItem();
    	condicionHoraria.setIdSector(sector.getIdsector());
    	condicionHoraria.setInicio(this.jCBInicio.getSelectedIndex());
    	condicionHoraria.setValorCondicion(new Integer(this.jTFValor.getText()).intValue());
    	condicionHorariaDao.insertCondicionHoraria(condicionHoraria);
    	this.setVisible(false);
    }//GEN-LAST:event_jBAceptarMouseClicked

    private void jBCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jBCancelarMouseClicked

    private void jBCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCancelarKeyPressed
        this.setVisible(false);
    }//GEN-LAST:event_jBCancelarKeyPressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox jCBComparador;
    private javax.swing.JComboBox jCBInicio;
    private javax.swing.JComboBox jCBSector;
    private javax.swing.JLabel jLComparador;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLInicio;
    private javax.swing.JLabel jLSector;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFDescripcion;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
    
}
