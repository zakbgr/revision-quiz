package projectpoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Result extends JFrame implements ActionListener {
    private int correctGuesses;
    private int totalQuestions;
    private JFrame quizFrame;

    public Result(int correctGuesses, int totalQuestions, JFrame quizFrame) {
        this.correctGuesses = correctGuesses;
        this.totalQuestions = totalQuestions;
        this.quizFrame = quizFrame;

        setTitle("Quiz Results");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the window
        setLayout(new BorderLayout());
        setBackground(new Color(50, 50, 50));
        createResultPanel();
        setVisible(true);
    }

    private void createResultPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.setBackground(new Color(50, 50, 50));

        JLabel resultLabel = new JLabel("Quiz Results");
        resultLabel.setForeground(Color.WHITE);
        resultLabel.setFont(new Font("MV Boli", Font.PLAIN, 24));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(resultLabel);

        JLabel scoreLabel = new JLabel("Score: " + correctGuesses + " / " + totalQuestions);
        scoreLabel.setForeground(Color.WHITE);
        scoreLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(scoreLabel);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(this);
        closeButton.setFont(new Font("MV Boli", Font.PLAIN, 16));
        closeButton.setFocusPainted(false);
        closeButton.setBackground(new Color(25, 25, 25));
        closeButton.setForeground(Color.WHITE);
        closeButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        panel.add(closeButton);

        JButton returnButton = new JButton("Return to Menu");
        returnButton.addActionListener(this);
        returnButton.setFont(new Font("MV Boli", Font.PLAIN, 16));
        returnButton.setFocusPainted(false);
        returnButton.setBackground(new Color(25, 25, 25));
        returnButton.setForeground(Color.WHITE);
        returnButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        panel.add(returnButton);

        add(panel, BorderLayout.CENTER);
    }

 
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Close")) {
            dispose(); // Close the result window
            quizFrame.dispose(); // Close the quiz window
        } else if (e.getActionCommand().equals("Return to Menu")) {
            dispose(); // Close the result window
            new MainMenu(); // Return to the menu
            quizFrame.dispose(); // Close the quiz window
        }
    }
}
