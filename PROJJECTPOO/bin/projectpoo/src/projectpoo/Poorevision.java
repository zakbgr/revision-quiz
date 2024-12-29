package projectpoo;
public class Poorevision extends Quiz {
    static String[] questions = {
        "Lequel des éléments suivants n’est pas un concept POO en Java?",
        " Quand la surcharge de méthode est-elle déterminée?",
        "Quel concept de Java est un moyen de convertir des objets du monde réel en termes de classe?",
        "Quel concept de Java est utilisé en combinant des méthodes et des attributs dans une classe?",
        "Quels keywords sont utilisés pour spécifier la visibilité des propriétés et des méthodes ?",
        "les attributs et methodes prives sont precedes le signe ",
        "Comment changez-vous la couleur de fond d'un composant Swing ?",
        "Quelle est la fonction principale de la synchronisation des threads ?",
        "Quel avantage offre l'utilisation de threads dans un programme ?",
        "Quel élément est représenté par un rectangle dans un diagramme de classe ?",

    };
    static String[][] options = {
        {"Héritage ", "Encapsulation ", "Polymorphisme ", "Compilation"},

        {"Au moment de l’exécution", "Au moment de la compilation", "Au moment du codage", "Au moment de l’exécution"},
        {"Polymorphisme", "Encapsulation", "Abstraction", "Héritage"},
        {"Polymorphisme", "Encapsulation", "Abstraction", "Héritage"},
        {"final", "private", "abstract", "double"},
        {" moins","plus","etoile","diese"},
        {" En utilisant la méthode setBackgroundColor()","En utilisant la méthode setBackground()"," En utilisant la méthode setForeground()","En utilisant la méthode setFillColor()"},
        {"Assurer que tous les threads s'exécutent en même temps","Contrôler le nombre de threads pouvant être créés dans un programme","Limiter l'accès des threads aux ressources système","Éviter les conflits de données et assurer la cohérence"},
        {"Accélération des performances en réduisant le temps d'exécution","Simplification du code en le rendant plus court","Rendre le programme plus facile à déboguer","Augmenter la portabilité du programme sur différentes plateformes"},
        
        {"Une classe"," Une association","Un attribut ","Une méthode"},
    };
    static char[] answers = {'D', 'B', 'C', 'B','B','A','B','D','A','A'};

    public Poorevision() {
        super(questions, options, answers);
    }
}
