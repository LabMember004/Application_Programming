package hello;

import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		ImageIcon leftImage=new ImageIcon("C:\\Users\\Kust\\eclipse-workspace\\hello\\src\\images\\right.gif");
		
		JButton b1 = new JButton("Disable middle button" , leftImage );
		contentPane.add(b1);
		b1.setVerticalTextPosition(AbstractButton.BOTTOM);
		b1.setHorizontalTextPosition(AbstractButton.LEADING);
		ImageIcon middleImage= new ImageIcon("C:\\Users\\Kust\\eclipse-workspace\\hello\\src\\images\\middle.gif");
		JButton b2 = new JButton("Middle Button",middleImage);
		contentPane.add(b2);
		b2.setVerticalTextPosition(AbstractButton.BOTTOM);
		b2.setHorizontalTextPosition(AbstractButton.CENTER);
		ImageIcon rightPicture = new ImageIcon("C:\\Users\\Kust\\eclipse-workspace\\hello\\src\\images\\left.gif");
		JButton bt3 = new JButton("Button 2" , rightPicture);
		b2.setVerticalTextPosition(AbstractButton.BOTTOM);
		b2.setHorizontalTextPosition(AbstractButton.CENTER);
		
		contentPane.add(bt3);
		
	}

}
