package projectpoo;
public class SystemeInformation extends Quiz {
    static String[] questions = {
        "Qu'est-ce qu'un système d'information ?",
        "Quels sont les composants d'un système d'information ?",
        "Qu'est-ce que l'analyse des données ?",
        "Qu'est-ce que la sécurité de l'information ?",
        "Quel est le rôle d'une base de données dans un système d'information ?",
        "Quelles sont les cinq parties essentielles d'une organisation selon Mintzberg ?",
        "Quel est le rôle du Centre Opérationnel (CO) dans une organisation ?",
        "Quel est le but de la Technostructure dans une organisation ?",
        "Quel est le rôle du Cycle d'Information au sein d'une organisation ?",
        "Quelle est la fonction principale d'un organigramme dans une organisation ?"

    };
    static String[][] options = {
        {"Un système qui collecte, traite, stocke, analyse et diffuse des informations dans un but spécifique", "Une langue de programmation", "Un protocole réseau", "Une structure de données"},
        {"Une structure de contrôle", "Une structure de boucle","Matériel, logiciel, données, procédures et personnes", "Une condition"},
        {"Un système de gestion de base de données","Le processus d'examen de grands ensembles de données pour découvrir des motifs cachés, des corrélations inconnues et d'autres informations utiles", "Un environnement de développement intégré (IDE)", "Une algorithm"},
        {"Un langage de programmation", "Un motif de conception", "Une méthode de chiffrement","La pratique de défendre l'information contre un accès non autorisé, une utilisation, une divulgation, une perturbation, une modification ou une destruction"},
        {"Une base de données ne sert à rien dans un système d'information","Une base de données est utilisée uniquement pour stocker des images et des vidéos","Une base de donnée utilisée seulement pour back end de site web","Une base de données est utilisée pour stocker, organiser et récupérer des données dans un système d'information"},
        {"Centre Opérationnel (CO), Sommet Stratégique (SS), Ligne Hiérarchique, Technostructure et Fonctions de Support","Centre Opérationnel (CO), Sommet Stratégique (SS), Département Informatique, Division Marketing et Équipe Juridique","Centre Opérationnel (CO), Management Intermédiaire, Département des Ventes, Division du Service Client, et Ressources Humaines","Centre Opérationnel (CO), Sommet Stratégique (SS), Recherche et Développement, Département de Production et Contrôle Qualité"},
        {"Le Centre Opérationnel est responsable de la gestion des ressources financières","Le Centre Opérationnel est uniquement concentré sur les tâches administratives","Le Centre Opérationnel est l'endroit où se déroule directement la production à valeur ajoutée, comme les travailleurs d'usine, les vendeurs, les enseignants ou les médecins d'hôpital","Le Centre Opérationnel n'a pas de rôle spécifique au sein de l'organisation"},
        {"La Technostructure est responsable d'organiser des événements sociaux au sein de l'organisation","La Technostructure est composée d'analystes responsables de structurer et d'adapter l'organisation. Ils standardisent les actions en spécifiant comment produire","La Technostructure gère les relations avec les clients","La Technostructure est chargée des stratégies de marketing et de publicité"},
        {"Le Cycle d'Information n'a aucun rôle dans les processus organisationnels","Le Cycle d'Information connecte la prise de décision à l'action au sein d'une organisation","Le Cycle d'Information ne se préoccupe que de la circulation de l'information","Le Cycle d'Information se concentre uniquement sur le stockage des données"},
        {"Un organigramme représente la répartition officielle des fonctions, montrant la subordination et les relations de travail","Un organigramme est uniquement utilisé à des fins décoratives au sein d'une organisation","Un organigramme représente les canaux de communication informels","Un organigramme ne représente que la structure informelle d'une organisation"}

    };
    static char[] answers = {'A', 'C', 'B', 'D','D', 'A', 'C', 'B','B','A'};

    public SystemeInformation() {
        super(questions, options, answers);
    }
}
