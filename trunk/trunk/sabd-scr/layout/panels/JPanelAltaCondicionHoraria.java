package layout.panels;

/**
 *
 * @author  ZIGGY STARDUST
 */
public class JPanelAltaCondicionHoraria extends javax.swing.JPanel {
    
    private static final long serialVersionUID = 1082296173286297574L;
	
    /** Creates new form JPanelAltaCondHoraria */
    public JPanelAltaCondicionHoraria() {
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
        jCBCondicion = new javax.swing.JComboBox();
        jLValor = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        jBAceptar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        jLTitulo.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLTitulo.setText("ALTA CONDICI\u00d3N HORARIA");

        jLCondicion.setText("Condici\u00f3n");

        jCBCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Art\u00edculo 1", "Art\u00edculo 2", "Art\u00edculo 3", "Art\u00edculo 4" }));

        jLValor.setText("Valor");

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
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(117, 117, 117)
                        .add(jLTitulo))
                    .add(layout.createSequentialGroup()
                        .add(86, 86, 86)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLValor)
                            .add(jLCondicion))
                        .add(56, 56, 56)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(jTFValor)
                            .add(jCBCondicion, 0, 141, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(101, 101, 101)
                        .add(jBAceptar)
                        .add(41, 41, 41)
                        .add(jBCancelar)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(jLTitulo)
                .add(53, 53, 53)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLCondicion)
                    .add(jCBCondicion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLValor)
                    .add(jTFValor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(47, 47, 47)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jBAceptar)
                    .add(jBCancelar))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseClicked
// TODO: Agrege su codigo aqui:
    }//GEN-LAST:event_jBCancelarMouseClicked

    private void jBCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCancelarKeyPressed
// TODO: Agrege su codigo aqui:
    }//GEN-LAST:event_jBCancelarKeyPressed

    private void jBAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAceptarMouseClicked
// TODO: Agrege su codigo aqui:
    }//GEN-LAST:event_jBAceptarMouseClicked

    private void jBAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAceptarKeyPressed
// TODO: Agrege su codigo aqui:
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