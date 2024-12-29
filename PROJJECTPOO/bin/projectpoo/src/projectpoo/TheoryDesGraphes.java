package projectpoo;
public class TheoryDesGraphes extends Quiz {
    static String[] questions = {
        "quelle est la definition d'un graphe ?",
        "qu'elle est la definition d'un graphe semi eulerien?",
        "ca veut dire quoi l'Anti-racine?",
        "c'est quoi un graphe acyclique ?",
        "que peut on dire sur le graphe non oriente ?",
        "qu'elle est la definition d'un graphe oriente ?",
        "comment calculer le nombre d'arcs dans un graphe ?",
        "quel est le type de la relation entre deux sommets dans un graphe non oriente ?",
        "selectionnez T(cd)",
        "selectionnez init(AB)",

    };
    static String[][] options = {
        {"un algorithme ", "ensemble de points connectes", "une entite ", "un theoreme"},
        {"nombre de sommet impaires=1", "nombre d'arcs=4", "nombre de sommet paires=2", "nombre de sommet impaires=2"},
        {"un sommet qu'a partir de lui on accede aux autres sommet", "sommet qui est accede a partir des autres sommets", "sommet dont D(x)>0", "sommet dont D(x)=0"},
        {"graphe qui contient 2 cycle", "graphe qui contient au plus 2 cycle", "graphe qui contient plus que 2 cycle", "graphe qui ne contient pas de cycle"},
        {" ∀ x,y ∈ X/E(x,y)!= E(y,x)"," ∀ x,y ∈ X/E(x,y)= E(y,x)","∀ x,y ∈ X/E(x,x)= E(y,y)","∀ x,y ∈ X/E(y,y)= E(x,x)"},
        {" ∀ x,y ∈ X/E(x,y)= E(y,x)","∀ x,y ∈ X/E(x,x)= E(y,y) ","∀ x,y ∈ X/E(x,y)!= E(y,x)","∀ x,y ∈ X/E(y,y)= E(x,x)"},
        {"ΣD(xi)/2","ΣD(xi)","ΣD(xi)/4","ΣD(xi)/6"},
        {"arcs","arretes","fil","ligne"},
        {"c","c et d","∄","d"},
        {"A","B","A and B","∄"},
    };
    static char[] answers = {'B', 'D', 'A', 'D','B','C','A','B','A','B'};

    public TheoryDesGraphes() {
        super(questions, options, answers);
    }
}
