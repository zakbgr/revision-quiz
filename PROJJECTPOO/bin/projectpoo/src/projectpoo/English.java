package projectpoo;

public class English extends Quiz {
    static String[] questions = {
        "What is the present simple tense used for?",
        "How do you form the present simple tense for regular verbs?",
        "When do we use the past simple tense?",
        "What is the past participle form of the verb 'go'?",
        "When is the future simple tense typically used?",
        "What is the correct structure for forming a future simple sentence with 'will'?",
        "What are some keywords commonly used with the present simple tense?",
        "Can the past simple tense be used to talk about ongoing actions?",
        "What are some common time expressions used with the future simple tense?",
        "How do you form negative sentences in the future simple tense?"
    };

    static String[][] options = {
        {"To describe habits, routines, and general truths", "To describe actions happening at the moment", "To describe actions that will happen in the future", "To describe actions that happened in the past"},
        {"Add '-ed' to the base form of the verb", "Add '-s' or '-es' to the base form of the verb", "No change to the base form of the verb", "Add '-ing' to the base form of the verb"},
        {"To talk about completed actions in the past", "To talk about future plans", "To talk about actions happening now", "To talk about actions that will happen in the future"},
        {"Went", "Gone", "Going", "Goed"},
        {"To talk about future actions or events that are not planned or arranged", "To talk about scheduled or arranged future events", "To talk about actions happening now", "To talk about actions that happened in the past"},
        {"Subject + will + base form of the verb", "Subject + to be + base form of the verb", "Subject + has + base form of the verb", "Subject + did + base form of the verb"},
        {"Always, often, sometimes", "Yesterday, last week, in 2010", "Now, at the moment, today", "Next week, in the future, tomorrow"},
        {"Yes, it can", "No, it can't", "It depends on the context", "Only in written English"},
        {"Tomorrow, next month, in a year", "Yesterday, last year, in 2005", "Every day, usually, on weekends", "Now, at the moment, today"},
        {"Add 'not' after the subject and before 'will'", "Add 'not' before the base form of the verb", "Change 'will' to 'won't'", "Use the verb 'don't' before the base form of the verb"}
    };

    static char[] answers = {'A', 'B', 'A', 'B', 'A', 'A', 'A', 'A', 'A', 'C'};

    public English() {
        super(questions, options, answers);
    }
}