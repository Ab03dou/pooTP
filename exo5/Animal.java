public class Animal {
    String nom;
    boolean veg;

    public Animal(String nom, boolean veg) {
        this.nom = nom;
        this.veg = veg;
    }

    @Override
    public String toString() {
        return "Animal [nom=" + nom + ", veg=" + veg + "]";
    }

    public void diagnostique(double poids) {
        if (this instanceof Chat) {
            if (poids > 8) {
                System.out.println("Le chat est obese");
            } else {
                System.out.println("Le chat n'est pas obese");

            }
        } else if (this instanceof Elephant) {
            if (poids > 1000) {
                System.out.println("Le Elephant est obese");
            } else {
                System.out.println("Le Elephant n'est pas obese");
            }
        }
    }

    public void diagnostique(int age) {
        if (this instanceof Chat) {
            if (age > 10) {
                System.out.println("Le chat est vieux");
            } else {
                System.out.println("Le chat n'est pas vieux");

            }
        } else if (this instanceof Elephant) {
            if (age > 30) {
                System.out.println("Le Elephant est vieux");
            } else {
                System.out.println("Le Elephant n'est pas vieux");

            }
        }

    }
}
