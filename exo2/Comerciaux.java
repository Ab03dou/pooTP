
public class Comerciaux extends Employer {
    public Comerciaux(String nom, String prenom, int annee, int nbrHeures, int nbrHeuresSup) {
        super(nom, prenom, annee, nbrHeures, nbrHeuresSup);
    }

    public int CalculPaie() {
        return super.getNbrHeures() * 350;
    }

    public int CalculHeuresSupp() {
        return super.getNbrHeuresSupp() * 500;
    }

    public int CalculPaieFinal() {
        return CalculPaie() + CalculHeuresSupp() + 2000 * (2023 - getYear());
    }

    public String toString() {
        return "Comerciaux informations :\n" + super.toString() + "payment finale :" + CalculPaieFinal();
    }

    public static void main(String[] args) {
        Devlopeur dev = new Devlopeur("John","wick",2019,40,13);
        Comerciaux com = new Comerciaux("Keanu","rieves",2023,40,2);
        System.err.println(dev.toString());
        System.err.println(com.toString());

    }
}