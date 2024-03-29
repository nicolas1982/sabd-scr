package layout.panels;

import java.awt.Component;
import java.awt.Dimension;

import scr.dao.ProductorDao;
import scr.entidades.Productor;

/**
 *
 * @author  ZIGGY STARDUST
 */
public class JPanelAltaProductor extends javax.swing.JPanel {
    
    private static final long serialVersionUID = -6014959205712574902L;
    private ProductorDao productorDao = new ProductorDao();
	
    /** Creates new form JPanelAltaProductor */
    public JPanelAltaProductor() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNombre = new javax.swing.JLabel();
        jLDomicilio = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jBAceptar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jTFNombre = new javax.swing.JTextField();
        jLDomicilioString = new javax.swing.JLabel();

        jLNombre.setText("Nombre Productor");

        jLDomicilio.setText("Domicilio");

        jLTitulo.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLTitulo.setText("ALTA PRODUCTOR");

        jBAceptar.setText("Aceptar");
        jBAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAceptarMouseClicked(evt);
            }
        });
        jBAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAceptarKeyPressed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCancelarMouseClicked(evt);
            }
        });
        jBCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCancelarKeyPressed(evt);
            }
        });

        jLDomicilioString.setText("Federico Lacroze 2556");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(89, 89, 89)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLNombre)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(99, 99, 99)
                                .add(jLTitulo))
                            .add(layout.createSequentialGroup()
                                .add(jLDomicilio)
                                .add(95, 95, 95)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLDomicilioString)
                                    .add(jTFNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 167, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(137, 137, 137))))
            .add(layout.createSequentialGroup()
                .add(139, 139, 139)
                .add(jBAceptar)
                .add(35, 35, 35)
                .add(jBCancelar)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLTitulo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 50, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLNombre)
                    .add(jTFNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(52, 52, 52)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLDomicilio)
                    .add(jLDomicilioString))
                .add(56, 56, 56)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jBCancelar)
                    .add(jBAceptar))
                .add(41, 41, 41))
        );
        Dimension dim = new Dimension();
        dim.setSize(500,400);
        this.setPreferredSize(dim);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setAlignmentY(Component.CENTER_ALIGNMENT);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCancelarKeyPressed
    	this.setVisible(false);
    	this.setEnabled(false);
    }//GEN-LAST:event_jBCancelarKeyPressed

    private void jBCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseClicked
    	this.setVisible(false);
    	this.setEnabled(false);
    }//GEN-LAST:event_jBCancelarMouseClicked

    private void jBAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAceptarKeyPressed
    	//int idDom = domicilioDao.altaDomicilio(this.getDomicilio());
    	Productor productor = this.getProductor();
    	productorDao.altaProductor(productor);
    	this.setVisible(false);
    	this.setEnabled(false);
    }//GEN-LAST:event_jBAceptarKeyPressed

	private Productor getProductor() {
    	Productor productor = new Productor();
    	productor.setNombre(this.jTFNombre.getText());
    	//HARDCODE
    	productor.setIdDomicilio(1);
		return productor;
	}

	private void jBAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAceptarMouseClicked
    	this.jBAceptarKeyPressed(null);
    }//GEN-LAST:event_jBAceptarMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JLabel jLDomicilio;
    private javax.swing.JLabel jLDomicilioString;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
    
}
