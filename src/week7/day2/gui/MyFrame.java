package week7.day2.gui;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	private JTextField field = new JTextField();;
	JTextArea area = new JTextArea();
	JButton jButton = new JButton("Save");
	JButton jButton2 = new JButton("Load");
	JLabel label1 = new JLabel("LABEL1");
	JLabel label2 = new JLabel("LABEL2");
	JLabel label3 = new JLabel("LABEL3");
	
	public MyFrame() throws HeadlessException {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		init();
		setVisible(true);
	}
	
	private void init(){
		
		GridLayout south = new GridLayout(2, 1);
		JPanel northCon = new JPanel(south);
		
		GridLayout innerNorthLayout = new GridLayout(1,3);
		JPanel innerNorthPanel = new JPanel(innerNorthLayout);
		innerNorthPanel.add(label1);
		innerNorthPanel.add(label2);
		innerNorthPanel.add(label3);
		
		northCon.add(area);
		northCon.add(innerNorthPanel);
		// ******************
		
		GridLayout southGridLayout = new GridLayout(2, 1);
		JPanel southCon = new JPanel(southGridLayout);
		
		GridLayout innerSouthLayout = new GridLayout(1,2);
		
		JPanel innerSouthPanel = new JPanel(innerSouthLayout);
		innerSouthPanel.add(jButton);
		innerSouthPanel.add(jButton2);
		
		southCon.add(field);
		southCon.add(innerSouthPanel);
		
		getContentPane().add(northCon, BorderLayout.CENTER);
		getContentPane().add(southCon, BorderLayout.SOUTH);
		
		
	}
	
	private class MyButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("Input your name");
		}
		
	}
	
}
