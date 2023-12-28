
public class Employer {
    private String nom, prenom;
    private int annee, NbrHeures, NbrHeuresSup;

    public Employer(String nom, String prenom, int annee, int nbrHeures, int nbrHeuresSup) {
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
        NbrHeures = nbrHeures;
        NbrHeuresSup = nbrHeuresSup;
    }

    public String toString() {
        StringBuilder EmployeInfo = new StringBuilder();
        EmployeInfo.append(" nom : ").append(nom).append("\n prenom : ").append(prenom).append("\n");
        //append("\n year of recruitment : ").append(annee).append("\n NbrHeures : ").append(NbrHeures).append("\n NbrHeuresSupp : ").append(NbrHeuresSup).

        return EmployeInfo.toString();
    }

    public int getNbrHeures() {
        return NbrHeures;
    }

    public int getNbrHeuresSupp() {
        return NbrHeuresSup;
    }

    public int getYear() {
        return annee;
    }
    
}
