package projectpoo;
public class ReseauInformatique extends Quiz {
    static String[] questions = {
            "Quelle est la taille maximale d'une adresse IPv4 ?",
            "Quel protocole est utilisé pour attribuer dynamiquement des adresses IP à des dispositifs sur un réseau ?",
            "Quel est le principal avantage d'IPv6 par rapport à IPv4 ?",
            "Quel est le rôle principal d'un routeur dans un réseau informatique ?",
            "Combien de dispositifs pouvez-vous connecter à un réseau avec l'adresse IP 192.168.1.0/24 ",
            "Combien de dispositifs pouvez-vous connecter à un réseau avec l'adresse IP 10.0.0.0/25 ?",
            "Quel est le rôle principal de la couche physique dans le modèle OSI ?",
            "Quelle est la fonction principale d'un concentrateur (hub) dans un réseau ?",
            "Combien de bits composent une adresse MAC ?",
            "Quelle partie de l'adresse MAC identifie le fabricant de la carte réseau ?"
    };
    static String[][] options = {
            {"128 bits", "64 bits", "32 bits", " 256 bits"},
            {"DHCP", "DNS", "FTP", "HTTP"},
            {"Support des adresses de diffusions", "Plus grand espace d'adressage", "Meilleure performance", "Prise en charge du NAT"},
            {"Sécuriser les connexions Internet", "Fournir des adresses IP aux dispositifs sur le réseau", "Connecter des dispositifs au même réseau local", "Gérer le trafic entre différents réseaux"},
            {"256 dispositifs", "254 dispositifs", "512 dispositifs", "1024 dispositifs"},
            {"126 dispositifs", "128 dispositifs", "254 dispositifs", "256 dispositifs"},
            {"Gérer la communication entre les applications", "Assurer la fiabilité de la transmission des données", "Spécifier les protocoles de routage","Gérer les signaux électriques ou optiques pour le transfert de données"},
            {"Filtrer le trafic réseau","Diviser le réseau en sous-réseaux","Amplifier et répéter les signaux","Gérer les adresses IP des périphériques connectés"},
            {"16 bits", "32 bits", "48 bits", "64 bits"},
            {"Les 6 premiers octets", "Les 4 premiers octets", "Les 3 premiers octets", "Les 2 premiers octets"}
    };
    static char[] answers = {'C','A', 'B', 'D', 'B','A','D','C','A','C'};

    public ReseauInformatique() {
        super(questions, options, answers);
    }
}
