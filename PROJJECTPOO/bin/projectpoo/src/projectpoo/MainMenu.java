package projectpoo;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainMenu extends JFrame implements ActionListener {
    JButton quizButton;
    JButton courseButton;
    JButton close ;

    public MainMenu() {
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the window
        setLayout(new GridLayout(3, 1));
        getContentPane().setBackground(new Color(50, 50, 50));

        // Create buttons
        quizButton = new JButton("Quiz Menu");
        courseButton = new JButton("Course Menu");
        close = new JButton("close ") ;

        // Style buttons
        styleButton(quizButton);
        styleButton(courseButton);
        styleButton(close);

        // Add action listeners
        quizButton.addActionListener(this);
        courseButton.addActionListener(this);
        close.addActionListener(this);

        // Add buttons to the frame
        add(quizButton);
        add(courseButton);
        add(close) ;

        setVisible(true);
    }

    // Method to style buttons
    private void styleButton(JButton button) {
        button.setFocusPainted(false);
        button.setFont(new Font("MV Boli", Font.PLAIN, 16));
        button.setBackground(new Color(25, 25, 25));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quizButton) {
            dispose(); // Close the main menu window
            new QuizMenu(); // Go to the Quiz menu
        } else if (e.getSource() == courseButton) {
            dispose(); // Close the main menu window
            new CourseMenu(); // Go to the Course menu
        }else if (e.getSource() == close) {
            dispose(); // Close the result window
            //frame.dispose(); // Close the quiz window
        }
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainMenu();
			}
		});
    }
}
