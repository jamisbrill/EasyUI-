import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
package GUI;




public class GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnSpotify = new JButton("Spotify");
		btnSpotify.setBounds(0, 0, 107, 68);
		btnSpotify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			
				//huh
				RunApp RA = new RunApp();
				
				RA.Spotify();
				System.out.println("Run app has been done");
				
			
			
			
			
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSpotify);
		
		JButton btnYoutube = new JButton("Youtube");
		btnYoutube.setBounds(158, 0, 89, 68);
		btnYoutube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				RunApp RA = new RunApp();
				
				RA.Youtube();
				System.out.println("Run app has been done");
				
			
				
				
				
				
				
			}
		});
		contentPane.add(btnYoutube);
		
		JButton btnWiiU = new JButton("Wii U ");
		btnWiiU.setBounds(345, 0, 89, 66);
		btnWiiU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RunApp RA = new RunApp();

				RA.Cemu();
				
				
			}
		});
		contentPane.add(btnWiiU);
		
		JButton btnNewButton = new JButton("Opera");
		btnNewButton.setBounds(158, 172, 89, 89);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				RunApp RA = new RunApp();

				RA.Opera();
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Steam");
		btnNewButton_1.setBounds(0, 172, 128, 89);
		contentPane.add(btnNewButton_1);
		

		//JComboBox comboBox = new JComboBox();
		String[] optionStr = { "Settings", "???" };
		JComboBox optionList = new JComboBox(optionStr);
		optionList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("test");
				
			}
		});
		optionList.setSelectedIndex(1);
	//	optionList.addActionListener(this);
		
		
		
		
		optionList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		optionList.setBounds(257, 228, 79, 22);
		contentPane.add(optionList);
		
		JButton Cogbtn = new JButton("Cog Icon ");
		Cogbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// run the File Selector Multiple times? 
				// then choose path for each exe you want to run 
				
				
				
				
				
				
				
			}
		});
		Cogbtn.setBounds(345, 228, 89, 23);
		contentPane.add(Cogbtn);
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	}
}
