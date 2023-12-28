public class Vehicule {
    private String marque;
    private int date;
    private float prix;

    public Vehicule(String marque, int date, float prix) {
        this.marque = marque;
        this.date = date;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("La marque: " + marque + "\nDate: " + date + "\nPrix: " + prix);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        else
            return false;
    }

    public double calculprix() {
        return prix - (2023 - date) * prix * 0.05;
    }

    public String getmarque() {
        return marque;
    }

    public int getDate() {
        return date;
    }

    public float getPrix() {
        return prix;
    }

}