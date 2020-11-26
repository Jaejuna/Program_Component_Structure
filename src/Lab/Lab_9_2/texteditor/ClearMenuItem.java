package Lab.Lab_9_2.texteditor;

import java.awt.event.*;

public class ClearMenuItem extends EditorMenuItem {
	
	public ClearMenuItem(String label, EditModel model) {
		super(label, model); 
	}
	
	public void actionPerformed(ActionEvent e) { 
		myModel().clear(); 
	}
}