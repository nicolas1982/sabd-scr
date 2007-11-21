package layout.panels;

import scr.dao.CondicionDao;
import scr.dao.CondicionNumericaDao;
import scr.entidades.Condicion;
import scr.entidades.CondicionHoraria;
import scr.entidades.CondicionNumerica;

/**
 *
 * @author  ZIGGY STARDUST
 */
public class JPanelAltaCondicionNumerica extends javax.swing.JPanel {

	private static final long serialVersionUID = -8454039743612102695L;
	
	CondicionDao condicionDao = new CondicionDao();
	CondicionNumericaDao condicionNumericaDao = new CondicionNumericaDao();

	/** Creates new form JPanelAltaCondNumerica */
    public JPanelAltaCondicionNumerica() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" C�digo Generado  ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLTitulo = new javax.swing.JLabel();
        jLCondicion = new javax.swing.JLabel();
        jLValor = new javax.swing.JLabel();
        jCBCondicion = new javax.swing.JComboBox();
        jTFValor = new javax.swing.JTextField();
        jBAceptar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        jLTitulo.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLTitulo.setText("ALTA CONDICI\u00d3N NUM\u00c9RICA");

        jLCondicion.setText("Condici\u00f3n");

        jLValor.setText("Valor");
        
        Condicion[] condiciones = (Condicion[]) condicionDao.getCondiciones(1).toArray();
        jCBCondicion.setModel(new javax.swing.DefaultComboBoxModel(condiciones));

        jTFValor.setText("jTextField1");

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

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(116, 116, 116)
                .add(jLTitulo)
                .addContainerGap(128, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jBAceptar)
                        .add(44, 44, 44)
                        .add(jBCancelar))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLCondicion)
                            .add(jLValor))
                        .add(47, 47, 47)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jTFValor)
                            .add(jCBCondicion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(jLTitulo)
                .add(45, 45, 45)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLCondicion)
                    .add(jCBCondicion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLValor)
                    .add(jTFValor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(50, 50, 50)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jBAceptar)
                    .add(jBCancelar))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseClicked
    	this.setVisible(false);
    }//GEN-LAST:event_jBCancelarMouseClicked

    private void jBCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCancelarKeyPressed
    	this.setVisible(false);
    }//GEN-LAST:event_jBCancelarKeyPressed

    private void jBAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAceptarMouseClicked
    	CondicionNumerica condicionNumerica = new CondicionNumerica();
    	Condicion condicion = (Condicion) this.jCBCondicion.getSelectedItem();
    	condicionNumerica.setId(condicion.getId());
    	condicionNumerica.setValorCondicion(new Float(this.jTFValor.getText()).floatValue());
    	condicionNumerica.setTipoCondicionNum(1);
    	condicionNumericaDao.insertCondicionNumerica(condicionNumerica);
    	this.setVisible(false);
    }//GEN-LAST:event_jBAceptarMouseClicked

    private void jBAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAceptarKeyPressed
    	this.jBAceptarMouseClicked(null);
    }//GEN-LAST:event_jBAceptarKeyPressed
    
    
    // Declaraci�n de varibales -no modificar//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox jCBCondicion;
    private javax.swing.JLabel jLCondicion;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLValor;
    private javax.swing.JTextField jTFValor;
    // Fin de declaraci�n de variables//GEN-END:variables
    
}
