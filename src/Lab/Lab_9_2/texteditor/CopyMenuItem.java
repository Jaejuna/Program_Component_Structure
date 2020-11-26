package Lab.Lab_9_2.texteditor;

import java.awt.event.*;

/** CopyMenuItem copies selected text into the clipboard */ 
public class CopyMenuItem extends EditorMenuItem { 
	
	public CopyMenuItem(String label, EditModel model) { 
		super(label, model); 
	}
 
	public void actionPerformed(ActionEvent e) { 
		myModel().copy(); 
	}
}
