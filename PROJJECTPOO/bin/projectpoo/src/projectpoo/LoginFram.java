package projectpoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFram extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFram() {
    	setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null); // Center the window
        setLayout(new GridLayout(3, 1));
        getContentPane().setBackground(new Color(0, 0, 0));

        // Username field
        JPanel usernamePanel = new JPanel(new FlowLayout());
        JLabel usernameLabel = new JLabel("Username: ") ;
        usernameLabel.setForeground(Color.BLACK);
        usernameField = new JTextField(20);
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);

        // Password field
        JPanel passwordPanel = new JPanel(new FlowLayout());
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setForeground(Color.BLACK);
        passwordField = new JPasswordField(20);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        styleButton(loginButton);

        // Add components to the frame
        add(usernamePanel);
        add(passwordPanel);
        add(loginButton);

        setVisible(true);
    }
    private void styleButton(JButton button) {
        button.setFocusPainted(false);
        button.setFont(new Font("MV Boli", Font.PLAIN, 16));
        button.setBackground(new Color(25,25,25));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    public void actionPerformed(ActionEvent e) {
       
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Perform login authentication
       
            if (username.equals("admin") && password.equals("admin")) {
                // If login successful, proceed to the main menu
                JOptionPane.showMessageDialog(this, "wolcome ! Login successful!");
                dispose(); // Close the login frame
                new MainMenu(); // Go to the main menu
            } else {
                // If login failed, show error message
                JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginFram();
            }
        });
    }
}




