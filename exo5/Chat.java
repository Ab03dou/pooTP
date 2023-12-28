public class Chat extends Animal {
    String coleur;

    public Chat(String nom, boolean veg, String coleur) {
        super(nom, veg);
        this.coleur = coleur;
    }

    @Override
    public String toString() {
        return "Chat [coleur=" + coleur + super.toString() + "]";
    }

}
