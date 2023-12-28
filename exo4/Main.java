
public class Main {
    public static void main(String[] args) {
        float[] notes = new float[5];
        Etudiant etd = new Etudiant("ana", "abdou", 20, notes);
        System.out.println("Entrer les notes des etudiants:");
        etd.RemplirNotes();
        System.out.println(etd.toString());

        String[] module = new String[4];
        Enseignant ens = new Enseignant("mazoni", "amin", 25, module);
        System.out.println("Entrer les modules des enseignants: ");
        ens.AffecterModules();
        System.out.println(ens.toString());
        Personne prs = new Personne("rabi3", "boudin", 44);
        
       
        
    }
}