package layout.gral;

import javax.swing.JFrame;
import java.awt.Dimension;

public abstract class GeneralScreen extends JFrame {

	/**
	 * This method initializes 
	 * 
	 */
	public GeneralScreen() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 */
	protected void initialize() {
        this.setSize(new Dimension(746, 537));
        this.setTitle("Sistema de control de Riego");
	}


	
	
	
}  //  @jve:decl-index=0:visual-constraint="30,20"  
