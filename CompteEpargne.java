public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(String numero, String titulaire, double soldeInitial, double tauxInteret) {
        super(numero, titulaire, soldeInitial);
        this.tauxInteret = 0.02;

    }

    public void appliquerInterets() {
        double interets = getSolde() * tauxInteret;
        deposer(interets);
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "tauxInteret=" + tauxInteret +
                ", " + super.toString() +
                '}';
    }

}
