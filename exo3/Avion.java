
public class Avion extends Vehicule {

    private int heuresVol;

    public Avion(String marque, int date, float prix, int heuresVol) {
        super(marque, date, prix);
        this.heuresVol = heuresVol;
    }

    @Override
    public double calculprix() {
        int co =0;
        for(int i =5000;i<heuresVol;i=i+5000){
            co++;
        }
        return super.calculprix()-0.8*co*super.calculprix();
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Prix apres la promotion: "+calculprix()+"\nHeures de vol: " + heuresVol);
    }

}
