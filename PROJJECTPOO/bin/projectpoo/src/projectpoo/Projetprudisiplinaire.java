package projectpoo;

	public class Projetprudisiplinaire extends Quiz {
	    static String[] questions = {
	        "Quelle section doit normalement figurer dans un cahier des charges pour un projet de création de site web ou d'application mobile ?",
	        " Quelle est l'importance de la planification dans un projet de développement web ou mobile ?",
	        " Quelles sont les caractéristiques importantes à rechercher lors de la constitution d'une équipe pour un projet de développement web ou mobile ? ",
	        " En quoi le diagramme de Gantt peut-il aider à la gestion du temps dans un projet de développement web ou mobile ?",
	        "Pourquoi la conception est-elle importante dans le développement d'un site web ou d'une application mobile ?",
	        "Quelle est la meilleure approche pour diviser les tâches dans un projet de développement web ou mobile ?",
	        "Quel critère pourrait être utilisé pour évaluer le succès d'un projet de développement web ou mobile ?",
	        "Pourquoi est-il important d'avoir une communication efficace au sein de l'équipe de développement ?",
	        "Comment la gestion des changements peut-elle contribuer au succès d'un projet de développement web ou mobile ?",
	        "Question : Pourquoi les tests sont-ils importants dans le développement d'un site web ou d'une application mobile ?",

	    };
	    static String[][] options = {
	        {" Le résumé exécutif", "Les objectifs du projet", "Les spécifications techniques ", "Les informations de contact de l'équipe de développement"},
	        {" Minimiser le temps consacré à la conception", "Maximiser les coûts du projet", " Identifier les ressources nécessaires et les délais à respecter", " Ignorer les retours des utilisateurs"},
	        {" Uniquement des compétences techniques approfondies", "Une bonne communication et collaboration", " Une expérience limitée dans le domaine", " Une vision unique du projet"},
	        {"En attribuant des délais à chaque étape du projet", " En rédigeant le contenu texte du site", "En choisissant les couleurs de la palette de design", "En identifiant les compétences nécessaires pour chaque tâche"},
	        {"Pour augmenter les coûts de développement"," Pour attirer l'attention des investisseurs"," Pour améliorer l'expérience utilisateur et l'ergonomie","Pour réduire la compatibilité avec les navigateurs"},
	        {"Ignorer les compétences individuelles des membres de l'équipe"," Diviser les tâches en fonction des compétences et des préférences"," Répartir toutes les tâches également entre tous les membres de l'équipe","Assigner toutes les tâches au chef de projet"},
	        {" Le nombre de bugs trouvés dans le code","La satisfaction des utilisateurs finaux","Le nombre total de lignes de code écrites","Le montant du financement obtenu pour le projet"},
	        {"Pour éviter toute forme de collaboration","Pour garantir que chaque membre travaille individuellement sur ses tâches assignées","Pour résoudre rapidement les problèmes, partager des idées et assurer une compréhension commune des objectifs du projet",""},
	        {" En refusant tout changement une fois le projet lancé","En permettant des ajustements en cours de route pour répondre aux besoins changeants des utilisateurs ou aux évolutions du marché","En ignorant complètement les retours des utilisateurs","En gardant le projet figé dans son état initial"},
	        {" Pour augmenter les coûts de développement","Pour minimiser le temps consacré au projet","Pour assurer la qualité du produit final en identifiant et en corrigeant les bugs"," Pour réduire la collaboration entre les membres de l'équipe"},
	    };
	    static char[] answers = {'c', 'c', 'b', 'a','c','b','b','c','b','c'};

	    public Projetprudisiplinaire() {
	        super(questions, options, answers);
	    }
	}
	