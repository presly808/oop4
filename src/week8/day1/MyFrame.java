package week8.day1;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() throws HeadlessException {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		
		
		final JButton jButton = new JButton();
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton.setEnabled(false);
				
			}
		});
		
		setVisible(true);
		
	}
	
	

}
