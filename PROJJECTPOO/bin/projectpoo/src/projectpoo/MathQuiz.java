package projectpoo;

import javax.swing.SwingUtilities;

public class MathQuiz extends Quiz {

    static String[] mathQuestions = {
        "What is the result of 2 + 2?",
        "What is the square root of 16?",
        "What is the value of π (pi) correct to two decimal places?",
        "What is the area of a rectangle with length 5 units and width 3 units?"
    };

    static String[][] mathOptions = {
        {"3", "4", "5", "6"},
        {"2", "4", "6", "8"},
        {"3.14", "3.16", "3.12", "3.18"},
        {"10", "12", "15", "20"}
    };

    static char[] mathAnswers = {'B', 'B', 'A', 'C'};

    public MathQuiz() {
        super(mathQuestions, mathOptions, mathAnswers);
    }

    public static void main(String[] args) {
        // Start the Math Quiz
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MathQuiz();
            }
        });
    }
}
