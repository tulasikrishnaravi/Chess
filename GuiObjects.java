package caluculator;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class GuiObjects {

  List<JButton> c=new ArrayList<JButton>();
	public JButton button(String text) {
		JButton b=new JButton();
		b.setText(text);
		b.setSize(200,200);
	  	return b;
	}

	
	
}
