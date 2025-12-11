public class NombreComplexe {
    private double partieReelle;
    private double partieImaginaire;

    public NombreComplexe(double a, double b) {
        partieReelle = a;
        partieImaginaire = b;
    }

    public NombreComplexe somme(NombreComplexe autre) {
        double sommePartieReelle = this.partieReelle + autre.partieReelle;
        double sommePartieImaginaire = this.partieImaginaire + autre.partieImaginaire;
        return new NombreComplexe(sommePartieReelle, sommePartieImaginaire);
    }

    public NombreComplexe produit(NombreComplexe autre) {
        double partieReelle = this.partieReelle * autre.partieReelle - this.partieImaginaire * autre.partieImaginaire;
        double partieImaginaire = this.partieReelle * autre.partieImaginaire
                + this.partieImaginaire * autre.partieReelle;
        return new NombreComplexe(partieReelle, partieImaginaire);
    }

    public NombreComplexe conjugue() {
        return new NombreComplexe(this.partieReelle, -this.partieImaginaire);
    }

    @Override
    public String toString() {
        return partieReelle + " + " + partieImaginaire + "i";
    }

}
