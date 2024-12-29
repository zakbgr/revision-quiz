package projectpoo;

	public class TheoryDesLangage extends Quiz {

		static String[] questions = {
	        "Quelle est la définition d'un langage formel ?",
	        "Différence entre langage régulier et contextuel ?",
	        "Qu'est-ce qu'une grammaire formelle ?",
	        "Qu'est-ce qu'un automate fini déterministe (AFD) ?",
	        "Qu'est-ce qu'une expression régulière ?",
	        "Qu'est-ce qu'un automate à pile ?",
	        "Relation entre langages réguliers et automates ?",
	        "Qu'est-ce qu'un langage universel ?",
	        "Différence entre langage récursivement énumérable et récursif ?",
	        "Théorème de l'équivalence grammaires et automates ?"
	    };
	    
	    static String[][] options = {
	        {"Langage avec syntaxe définie", "Langage de programmation", "Langage utilisé pour la communication", "Langage de science"},
	        {"Réguliers reconnus par automates finis", "Réguliers plus simples", "Contextuels utilisent automates finis", "Aucune différence"},
	        {"Ensemble de règles pour générer mots", "Langage de programmation", "Communication entre automates", "Codage de l'information"},
	        {"Lisant un symbole à la fois", "Lisant plusieurs symboles", "Lisant et retournant", "Dans plusieurs états à la fois"},
	        {"Expression pour décrire chaînes", "Traduction automatique", "Méthode de cryptage", "Langage de programmation"},
	        {"Automate avec pile", "Automate dans plusieurs états", "Automate lisant un seul symbole", "Automate lisant plusieurs symboles"},
	        {"Tout régulier reconnu par fini", "Réguliers plus complexes", "Automates reconnaissent tout", "Réguliers plus simples"},
	        {"Compris par tous locuteurs", "Exprime tout concept", "Utilisable pour tous logiciels", "Décrivant tout langage"},
	        {"Récursivement énumérables décidés par automate", "Récursifs plus simples", "Aucune différence", "Récursifs décidés par algorithme"},
	        {"Grammaire transformable en automate", "Automates plus puissants", "Grammaires générant tout", "Aucune relation"}
	    };
	    
	    static char[] answers = {'A', 'A', 'A', 'C', 'A', 'A', 'A', 'B', 'D', 'A'};

	    public TheoryDesLangage() {
	        super(questions, options, answers);
	    }
	}
