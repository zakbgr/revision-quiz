package projectpoo;

public class BaseDeDonne extends Quiz {
    static String[] questions = {
        "Qu'est-ce que la normalisation dans le contexte des bases de données ?",
        "Quels sont les objectifs principaux de la normalisation des données ?",
        "Qu'est-ce qu'une entité dans un modèle entité-relation (ER) ?",
        "Quelle est la différence entre une clé primaire et une clé étrangère dans une base de données ?",
        "Qu'est-ce que SQL et quel est son rôle dans les bases de données ?",
        "Quelle est la différence entre les instructions SQL INSERT et UPDATE ?",
        "Qu'est-ce que PHP et comment est-il utilisé dans le développement web ?",
        "Quelle est la différence entre une variable locale et une variable globale en PHP ?",
        "Qu'est-ce qu'une clé primaire dans une base de données relationnelle ?",
        "Quelle est la différence entre une base de données relationnelle et une base de données NoSQL ?"
    };

    static String[][] options = {
        {"Un processus de conception de schémas de tables de base de données", "Un processus de réduction de la redondance et de l'incohérence des données", "Un processus de connexion à une base de données", "Un processus de sauvegarde des données"},
        {"Éliminer les redondances", "Assurer l'intégrité des données", "Réduire les anomalies de mise à jour", "Toutes les réponses ci-dessus"},
        {"Un objet du monde réel ou conceptuel représenté dans la base de données", "Une relation entre deux tables", "Un champ unique dans une table", "Un type de donnée numérique"},
        {"Une clé primaire identifie de manière unique un enregistrement dans une table, tandis qu'une clé étrangère fait référence à une clé primaire dans une autre table", "Une clé primaire est utilisée pour accéder à une table, tandis qu'une clé étrangère est utilisée pour ajouter des données à une table", "Une clé primaire peut être composée de plusieurs colonnes, tandis qu'une clé étrangère est toujours simple", "Il n'y a pas de différence entre une clé primaire et une clé étrangère"},
        {"Structured Query Language, utilisé pour interagir avec les bases de données relationnelles", "Système de requêtes linguistiques, utilisé pour interroger des fichiers texte", "Une technique de conception de bases de données", "Un langage de programmation pour développer des applications web"},
        {"INSERT est utilisé pour ajouter de nouvelles lignes à une table, tandis que UPDATE est utilisé pour modifier des lignes existantes", "INSERT est utilisé pour insérer des données dans une base de données, tandis que UPDATE est utilisé pour créer une nouvelle base de données", "INSERT est utilisé pour insérer des données dans une table, tandis que UPDATE est utilisé pour insérer des données dans un fichier", "INSERT et UPDATE sont utilisés de la même manière"},
        {"PHP est un langage de script côté serveur utilisé pour développer des applications web dynamiques", "PHP est un langage de programmation côté client utilisé pour styliser les pages web", "PHP est un langage de requête utilisé pour interroger les bases de données", "PHP est un système de gestion de bases de données"},
        {"Une variable locale est accessible uniquement à l'intérieur de la fonction où elle est déclarée, tandis qu'une variable globale est accessible depuis n'importe où dans le script PHP", "Une variable locale est déclarée en dehors de toutes les fonctions, tandis qu'une variable globale est déclarée à l'intérieur d'une fonction", "Une variable locale ne peut pas être modifiée une fois définie, tandis qu'une variable globale peut être modifiée à tout moment", "Il n'y a pas de différence entre une variable locale et une variable globale en PHP"},
        {"Un attribut unique qui identifie de manière unique chaque enregistrement dans une table", "Une clé étrangère qui fait référence à une autre table", "Un type de donnée texte", "Un langage de programmation utilisé pour interroger les bases de données"},
{"Une base de données relationnelle stocke des données dans des tables structurées avec des relations prédéfinies, tandis qu'une base de données NoSQL stocke des données de manière plus flexible, souvent sans schéma fixe", "Une base de données relationnelle stocke des données en utilisant le langage SQL, tandis qu'une base de données NoSQL utilise un langage de requête différent", "Il n'y a pas de différence entre une base de données relationnelle et une base de données NoSQL", "Une base de données relationnelle est plus adaptée aux applications web que NoSQL"}
    };

    static char[] answers = {'B', 'D', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};

    public BaseDeDonne() {
        super(questions, options, answers);
    }
}