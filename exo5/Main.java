public class Main {
    public static void main(String[] args) {
        Chat cht = new Chat("tom", false, "black");
        Elephant elf = new Elephant("bob", true);
        //System.err.println(cht.toString());
        Animal anm = new Elephant("ana",true);
       anm.diagnostique(50);
    }
}
