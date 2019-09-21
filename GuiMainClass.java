package caluculator;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GuiMainClass {

	public static void main(String args[]) {
		
		GuiObjects c=new GuiObjects();
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		JPanel panel=new JPanel();
		JPanel panel1=new JPanel();
		
		panel.setBackground(Color.WHITE);
		//panel.setLayout(new FlowLayout());
		JTextArea area=new JTextArea();
		area.setSize(400,50);
		panel1.add(area);
		List<String> m=new ArrayList<String>();
		//List<String> numbers=new ArrayList<String>();
		
		m.add("MC");
		m.add("MR");
		m.add("MS");
		m.add("M+");
		for(String mk:m) {
		JButton cbutton=c.button(mk);
		panel.add(cbutton);
		}
		
		for(int i=0;i<=9;i++) 
		 {
			JButton cbutton=c.button(String.valueOf(i));
		  panel.add(cbutton);
		 }
		
		//frame.add(panel1);
		frame.add(panel);
		frame.setLayout(new GridLayout());
 
		frame.setVisible(true);
		
		
		
		
	}
}
