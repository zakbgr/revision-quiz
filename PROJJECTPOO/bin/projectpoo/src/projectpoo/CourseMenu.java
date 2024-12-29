package projectpoo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseMenu extends JFrame implements ActionListener {
    String[] modules = {"POO", "BASE DE DONNE", "RESEAU INFORMATIQUE", "SYSTEME D'INFORMATION",
    		"‪PROJETPLURIDISCIPLINAIRES", "THEORY DES GRAPHES", "THEORY DES LANGAGE", "ENGLISH"};

    public CourseMenu() {
        setTitle("Course Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650,650);
        setLocationRelativeTo(null); // Center the window
        setLayout(new GridLayout(modules.length + 1, 1)); // +1 for the "Back" button

        // Add buttons for each module
        for (String module : modules) {
            JButton button = new JButton(module);
            button.addActionListener(this);
            button.setFont(new Font("MV Boli", Font.PLAIN, 16));
            button.setFocusPainted(false);
            button.setBackground(new Color(25, 25, 25));
            button.setForeground(Color.WHITE);
            button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
          
            add(button);
        }

        // Add a "Back" button to return to the main menu
        JButton backButton = new JButton("Back");
        backButton.addActionListener(this);
        backButton.setFont(new Font("MV Boli", Font.PLAIN, 16));
        backButton.setFocusPainted(false);
        backButton.setBackground(new Color(25, 25, 25));
        backButton.setForeground(Color.WHITE);
        backButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
      
        add(backButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Back")) {
            dispose();
            new MainMenu();
        }else if (actionCommand.equals("POO")) {
        	dispose();
            new CoursPOO();
        } else if (actionCommand.equals("‪PROJETPLURIDISCIPLINAIRES")) {
        	JOptionPane.showMessageDialog(this, "Il n'y a pas de cours");
        } else if (actionCommand.equals("BASE DE DONNE")) {
            dispose(); 
            new CoursBDD(); 
        } else if (actionCommand.equals("RESEAU INFORMATIQUE")) {
            dispose(); 
            new CoursIR(); 
        } else if (actionCommand.equals("SYSTEME D'INFORMATION")) {
            dispose();
            new CoursISI();
        } else if (actionCommand.equals("THEORY DES GRAPHES")) {
            dispose();
            new CoursTHG(); 
        } else if (actionCommand.equals("THEORY DES LANGAGE")) {
            dispose(); 
            new CoursTHL(); 
        } else if (actionCommand.equals("ENGLISH")) {
            dispose();
            new CoursEng();  
        } 
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CourseMenu());
    }
}
