public class Personne {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void presenter() {
        System.out.println("Je m'appelle " + nom + " et j'ai " + age + " ans.");
    }

}
