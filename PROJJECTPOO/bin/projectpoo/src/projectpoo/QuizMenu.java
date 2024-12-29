package projectpoo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizMenu extends JFrame implements ActionListener {
    String[] modul = {
        "POO", "BASE DE DONNE", "RESEAU INFORMATIQUE", "SYSTEME D'INFORMATION",
        "PROJECT PLURDISPLINAIR", "THEORY DES GRAPHES", "THEORY DES LANGAGE",
        "ENGLISH"
    };
    JButton startButton;

    public QuizMenu() {
        setTitle("Quiz Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 650);
        setLocationRelativeTo(null); // Center the window
        setLayout(new BorderLayout());
        setBackground(new Color(50,50,50));
        createMenu();
        setVisible(true);
    }

    private void createMenu() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(modul.length, 1)); // Use modul.length here
        panel.setBackground(new Color(50, 50, 50));

        JLabel label = new JLabel("Choose an option:");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        panel.add(label);

        for (int i = 0; i < modul.length; i++) { // Start from 0
            JButton button = new JButton(" " + modul[i]);
            button.setActionCommand(modul[i]);
            button.addActionListener(this);
            button.setFont(new Font("MV Boli", Font.PLAIN, 16));
            button.setFocusPainted(false);
            button.setBackground(new Color(25, 25, 25));
            button.setForeground(Color.WHITE);
            button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            panel.add(button);
        }
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
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("POO")) {
            dispose(); // Close the menu window
            new Poorevision(); // Start the POO quiz game
        } else if (actionCommand.equals("BASE DE DONNE")) {
            dispose(); // Close the menu window
            new BaseDeDonne(); // Start the database quiz game
        } else if (actionCommand.equals("RESEAU INFORMATIQUE")) {
            dispose(); // Close the menu window
            new ReseauInformatique(); // Start the computer networking quiz game
        } else if (actionCommand.equals("SYSTEME D'INFORMATION")) {
            dispose(); // Close the menu window
            new SystemeInformation(); // Start the information systems quiz game
        } else if (actionCommand.equals("PROJECT PLURDISPLINAIR")) {
            dispose(); // Close the menu window
            new Projetprudisiplinaire(); // Start the interdisciplinary project quiz game
        } else if (actionCommand.equals("THEORY DES GRAPHES")) {
            dispose(); // Close the menu window
            new TheoryDesGraphes(); // Start the graph theory quiz game
        } else if (actionCommand.equals("THEORY DES LANGAGE")) {
            dispose(); // Close the menu window
            new TheoryDesLangage(); // Start the language theory quiz game
        } else if (actionCommand.equals("ENGLISH")) {
            dispose(); // Close the menu window
            new English(); // Start the English quiz game
        }else if (e.getActionCommand().equals("Return to Menu")) {
            dispose(); // Close the result window
            new MainMenu(); // Return to the menu
            
        }
      
    }

}
