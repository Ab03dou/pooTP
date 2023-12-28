
public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Porsche 911 GT3 RS", 2023, 234977, 2, 518, 1500);
        Voiture voiture1 = new Voiture("Pagani huayra R", 2013, 30000000, 2, 850, 20000);
        Avion avion = new Avion("Boeing", 2020, 80000000, 12000);
        Avion avion1 = new Avion("ATR", 2020, 1800000, 6200);
        System.out.println("---------------------");
        voiture.afficher();
        System.out.println("---------------------");
        voiture1.afficher();
        System.out.println("---------------------");
        avion.afficher();
        System.out.println("---------------------");
        avion1.afficher();
        System.out.println("---------------------");
        if (voiture.equals(avion)) {
            System.out.println("Porsche is equal to Boeing");
        } else {
            System.out.println("Porsche is not equal to Boeing");
        }

        if (voiture1.equals(avion1)) {
            System.out.println("Pagani is equal to ATR");
        } else {
            System.out.println("Pagani is not equal to ATR");
        }

        if (voiture.equals(voiture1)) {
            System.out.println("Porsche is equal to Pagani");
        } else {
            System.out.println("Porsche is not equal to Pagani");
        }

        if (avion.equals(avion1)) {
            System.out.println("Boeing is equal to ATR");
        } else {
            System.out.println("Boeing is not equal to ATR");
        }

        if (voiture.equals(voiture)) {
            System.out.println("Porsche is equal to itself");
        } else {
            System.out.println("Porsche is not equal to itself");
        }

    }
}
