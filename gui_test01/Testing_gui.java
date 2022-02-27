package gui_test01;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Testing_gui {
	static JFrame frame_1;
	static JButton start_val, add_1, minus_1, reset_1;
	static JLabel label_1, label_num;
	static JTextField text_1;
	static JPanel panel_center, panel_south;
	static int iCounter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame_1 = new JFrame(); 
		frame_1.setLayout(new BorderLayout()); 
		panel_center = new JPanel();
		panel_south = new JPanel();
		panel_center.setLayout(new FlowLayout());
		panel_south.setLayout(new FlowLayout());
		start_val = new JButton("Start Counter");
		add_1 = new JButton("Add 1");
		minus_1 = new JButton("Delete 1");
		reset_1 = new JButton("Reset");
		label_1 = new JLabel("Value is: ");
		
		text_1 = new JTextField(10);
		label_num = new JLabel();
		
		start_val.addActionListener(new ButtonListener());
		add_1.addActionListener(new ButtonListener());
		minus_1.addActionListener(new ButtonListener());
		reset_1.addActionListener(new ButtonListener());
		// setup all buttons to use the "ButtonListener()" class for ActionEvents
		panel_center.add(text_1);
		panel_center.add(label_1);
		panel_center.add(label_num);
		// Put the JtextField, and the two JLabel in the 'panel_center' 
		panel_south.add(start_val);
		panel_south.add(add_1);
		panel_south.add(minus_1);
		panel_south.add(reset_1);
		// and the buttons in the 'panel_south' panels.
		
		// add the two panels to the 'frame_1' in the proper 
		// area (CENTER, SOUTH, NORTH, EAST, WEST)
		frame_1.getContentPane().add(panel_center,BorderLayout.CENTER);
		frame_1.getContentPane().add(panel_south, BorderLayout.SOUTH);
		
		frame_1.setSize(450, 200);    
		frame_1.setVisible(true);
		frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private static class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			
			if(e.getSource().equals(start_val)) {
				String input =text_1.getText();
				
				
				label_num.setText(input);
				iCounter = Integer.parseInt(input);
				label_1.setText("Value of: "+ iCounter);
			} if(e.getSource().equals(add_1)) {
				
				iCounter++;
				label_1.setText("Value of: "+ iCounter);
				
			} if(e.getSource().equals(minus_1)){
				
				iCounter--;
				label_1.setText("Value of: "+ iCounter);
				
			} if(e.getSource().equals(reset_1)) {
				
				iCounter = 0;
				label_1.setText("Value of: "+ iCounter);
			}
			// write code here to test which of the three buttons
			// have been clicked using 'e.getSource().equals...'
			// very similar to the demonstration I did in class lecture
			// First, when 'start_val' clicked, then get the value from the 'text_1'
			// text box (user 'getText()' method) and set the 'label_num' and the  
			// iCounter to be that value. Next, in the if 'add_1' clicked, then 
			// add 1 to the 'iCounter' and update label: 'label_num' and if
			// the 'minus_1' is clicked, delete 1 from iCounter and update
			// the 'label_num' Then, if 'reset_1' is clicked, set things blank and back to zero.
			// HINT: when you get the value from a JTextField, it is a string, so 
			// you have to convert it to an integer to give the value to 'iCounter'
			// and to convert an integer to a string, use 'Integer.parseInt(string variable)'
			//
			
		}

}
}
