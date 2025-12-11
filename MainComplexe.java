public class MainComplexe {
    public static void main(String[] args) {
        NombreComplexe z1 = new NombreComplexe(3, 4);
        NombreComplexe z2 = new NombreComplexe(1, -2);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);

        System.out.println("Somme = " + z1.somme(z2));
        System.out.println("Produit = " + z1.produit(z2));
        System.out.println("Conjugué de z1 = " + z1.conjugue());
    }
}
