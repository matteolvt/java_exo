public class CompteBancaire {
    private String numero;
    private String titulaire;
    private double solde;

    public CompteBancaire(String numero, String titulaire, double soldeInitial) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
        }
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "numero='" + numero + '\'' +
                ", titulaire='" + titulaire + '\'' +
                ", solde=" + solde +
                '}';
    }

}