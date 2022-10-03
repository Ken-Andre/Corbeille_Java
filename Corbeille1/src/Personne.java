public class Personne {
    public String nom = "";
    public String prenom = "";

    public void direBonjour() {
        System.out.println("Bonjour, je m'appelle " + this.nom + " " +
                this.prenom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return nom;
    }

    public void setPrenom(String nom) {
        this.nom = nom;
    }
}