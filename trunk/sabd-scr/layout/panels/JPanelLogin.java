package layout.panels;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import scr.dao.LoginDao;
import scr.entidades.Session;
import scr.entidades.Usuario;

/**
 *
 * @author  ZIGGY STARDUST
 */
public class JPanelLogin extends javax.swing.JPanel {
    
	private static final long serialVersionUID = -8870916813067213121L;

	/** Creates new form JPanelLogin */
    public JPanelLogin() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" C�digo Generado  ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLUsr = new javax.swing.JLabel();
        jLPsswd = new javax.swing.JLabel();
        jTFUsr = new javax.swing.JTextField();
        jPPasswd = new javax.swing.JPasswordField();
        jBAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLUsr.setText("Usuario");

        jLPsswd.setText("Password");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("LOGIN");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(87, 87, 87)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLUsr)
                    .add(jLPsswd))
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPPasswd)
                    .add(jTFUsr, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .add(jBAceptar)
                .add(145, 145, 145))
            .add(layout.createSequentialGroup()
                .add(183, 183, 183)
                .add(jLabel1)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLUsr)
                    .add(jTFUsr, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(31, 31, 31)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLPsswd)
                    .add(jPPasswd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(37, 37, 37)
                .add(jBAceptar)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        Dimension dim = new Dimension();
        dim.setSize(500,400);
        this.setPreferredSize(dim);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setAlignmentY(Component.CENTER_ALIGNMENT);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAceptarKeyPressed
    	this.jBAceptar.setEnabled(false);
    	LoginDao loginDao = new LoginDao();
    	Usuario usuario = loginDao.buscarPorNombreYPass(this.jTFUsr.getText(), convertirAString(this.jPPasswd.getPassword())); 
    	if(usuario != null){
    		Session.getInstance().setUsuario(usuario);
    		String message = "Bienvenido " + usuario.getNombre();
    	    JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
    	        JOptionPane.INFORMATION_MESSAGE);
    		this.setEnabled(false);
    	} else {
    		String message = "El usuario ingresado es incorrecto";
    	    JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
    	        JOptionPane.ERROR_MESSAGE);
    	    this.jTFUsr.setText("");
    	    this.jPPasswd.setText("");
    	    this.jBAceptar.setEnabled(true);
    	}
    }//GEN-LAST:event_jBAceptarKeyPressed

    private String convertirAString(char[] password) {
		int i = 0;
		String pass = "";
		for(i = 0; i < password.length; i++){
			pass += password[i];
		}
		return pass;
	}

	private void jBAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAceptarMouseClicked
    	jBAceptarKeyPressed(null);
    }//GEN-LAST:event_jBAceptarMouseClicked
    
    
    // Declaraci�n de varibales -no modificar//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JLabel jLPsswd;
    private javax.swing.JLabel jLUsr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPPasswd;
    private javax.swing.JTextField jTFUsr;
    // Fin de declaraci�n de variables//GEN-END:variables
    
}
