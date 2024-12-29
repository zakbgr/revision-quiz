package projectpoo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Intrfacefile extends JFrame implements ActionListener {
    private JPanel panel;
    private JPanel buttonPanel;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JButton nextPageButton;
    private JButton prevPageButton;
    private JButton BrakmainMenu;
    private String str ;
    private int currentPage = 1;

    public Intrfacefile(String asciiz) {
    	this.str = asciiz ;
        setTitle("PDF Viewer");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        panel = new JPanel(new BorderLayout());
        add(panel);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        buttonPanel = new JPanel();
        prevPageButton = new JButton("Previous Page");
        prevPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayPreviousPage();
            }
        });
        buttonPanel.add(prevPageButton);

        nextPageButton = new JButton("Next Page");
        nextPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayNextPage();
            }
        });
        buttonPanel.add(nextPageButton);
        
        BrakmainMenu = new JButton("Break");
        BrakmainMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
                new CourseMenu();
            }
        });
        
        buttonPanel.add(BrakmainMenu);
        
        panel.add(buttonPanel, BorderLayout.SOUTH);

        displayPDF(str);
    }

    private void displayPDF(String str) {
        try {
            File file = new File(str);
            PDDocument document = PDDocument.load(file);
            PDFTextStripper pdfTextStripper = new PDFTextStripper();
            pdfTextStripper.setStartPage(currentPage);
            pdfTextStripper.setEndPage(currentPage);
            String text = pdfTextStripper.getText(document);
            
            textArea.setBackground(new Color(25,25,25));
            textArea.setFont(new Font("MV Boli",Font.BOLD,20));
            textArea.setForeground(new Color(255,255,255));
            textArea.setText(text);
            
            document.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayNextPage() {
        currentPage++;
        displayPDF(str);
    }
    
    private void displayPreviousPage() {
        currentPage--;
        if (currentPage < 1) {
            currentPage = 1;
        }
        displayPDF(str);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
