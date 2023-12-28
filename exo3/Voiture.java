public class Voiture extends Vehicule {

    int NbrPortes, Puissance, Kilometrage;

    public Voiture(String marque, int date, float prix, int nbrPortes, int puissance, int kilometrage) {
        super(marque, date, prix);
        NbrPortes = nbrPortes;
        Puissance = puissance;
        Kilometrage = kilometrage;
    }

    @Override
    public double calculprix() {
        int co = 0;
        for (int i = 100000; i < Kilometrage; i = i + 100000) {
            co++;
        }
        return super.calculprix() - 0.1 * co * super.calculprix();
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Le prix apres promotion: "+calculprix()+"\nNomnre de Portes: " + NbrPortes + "\nPuissance: " + Puissance + "\nKilometrage: " + Kilometrage);
    }

}