/*
 * JFramePrincipal.java
 *
 * Created on 17 de noviembre de 2007, 16:34
 */

package layout.frame;

import java.awt.Dimension;

import javax.swing.JPanel;

import layout.panels.JPanelAltaCampo;
import layout.panels.JPanelAltaCondicion;
import layout.panels.JPanelAltaCondicionHoraria;
import layout.panels.JPanelAltaCondicionNumerica;
import layout.panels.JPanelAltaProductor;
import layout.panels.JPanelAltaRegistroMedicion;
import layout.panels.JPanelAltaSector;
import layout.panels.JPanelConsultarEstadoSector;
import layout.panels.JPanelConsultarFactura;
import layout.panels.JPanelGenerarFacturacion;

/**
 *
 * @author  Sergio
 */
public class JFramePrincipal extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form JFramePrincipal */
    public JFramePrincipal() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jMenuBar = new javax.swing.JMenuBar();
        jMenuABMs = new javax.swing.JMenu();
        jMenuItemAltaProductor = new javax.swing.JMenuItem();
        jMenuItemAltaCampo = new javax.swing.JMenuItem();
        jMenuItemAltaSector = new javax.swing.JMenuItem();
        jMenuCondicion = new javax.swing.JMenu();
        jMenuItemAltaCondicion = new javax.swing.JMenuItem();
        jMenuItemAltaCondicionNumerica = new javax.swing.JMenuItem();
        jMenuItemAltaCondicionHoraria = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemConsultarFactura = new javax.swing.JMenuItem();
        jMenuItemConsultarEstadoSector = new javax.swing.JMenuItem();
        jMenuOperaciones = new javax.swing.JMenu();
        jMenuItemAltaRegistroMedicion = new javax.swing.JMenuItem();
        jMenuItemGenerarFacturacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jMenuABMs.setText("ABMs");
        jMenuABMs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuABMsActionPerformed(evt);
            }
        });

        jMenuItemAltaProductor.setText("Alta Productor");
        jMenuItemAltaProductor.setActionCommand("Alta Productor");
        jMenuItemAltaProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaProductorActionPerformed(evt);
            }
        });

        jMenuABMs.add(jMenuItemAltaProductor);

        jMenuItemAltaCampo.setText("Alta Campo");
        jMenuItemAltaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaCampoActionPerformed(evt);
            }
        });

        jMenuABMs.add(jMenuItemAltaCampo);

        jMenuItemAltaSector.setText("Alta Sector");
        jMenuItemAltaSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaSectorActionPerformed(evt);
            }
        });

        jMenuABMs.add(jMenuItemAltaSector);

        jMenuCondicion.setText("ABM Condiciones");
        jMenuItemAltaCondicion.setText("Alta Condicion");
        jMenuItemAltaCondicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaCondicionActionPerformed(evt);
            }
        });

        jMenuCondicion.add(jMenuItemAltaCondicion);

        jMenuItemAltaCondicionNumerica.setText("Alta Condicion Numerica");
        jMenuItemAltaCondicionNumerica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaCondicionNumericaActionPerformed(evt);
            }
        });

        jMenuCondicion.add(jMenuItemAltaCondicionNumerica);

        jMenuItemAltaCondicionHoraria.setText("Alta Condicion Horaria");
        jMenuItemAltaCondicionHoraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaCondicionHorariaActionPerformed(evt);
            }
        });

        jMenuCondicion.add(jMenuItemAltaCondicionHoraria);

        jMenuABMs.add(jMenuCondicion);

        jMenuBar.add(jMenuABMs);

        jMenuConsultas.setText("Consultas");
        jMenuItemConsultarFactura.setText("Consultar Factura");
        jMenuItemConsultarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarFacturaActionPerformed(evt);
            }
        });

        jMenuConsultas.add(jMenuItemConsultarFactura);

        jMenuItemConsultarEstadoSector.setText("Consultar Estado Sector");
        jMenuItemConsultarEstadoSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarEstadoSectorActionPerformed(evt);
            }
        });

        jMenuConsultas.add(jMenuItemConsultarEstadoSector);

        jMenuBar.add(jMenuConsultas);

        jMenuOperaciones.setText("Operaciones");
        jMenuItemAltaRegistroMedicion.setText("Alta Registro Medicion");
        jMenuItemAltaRegistroMedicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaRegistroMedicionActionPerformed(evt);
            }
        });

        jMenuOperaciones.add(jMenuItemAltaRegistroMedicion);

        jMenuItemGenerarFacturacion.setText("Generar Facturacion");
        jMenuItemGenerarFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGenerarFacturacionActionPerformed(evt);
            }
        });

        jMenuOperaciones.add(jMenuItemGenerarFacturacion);

        jMenuBar.add(jMenuOperaciones);

        setJMenuBar(jMenuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        );
        Dimension dim = new Dimension();
        dim.setSize(800,600);
        this.setPreferredSize(dim);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConsultarEstadoSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarEstadoSectorActionPerformed
        if ("Consultar Estado Sector".equals(evt.getActionCommand()))
        createFrame("Consultar Estado Sector", new JPanelConsultarEstadoSector());

    }//GEN-LAST:event_jMenuItemConsultarEstadoSectorActionPerformed

    private void jMenuItemConsultarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarFacturaActionPerformed
        if ("Consultar Factura".equals(evt.getActionCommand()))
        createFrame("Consultar Factura", new JPanelConsultarFactura());

    }//GEN-LAST:event_jMenuItemConsultarFacturaActionPerformed

    private void jMenuItemGenerarFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGenerarFacturacionActionPerformed
        if ("Generar Facturacion".equals(evt.getActionCommand()))
        createFrame("Generar Facturacion", new JPanelGenerarFacturacion());

    }//GEN-LAST:event_jMenuItemGenerarFacturacionActionPerformed

    private void jMenuItemAltaRegistroMedicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaRegistroMedicionActionPerformed
        if ("Alta Registro Medicion".equals(evt.getActionCommand()))
        createFrame("Alta Registro Medicion", new JPanelAltaRegistroMedicion());

    }//GEN-LAST:event_jMenuItemAltaRegistroMedicionActionPerformed

    private void jMenuItemAltaCondicionHorariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaCondicionHorariaActionPerformed
        if ("Alta Condicion Horaria".equals(evt.getActionCommand()))
        createFrame("Alta Condicion Horaria", new JPanelAltaCondicionHoraria());

    }//GEN-LAST:event_jMenuItemAltaCondicionHorariaActionPerformed

    private void jMenuItemAltaCondicionNumericaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaCondicionNumericaActionPerformed
        if ("Alta Condicion Numerica".equals(evt.getActionCommand()))
        createFrame("Alta Condicion Numerica", new JPanelAltaCondicionNumerica());

    }//GEN-LAST:event_jMenuItemAltaCondicionNumericaActionPerformed

    private void jMenuItemAltaCondicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaCondicionActionPerformed
        if ("Alta Condicion".equals(evt.getActionCommand()))
        createFrame("Alta Condicion", new JPanelAltaCondicion());
    }//GEN-LAST:event_jMenuItemAltaCondicionActionPerformed

    private void jMenuItemAltaSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaSectorActionPerformed
        if ("Alta Sector".equals(evt.getActionCommand()))
        createFrame("Alta Sector", new JPanelAltaSector());

    }//GEN-LAST:event_jMenuItemAltaSectorActionPerformed

    private void jMenuItemAltaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaCampoActionPerformed
        if ("Alta Campo".equals(evt.getActionCommand()))
        createFrame("Alta Campo", new JPanelAltaCampo());
    }//GEN-LAST:event_jMenuItemAltaCampoActionPerformed

    private void jMenuABMsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuABMsActionPerformed
// TODO add your handling code here: Nada no debe hacer nada
    }//GEN-LAST:event_jMenuABMsActionPerformed

    private void jMenuItemAltaProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaProductorActionPerformed
        if ("Alta Productor".equals(evt.getActionCommand()))
        createFrame("Alta Productor", new JPanelAltaProductor());
    }//GEN-LAST:event_jMenuItemAltaProductorActionPerformed
    
     protected void createFrame(String name, JPanel panel) {
        MyInternalFrame innerFrame = new MyInternalFrame(name,panel);
        innerFrame.setVisible(true);
        getContentPane().add(innerFrame);
        try {
            innerFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuABMs;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCondicion;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemAltaCampo;
    private javax.swing.JMenuItem jMenuItemAltaCondicion;
    private javax.swing.JMenuItem jMenuItemAltaCondicionHoraria;
    private javax.swing.JMenuItem jMenuItemAltaCondicionNumerica;
    private javax.swing.JMenuItem jMenuItemAltaProductor;
    private javax.swing.JMenuItem jMenuItemAltaRegistroMedicion;
    private javax.swing.JMenuItem jMenuItemAltaSector;
    private javax.swing.JMenuItem jMenuItemConsultarEstadoSector;
    private javax.swing.JMenuItem jMenuItemConsultarFactura;
    private javax.swing.JMenuItem jMenuItemGenerarFacturacion;
    private javax.swing.JMenu jMenuOperaciones;
    // End of variables declaration//GEN-END:variables
    
}
