package projectpoo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeFrame extends JFrame implements ActionListener {
    JButton startButton;

    public WelcomeFrame() {
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500); // Adjusted size for a better layout
        setLocationRelativeTo(null); // Center the window
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(240, 240, 240)); // Light background color

        // Logo panel
        JPanel logoPanel = new JPanel(new GridBagLayout());
        logoPanel.setBackground(new Color(240, 240, 240)); // Match the background color
        ImageIcon logoIcon = new ImageIcon("logo.png"); // Replace "logo.png" with your icon's path
        JLabel logoLabel = new JLabel(logoIcon);
        logoPanel.add(logoLabel);
        add(logoPanel, BorderLayout.CENTER);

        // Start button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(240, 240, 240)); // Match the background color
        startButton = new JButton("Start");
        startButton.addActionListener(this);
        buttonPanel.add(startButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
    
	public void actionPerformed(ActionEvent e) {
		    if(e.getSource() == startButton) {
		    	dispose();
		    	new LoginFram();
		    }
		
	}


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new WelcomeFrame());
    }


}
